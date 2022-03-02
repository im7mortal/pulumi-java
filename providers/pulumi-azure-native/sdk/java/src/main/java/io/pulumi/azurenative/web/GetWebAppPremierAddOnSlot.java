// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppPremierAddOnSlotArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppPremierAddOnSlotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppPremierAddOnSlot {
    private GetWebAppPremierAddOnSlot() {}
    public interface BuilderApplicator {
        public void apply(GetWebAppPremierAddOnSlotArgs.Builder a);
    }
    private static GetWebAppPremierAddOnSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWebAppPremierAddOnSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Premier add-on.
 * API Version: 2020-12-01.
 * 
     *
     * Premier add-on.
 * 
     */
    public static CompletableFuture<GetWebAppPremierAddOnSlotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Premier add-on.
     * API Version: 2020-12-01.
     * 
     *
         * Premier add-on.
     * 
     */
    public static CompletableFuture<GetWebAppPremierAddOnSlotResult> invokeAsync(GetWebAppPremierAddOnSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppPremierAddOnSlot", TypeShape.of(GetWebAppPremierAddOnSlotResult.class), args == null ? GetWebAppPremierAddOnSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
