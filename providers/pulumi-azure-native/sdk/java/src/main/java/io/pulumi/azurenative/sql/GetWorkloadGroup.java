// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetWorkloadGroupArgs;
import io.pulumi.azurenative.sql.outputs.GetWorkloadGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkloadGroup {
    private GetWorkloadGroup() {}
    public interface BuilderApplicator {
        public void apply(GetWorkloadGroupArgs.Builder a);
    }
    private static GetWorkloadGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWorkloadGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Workload group operations for a data warehouse
 * API Version: 2020-11-01-preview.
 * 
     *
     * Workload group operations for a data warehouse
 * 
     */
    public static CompletableFuture<GetWorkloadGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Workload group operations for a data warehouse
     * API Version: 2020-11-01-preview.
     * 
     *
         * Workload group operations for a data warehouse
     * 
     */
    public static CompletableFuture<GetWorkloadGroupResult> invokeAsync(GetWorkloadGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getWorkloadGroup", TypeShape.of(GetWorkloadGroupResult.class), args == null ? GetWorkloadGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
