// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.changeanalysis.inputs.GetConfigurationProfileArgs;
import io.pulumi.azurenative.changeanalysis.outputs.GetConfigurationProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfigurationProfile {
    private GetConfigurationProfile() {}
    public interface BuilderApplicator {
        public void apply(GetConfigurationProfileArgs.Builder a);
    }
    private static GetConfigurationProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConfigurationProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
 * API Version: 2020-04-01-preview.
 * 
     *
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
 * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * API Version: 2020-04-01-preview.
     * 
     *
         * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> invokeAsync(GetConfigurationProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:changeanalysis:getConfigurationProfile", TypeShape.of(GetConfigurationProfileResult.class), args == null ? GetConfigurationProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
