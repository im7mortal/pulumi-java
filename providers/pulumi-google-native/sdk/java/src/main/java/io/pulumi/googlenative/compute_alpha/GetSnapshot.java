// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetSnapshotArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetSnapshotResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSnapshot {
    private GetSnapshot() {}
    public interface BuilderApplicator {
        public void apply(GetSnapshotArgs.Builder a);
    }
    private static GetSnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified Snapshot resource. Gets a list of available snapshots by making a list() request.
 * 
     */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified Snapshot resource. Gets a list of available snapshots by making a list() request.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(GetSnapshotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getSnapshot", TypeShape.of(GetSnapshotResult.class), args == null ? GetSnapshotArgs.Empty : args, Utilities.withVersion(options));
    }
}
