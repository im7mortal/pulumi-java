// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakeanalytics.inputs.GetComputePolicyArgs;
import io.pulumi.azurenative.datalakeanalytics.outputs.GetComputePolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetComputePolicy {
    private GetComputePolicy() {}
    public interface BuilderApplicator {
        public void apply(GetComputePolicyArgs.Builder a);
    }
    private static GetComputePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetComputePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Data Lake Analytics compute policy information.
 * API Version: 2016-11-01.
 * 
     *
     * Data Lake Analytics compute policy information.
 * 
     */
    public static CompletableFuture<GetComputePolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Data Lake Analytics compute policy information.
     * API Version: 2016-11-01.
     * 
     *
         * Data Lake Analytics compute policy information.
     * 
     */
    public static CompletableFuture<GetComputePolicyResult> invokeAsync(GetComputePolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:getComputePolicy", TypeShape.of(GetComputePolicyResult.class), args == null ? GetComputePolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
