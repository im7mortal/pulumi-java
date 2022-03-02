// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
import io.pulumi.aws.ecs.outputs.GetContainerDefinitionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContainerDefinition {
    private GetContainerDefinition() {}
    public interface BuilderApplicator {
        public void apply(GetContainerDefinitionArgs.Builder a);
    }
    private static GetContainerDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContainerDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The ECS container definition data source allows access to details of
 * a specific container within an AWS ECS service.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getContainerDefinition.
 * 
     *
     * A collection of values returned by getContainerDefinition.
 * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getContainerDefinition.
     * 
     *
         * A collection of values returned by getContainerDefinition.
     * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> invokeAsync(GetContainerDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getContainerDefinition:getContainerDefinition", TypeShape.of(GetContainerDefinitionResult.class), args == null ? GetContainerDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
