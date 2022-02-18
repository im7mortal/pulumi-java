// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetAppImageConfigArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetAppImageConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppImageConfig {
/**
 * Resource Type definition for AWS::SageMaker::AppImageConfig
 * 
 */
    public static CompletableFuture<GetAppImageConfigResult> invokeAsync(GetAppImageConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getAppImageConfig", TypeShape.of(GetAppImageConfigResult.class), args == null ? GetAppImageConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
