// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppMetadataSlotArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppMetadataSlotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppMetadataSlot {
    private ListWebAppMetadataSlot() {}
    public interface BuilderApplicator {
        public void apply(ListWebAppMetadataSlotArgs.Builder a);
    }
    private static ListWebAppMetadataSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListWebAppMetadataSlotArgs.builder();
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
    public static CompletableFuture<ListWebAppMetadataSlotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
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
    public static CompletableFuture<ListWebAppMetadataSlotResult> invokeAsync(ListWebAppMetadataSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppMetadataSlot", TypeShape.of(ListWebAppMetadataSlotResult.class), args == null ? ListWebAppMetadataSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
