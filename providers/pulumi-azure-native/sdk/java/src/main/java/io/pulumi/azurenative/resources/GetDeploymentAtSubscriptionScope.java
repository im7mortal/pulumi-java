// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtSubscriptionScopeArgs;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtSubscriptionScopeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeploymentAtSubscriptionScope {
    private GetDeploymentAtSubscriptionScope() {}
    public interface BuilderApplicator {
        public void apply(GetDeploymentAtSubscriptionScopeArgs.Builder a);
    }
    private static GetDeploymentAtSubscriptionScopeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDeploymentAtSubscriptionScopeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Deployment information.
 * API Version: 2021-01-01.
 * 
     *
     * Deployment information.
 * 
     */
    public static CompletableFuture<GetDeploymentAtSubscriptionScopeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Deployment information.
     * API Version: 2021-01-01.
     * 
     *
         * Deployment information.
     * 
     */
    public static CompletableFuture<GetDeploymentAtSubscriptionScopeResult> invokeAsync(GetDeploymentAtSubscriptionScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtSubscriptionScope", TypeShape.of(GetDeploymentAtSubscriptionScopeResult.class), args == null ? GetDeploymentAtSubscriptionScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}
