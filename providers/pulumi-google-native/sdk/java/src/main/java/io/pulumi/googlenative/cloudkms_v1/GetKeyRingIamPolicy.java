// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingIamPolicyArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKeyRingIamPolicy {
    private GetKeyRingIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetKeyRingIamPolicyArgs.Builder a);
    }
    private static GetKeyRingIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyRingIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetKeyRingIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingIamPolicyResult> invokeAsync(GetKeyRingIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingIamPolicy", TypeShape.of(GetKeyRingIamPolicyResult.class), args == null ? GetKeyRingIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
