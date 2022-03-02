// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetGatewayCustomDomainArgs;
import io.pulumi.azurenative.appplatform.outputs.GetGatewayCustomDomainResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGatewayCustomDomain {
    private GetGatewayCustomDomain() {}
    public interface BuilderApplicator {
        public void apply(GetGatewayCustomDomainArgs.Builder a);
    }
    private static GetGatewayCustomDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGatewayCustomDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Custom domain of the Spring Cloud Gateway
 * API Version: 2022-01-01-preview.
 * 
     *
     * Custom domain of the Spring Cloud Gateway
 * 
     */
    public static CompletableFuture<GetGatewayCustomDomainResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Custom domain of the Spring Cloud Gateway
     * API Version: 2022-01-01-preview.
     * 
     *
         * Custom domain of the Spring Cloud Gateway
     * 
     */
    public static CompletableFuture<GetGatewayCustomDomainResult> invokeAsync(GetGatewayCustomDomainArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGatewayCustomDomain", TypeShape.of(GetGatewayCustomDomainResult.class), args == null ? GetGatewayCustomDomainArgs.Empty : args, Utilities.withVersion(options));
    }
}
