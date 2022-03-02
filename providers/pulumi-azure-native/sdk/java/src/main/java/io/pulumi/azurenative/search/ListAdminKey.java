// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.search.inputs.ListAdminKeyArgs;
import io.pulumi.azurenative.search.outputs.ListAdminKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAdminKey {
    private ListAdminKey() {}
    public interface BuilderApplicator {
        public void apply(ListAdminKeyArgs.Builder a);
    }
    private static ListAdminKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListAdminKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
 * API Version: 2020-08-01.
 * 
     *
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
 * 
     */
    public static CompletableFuture<ListAdminKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     *
         * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * 
     */
    public static CompletableFuture<ListAdminKeyResult> invokeAsync(ListAdminKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:listAdminKey", TypeShape.of(ListAdminKeyResult.class), args == null ? ListAdminKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
