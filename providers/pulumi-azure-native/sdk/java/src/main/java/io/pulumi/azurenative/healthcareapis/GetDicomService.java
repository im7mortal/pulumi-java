// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.inputs.GetDicomServiceArgs;
import io.pulumi.azurenative.healthcareapis.outputs.GetDicomServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDicomService {
    private GetDicomService() {}
    public interface BuilderApplicator {
        public void apply(GetDicomServiceArgs.Builder a);
    }
    private static GetDicomServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDicomServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The description of Dicom Service
 * API Version: 2021-06-01-preview.
 * 
     *
     * The description of Dicom Service
 * 
     */
    public static CompletableFuture<GetDicomServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The description of Dicom Service
     * API Version: 2021-06-01-preview.
     * 
     *
         * The description of Dicom Service
     * 
     */
    public static CompletableFuture<GetDicomServiceResult> invokeAsync(GetDicomServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:healthcareapis:getDicomService", TypeShape.of(GetDicomServiceResult.class), args == null ? GetDicomServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
