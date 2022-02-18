// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.inputs.GetFirewallRuleGroupArgs;
import io.pulumi.awsnative.route53resolver.outputs.GetFirewallRuleGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewallRuleGroup {
/**
 * Resource schema for AWS::Route53Resolver::FirewallRuleGroup.
 * 
 */
    public static CompletableFuture<GetFirewallRuleGroupResult> invokeAsync(GetFirewallRuleGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53resolver:getFirewallRuleGroup", TypeShape.of(GetFirewallRuleGroupResult.class), args == null ? GetFirewallRuleGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
