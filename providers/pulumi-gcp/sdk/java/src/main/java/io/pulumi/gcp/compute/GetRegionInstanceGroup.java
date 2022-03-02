// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetRegionInstanceGroupArgs;
import io.pulumi.gcp.compute.outputs.GetRegionInstanceGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionInstanceGroup {
    private GetRegionInstanceGroup() {}
    public interface BuilderApplicator {
        public void apply(GetRegionInstanceGroupArgs.Builder a);
    }
    private static GetRegionInstanceGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionInstanceGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get a Compute Region Instance Group within GCE.
 * For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/latest/regionInstanceGroups).
 * 
 * The most common use of this datasource will be to fetch information about the instances inside regional managed instance groups, for instance:
 * 
     *
     * A collection of arguments for invoking getRegionInstanceGroup.
 * 
     *
     * A collection of values returned by getRegionInstanceGroup.
 * 
     */
    public static CompletableFuture<GetRegionInstanceGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get a Compute Region Instance Group within GCE.
     * For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/latest/regionInstanceGroups).
     * 
     * The most common use of this datasource will be to fetch information about the instances inside regional managed instance groups, for instance:
     * 
     *
         * A collection of arguments for invoking getRegionInstanceGroup.
     * 
     *
         * A collection of values returned by getRegionInstanceGroup.
     * 
     */
    public static CompletableFuture<GetRegionInstanceGroupResult> invokeAsync(@Nullable GetRegionInstanceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getRegionInstanceGroup:getRegionInstanceGroup", TypeShape.of(GetRegionInstanceGroupResult.class), args == null ? GetRegionInstanceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
