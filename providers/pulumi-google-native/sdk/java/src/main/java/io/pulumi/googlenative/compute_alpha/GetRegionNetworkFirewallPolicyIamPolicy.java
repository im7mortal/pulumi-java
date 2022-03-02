// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionNetworkFirewallPolicyIamPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionNetworkFirewallPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionNetworkFirewallPolicyIamPolicy {
    private GetRegionNetworkFirewallPolicyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetRegionNetworkFirewallPolicyIamPolicyArgs.Builder a);
    }
    private static GetRegionNetworkFirewallPolicyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionNetworkFirewallPolicyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
     */
    public static CompletableFuture<GetRegionNetworkFirewallPolicyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetRegionNetworkFirewallPolicyIamPolicyResult> invokeAsync(GetRegionNetworkFirewallPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionNetworkFirewallPolicyIamPolicy", TypeShape.of(GetRegionNetworkFirewallPolicyIamPolicyResult.class), args == null ? GetRegionNetworkFirewallPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
