// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetKustoClusterDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.GetKustoClusterDataSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKustoClusterDataSet {
    private GetKustoClusterDataSet() {}
    public interface BuilderApplicator {
        public void apply(GetKustoClusterDataSetArgs.Builder a);
    }
    private static GetKustoClusterDataSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKustoClusterDataSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A kusto cluster data set.
 * API Version: 2020-09-01.
 * 
     *
     * A kusto cluster data set.
 * 
     */
    public static CompletableFuture<GetKustoClusterDataSetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A kusto cluster data set.
     * API Version: 2020-09-01.
     * 
     *
         * A kusto cluster data set.
     * 
     */
    public static CompletableFuture<GetKustoClusterDataSetResult> invokeAsync(GetKustoClusterDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getKustoClusterDataSet", TypeShape.of(GetKustoClusterDataSetResult.class), args == null ? GetKustoClusterDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
