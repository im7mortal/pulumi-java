// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.inputs.GetResourceDefaultVersionArgs;
import io.pulumi.awsnative.cloudformation.outputs.GetResourceDefaultVersionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceDefaultVersion {
/**
 * The default version of a resource that has been registered in the CloudFormation Registry.
 * 
 */
    public static CompletableFuture<GetResourceDefaultVersionResult> invokeAsync(GetResourceDefaultVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudformation:getResourceDefaultVersion", TypeShape.of(GetResourceDefaultVersionResult.class), args == null ? GetResourceDefaultVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
