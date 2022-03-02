// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetJobStepArgs;
import io.pulumi.azurenative.sql.outputs.GetJobStepResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJobStep {
    private GetJobStep() {}
    public interface BuilderApplicator {
        public void apply(GetJobStepArgs.Builder a);
    }
    private static GetJobStepArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetJobStepArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A job step.
 * API Version: 2020-11-01-preview.
 * 
     *
     * A job step.
 * 
     */
    public static CompletableFuture<GetJobStepResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A job step.
     * API Version: 2020-11-01-preview.
     * 
     *
         * A job step.
     * 
     */
    public static CompletableFuture<GetJobStepResult> invokeAsync(GetJobStepArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getJobStep", TypeShape.of(GetJobStepResult.class), args == null ? GetJobStepArgs.Empty : args, Utilities.withVersion(options));
    }
}
