// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs;
import io.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResponseHeadersPolicy {
    private GetResponseHeadersPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetResponseHeadersPolicyArgs.Builder a);
    }
    private static GetResponseHeadersPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResponseHeadersPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getResponseHeadersPolicy.
 * 
     *
     * A collection of values returned by getResponseHeadersPolicy.
 * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to retrieve information about a CloudFront cache policy.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getResponseHeadersPolicy.
     * 
     *
         * A collection of values returned by getResponseHeadersPolicy.
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> invokeAsync(@Nullable GetResponseHeadersPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getResponseHeadersPolicy:getResponseHeadersPolicy", TypeShape.of(GetResponseHeadersPolicyResult.class), args == null ? GetResponseHeadersPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
