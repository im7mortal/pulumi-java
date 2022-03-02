// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.inputs.GetRuleGroupArgs;
import io.pulumi.aws.wafv2.outputs.GetRuleGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRuleGroup {
    private GetRuleGroup() {}
    public interface BuilderApplicator {
        public void apply(GetRuleGroupArgs.Builder a);
    }
    private static GetRuleGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRuleGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the summary of a WAFv2 Rule Group.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getRuleGroup.
 * 
     *
     * A collection of values returned by getRuleGroup.
 * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the summary of a WAFv2 Rule Group.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getRuleGroup.
     * 
     *
         * A collection of values returned by getRuleGroup.
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(GetRuleGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafv2/getRuleGroup:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args == null ? GetRuleGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
