// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.inputs.GetResolverRuleArgs;
import io.pulumi.awsnative.route53resolver.outputs.GetResolverRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverRule {
    private GetResolverRule() {}
    public interface BuilderApplicator {
        public void apply(GetResolverRuleArgs.Builder a);
    }
    private static GetResolverRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResolverRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::Route53Resolver::ResolverRule
 * 
     */
    public static CompletableFuture<GetResolverRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::Route53Resolver::ResolverRule
     * 
     */
    public static CompletableFuture<GetResolverRuleResult> invokeAsync(GetResolverRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53resolver:getResolverRule", TypeShape.of(GetResolverRuleResult.class), args == null ? GetResolverRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
