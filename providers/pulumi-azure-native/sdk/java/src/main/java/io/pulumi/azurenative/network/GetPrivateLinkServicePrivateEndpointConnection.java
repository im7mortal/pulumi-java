// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetPrivateLinkServicePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.network.outputs.GetPrivateLinkServicePrivateEndpointConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateLinkServicePrivateEndpointConnection {
    private GetPrivateLinkServicePrivateEndpointConnection() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateLinkServicePrivateEndpointConnectionArgs.Builder a);
    }
    private static GetPrivateLinkServicePrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateLinkServicePrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * PrivateEndpointConnection resource.
 * API Version: 2020-11-01.
 * 
     *
     * PrivateEndpointConnection resource.
 * 
     */
    public static CompletableFuture<GetPrivateLinkServicePrivateEndpointConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * PrivateEndpointConnection resource.
     * API Version: 2020-11-01.
     * 
     *
         * PrivateEndpointConnection resource.
     * 
     */
    public static CompletableFuture<GetPrivateLinkServicePrivateEndpointConnectionResult> invokeAsync(GetPrivateLinkServicePrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getPrivateLinkServicePrivateEndpointConnection", TypeShape.of(GetPrivateLinkServicePrivateEndpointConnectionResult.class), args == null ? GetPrivateLinkServicePrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
