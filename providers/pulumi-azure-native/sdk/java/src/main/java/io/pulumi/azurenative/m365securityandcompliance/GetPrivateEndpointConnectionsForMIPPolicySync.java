// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.inputs.GetPrivateEndpointConnectionsForMIPPolicySyncArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.GetPrivateEndpointConnectionsForMIPPolicySyncResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionsForMIPPolicySync {
    private GetPrivateEndpointConnectionsForMIPPolicySync() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateEndpointConnectionsForMIPPolicySyncArgs.Builder a);
    }
    private static GetPrivateEndpointConnectionsForMIPPolicySyncArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateEndpointConnectionsForMIPPolicySyncArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Private Endpoint Connection resource.
 * API Version: 2021-03-25-preview.
 * 
     *
     * The Private Endpoint Connection resource.
 * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForMIPPolicySyncResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Private Endpoint Connection resource.
     * API Version: 2021-03-25-preview.
     * 
     *
         * The Private Endpoint Connection resource.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForMIPPolicySyncResult> invokeAsync(GetPrivateEndpointConnectionsForMIPPolicySyncArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:m365securityandcompliance:getPrivateEndpointConnectionsForMIPPolicySync", TypeShape.of(GetPrivateEndpointConnectionsForMIPPolicySyncResult.class), args == null ? GetPrivateEndpointConnectionsForMIPPolicySyncArgs.Empty : args, Utilities.withVersion(options));
    }
}
