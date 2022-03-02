// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1.inputs.GetAuthorizationPolicyIamPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1.outputs.GetAuthorizationPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAuthorizationPolicyIamPolicy {
    private GetAuthorizationPolicyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetAuthorizationPolicyIamPolicyArgs.Builder a);
    }
    private static GetAuthorizationPolicyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAuthorizationPolicyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetAuthorizationPolicyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetAuthorizationPolicyIamPolicyResult> invokeAsync(GetAuthorizationPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1:getAuthorizationPolicyIamPolicy", TypeShape.of(GetAuthorizationPolicyIamPolicyResult.class), args == null ? GetAuthorizationPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
