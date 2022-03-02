// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GetAutoscalingPolicyIamPolicyArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.GetAutoscalingPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutoscalingPolicyIamPolicy {
    private GetAutoscalingPolicyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetAutoscalingPolicyIamPolicyArgs.Builder a);
    }
    private static GetAutoscalingPolicyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAutoscalingPolicyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetAutoscalingPolicyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetAutoscalingPolicyIamPolicyResult> invokeAsync(GetAutoscalingPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1beta2:getAutoscalingPolicyIamPolicy", TypeShape.of(GetAutoscalingPolicyIamPolicyResult.class), args == null ? GetAutoscalingPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
