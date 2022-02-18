// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.location.inputs.GetMapArgs;
import io.pulumi.awsnative.location.outputs.GetMapResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMap {
/**
 * Definition of AWS::Location::Map Resource Type
 * 
 */
    public static CompletableFuture<GetMapResult> invokeAsync(GetMapArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:location:getMap", TypeShape.of(GetMapResult.class), args == null ? GetMapArgs.Empty : args, Utilities.withVersion(options));
    }
}