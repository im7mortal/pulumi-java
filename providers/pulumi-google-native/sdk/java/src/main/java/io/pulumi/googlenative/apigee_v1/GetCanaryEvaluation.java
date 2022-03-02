// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetCanaryEvaluationArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetCanaryEvaluationResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCanaryEvaluation {
    private GetCanaryEvaluation() {}
    public interface BuilderApplicator {
        public void apply(GetCanaryEvaluationArgs.Builder a);
    }
    private static GetCanaryEvaluationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCanaryEvaluationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a CanaryEvaluation for an organization.
 * 
     */
    public static CompletableFuture<GetCanaryEvaluationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a CanaryEvaluation for an organization.
     * 
     */
    public static CompletableFuture<GetCanaryEvaluationResult> invokeAsync(GetCanaryEvaluationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getCanaryEvaluation", TypeShape.of(GetCanaryEvaluationResult.class), args == null ? GetCanaryEvaluationArgs.Empty : args, Utilities.withVersion(options));
    }
}
