// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.engagementfabric.inputs.ListAccountChannelTypesArgs;
import io.pulumi.azurenative.engagementfabric.outputs.ListAccountChannelTypesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAccountChannelTypes {
    private ListAccountChannelTypes() {}
    public interface BuilderApplicator {
        public void apply(ListAccountChannelTypesArgs.Builder a);
    }
    private static ListAccountChannelTypesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListAccountChannelTypesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * List of the EngagementFabric channel descriptions
 * API Version: 2018-09-01-preview.
 * 
     *
     * List of the EngagementFabric channel descriptions
 * 
     */
    public static CompletableFuture<ListAccountChannelTypesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * List of the EngagementFabric channel descriptions
     * API Version: 2018-09-01-preview.
     * 
     *
         * List of the EngagementFabric channel descriptions
     * 
     */
    public static CompletableFuture<ListAccountChannelTypesResult> invokeAsync(ListAccountChannelTypesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:engagementfabric:listAccountChannelTypes", TypeShape.of(ListAccountChannelTypesResult.class), args == null ? ListAccountChannelTypesArgs.Empty : args, Utilities.withVersion(options));
    }
}
