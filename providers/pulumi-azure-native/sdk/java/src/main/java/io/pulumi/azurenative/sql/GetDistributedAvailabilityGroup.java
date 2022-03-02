// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDistributedAvailabilityGroupArgs;
import io.pulumi.azurenative.sql.outputs.GetDistributedAvailabilityGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDistributedAvailabilityGroup {
    private GetDistributedAvailabilityGroup() {}
    public interface BuilderApplicator {
        public void apply(GetDistributedAvailabilityGroupArgs.Builder a);
    }
    private static GetDistributedAvailabilityGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDistributedAvailabilityGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Distributed availability group between box and Sql Managed Instance.
 * API Version: 2021-05-01-preview.
 * 
     *
     * Distributed availability group between box and Sql Managed Instance.
 * 
     */
    public static CompletableFuture<GetDistributedAvailabilityGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Distributed availability group between box and Sql Managed Instance.
     * API Version: 2021-05-01-preview.
     * 
     *
         * Distributed availability group between box and Sql Managed Instance.
     * 
     */
    public static CompletableFuture<GetDistributedAvailabilityGroupResult> invokeAsync(GetDistributedAvailabilityGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDistributedAvailabilityGroup", TypeShape.of(GetDistributedAvailabilityGroupResult.class), args == null ? GetDistributedAvailabilityGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
