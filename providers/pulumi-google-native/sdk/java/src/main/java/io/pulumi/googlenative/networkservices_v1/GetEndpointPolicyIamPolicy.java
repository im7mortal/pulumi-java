// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1.inputs.GetEndpointPolicyIamPolicyArgs;
import io.pulumi.googlenative.networkservices_v1.outputs.GetEndpointPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEndpointPolicyIamPolicy {
    private GetEndpointPolicyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetEndpointPolicyIamPolicyArgs.Builder a);
    }
    private static GetEndpointPolicyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEndpointPolicyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> invokeAsync(GetEndpointPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1:getEndpointPolicyIamPolicy", TypeShape.of(GetEndpointPolicyIamPolicyResult.class), args == null ? GetEndpointPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
