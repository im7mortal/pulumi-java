// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetInstanceGroupArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetInstanceGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceGroup {
    private GetInstanceGroup() {}
    public interface BuilderApplicator {
        public void apply(GetInstanceGroupArgs.Builder a);
    }
    private static GetInstanceGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstanceGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified zonal instance group. Get a list of available zonal instance groups by making a list() request. For managed instance groups, use the instanceGroupManagers or regionInstanceGroupManagers methods instead.
 * 
     */
    public static CompletableFuture<GetInstanceGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified zonal instance group. Get a list of available zonal instance groups by making a list() request. For managed instance groups, use the instanceGroupManagers or regionInstanceGroupManagers methods instead.
     * 
     */
    public static CompletableFuture<GetInstanceGroupResult> invokeAsync(GetInstanceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getInstanceGroup", TypeShape.of(GetInstanceGroupResult.class), args == null ? GetInstanceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
