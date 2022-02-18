// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.inputs.GetResourceSpecificLoggingArgs;
import io.pulumi.awsnative.iot.outputs.GetResourceSpecificLoggingResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceSpecificLogging {
/**
 * Resource-specific logging allows you to specify a logging level for a specific thing group.
 * 
 */
    public static CompletableFuture<GetResourceSpecificLoggingResult> invokeAsync(GetResourceSpecificLoggingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iot:getResourceSpecificLogging", TypeShape.of(GetResourceSpecificLoggingResult.class), args == null ? GetResourceSpecificLoggingArgs.Empty : args, Utilities.withVersion(options));
    }
}
