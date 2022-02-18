// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.inputs.GetDataSetArgs;
import io.pulumi.awsnative.quicksight.outputs.GetDataSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataSet {
/**
 * Definition of the AWS::QuickSight::DataSet Resource Type.
 * 
 */
    public static CompletableFuture<GetDataSetResult> invokeAsync(GetDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:quicksight:getDataSet", TypeShape.of(GetDataSetResult.class), args == null ? GetDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}