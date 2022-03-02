// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.GetOpenShiftManagedClusterArgs;
import io.pulumi.azurenative.containerservice.outputs.GetOpenShiftManagedClusterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOpenShiftManagedCluster {
    private GetOpenShiftManagedCluster() {}
    public interface BuilderApplicator {
        public void apply(GetOpenShiftManagedClusterArgs.Builder a);
    }
    private static GetOpenShiftManagedClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOpenShiftManagedClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * OpenShift Managed cluster.
 * API Version: 2019-04-30.
 * 
     *
     * OpenShift Managed cluster.
 * 
     */
    public static CompletableFuture<GetOpenShiftManagedClusterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * OpenShift Managed cluster.
     * API Version: 2019-04-30.
     * 
     *
         * OpenShift Managed cluster.
     * 
     */
    public static CompletableFuture<GetOpenShiftManagedClusterResult> invokeAsync(GetOpenShiftManagedClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:getOpenShiftManagedCluster", TypeShape.of(GetOpenShiftManagedClusterResult.class), args == null ? GetOpenShiftManagedClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
