// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.inputs.GetDiskArgs;
import io.pulumi.awsnative.lightsail.outputs.GetDiskResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDisk {
/**
 * Resource Type definition for AWS::Lightsail::Disk
 * 
 */
    public static CompletableFuture<GetDiskResult> invokeAsync(GetDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lightsail:getDisk", TypeShape.of(GetDiskResult.class), args == null ? GetDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}
