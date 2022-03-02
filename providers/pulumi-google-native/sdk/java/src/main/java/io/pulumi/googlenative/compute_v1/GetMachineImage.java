// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetMachineImageArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetMachineImageResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMachineImage {
    private GetMachineImage() {}
    public interface BuilderApplicator {
        public void apply(GetMachineImageArgs.Builder a);
    }
    private static GetMachineImageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMachineImageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified machine image. Gets a list of available machine images by making a list() request.
 * 
     */
    public static CompletableFuture<GetMachineImageResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified machine image. Gets a list of available machine images by making a list() request.
     * 
     */
    public static CompletableFuture<GetMachineImageResult> invokeAsync(GetMachineImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getMachineImage", TypeShape.of(GetMachineImageResult.class), args == null ? GetMachineImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
