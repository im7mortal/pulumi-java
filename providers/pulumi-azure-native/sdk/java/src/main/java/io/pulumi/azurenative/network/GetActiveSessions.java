// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetActiveSessionsArgs;
import io.pulumi.azurenative.network.outputs.GetActiveSessionsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetActiveSessions {
    private GetActiveSessions() {}
    public interface BuilderApplicator {
        public void apply(GetActiveSessionsArgs.Builder a);
    }
    private static GetActiveSessionsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetActiveSessionsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response for GetActiveSessions.
 * API Version: 2020-11-01.
 * 
     *
     * Response for GetActiveSessions.
 * 
     */
    public static CompletableFuture<GetActiveSessionsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response for GetActiveSessions.
     * API Version: 2020-11-01.
     * 
     *
         * Response for GetActiveSessions.
     * 
     */
    public static CompletableFuture<GetActiveSessionsResult> invokeAsync(GetActiveSessionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getActiveSessions", TypeShape.of(GetActiveSessionsResult.class), args == null ? GetActiveSessionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
