// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.outputs.GetCallerIdentityResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCallerIdentity {
    private GetCallerIdentity() {}
    /**
         * Use this data source to get the access to the effective Account ID, User ID, and ARN in
     * which this provider is authorized.
     * 
     * ## Example Usage
     * 
     *
         * A collection of values returned by getCallerIdentity.
     * 
     */
    public static CompletableFuture<GetCallerIdentityResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getCallerIdentity:getCallerIdentity", TypeShape.of(GetCallerIdentityResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
