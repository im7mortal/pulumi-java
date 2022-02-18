// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediapackage.inputs.GetChannelArgs;
import io.pulumi.awsnative.mediapackage.outputs.GetChannelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannel {
/**
 * Resource schema for AWS::MediaPackage::Channel
 * 
 */
    public static CompletableFuture<GetChannelResult> invokeAsync(GetChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediapackage:getChannel", TypeShape.of(GetChannelResult.class), args == null ? GetChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}