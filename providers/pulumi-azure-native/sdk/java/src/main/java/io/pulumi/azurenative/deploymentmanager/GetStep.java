// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.deploymentmanager.inputs.GetStepArgs;
import io.pulumi.azurenative.deploymentmanager.outputs.GetStepResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStep {
    private GetStep() {}
    public interface BuilderApplicator {
        public void apply(GetStepArgs.Builder a);
    }
    private static GetStepArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetStepArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The resource representation of a rollout step.
 * API Version: 2019-11-01-preview.
 * 
     *
     * The resource representation of a rollout step.
 * 
     */
    public static CompletableFuture<GetStepResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The resource representation of a rollout step.
     * API Version: 2019-11-01-preview.
     * 
     *
         * The resource representation of a rollout step.
     * 
     */
    public static CompletableFuture<GetStepResult> invokeAsync(GetStepArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deploymentmanager:getStep", TypeShape.of(GetStepResult.class), args == null ? GetStepArgs.Empty : args, Utilities.withVersion(options));
    }
}
