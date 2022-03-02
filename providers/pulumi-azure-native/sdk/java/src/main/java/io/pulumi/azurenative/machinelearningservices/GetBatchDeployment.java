// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetBatchDeploymentArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetBatchDeploymentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBatchDeployment {
    private GetBatchDeployment() {}
    public interface BuilderApplicator {
        public void apply(GetBatchDeploymentArgs.Builder a);
    }
    private static GetBatchDeploymentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBatchDeploymentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2021-03-01-preview.
 * 
     */
    public static CompletableFuture<GetBatchDeploymentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<GetBatchDeploymentResult> invokeAsync(GetBatchDeploymentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getBatchDeployment", TypeShape.of(GetBatchDeploymentResult.class), args == null ? GetBatchDeploymentArgs.Empty : args, Utilities.withVersion(options));
    }
}
