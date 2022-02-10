// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.orbital.inputs.GetSpacecraftArgs;
import io.pulumi.azurenative.orbital.outputs.GetSpacecraftResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSpacecraft {
    public static CompletableFuture<GetSpacecraftResult> invokeAsync(GetSpacecraftArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:getSpacecraft", TypeShape.of(GetSpacecraftResult.class), args == null ? GetSpacecraftArgs.Empty : args, Utilities.withVersion(options));
    }
}