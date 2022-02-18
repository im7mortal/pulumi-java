// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.inputs.GetApplicationInstanceArgs;
import io.pulumi.awsnative.panorama.outputs.GetApplicationInstanceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplicationInstance {
/**
 * Schema for ApplicationInstance CloudFormation Resource
 * 
 */
    public static CompletableFuture<GetApplicationInstanceResult> invokeAsync(GetApplicationInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:panorama:getApplicationInstance", TypeShape.of(GetApplicationInstanceResult.class), args == null ? GetApplicationInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
