// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.connect.inputs.GetHoursOfOperationArgs;
import io.pulumi.awsnative.connect.outputs.GetHoursOfOperationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHoursOfOperation {
/**
 * Resource Type definition for AWS::Connect::HoursOfOperation
 * 
 */
    public static CompletableFuture<GetHoursOfOperationResult> invokeAsync(GetHoursOfOperationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getHoursOfOperation", TypeShape.of(GetHoursOfOperationResult.class), args == null ? GetHoursOfOperationArgs.Empty : args, Utilities.withVersion(options));
    }
}
