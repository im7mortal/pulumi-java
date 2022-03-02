// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformariadb.inputs.GetFirewallRuleArgs;
import io.pulumi.azurenative.dbformariadb.outputs.GetFirewallRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewallRule {
    private GetFirewallRule() {}
    public interface BuilderApplicator {
        public void apply(GetFirewallRuleArgs.Builder a);
    }
    private static GetFirewallRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFirewallRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents a server firewall rule.
 * API Version: 2018-06-01.
 * 
     *
     * Represents a server firewall rule.
 * 
     */
    public static CompletableFuture<GetFirewallRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents a server firewall rule.
     * API Version: 2018-06-01.
     * 
     *
         * Represents a server firewall rule.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> invokeAsync(GetFirewallRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformariadb:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args == null ? GetFirewallRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
