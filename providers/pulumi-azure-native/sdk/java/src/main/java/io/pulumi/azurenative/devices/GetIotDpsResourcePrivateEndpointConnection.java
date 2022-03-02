// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetIotDpsResourcePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.devices.outputs.GetIotDpsResourcePrivateEndpointConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIotDpsResourcePrivateEndpointConnection {
    private GetIotDpsResourcePrivateEndpointConnection() {}
    public interface BuilderApplicator {
        public void apply(GetIotDpsResourcePrivateEndpointConnectionArgs.Builder a);
    }
    private static GetIotDpsResourcePrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIotDpsResourcePrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The private endpoint connection of a provisioning service
 * API Version: 2020-03-01.
 * 
     *
     * The private endpoint connection of a provisioning service
 * 
     */
    public static CompletableFuture<GetIotDpsResourcePrivateEndpointConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The private endpoint connection of a provisioning service
     * API Version: 2020-03-01.
     * 
     *
         * The private endpoint connection of a provisioning service
     * 
     */
    public static CompletableFuture<GetIotDpsResourcePrivateEndpointConnectionResult> invokeAsync(GetIotDpsResourcePrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotDpsResourcePrivateEndpointConnection", TypeShape.of(GetIotDpsResourcePrivateEndpointConnectionResult.class), args == null ? GetIotDpsResourcePrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
