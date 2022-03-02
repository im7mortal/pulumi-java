// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetImportJobArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetImportJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImportJob {
    private GetImportJob() {}
    public interface BuilderApplicator {
        public void apply(GetImportJobArgs.Builder a);
    }
    private static GetImportJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetImportJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns metadata for a given ImportJob.
 * 
     */
    public static CompletableFuture<GetImportJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns metadata for a given ImportJob.
     * 
     */
    public static CompletableFuture<GetImportJobResult> invokeAsync(GetImportJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getImportJob", TypeShape.of(GetImportJobResult.class), args == null ? GetImportJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
