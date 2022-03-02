// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetArcAddonArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetArcAddonResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetArcAddon {
    private GetArcAddon() {}
    public interface BuilderApplicator {
        public void apply(GetArcAddonArgs.Builder a);
    }
    private static GetArcAddonArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetArcAddonArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Arc Addon.
 * API Version: 2020-12-01.
 * 
     *
     * Arc Addon.
 * 
     */
    public static CompletableFuture<GetArcAddonResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Arc Addon.
     * API Version: 2020-12-01.
     * 
     *
         * Arc Addon.
     * 
     */
    public static CompletableFuture<GetArcAddonResult> invokeAsync(GetArcAddonArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getArcAddon", TypeShape.of(GetArcAddonResult.class), args == null ? GetArcAddonArgs.Empty : args, Utilities.withVersion(options));
    }
}
