// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetFirewallArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetFirewallResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewall {
    private GetFirewall() {}
    public interface BuilderApplicator {
        public void apply(GetFirewallArgs.Builder a);
    }
    private static GetFirewallArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFirewallArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified firewall.
 * 
     */
    public static CompletableFuture<GetFirewallResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified firewall.
     * 
     */
    public static CompletableFuture<GetFirewallResult> invokeAsync(GetFirewallArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getFirewall", TypeShape.of(GetFirewallResult.class), args == null ? GetFirewallArgs.Empty : args, Utilities.withVersion(options));
    }
}
