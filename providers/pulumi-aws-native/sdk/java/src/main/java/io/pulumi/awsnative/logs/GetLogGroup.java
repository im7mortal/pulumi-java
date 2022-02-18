// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.logs.inputs.GetLogGroupArgs;
import io.pulumi.awsnative.logs.outputs.GetLogGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLogGroup {
/**
 * Resource schema for AWS::Logs::LogGroup
 * 
 */
    public static CompletableFuture<GetLogGroupResult> invokeAsync(GetLogGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:logs:getLogGroup", TypeShape.of(GetLogGroupResult.class), args == null ? GetLogGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
