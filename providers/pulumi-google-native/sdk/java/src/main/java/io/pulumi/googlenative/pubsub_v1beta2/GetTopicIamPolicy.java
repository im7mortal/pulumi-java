// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsub_v1beta2.inputs.GetTopicIamPolicyArgs;
import io.pulumi.googlenative.pubsub_v1beta2.outputs.GetTopicIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopicIamPolicy {
    private GetTopicIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetTopicIamPolicyArgs.Builder a);
    }
    private static GetTopicIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTopicIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetTopicIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTopicIamPolicyResult> invokeAsync(GetTopicIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta2:getTopicIamPolicy", TypeShape.of(GetTopicIamPolicyResult.class), args == null ? GetTopicIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
