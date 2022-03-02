// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetDiskIamPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetDiskIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDiskIamPolicy {
    private GetDiskIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetDiskIamPolicyArgs.Builder a);
    }
    private static GetDiskIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDiskIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
     */
    public static CompletableFuture<GetDiskIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDiskIamPolicyResult> invokeAsync(GetDiskIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getDiskIamPolicy", TypeShape.of(GetDiskIamPolicyResult.class), args == null ? GetDiskIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
