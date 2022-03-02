// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.insights.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnection {
    private GetPrivateEndpointConnection() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateEndpointConnectionArgs.Builder a);
    }
    private static GetPrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A private endpoint connection
 * API Version: 2019-10-17-preview.
 * 
     *
     * A private endpoint connection
 * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A private endpoint connection
     * API Version: 2019-10-17-preview.
     * 
     *
         * A private endpoint connection
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> invokeAsync(GetPrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args == null ? GetPrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
