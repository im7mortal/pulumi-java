// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetExperimentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetExperimentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExperiment {
    private GetExperiment() {}
    public interface BuilderApplicator {
        public void apply(GetExperimentArgs.Builder a);
    }
    private static GetExperimentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetExperimentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the specified Experiment.
 * 
     */
    public static CompletableFuture<GetExperimentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the specified Experiment.
     * 
     */
    public static CompletableFuture<GetExperimentResult> invokeAsync(GetExperimentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getExperiment", TypeShape.of(GetExperimentResult.class), args == null ? GetExperimentArgs.Empty : args, Utilities.withVersion(options));
    }
}
