// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.inputs.GetServiceAccountIamPolicyArgs;
import io.pulumi.googlenative.iam_v1.outputs.GetServiceAccountIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceAccountIamPolicy {
    private GetServiceAccountIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetServiceAccountIamPolicyArgs.Builder a);
    }
    private static GetServiceAccountIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceAccountIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API's [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
 * 
     */
    public static CompletableFuture<GetServiceAccountIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API's [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
     * 
     */
    public static CompletableFuture<GetServiceAccountIamPolicyResult> invokeAsync(GetServiceAccountIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getServiceAccountIamPolicy", TypeShape.of(GetServiceAccountIamPolicyResult.class), args == null ? GetServiceAccountIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
