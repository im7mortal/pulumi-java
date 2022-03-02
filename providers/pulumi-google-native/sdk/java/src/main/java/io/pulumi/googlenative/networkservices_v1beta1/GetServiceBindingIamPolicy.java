// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingIamPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetServiceBindingIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceBindingIamPolicy {
    private GetServiceBindingIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetServiceBindingIamPolicyArgs.Builder a);
    }
    private static GetServiceBindingIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceBindingIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetServiceBindingIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBindingIamPolicyResult> invokeAsync(GetServiceBindingIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getServiceBindingIamPolicy", TypeShape.of(GetServiceBindingIamPolicyResult.class), args == null ? GetServiceBindingIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
