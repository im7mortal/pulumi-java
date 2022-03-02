// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetStorageInsightConfigArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetStorageInsightConfigResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStorageInsightConfig {
    private GetStorageInsightConfig() {}
    public interface BuilderApplicator {
        public void apply(GetStorageInsightConfigArgs.Builder a);
    }
    private static GetStorageInsightConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetStorageInsightConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The top level storage insight resource container.
 * API Version: 2020-08-01.
 * 
     *
     * The top level storage insight resource container.
 * 
     */
    public static CompletableFuture<GetStorageInsightConfigResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The top level storage insight resource container.
     * API Version: 2020-08-01.
     * 
     *
         * The top level storage insight resource container.
     * 
     */
    public static CompletableFuture<GetStorageInsightConfigResult> invokeAsync(GetStorageInsightConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getStorageInsightConfig", TypeShape.of(GetStorageInsightConfigResult.class), args == null ? GetStorageInsightConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
