// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetScheduledQueryRuleArgs;
import io.pulumi.azurenative.insights.outputs.GetScheduledQueryRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScheduledQueryRule {
    private GetScheduledQueryRule() {}
    public interface BuilderApplicator {
        public void apply(GetScheduledQueryRuleArgs.Builder a);
    }
    private static GetScheduledQueryRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetScheduledQueryRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Log Search Rule resource.
 * API Version: 2018-04-16.
 * 
     *
     * The Log Search Rule resource.
 * 
     */
    public static CompletableFuture<GetScheduledQueryRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Log Search Rule resource.
     * API Version: 2018-04-16.
     * 
     *
         * The Log Search Rule resource.
     * 
     */
    public static CompletableFuture<GetScheduledQueryRuleResult> invokeAsync(GetScheduledQueryRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getScheduledQueryRule", TypeShape.of(GetScheduledQueryRuleResult.class), args == null ? GetScheduledQueryRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
