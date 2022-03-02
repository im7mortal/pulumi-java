// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetIotHubResourceArgs;
import io.pulumi.azurenative.devices.outputs.GetIotHubResourceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIotHubResource {
    private GetIotHubResource() {}
    public interface BuilderApplicator {
        public void apply(GetIotHubResourceArgs.Builder a);
    }
    private static GetIotHubResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIotHubResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The description of the IoT hub.
 * API Version: 2020-08-31.
 * 
     *
     * The description of the IoT hub.
 * 
     */
    public static CompletableFuture<GetIotHubResourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The description of the IoT hub.
     * API Version: 2020-08-31.
     * 
     *
         * The description of the IoT hub.
     * 
     */
    public static CompletableFuture<GetIotHubResourceResult> invokeAsync(GetIotHubResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotHubResource", TypeShape.of(GetIotHubResourceResult.class), args == null ? GetIotHubResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
