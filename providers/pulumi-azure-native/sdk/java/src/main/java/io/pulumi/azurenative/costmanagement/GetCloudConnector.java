// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.inputs.GetCloudConnectorArgs;
import io.pulumi.azurenative.costmanagement.outputs.GetCloudConnectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCloudConnector {
    public static CompletableFuture<GetCloudConnectorResult> invokeAsync(GetCloudConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:costmanagement:getCloudConnector", TypeShape.of(GetCloudConnectorResult.class), args == null ? GetCloudConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}