// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.inputs.GetPrivateEndpointArgs;
import io.pulumi.azurenative.streamanalytics.outputs.GetPrivateEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpoint {
    private GetPrivateEndpoint() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateEndpointArgs.Builder a);
    }
    private static GetPrivateEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Complete information about the private endpoint.
 * API Version: 2020-03-01-preview.
 * 
     *
     * Complete information about the private endpoint.
 * 
     */
    public static CompletableFuture<GetPrivateEndpointResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Complete information about the private endpoint.
     * API Version: 2020-03-01-preview.
     * 
     *
         * Complete information about the private endpoint.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointResult> invokeAsync(GetPrivateEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getPrivateEndpoint", TypeShape.of(GetPrivateEndpointResult.class), args == null ? GetPrivateEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
