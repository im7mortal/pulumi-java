// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetGatewayRouteConfigArgs;
import io.pulumi.azurenative.appplatform.outputs.GetGatewayRouteConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGatewayRouteConfig {
    public static CompletableFuture<GetGatewayRouteConfigResult> invokeAsync(GetGatewayRouteConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGatewayRouteConfig", TypeShape.of(GetGatewayRouteConfigResult.class), args == null ? GetGatewayRouteConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}