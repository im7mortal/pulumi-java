// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.inputs.GetCapacityProviderArgs;
import io.pulumi.awsnative.ecs.outputs.GetCapacityProviderResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCapacityProvider {
/**
 * Resource Type definition for AWS::ECS::CapacityProvider.
 * 
 */
    public static CompletableFuture<GetCapacityProviderResult> invokeAsync(GetCapacityProviderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getCapacityProvider", TypeShape.of(GetCapacityProviderResult.class), args == null ? GetCapacityProviderArgs.Empty : args, Utilities.withVersion(options));
    }
}