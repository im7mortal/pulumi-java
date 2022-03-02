// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GetWorkerPoolArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GetWorkerPoolResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkerPool {
    private GetWorkerPool() {}
    public interface BuilderApplicator {
        public void apply(GetWorkerPoolArgs.Builder a);
    }
    private static GetWorkerPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWorkerPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns details of a `WorkerPool`.
 * 
     */
    public static CompletableFuture<GetWorkerPoolResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns details of a `WorkerPool`.
     * 
     */
    public static CompletableFuture<GetWorkerPoolResult> invokeAsync(GetWorkerPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbuild/v1:getWorkerPool", TypeShape.of(GetWorkerPoolResult.class), args == null ? GetWorkerPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
