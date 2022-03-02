// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetCloneJobArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetCloneJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCloneJob {
    private GetCloneJob() {}
    public interface BuilderApplicator {
        public void apply(GetCloneJobArgs.Builder a);
    }
    private static GetCloneJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCloneJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single CloneJob.
 * 
     */
    public static CompletableFuture<GetCloneJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single CloneJob.
     * 
     */
    public static CompletableFuture<GetCloneJobResult> invokeAsync(GetCloneJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getCloneJob", TypeShape.of(GetCloneJobResult.class), args == null ? GetCloneJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
