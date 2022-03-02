// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetSubnetArgs;
import io.pulumi.azurenative.network.outputs.GetSubnetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubnet {
    private GetSubnet() {}
    public interface BuilderApplicator {
        public void apply(GetSubnetArgs.Builder a);
    }
    private static GetSubnetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSubnetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Subnet in a virtual network resource.
 * API Version: 2020-11-01.
 * 
     *
     * Subnet in a virtual network resource.
 * 
     */
    public static CompletableFuture<GetSubnetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Subnet in a virtual network resource.
     * API Version: 2020-11-01.
     * 
     *
         * Subnet in a virtual network resource.
     * 
     */
    public static CompletableFuture<GetSubnetResult> invokeAsync(GetSubnetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getSubnet", TypeShape.of(GetSubnetResult.class), args == null ? GetSubnetArgs.Empty : args, Utilities.withVersion(options));
    }
}
