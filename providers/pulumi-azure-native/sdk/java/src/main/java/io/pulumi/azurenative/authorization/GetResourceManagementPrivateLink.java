// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetResourceManagementPrivateLinkArgs;
import io.pulumi.azurenative.authorization.outputs.GetResourceManagementPrivateLinkResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceManagementPrivateLink {
    private GetResourceManagementPrivateLink() {}
    public interface BuilderApplicator {
        public void apply(GetResourceManagementPrivateLinkArgs.Builder a);
    }
    private static GetResourceManagementPrivateLinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResourceManagementPrivateLinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2020-05-01.
 * 
     */
    public static CompletableFuture<GetResourceManagementPrivateLinkResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetResourceManagementPrivateLinkResult> invokeAsync(GetResourceManagementPrivateLinkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getResourceManagementPrivateLink", TypeShape.of(GetResourceManagementPrivateLinkResult.class), args == null ? GetResourceManagementPrivateLinkArgs.Empty : args, Utilities.withVersion(options));
    }
}
