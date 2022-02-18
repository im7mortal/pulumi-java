// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetFeatureGroupArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetFeatureGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeatureGroup {
/**
 * Resource Type definition for AWS::SageMaker::FeatureGroup
 * 
 */
    public static CompletableFuture<GetFeatureGroupResult> invokeAsync(GetFeatureGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getFeatureGroup", TypeShape.of(GetFeatureGroupResult.class), args == null ? GetFeatureGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
