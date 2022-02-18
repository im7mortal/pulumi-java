// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.inputs.GetInstanceProfileArgs;
import io.pulumi.awsnative.devicefarm.outputs.GetInstanceProfileResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceProfile {
/**
 * AWS::DeviceFarm::InstanceProfile creates a new Device Farm Instance Profile
 * 
 */
    public static CompletableFuture<GetInstanceProfileResult> invokeAsync(GetInstanceProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devicefarm:getInstanceProfile", TypeShape.of(GetInstanceProfileResult.class), args == null ? GetInstanceProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
