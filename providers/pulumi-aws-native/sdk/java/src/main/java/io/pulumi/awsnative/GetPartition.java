// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.outputs.GetPartitionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPartition {
    private GetPartition() {}
    public static CompletableFuture<GetPartitionResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:getPartition", TypeShape.of(GetPartitionResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
