// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetDeviceFleetArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetDeviceFleetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeviceFleet {
    private GetDeviceFleet() {}
    public interface BuilderApplicator {
        public void apply(GetDeviceFleetArgs.Builder a);
    }
    private static GetDeviceFleetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDeviceFleetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::SageMaker::DeviceFleet
 * 
     */
    public static CompletableFuture<GetDeviceFleetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::SageMaker::DeviceFleet
     * 
     */
    public static CompletableFuture<GetDeviceFleetResult> invokeAsync(GetDeviceFleetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getDeviceFleet", TypeShape.of(GetDeviceFleetResult.class), args == null ? GetDeviceFleetArgs.Empty : args, Utilities.withVersion(options));
    }
}
