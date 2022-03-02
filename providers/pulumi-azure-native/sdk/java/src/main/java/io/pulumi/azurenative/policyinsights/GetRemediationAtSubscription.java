// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.GetRemediationAtSubscriptionArgs;
import io.pulumi.azurenative.policyinsights.outputs.GetRemediationAtSubscriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRemediationAtSubscription {
    private GetRemediationAtSubscription() {}
    public interface BuilderApplicator {
        public void apply(GetRemediationAtSubscriptionArgs.Builder a);
    }
    private static GetRemediationAtSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRemediationAtSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The remediation definition.
 * API Version: 2019-07-01.
 * 
     *
     * The remediation definition.
 * 
     */
    public static CompletableFuture<GetRemediationAtSubscriptionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The remediation definition.
     * API Version: 2019-07-01.
     * 
     *
         * The remediation definition.
     * 
     */
    public static CompletableFuture<GetRemediationAtSubscriptionResult> invokeAsync(GetRemediationAtSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:getRemediationAtSubscription", TypeShape.of(GetRemediationAtSubscriptionResult.class), args == null ? GetRemediationAtSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
