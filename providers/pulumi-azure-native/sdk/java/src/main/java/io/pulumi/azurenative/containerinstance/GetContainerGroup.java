// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerinstance.inputs.GetContainerGroupArgs;
import io.pulumi.azurenative.containerinstance.outputs.GetContainerGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContainerGroup {
    private GetContainerGroup() {}
    public interface BuilderApplicator {
        public void apply(GetContainerGroupArgs.Builder a);
    }
    private static GetContainerGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContainerGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A container group.
 * API Version: 2021-03-01.
 * 
     *
     * A container group.
 * 
     */
    public static CompletableFuture<GetContainerGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A container group.
     * API Version: 2021-03-01.
     * 
     *
         * A container group.
     * 
     */
    public static CompletableFuture<GetContainerGroupResult> invokeAsync(GetContainerGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerinstance:getContainerGroup", TypeShape.of(GetContainerGroupResult.class), args == null ? GetContainerGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
