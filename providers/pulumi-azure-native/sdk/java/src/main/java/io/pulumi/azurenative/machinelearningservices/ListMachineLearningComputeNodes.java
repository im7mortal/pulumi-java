// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.ListMachineLearningComputeNodesArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ListMachineLearningComputeNodesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListMachineLearningComputeNodes {
    private ListMachineLearningComputeNodes() {}
    public interface BuilderApplicator {
        public void apply(ListMachineLearningComputeNodesArgs.Builder a);
    }
    private static ListMachineLearningComputeNodesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListMachineLearningComputeNodesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Compute node information related to a AmlCompute.
 * API Version: 2021-01-01.
 * 
     *
     * Compute node information related to a AmlCompute.
 * 
     */
    public static CompletableFuture<ListMachineLearningComputeNodesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Compute node information related to a AmlCompute.
     * API Version: 2021-01-01.
     * 
     *
         * Compute node information related to a AmlCompute.
     * 
     */
    public static CompletableFuture<ListMachineLearningComputeNodesResult> invokeAsync(ListMachineLearningComputeNodesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:listMachineLearningComputeNodes", TypeShape.of(ListMachineLearningComputeNodesResult.class), args == null ? ListMachineLearningComputeNodesArgs.Empty : args, Utilities.withVersion(options));
    }
}
