// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetSecurityConnectorArgs;
import io.pulumi.azurenative.security.outputs.GetSecurityConnectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityConnector {
    private GetSecurityConnector() {}
    public interface BuilderApplicator {
        public void apply(GetSecurityConnectorArgs.Builder a);
    }
    private static GetSecurityConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSecurityConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The security connector resource.
 * API Version: 2021-07-01-preview.
 * 
     *
     * The security connector resource.
 * 
     */
    public static CompletableFuture<GetSecurityConnectorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The security connector resource.
     * API Version: 2021-07-01-preview.
     * 
     *
         * The security connector resource.
     * 
     */
    public static CompletableFuture<GetSecurityConnectorResult> invokeAsync(GetSecurityConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getSecurityConnector", TypeShape.of(GetSecurityConnectorResult.class), args == null ? GetSecurityConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
