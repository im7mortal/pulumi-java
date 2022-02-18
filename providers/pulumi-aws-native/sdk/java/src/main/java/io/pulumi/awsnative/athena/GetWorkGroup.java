// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.inputs.GetWorkGroupArgs;
import io.pulumi.awsnative.athena.outputs.GetWorkGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkGroup {
/**
 * Resource schema for AWS::Athena::WorkGroup
 * 
 */
    public static CompletableFuture<GetWorkGroupResult> invokeAsync(GetWorkGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getWorkGroup", TypeShape.of(GetWorkGroupResult.class), args == null ? GetWorkGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
