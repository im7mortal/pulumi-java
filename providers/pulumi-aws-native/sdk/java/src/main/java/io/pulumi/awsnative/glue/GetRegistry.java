// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.inputs.GetRegistryArgs;
import io.pulumi.awsnative.glue.outputs.GetRegistryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistry {
/**
 * This resource creates a Registry for authoring schemas as part of Glue Schema Registry.
 * 
 */
    public static CompletableFuture<GetRegistryResult> invokeAsync(GetRegistryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:glue:getRegistry", TypeShape.of(GetRegistryResult.class), args == null ? GetRegistryArgs.Empty : args, Utilities.withVersion(options));
    }
}
