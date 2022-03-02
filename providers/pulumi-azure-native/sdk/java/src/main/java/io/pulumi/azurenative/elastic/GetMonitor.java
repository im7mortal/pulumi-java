// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.elastic.inputs.GetMonitorArgs;
import io.pulumi.azurenative.elastic.outputs.GetMonitorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMonitor {
    private GetMonitor() {}
    public interface BuilderApplicator {
        public void apply(GetMonitorArgs.Builder a);
    }
    private static GetMonitorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMonitorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Monitor resource.
 * API Version: 2020-07-01.
 * 
     *
     * Monitor resource.
 * 
     */
    public static CompletableFuture<GetMonitorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Monitor resource.
     * API Version: 2020-07-01.
     * 
     *
         * Monitor resource.
     * 
     */
    public static CompletableFuture<GetMonitorResult> invokeAsync(GetMonitorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:elastic:getMonitor", TypeShape.of(GetMonitorResult.class), args == null ? GetMonitorArgs.Empty : args, Utilities.withVersion(options));
    }
}
