// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.signalrservice.inputs.GetSignalRSharedPrivateLinkResourceArgs;
import io.pulumi.azurenative.signalrservice.outputs.GetSignalRSharedPrivateLinkResourceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSignalRSharedPrivateLinkResource {
    private GetSignalRSharedPrivateLinkResource() {}
    public interface BuilderApplicator {
        public void apply(GetSignalRSharedPrivateLinkResourceArgs.Builder a);
    }
    private static GetSignalRSharedPrivateLinkResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSignalRSharedPrivateLinkResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Describes a Shared Private Link Resource
 * API Version: 2021-04-01-preview.
 * 
     *
     * Describes a Shared Private Link Resource
 * 
     */
    public static CompletableFuture<GetSignalRSharedPrivateLinkResourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Describes a Shared Private Link Resource
     * API Version: 2021-04-01-preview.
     * 
     *
         * Describes a Shared Private Link Resource
     * 
     */
    public static CompletableFuture<GetSignalRSharedPrivateLinkResourceResult> invokeAsync(GetSignalRSharedPrivateLinkResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:signalrservice:getSignalRSharedPrivateLinkResource", TypeShape.of(GetSignalRSharedPrivateLinkResourceResult.class), args == null ? GetSignalRSharedPrivateLinkResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
