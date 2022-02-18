// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.inputs.GetFeatureArgs;
import io.pulumi.awsnative.evidently.outputs.GetFeatureResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeature {
/**
 * Resource Type definition for AWS::Evidently::Feature.
 * 
 */
    public static CompletableFuture<GetFeatureResult> invokeAsync(GetFeatureArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:evidently:getFeature", TypeShape.of(GetFeatureResult.class), args == null ? GetFeatureArgs.Empty : args, Utilities.withVersion(options));
    }
}
