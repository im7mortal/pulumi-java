// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudrun.inputs.GetServiceArgs;
import io.pulumi.gcp.cloudrun.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetService {
    private GetService() {}
    public interface BuilderApplicator {
        public void apply(GetServiceArgs.Builder a);
    }
    private static GetServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get information about a Google Cloud Run Service. For more information see
 * the [official documentation](https://cloud.google.com/run/docs/)
 * and [API](https://cloud.google.com/run/docs/apis).
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getService.
 * 
     *
     * A collection of values returned by getService.
 * 
     */
    public static CompletableFuture<GetServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get information about a Google Cloud Run Service. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getService.
     * 
     *
         * A collection of values returned by getService.
     * 
     */
    public static CompletableFuture<GetServiceResult> invokeAsync(GetServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:cloudrun/getService:getService", TypeShape.of(GetServiceResult.class), args == null ? GetServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
