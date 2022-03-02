// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsAdtAPIArgs;
import io.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsAdtAPIResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionsAdtAPI {
    private GetPrivateEndpointConnectionsAdtAPI() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateEndpointConnectionsAdtAPIArgs.Builder a);
    }
    private static GetPrivateEndpointConnectionsAdtAPIArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateEndpointConnectionsAdtAPIArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Private Endpoint Connection resource.
 * API Version: 2021-03-08.
 * 
     *
     * The Private Endpoint Connection resource.
 * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsAdtAPIResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     *
         * The Private Endpoint Connection resource.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsAdtAPIResult> invokeAsync(GetPrivateEndpointConnectionsAdtAPIArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsAdtAPI", TypeShape.of(GetPrivateEndpointConnectionsAdtAPIResult.class), args == null ? GetPrivateEndpointConnectionsAdtAPIArgs.Empty : args, Utilities.withVersion(options));
    }
}
