package io.pulumi.deployment;

import io.pulumi.Stack;
import io.pulumi.core.Output;
import io.pulumi.core.internal.InputOutputData;
import io.pulumi.core.internal.TypedInputOutput;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.deployment.internal.DeploymentTests;
import io.pulumi.exceptions.RunException;
import org.assertj.core.api.HamcrestCondition;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import static io.pulumi.deployment.internal.DeploymentTests.cleanupDeploymentMocks;
import static io.pulumi.deployment.internal.DeploymentTests.printErrorCount;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class DeploymentRunnerTest {

    @AfterEach
    public void cleanup() {
        cleanupDeploymentMocks();
    }

    @Test
    void testTerminatesEarlyOnException() {
        var mock = DeploymentTests.DeploymentMockBuilder.builder()
                .setSpyGlobalInstance();

        var result = mock.tryTestAsync(TerminatesEarlyOnExceptionStack.class).join();

        assertThat(mock.runner.getSwallowedExceptions()).hasSize(2);

        assertThat(result.exceptions).isNotNull();
        assertThat(result.exceptions).isNotEmpty();
        assertThat(result.exceptions).hasSize(1);
        assertThat(result.exceptions.get(0)).isExactlyInstanceOf(RunException.class);
        assertThat(result.exceptions.get(0)).hasMessageContaining("Deliberate test error");
        assertThat(result.resources).isNotNull();
        assertThat(result.resources).isNotEmpty();
        assertThat(result.resources).hasSize(1);
        var stack = (TerminatesEarlyOnExceptionStack) result.resources.get(0);
        assertThat(TypedInputOutput.cast(stack.slowOutput).internalGetDataAsync()).isNotCompleted();
        assertThat(TypedInputOutput.cast(stack.slowOutput).view(InputOutputData::getValueNullable)).isNotCompleted();

        printErrorCount(mock.logger);
    }

    public static class TerminatesEarlyOnExceptionStack extends Stack {
        @OutputExport(type = Integer.class)
        public final Output<Integer> slowOutput;

        public TerminatesEarlyOnExceptionStack() {
            var parallelExecutor = new ForkJoinPool(2);
            Output.of(CompletableFuture.supplyAsync(
                    () -> {
                        throw new RunException("Deliberate test error");
                    }, parallelExecutor)
            );
            this.slowOutput = Output.of(CompletableFuture
                    .supplyAsync(() -> sleep(60000), parallelExecutor)
                    .thenApply(ignore -> 1)
            );
        }
    }

    @Test
    void testLogsTaskDescriptions() {
        var logger = new InMemoryLogger();
        logger.setLevel(Level.FINEST);

        var mock = DeploymentTests.DeploymentMockBuilder.builder()
                .setStandardLogger(logger)
                .setSpyGlobalInstance();

        var runner = mock.getRunner();
        var parallelExecutor = new ForkJoinPool(2);
        for (var i = 0; i < 2; i++) {
            final var delay = 100L + i;
            runner.registerTask(String.format("task%d", i), CompletableFuture.<Void>supplyAsync(
                    () -> {
                        sleep(delay);
                        return null;
                    }, parallelExecutor)
            );
        }
        Supplier<CompletableFuture<Map<String, Optional<Object>>>> supplier =
                () -> CompletableFuture.completedFuture(Map.of());
        var code = mock.runner.runAsyncFuture(supplier, null).join();
        assertThat(code).isEqualTo(0);

        var messages = logger.getMessages();
        for (var i = 0; i < 2; i++) {
            assertThat(messages).haveAtLeastOne(containsStringCondition(String.format("Registering task: 'task%d'", i)));
            assertThat(messages).haveAtLeastOne(containsStringCondition(String.format("Completed task: 'task%d'", i)));
        }

        printErrorCount(mock.logger);
    }

    @Nullable
    private static Object sleep(long millis) {
        try {
            Thread.sleep(millis);
            return null;
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static HamcrestCondition<String> containsStringCondition(String s) {
        return new HamcrestCondition<>(containsString(s));
    }

    private static class InMemoryLogger extends Logger {
        private final Queue<String> messages = new ConcurrentLinkedQueue<>();

        public InMemoryLogger() {
            this(DeploymentRunnerTest.class.getTypeName(), null);
        }

        protected InMemoryLogger(String name, String resourceBundleName) {
            super(name, resourceBundleName);
            this.setLevel(Level.FINEST);
        }

        public List<String> getMessages() {
            return List.copyOf(messages);
        }

        @Override
        public void log(LogRecord record) {
            this.messages.add(String.format("%s %s %s", record.getLevel(), record.getSequenceNumber(), record.getMessage()));
            super.log(record);
        }
    }
}