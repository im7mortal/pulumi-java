// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetLicenseIamPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetLicenseIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLicenseIamPolicy {
    private GetLicenseIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetLicenseIamPolicyArgs.Builder a);
    }
    private static GetLicenseIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLicenseIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists. *Caution* This resource is intended for use only by third-party partners who are creating Cloud Marketplace images.
 * 
     */
    public static CompletableFuture<GetLicenseIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. May be empty if no such policy or resource exists. *Caution* This resource is intended for use only by third-party partners who are creating Cloud Marketplace images.
     * 
     */
    public static CompletableFuture<GetLicenseIamPolicyResult> invokeAsync(GetLicenseIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getLicenseIamPolicy", TypeShape.of(GetLicenseIamPolicyResult.class), args == null ? GetLicenseIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
