// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maintenance.inputs.GetMaintenanceConfigurationArgs;
import io.pulumi.azurenative.maintenance.outputs.GetMaintenanceConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMaintenanceConfiguration {
    private GetMaintenanceConfiguration() {}
    public interface BuilderApplicator {
        public void apply(GetMaintenanceConfigurationArgs.Builder a);
    }
    private static GetMaintenanceConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMaintenanceConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Maintenance configuration record type
 * API Version: 2020-04-01.
 * 
     *
     * Maintenance configuration record type
 * 
     */
    public static CompletableFuture<GetMaintenanceConfigurationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Maintenance configuration record type
     * API Version: 2020-04-01.
     * 
     *
         * Maintenance configuration record type
     * 
     */
    public static CompletableFuture<GetMaintenanceConfigurationResult> invokeAsync(GetMaintenanceConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maintenance:getMaintenanceConfiguration", TypeShape.of(GetMaintenanceConfigurationResult.class), args == null ? GetMaintenanceConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
