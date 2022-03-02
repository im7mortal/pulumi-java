// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.inputs.GetPrimaryTaskSetArgs;
import io.pulumi.awsnative.ecs.outputs.GetPrimaryTaskSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrimaryTaskSet {
    private GetPrimaryTaskSet() {}
    public interface BuilderApplicator {
        public void apply(GetPrimaryTaskSetArgs.Builder a);
    }
    private static GetPrimaryTaskSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrimaryTaskSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A pseudo-resource that manages which of your ECS task sets is primary.
 * 
     */
    public static CompletableFuture<GetPrimaryTaskSetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A pseudo-resource that manages which of your ECS task sets is primary.
     * 
     */
    public static CompletableFuture<GetPrimaryTaskSetResult> invokeAsync(GetPrimaryTaskSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getPrimaryTaskSet", TypeShape.of(GetPrimaryTaskSetResult.class), args == null ? GetPrimaryTaskSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
