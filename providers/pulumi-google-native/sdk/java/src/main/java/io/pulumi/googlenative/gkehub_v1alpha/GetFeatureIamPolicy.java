// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.GetFeatureIamPolicyArgs;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.GetFeatureIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeatureIamPolicy {
    private GetFeatureIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetFeatureIamPolicyArgs.Builder a);
    }
    private static GetFeatureIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFeatureIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetFeatureIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetFeatureIamPolicyResult> invokeAsync(GetFeatureIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1alpha:getFeatureIamPolicy", TypeShape.of(GetFeatureIamPolicyResult.class), args == null ? GetFeatureIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
