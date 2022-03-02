// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetVCenterArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetVCenterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVCenter {
    private GetVCenter() {}
    public interface BuilderApplicator {
        public void apply(GetVCenterArgs.Builder a);
    }
    private static GetVCenterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVCenterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Defines the vCenter.
 * API Version: 2020-10-01-preview.
 * 
     *
     * Defines the vCenter.
 * 
     */
    public static CompletableFuture<GetVCenterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Defines the vCenter.
     * API Version: 2020-10-01-preview.
     * 
     *
         * Defines the vCenter.
     * 
     */
    public static CompletableFuture<GetVCenterResult> invokeAsync(GetVCenterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getVCenter", TypeShape.of(GetVCenterResult.class), args == null ? GetVCenterArgs.Empty : args, Utilities.withVersion(options));
    }
}
