// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GetBudgetArgs;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GetBudgetResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBudget {
    private GetBudget() {}
    public interface BuilderApplicator {
        public void apply(GetBudgetArgs.Builder a);
    }
    private static GetBudgetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBudgetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
 * 
     */
    public static CompletableFuture<GetBudgetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
     * 
     */
    public static CompletableFuture<GetBudgetResult> invokeAsync(GetBudgetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:billingbudgets/v1beta1:getBudget", TypeShape.of(GetBudgetResult.class), args == null ? GetBudgetArgs.Empty : args, Utilities.withVersion(options));
    }
}
