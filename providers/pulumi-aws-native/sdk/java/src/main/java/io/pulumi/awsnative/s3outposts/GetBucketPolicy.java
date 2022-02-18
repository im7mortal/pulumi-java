// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3outposts.inputs.GetBucketPolicyArgs;
import io.pulumi.awsnative.s3outposts.outputs.GetBucketPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucketPolicy {
/**
 * Resource Type Definition for AWS::S3Outposts::BucketPolicy
 * 
 */
    public static CompletableFuture<GetBucketPolicyResult> invokeAsync(GetBucketPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:s3outposts:getBucketPolicy", TypeShape.of(GetBucketPolicyResult.class), args == null ? GetBucketPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
