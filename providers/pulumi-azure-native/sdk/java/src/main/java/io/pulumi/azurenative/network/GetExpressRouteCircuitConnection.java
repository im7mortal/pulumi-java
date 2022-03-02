// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetExpressRouteCircuitConnectionArgs;
import io.pulumi.azurenative.network.outputs.GetExpressRouteCircuitConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExpressRouteCircuitConnection {
    private GetExpressRouteCircuitConnection() {}
    public interface BuilderApplicator {
        public void apply(GetExpressRouteCircuitConnectionArgs.Builder a);
    }
    private static GetExpressRouteCircuitConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetExpressRouteCircuitConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * API Version: 2020-11-01.
 * 
     *
     * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * 
     */
    public static CompletableFuture<GetExpressRouteCircuitConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * API Version: 2020-11-01.
     * 
     *
         * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * 
     */
    public static CompletableFuture<GetExpressRouteCircuitConnectionResult> invokeAsync(GetExpressRouteCircuitConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getExpressRouteCircuitConnection", TypeShape.of(GetExpressRouteCircuitConnectionResult.class), args == null ? GetExpressRouteCircuitConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
