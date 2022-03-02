// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetBackendBucketArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetBackendBucketResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackendBucket {
    private GetBackendBucket() {}
    public interface BuilderApplicator {
        public void apply(GetBackendBucketArgs.Builder a);
    }
    private static GetBackendBucketArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBackendBucketArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request.
 * 
     */
    public static CompletableFuture<GetBackendBucketResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request.
     * 
     */
    public static CompletableFuture<GetBackendBucketResult> invokeAsync(GetBackendBucketArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getBackendBucket", TypeShape.of(GetBackendBucketResult.class), args == null ? GetBackendBucketArgs.Empty : args, Utilities.withVersion(options));
    }
}
