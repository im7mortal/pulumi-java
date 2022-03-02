// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetGlobalAddressArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetGlobalAddressResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalAddress {
    private GetGlobalAddress() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalAddressArgs.Builder a);
    }
    private static GetGlobalAddressArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalAddressArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified address resource. Gets a list of available addresses by making a list() request.
 * 
     */
    public static CompletableFuture<GetGlobalAddressResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified address resource. Gets a list of available addresses by making a list() request.
     * 
     */
    public static CompletableFuture<GetGlobalAddressResult> invokeAsync(GetGlobalAddressArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getGlobalAddress", TypeShape.of(GetGlobalAddressResult.class), args == null ? GetGlobalAddressArgs.Empty : args, Utilities.withVersion(options));
    }
}
