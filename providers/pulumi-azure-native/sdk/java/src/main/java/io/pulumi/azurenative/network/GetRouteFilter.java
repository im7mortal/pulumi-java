// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetRouteFilterArgs;
import io.pulumi.azurenative.network.outputs.GetRouteFilterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRouteFilter {
    public static CompletableFuture<GetRouteFilterResult> invokeAsync(GetRouteFilterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getRouteFilter", TypeShape.of(GetRouteFilterResult.class), args == null ? GetRouteFilterArgs.Empty : args, Utilities.withVersion(options));
    }
}