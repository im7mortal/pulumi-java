// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1alpha2.inputs.GetMembershipIamPolicyArgs;
import io.pulumi.googlenative.gkehub_v1alpha2.outputs.GetMembershipIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMembershipIamPolicy {
    private GetMembershipIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetMembershipIamPolicyArgs.Builder a);
    }
    private static GetMembershipIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMembershipIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetMembershipIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMembershipIamPolicyResult> invokeAsync(GetMembershipIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1alpha2:getMembershipIamPolicy", TypeShape.of(GetMembershipIamPolicyResult.class), args == null ? GetMembershipIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
