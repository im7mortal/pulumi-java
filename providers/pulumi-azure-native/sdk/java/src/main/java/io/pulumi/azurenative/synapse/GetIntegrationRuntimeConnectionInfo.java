// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetIntegrationRuntimeConnectionInfoArgs;
import io.pulumi.azurenative.synapse.outputs.GetIntegrationRuntimeConnectionInfoResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationRuntimeConnectionInfo {
    private GetIntegrationRuntimeConnectionInfo() {}
    public interface BuilderApplicator {
        public void apply(GetIntegrationRuntimeConnectionInfoArgs.Builder a);
    }
    private static GetIntegrationRuntimeConnectionInfoArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIntegrationRuntimeConnectionInfoArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Connection information for encrypting the on-premises data source credentials.
 * API Version: 2021-03-01.
 * 
     *
     * Connection information for encrypting the on-premises data source credentials.
 * 
     */
    public static CompletableFuture<GetIntegrationRuntimeConnectionInfoResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Connection information for encrypting the on-premises data source credentials.
     * API Version: 2021-03-01.
     * 
     *
         * Connection information for encrypting the on-premises data source credentials.
     * 
     */
    public static CompletableFuture<GetIntegrationRuntimeConnectionInfoResult> invokeAsync(GetIntegrationRuntimeConnectionInfoArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getIntegrationRuntimeConnectionInfo", TypeShape.of(GetIntegrationRuntimeConnectionInfoResult.class), args == null ? GetIntegrationRuntimeConnectionInfoArgs.Empty : args, Utilities.withVersion(options));
    }
}
