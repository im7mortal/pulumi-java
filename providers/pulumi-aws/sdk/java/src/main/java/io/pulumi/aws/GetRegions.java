// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetRegionsArgs;
import io.pulumi.aws.outputs.GetRegionsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegions {
    private GetRegions() {}
    public interface BuilderApplicator {
        public void apply(GetRegionsArgs.Builder a);
    }
    private static GetRegionsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `aws.getRegion` data source.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getRegions.
 * 
     *
     * A collection of values returned by getRegions.
 * 
     */
    public static CompletableFuture<GetRegionsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `aws.getRegion` data source.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getRegions.
     * 
     *
         * A collection of values returned by getRegions.
     * 
     */
    public static CompletableFuture<GetRegionsResult> invokeAsync(@Nullable GetRegionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getRegions:getRegions", TypeShape.of(GetRegionsResult.class), args == null ? GetRegionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
