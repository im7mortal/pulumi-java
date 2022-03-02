// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetExternalVpnGatewayArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetExternalVpnGatewayResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExternalVpnGateway {
    private GetExternalVpnGateway() {}
    public interface BuilderApplicator {
        public void apply(GetExternalVpnGatewayArgs.Builder a);
    }
    private static GetExternalVpnGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetExternalVpnGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified externalVpnGateway. Get a list of available externalVpnGateways by making a list() request.
 * 
     */
    public static CompletableFuture<GetExternalVpnGatewayResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified externalVpnGateway. Get a list of available externalVpnGateways by making a list() request.
     * 
     */
    public static CompletableFuture<GetExternalVpnGatewayResult> invokeAsync(GetExternalVpnGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getExternalVpnGateway", TypeShape.of(GetExternalVpnGatewayResult.class), args == null ? GetExternalVpnGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
