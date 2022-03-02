// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v4.inputs.GetJobArgs;
import io.pulumi.googlenative.jobs_v4.outputs.GetJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJob {
    private GetJob() {}
    public interface BuilderApplicator {
        public void apply(GetJobArgs.Builder a);
    }
    private static GetJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
 * 
     */
    public static CompletableFuture<GetJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
     * 
     */
    public static CompletableFuture<GetJobResult> invokeAsync(GetJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:jobs/v4:getJob", TypeShape.of(GetJobResult.class), args == null ? GetJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
