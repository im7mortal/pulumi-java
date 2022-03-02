// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1.inputs.GetGatewayIamPolicyArgs;
import io.pulumi.googlenative.apigateway_v1.outputs.GetGatewayIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGatewayIamPolicy {
    private GetGatewayIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetGatewayIamPolicyArgs.Builder a);
    }
    private static GetGatewayIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGatewayIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> invokeAsync(GetGatewayIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args == null ? GetGatewayIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
