// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsAnalysisArgs;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsAnalysisResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkInsightsAnalysis {
/**
 * Resource schema for AWS::EC2::NetworkInsightsAnalysis
 * 
 */
    public static CompletableFuture<GetNetworkInsightsAnalysisResult> invokeAsync(GetNetworkInsightsAnalysisArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsAnalysis", TypeShape.of(GetNetworkInsightsAnalysisResult.class), args == null ? GetNetworkInsightsAnalysisArgs.Empty : args, Utilities.withVersion(options));
    }
}