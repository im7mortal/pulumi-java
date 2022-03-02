// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.inputs.GetVolumeArgs;
import io.pulumi.azurenative.servicefabricmesh.outputs.GetVolumeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVolume {
    private GetVolume() {}
    public interface BuilderApplicator {
        public void apply(GetVolumeArgs.Builder a);
    }
    private static GetVolumeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVolumeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * This type describes a volume resource.
 * API Version: 2018-09-01-preview.
 * 
     *
     * This type describes a volume resource.
 * 
     */
    public static CompletableFuture<GetVolumeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * This type describes a volume resource.
     * API Version: 2018-09-01-preview.
     * 
     *
         * This type describes a volume resource.
     * 
     */
    public static CompletableFuture<GetVolumeResult> invokeAsync(GetVolumeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getVolume", TypeShape.of(GetVolumeResult.class), args == null ? GetVolumeArgs.Empty : args, Utilities.withVersion(options));
    }
}
