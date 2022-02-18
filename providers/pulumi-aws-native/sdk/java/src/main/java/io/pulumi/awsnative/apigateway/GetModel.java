// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetModelArgs;
import io.pulumi.awsnative.apigateway.outputs.GetModelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModel {
/**
 * Resource Type definition for AWS::ApiGateway::Model
 * 
 */
    public static CompletableFuture<GetModelResult> invokeAsync(GetModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getModel", TypeShape.of(GetModelResult.class), args == null ? GetModelArgs.Empty : args, Utilities.withVersion(options));
    }
}
