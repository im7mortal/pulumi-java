// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetOrganizationEnvironmentIamPolicyArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetOrganizationEnvironmentIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationEnvironmentIamPolicy {
    private GetOrganizationEnvironmentIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetOrganizationEnvironmentIamPolicyArgs.Builder a);
    }
    private static GetOrganizationEnvironmentIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOrganizationEnvironmentIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the IAM policy on an environment. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.getIamPolicy` permission to call this API.
 * 
     */
    public static CompletableFuture<GetOrganizationEnvironmentIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the IAM policy on an environment. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.getIamPolicy` permission to call this API.
     * 
     */
    public static CompletableFuture<GetOrganizationEnvironmentIamPolicyResult> invokeAsync(GetOrganizationEnvironmentIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getOrganizationEnvironmentIamPolicy", TypeShape.of(GetOrganizationEnvironmentIamPolicyResult.class), args == null ? GetOrganizationEnvironmentIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
