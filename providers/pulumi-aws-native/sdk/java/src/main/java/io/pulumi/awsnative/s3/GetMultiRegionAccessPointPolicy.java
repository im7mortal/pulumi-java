// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.inputs.GetMultiRegionAccessPointPolicyArgs;
import io.pulumi.awsnative.s3.outputs.GetMultiRegionAccessPointPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMultiRegionAccessPointPolicy {
/**
 * The policy to be attached to a Multi Region Access Point
 * 
 */
    public static CompletableFuture<GetMultiRegionAccessPointPolicyResult> invokeAsync(GetMultiRegionAccessPointPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:s3:getMultiRegionAccessPointPolicy", TypeShape.of(GetMultiRegionAccessPointPolicyResult.class), args == null ? GetMultiRegionAccessPointPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
