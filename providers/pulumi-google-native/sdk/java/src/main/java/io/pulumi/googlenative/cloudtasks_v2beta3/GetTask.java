// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.GetTaskArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.GetTaskResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTask {
    private GetTask() {}
    public interface BuilderApplicator {
        public void apply(GetTaskArgs.Builder a);
    }
    private static GetTaskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTaskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a task.
 * 
     */
    public static CompletableFuture<GetTaskResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a task.
     * 
     */
    public static CompletableFuture<GetTaskResult> invokeAsync(GetTaskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta3:getTask", TypeShape.of(GetTaskResult.class), args == null ? GetTaskArgs.Empty : args, Utilities.withVersion(options));
    }
}
