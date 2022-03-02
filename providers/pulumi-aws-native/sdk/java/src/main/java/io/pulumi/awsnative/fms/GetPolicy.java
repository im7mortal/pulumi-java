// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.fms.inputs.GetPolicyArgs;
import io.pulumi.awsnative.fms.outputs.GetPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicy {
    private GetPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetPolicyArgs.Builder a);
    }
    private static GetPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Creates an AWS Firewall Manager policy.
 * 
     */
    public static CompletableFuture<GetPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Creates an AWS Firewall Manager policy.
     * 
     */
    public static CompletableFuture<GetPolicyResult> invokeAsync(GetPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:fms:getPolicy", TypeShape.of(GetPolicyResult.class), args == null ? GetPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
