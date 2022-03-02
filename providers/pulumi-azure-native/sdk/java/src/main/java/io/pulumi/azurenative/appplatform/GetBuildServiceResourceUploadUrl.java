// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetBuildServiceResourceUploadUrlArgs;
import io.pulumi.azurenative.appplatform.outputs.GetBuildServiceResourceUploadUrlResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBuildServiceResourceUploadUrl {
    private GetBuildServiceResourceUploadUrl() {}
    public interface BuilderApplicator {
        public void apply(GetBuildServiceResourceUploadUrlArgs.Builder a);
    }
    private static GetBuildServiceResourceUploadUrlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBuildServiceResourceUploadUrlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource upload definition payload
 * API Version: 2022-01-01-preview.
 * 
     *
     * Resource upload definition payload
 * 
     */
    public static CompletableFuture<GetBuildServiceResourceUploadUrlResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource upload definition payload
     * API Version: 2022-01-01-preview.
     * 
     *
         * Resource upload definition payload
     * 
     */
    public static CompletableFuture<GetBuildServiceResourceUploadUrlResult> invokeAsync(GetBuildServiceResourceUploadUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildServiceResourceUploadUrl", TypeShape.of(GetBuildServiceResourceUploadUrlResult.class), args == null ? GetBuildServiceResourceUploadUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}
