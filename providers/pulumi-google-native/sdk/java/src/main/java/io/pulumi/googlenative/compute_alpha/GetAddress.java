// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetAddressArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetAddressResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAddress {
    public static CompletableFuture<GetAddressResult> invokeAsync(GetAddressArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getAddress", TypeShape.of(GetAddressResult.class), args == null ? GetAddressArgs.Empty : args, Utilities.withVersion(options));
    }
}