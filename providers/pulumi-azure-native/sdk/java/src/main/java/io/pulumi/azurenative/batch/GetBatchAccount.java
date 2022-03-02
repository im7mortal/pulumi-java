// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.inputs.GetBatchAccountArgs;
import io.pulumi.azurenative.batch.outputs.GetBatchAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBatchAccount {
    private GetBatchAccount() {}
    public interface BuilderApplicator {
        public void apply(GetBatchAccountArgs.Builder a);
    }
    private static GetBatchAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBatchAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Contains information about an Azure Batch account.
 * API Version: 2021-01-01.
 * 
     *
     * Contains information about an Azure Batch account.
 * 
     */
    public static CompletableFuture<GetBatchAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Contains information about an Azure Batch account.
     * API Version: 2021-01-01.
     * 
     *
         * Contains information about an Azure Batch account.
     * 
     */
    public static CompletableFuture<GetBatchAccountResult> invokeAsync(GetBatchAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getBatchAccount", TypeShape.of(GetBatchAccountResult.class), args == null ? GetBatchAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
