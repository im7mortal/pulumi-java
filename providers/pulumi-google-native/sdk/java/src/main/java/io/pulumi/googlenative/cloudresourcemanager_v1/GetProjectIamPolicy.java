// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetProjectIamPolicyArgs;
import io.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetProjectIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProjectIamPolicy {
    private GetProjectIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetProjectIamPolicyArgs.Builder a);
    }
    private static GetProjectIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetProjectIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. Authorization requires the Google IAM permission `resourcemanager.projects.getIamPolicy` on the project. For additional information about `resource` (e.g. my-project-id) structure and identification, see [Resource Names](https://cloud.google.com/apis/design/resource_names).
 * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. Authorization requires the Google IAM permission `resourcemanager.projects.getIamPolicy` on the project. For additional information about `resource` (e.g. my-project-id) structure and identification, see [Resource Names](https://cloud.google.com/apis/design/resource_names).
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> invokeAsync(GetProjectIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args == null ? GetProjectIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
