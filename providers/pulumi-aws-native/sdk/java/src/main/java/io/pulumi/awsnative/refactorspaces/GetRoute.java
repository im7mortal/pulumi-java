// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.inputs.GetRouteArgs;
import io.pulumi.awsnative.refactorspaces.outputs.GetRouteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRoute {
/**
 * Definition of AWS::RefactorSpaces::Route Resource Type
 * 
 */
    public static CompletableFuture<GetRouteResult> invokeAsync(GetRouteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:refactorspaces:getRoute", TypeShape.of(GetRouteResult.class), args == null ? GetRouteArgs.Empty : args, Utilities.withVersion(options));
    }
}
