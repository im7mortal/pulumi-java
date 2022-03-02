// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs;
import io.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDistributionConfigurations {
    private GetDistributionConfigurations() {}
    public interface BuilderApplicator {
        public void apply(GetDistributionConfigurationsArgs.Builder a);
    }
    private static GetDistributionConfigurationsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDistributionConfigurationsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getDistributionConfigurations.
 * 
     *
     * A collection of values returned by getDistributionConfigurations.
 * 
     */
    public static CompletableFuture<GetDistributionConfigurationsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getDistributionConfigurations.
     * 
     *
         * A collection of values returned by getDistributionConfigurations.
     * 
     */
    public static CompletableFuture<GetDistributionConfigurationsResult> invokeAsync(@Nullable GetDistributionConfigurationsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:imagebuilder/getDistributionConfigurations:getDistributionConfigurations", TypeShape.of(GetDistributionConfigurationsResult.class), args == null ? GetDistributionConfigurationsArgs.Empty : args, Utilities.withVersion(options));
    }
}
