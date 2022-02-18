// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.inputs.GetBucketArgs;
import io.pulumi.awsnative.lightsail.outputs.GetBucketResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucket {
/**
 * Resource Type definition for AWS::Lightsail::Bucket
 * 
 */
    public static CompletableFuture<GetBucketResult> invokeAsync(GetBucketArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lightsail:getBucket", TypeShape.of(GetBucketResult.class), args == null ? GetBucketArgs.Empty : args, Utilities.withVersion(options));
    }
}
