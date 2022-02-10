// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.GetJobArgs;
import io.pulumi.googlenative.cloudscheduler_v1.outputs.GetJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJob {
    public static CompletableFuture<GetJobResult> invokeAsync(GetJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudscheduler/v1:getJob", TypeShape.of(GetJobResult.class), args == null ? GetJobArgs.Empty : args, Utilities.withVersion(options));
    }
}