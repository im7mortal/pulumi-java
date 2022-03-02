// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotevents.inputs.GetDetectorModelArgs;
import io.pulumi.awsnative.iotevents.outputs.GetDetectorModelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDetectorModel {
    private GetDetectorModel() {}
    public interface BuilderApplicator {
        public void apply(GetDetectorModelArgs.Builder a);
    }
    private static GetDetectorModelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDetectorModelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The AWS::IoTEvents::DetectorModel resource creates a detector model. You create a *detector model* (a model of your equipment or process) using *states*. For each state, you define conditional (Boolean) logic that evaluates the incoming inputs to detect significant events. When an event is detected, it can change the state or trigger custom-built or predefined actions using other AWS services. You can define additional events that trigger actions when entering or exiting a state and, optionally, when a condition is met. For more information, see [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in the *AWS IoT Events Developer Guide*.
 * 
     */
    public static CompletableFuture<GetDetectorModelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The AWS::IoTEvents::DetectorModel resource creates a detector model. You create a *detector model* (a model of your equipment or process) using *states*. For each state, you define conditional (Boolean) logic that evaluates the incoming inputs to detect significant events. When an event is detected, it can change the state or trigger custom-built or predefined actions using other AWS services. You can define additional events that trigger actions when entering or exiting a state and, optionally, when a condition is met. For more information, see [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in the *AWS IoT Events Developer Guide*.
     * 
     */
    public static CompletableFuture<GetDetectorModelResult> invokeAsync(GetDetectorModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotevents:getDetectorModel", TypeShape.of(GetDetectorModelResult.class), args == null ? GetDetectorModelArgs.Empty : args, Utilities.withVersion(options));
    }
}
