// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetDataCollectionEndpointArgs;
import io.pulumi.azurenative.insights.outputs.GetDataCollectionEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataCollectionEndpoint {
    private GetDataCollectionEndpoint() {}
    public interface BuilderApplicator {
        public void apply(GetDataCollectionEndpointArgs.Builder a);
    }
    private static GetDataCollectionEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDataCollectionEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Definition of ARM tracked top level resource.
 * API Version: 2021-04-01.
 * 
     *
     * Definition of ARM tracked top level resource.
 * 
     */
    public static CompletableFuture<GetDataCollectionEndpointResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Definition of ARM tracked top level resource.
     * API Version: 2021-04-01.
     * 
     *
         * Definition of ARM tracked top level resource.
     * 
     */
    public static CompletableFuture<GetDataCollectionEndpointResult> invokeAsync(GetDataCollectionEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDataCollectionEndpoint", TypeShape.of(GetDataCollectionEndpointResult.class), args == null ? GetDataCollectionEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
