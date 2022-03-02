// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetInstanceIamPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetInstanceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceIamPolicy {
    private GetInstanceIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetInstanceIamPolicyArgs.Builder a);
    }
    private static GetInstanceIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstanceIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> invokeAsync(GetInstanceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getInstanceIamPolicy", TypeShape.of(GetInstanceIamPolicyResult.class), args == null ? GetInstanceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
