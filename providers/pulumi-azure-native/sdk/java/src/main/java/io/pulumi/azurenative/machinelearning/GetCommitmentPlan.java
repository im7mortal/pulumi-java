// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.inputs.GetCommitmentPlanArgs;
import io.pulumi.azurenative.machinelearning.outputs.GetCommitmentPlanResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCommitmentPlan {
    public static CompletableFuture<GetCommitmentPlanResult> invokeAsync(GetCommitmentPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getCommitmentPlan", TypeShape.of(GetCommitmentPlanResult.class), args == null ? GetCommitmentPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}