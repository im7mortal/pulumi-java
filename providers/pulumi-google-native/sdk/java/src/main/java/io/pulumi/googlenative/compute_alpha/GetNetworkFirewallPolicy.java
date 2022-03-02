// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetNetworkFirewallPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetNetworkFirewallPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkFirewallPolicy {
    private GetNetworkFirewallPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetNetworkFirewallPolicyArgs.Builder a);
    }
    private static GetNetworkFirewallPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNetworkFirewallPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified network firewall policy.
 * 
     */
    public static CompletableFuture<GetNetworkFirewallPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified network firewall policy.
     * 
     */
    public static CompletableFuture<GetNetworkFirewallPolicyResult> invokeAsync(GetNetworkFirewallPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getNetworkFirewallPolicy", TypeShape.of(GetNetworkFirewallPolicyResult.class), args == null ? GetNetworkFirewallPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
