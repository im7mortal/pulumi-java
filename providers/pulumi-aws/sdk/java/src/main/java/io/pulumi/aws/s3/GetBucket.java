// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.inputs.GetBucketArgs;
import io.pulumi.aws.s3.outputs.GetBucketResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucket {
    private GetBucket() {}
    public interface BuilderApplicator {
        public void apply(GetBucketArgs.Builder a);
    }
    private static GetBucketArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBucketArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about a specific S3 bucket.
 * 
 * This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
 * Distribution.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getBucket.
 * 
     *
     * A collection of values returned by getBucket.
 * 
     */
    public static CompletableFuture<GetBucketResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about a specific S3 bucket.
     * 
     * This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
     * Distribution.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getBucket.
     * 
     *
         * A collection of values returned by getBucket.
     * 
     */
    public static CompletableFuture<GetBucketResult> invokeAsync(GetBucketArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:s3/getBucket:getBucket", TypeShape.of(GetBucketResult.class), args == null ? GetBucketArgs.Empty : args, Utilities.withVersion(options));
    }
}
