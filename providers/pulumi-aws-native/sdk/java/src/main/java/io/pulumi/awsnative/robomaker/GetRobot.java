// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.inputs.GetRobotArgs;
import io.pulumi.awsnative.robomaker.outputs.GetRobotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRobot {
    private GetRobot() {}
    public interface BuilderApplicator {
        public void apply(GetRobotArgs.Builder a);
    }
    private static GetRobotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRobotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * AWS::RoboMaker::Robot resource creates an AWS RoboMaker fleet.
 * 
     */
    public static CompletableFuture<GetRobotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * AWS::RoboMaker::Robot resource creates an AWS RoboMaker fleet.
     * 
     */
    public static CompletableFuture<GetRobotResult> invokeAsync(GetRobotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getRobot", TypeShape.of(GetRobotResult.class), args == null ? GetRobotArgs.Empty : args, Utilities.withVersion(options));
    }
}
