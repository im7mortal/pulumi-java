// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.gamelift.inputs.GetFleetArgs;
import io.pulumi.awsnative.gamelift.outputs.GetFleetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFleet {
/**
 * The AWS::GameLift::Fleet resource creates an Amazon GameLift (GameLift) fleet to host game servers.  A fleet is a set of EC2 instances, each of which can host multiple game sessions.
 * 
 */
    public static CompletableFuture<GetFleetResult> invokeAsync(GetFleetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:gamelift:getFleet", TypeShape.of(GetFleetResult.class), args == null ? GetFleetArgs.Empty : args, Utilities.withVersion(options));
    }
}
