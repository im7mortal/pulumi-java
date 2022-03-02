// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1.inputs.GetIngressRuleArgs;
import io.pulumi.googlenative.appengine_v1.outputs.GetIngressRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIngressRule {
    private GetIngressRule() {}
    public interface BuilderApplicator {
        public void apply(GetIngressRuleArgs.Builder a);
    }
    private static GetIngressRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIngressRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified firewall rule.
 * 
     */
    public static CompletableFuture<GetIngressRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified firewall rule.
     * 
     */
    public static CompletableFuture<GetIngressRuleResult> invokeAsync(GetIngressRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getIngressRule", TypeShape.of(GetIngressRuleResult.class), args == null ? GetIngressRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
