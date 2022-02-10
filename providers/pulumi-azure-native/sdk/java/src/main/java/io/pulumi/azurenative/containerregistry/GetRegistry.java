// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetRegistryArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetRegistryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistry {
    public static CompletableFuture<GetRegistryResult> invokeAsync(GetRegistryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getRegistry", TypeShape.of(GetRegistryResult.class), args == null ? GetRegistryArgs.Empty : args, Utilities.withVersion(options));
    }
}