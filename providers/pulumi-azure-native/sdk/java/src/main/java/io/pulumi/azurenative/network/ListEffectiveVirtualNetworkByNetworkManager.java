// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.ListEffectiveVirtualNetworkByNetworkManagerArgs;
import io.pulumi.azurenative.network.outputs.ListEffectiveVirtualNetworkByNetworkManagerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListEffectiveVirtualNetworkByNetworkManager {
    private ListEffectiveVirtualNetworkByNetworkManager() {}
    public interface BuilderApplicator {
        public void apply(ListEffectiveVirtualNetworkByNetworkManagerArgs.Builder a);
    }
    private static ListEffectiveVirtualNetworkByNetworkManagerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListEffectiveVirtualNetworkByNetworkManagerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Result of the request to list Effective Virtual Network. It contains a list of groups and a URL link to get the next set of results.
 * API Version: 2021-02-01-preview.
 * 
     *
     * Result of the request to list Effective Virtual Network. It contains a list of groups and a URL link to get the next set of results.
 * 
     */
    public static CompletableFuture<ListEffectiveVirtualNetworkByNetworkManagerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Result of the request to list Effective Virtual Network. It contains a list of groups and a URL link to get the next set of results.
     * API Version: 2021-02-01-preview.
     * 
     *
         * Result of the request to list Effective Virtual Network. It contains a list of groups and a URL link to get the next set of results.
     * 
     */
    public static CompletableFuture<ListEffectiveVirtualNetworkByNetworkManagerResult> invokeAsync(ListEffectiveVirtualNetworkByNetworkManagerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:listEffectiveVirtualNetworkByNetworkManager", TypeShape.of(ListEffectiveVirtualNetworkByNetworkManagerResult.class), args == null ? ListEffectiveVirtualNetworkByNetworkManagerArgs.Empty : args, Utilities.withVersion(options));
    }
}
