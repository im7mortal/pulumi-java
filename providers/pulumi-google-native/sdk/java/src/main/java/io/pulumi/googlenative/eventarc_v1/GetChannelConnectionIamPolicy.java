// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.eventarc_v1.inputs.GetChannelConnectionIamPolicyArgs;
import io.pulumi.googlenative.eventarc_v1.outputs.GetChannelConnectionIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannelConnectionIamPolicy {
    private GetChannelConnectionIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetChannelConnectionIamPolicyArgs.Builder a);
    }
    private static GetChannelConnectionIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetChannelConnectionIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetChannelConnectionIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelConnectionIamPolicyResult> invokeAsync(GetChannelConnectionIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannelConnectionIamPolicy", TypeShape.of(GetChannelConnectionIamPolicyResult.class), args == null ? GetChannelConnectionIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
