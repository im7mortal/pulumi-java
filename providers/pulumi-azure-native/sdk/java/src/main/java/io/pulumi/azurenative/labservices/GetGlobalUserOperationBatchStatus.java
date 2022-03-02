// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationBatchStatusArgs;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationBatchStatusResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalUserOperationBatchStatus {
    private GetGlobalUserOperationBatchStatus() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalUserOperationBatchStatusArgs.Builder a);
    }
    private static GetGlobalUserOperationBatchStatusArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalUserOperationBatchStatusArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Status Details of the long running operation for an environment
 * API Version: 2018-10-15.
 * 
     *
     * Status Details of the long running operation for an environment
 * 
     */
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     *
         * Status Details of the long running operation for an environment
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> invokeAsync(GetGlobalUserOperationBatchStatusArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationBatchStatus", TypeShape.of(GetGlobalUserOperationBatchStatusResult.class), args == null ? GetGlobalUserOperationBatchStatusArgs.Empty : args, Utilities.withVersion(options));
    }
}
