// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetInstanceTemplateIamPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetInstanceTemplateIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceTemplateIamPolicy {
    private GetInstanceTemplateIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetInstanceTemplateIamPolicyArgs.Builder a);
    }
    private static GetInstanceTemplateIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstanceTemplateIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
     */
    public static CompletableFuture<GetInstanceTemplateIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetInstanceTemplateIamPolicyResult> invokeAsync(GetInstanceTemplateIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getInstanceTemplateIamPolicy", TypeShape.of(GetInstanceTemplateIamPolicyResult.class), args == null ? GetInstanceTemplateIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
