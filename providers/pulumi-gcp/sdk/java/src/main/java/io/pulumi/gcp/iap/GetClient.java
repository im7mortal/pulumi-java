// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.inputs.GetClientArgs;
import io.pulumi.gcp.iap.outputs.GetClientResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClient {
    private GetClient() {}
    public interface BuilderApplicator {
        public void apply(GetClientArgs.Builder a);
    }
    private static GetClientArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetClientArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get info about a Google Cloud IAP Client.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getClient.
 * 
     *
     * A collection of values returned by getClient.
 * 
     */
    public static CompletableFuture<GetClientResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get info about a Google Cloud IAP Client.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getClient.
     * 
     *
         * A collection of values returned by getClient.
     * 
     */
    public static CompletableFuture<GetClientResult> invokeAsync(GetClientArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iap/getClient:getClient", TypeShape.of(GetClientResult.class), args == null ? GetClientArgs.Empty : args, Utilities.withVersion(options));
    }
}
