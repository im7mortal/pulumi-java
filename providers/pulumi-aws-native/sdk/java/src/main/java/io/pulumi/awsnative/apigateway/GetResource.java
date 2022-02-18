// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetResourceArgs;
import io.pulumi.awsnative.apigateway.outputs.GetResourceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResource {
/**
 * Resource Type definition for AWS::ApiGateway::Resource
 * 
 */
    public static CompletableFuture<GetResourceResult> invokeAsync(GetResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getResource", TypeShape.of(GetResourceResult.class), args == null ? GetResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
