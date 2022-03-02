// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.signer.inputs.GetSigningJobArgs;
import io.pulumi.aws.signer.outputs.GetSigningJobResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSigningJob {
    private GetSigningJob() {}
    public interface BuilderApplicator {
        public void apply(GetSigningJobArgs.Builder a);
    }
    private static GetSigningJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSigningJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information about a Signer Signing Job.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getSigningJob.
 * 
     *
     * A collection of values returned by getSigningJob.
 * 
     */
    public static CompletableFuture<GetSigningJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information about a Signer Signing Job.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getSigningJob.
     * 
     *
         * A collection of values returned by getSigningJob.
     * 
     */
    public static CompletableFuture<GetSigningJobResult> invokeAsync(GetSigningJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:signer/getSigningJob:getSigningJob", TypeShape.of(GetSigningJobResult.class), args == null ? GetSigningJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
