// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetIotDpsResourceArgs;
import io.pulumi.azurenative.devices.outputs.GetIotDpsResourceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIotDpsResource {
    private GetIotDpsResource() {}
    public interface BuilderApplicator {
        public void apply(GetIotDpsResourceArgs.Builder a);
    }
    private static GetIotDpsResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIotDpsResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The description of the provisioning service.
 * API Version: 2020-03-01.
 * 
     *
     * The description of the provisioning service.
 * 
     */
    public static CompletableFuture<GetIotDpsResourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The description of the provisioning service.
     * API Version: 2020-03-01.
     * 
     *
         * The description of the provisioning service.
     * 
     */
    public static CompletableFuture<GetIotDpsResourceResult> invokeAsync(GetIotDpsResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotDpsResource", TypeShape.of(GetIotDpsResourceResult.class), args == null ? GetIotDpsResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
