// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lookoutmetrics.inputs.GetAnomalyDetectorArgs;
import io.pulumi.awsnative.lookoutmetrics.outputs.GetAnomalyDetectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAnomalyDetector {
/**
 * An Amazon Lookout for Metrics Detector
 * 
 */
    public static CompletableFuture<GetAnomalyDetectorResult> invokeAsync(GetAnomalyDetectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lookoutmetrics:getAnomalyDetector", TypeShape.of(GetAnomalyDetectorResult.class), args == null ? GetAnomalyDetectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
