// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetEndpointPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEndpointPolicy {
    private GetEndpointPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetEndpointPolicyArgs.Builder a);
    }
    private static GetEndpointPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEndpointPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single EndpointPolicy.
 * 
     */
    public static CompletableFuture<GetEndpointPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single EndpointPolicy.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyResult> invokeAsync(GetEndpointPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getEndpointPolicy", TypeShape.of(GetEndpointPolicyResult.class), args == null ? GetEndpointPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
