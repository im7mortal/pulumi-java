// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppApplicationSettingsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppApplicationSettingsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppApplicationSettings {
    private ListWebAppApplicationSettings() {}
    public interface BuilderApplicator {
        public void apply(ListWebAppApplicationSettingsArgs.Builder a);
    }
    private static ListWebAppApplicationSettingsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListWebAppApplicationSettingsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * String dictionary resource.
 * API Version: 2020-12-01.
 * 
     *
     * String dictionary resource.
 * 
     */
    public static CompletableFuture<ListWebAppApplicationSettingsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * String dictionary resource.
     * API Version: 2020-12-01.
     * 
     *
         * String dictionary resource.
     * 
     */
    public static CompletableFuture<ListWebAppApplicationSettingsResult> invokeAsync(ListWebAppApplicationSettingsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppApplicationSettings", TypeShape.of(ListWebAppApplicationSettingsResult.class), args == null ? ListWebAppApplicationSettingsArgs.Empty : args, Utilities.withVersion(options));
    }
}
