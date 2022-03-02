// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.securitycenter_v1.inputs.GetOrganizationSourceIamPolicyArgs;
import io.pulumi.googlenative.securitycenter_v1.outputs.GetOrganizationSourceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationSourceIamPolicy {
    private GetOrganizationSourceIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetOrganizationSourceIamPolicyArgs.Builder a);
    }
    private static GetOrganizationSourceIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOrganizationSourceIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy on the specified Source.
 * 
     */
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy on the specified Source.
     * 
     */
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> invokeAsync(GetOrganizationSourceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getOrganizationSourceIamPolicy", TypeShape.of(GetOrganizationSourceIamPolicyResult.class), args == null ? GetOrganizationSourceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
