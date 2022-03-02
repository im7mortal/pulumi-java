// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.GetRemediationAtManagementGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.GetRemediationAtManagementGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRemediationAtManagementGroup {
    private GetRemediationAtManagementGroup() {}
    public interface BuilderApplicator {
        public void apply(GetRemediationAtManagementGroupArgs.Builder a);
    }
    private static GetRemediationAtManagementGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRemediationAtManagementGroupArgs.builder();
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
    public static CompletableFuture<GetRemediationAtManagementGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
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
    public static CompletableFuture<GetRemediationAtManagementGroupResult> invokeAsync(GetRemediationAtManagementGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:getRemediationAtManagementGroup", TypeShape.of(GetRemediationAtManagementGroupResult.class), args == null ? GetRemediationAtManagementGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
