// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datadog.inputs.GetMonitorDefaultKeyArgs;
import io.pulumi.azurenative.datadog.outputs.GetMonitorDefaultKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMonitorDefaultKey {
    private GetMonitorDefaultKey() {}
    public interface BuilderApplicator {
        public void apply(GetMonitorDefaultKeyArgs.Builder a);
    }
    private static GetMonitorDefaultKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMonitorDefaultKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2021-03-01.
 * 
     */
    public static CompletableFuture<GetMonitorDefaultKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetMonitorDefaultKeyResult> invokeAsync(GetMonitorDefaultKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datadog:getMonitorDefaultKey", TypeShape.of(GetMonitorDefaultKeyResult.class), args == null ? GetMonitorDefaultKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
