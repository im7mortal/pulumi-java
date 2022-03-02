// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.baremetalsolution_v2.inputs.GetSnapshotSchedulePolicyArgs;
import io.pulumi.googlenative.baremetalsolution_v2.outputs.GetSnapshotSchedulePolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSnapshotSchedulePolicy {
    private GetSnapshotSchedulePolicy() {}
    public interface BuilderApplicator {
        public void apply(GetSnapshotSchedulePolicyArgs.Builder a);
    }
    private static GetSnapshotSchedulePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSnapshotSchedulePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get details of a single snapshot schedule policy.
 * 
     */
    public static CompletableFuture<GetSnapshotSchedulePolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get details of a single snapshot schedule policy.
     * 
     */
    public static CompletableFuture<GetSnapshotSchedulePolicyResult> invokeAsync(GetSnapshotSchedulePolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:baremetalsolution/v2:getSnapshotSchedulePolicy", TypeShape.of(GetSnapshotSchedulePolicyResult.class), args == null ? GetSnapshotSchedulePolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
