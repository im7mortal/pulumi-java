// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetGlobalReachConnectionArgs;
import io.pulumi.azurenative.avs.outputs.GetGlobalReachConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalReachConnection {
    private GetGlobalReachConnection() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalReachConnectionArgs.Builder a);
    }
    private static GetGlobalReachConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalReachConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A global reach connection resource
 * API Version: 2020-07-17-preview.
 * 
     *
     * A global reach connection resource
 * 
     */
    public static CompletableFuture<GetGlobalReachConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A global reach connection resource
     * API Version: 2020-07-17-preview.
     * 
     *
         * A global reach connection resource
     * 
     */
    public static CompletableFuture<GetGlobalReachConnectionResult> invokeAsync(GetGlobalReachConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getGlobalReachConnection", TypeShape.of(GetGlobalReachConnectionResult.class), args == null ? GetGlobalReachConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
