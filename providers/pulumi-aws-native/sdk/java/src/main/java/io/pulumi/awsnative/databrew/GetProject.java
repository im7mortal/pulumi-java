// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.inputs.GetProjectArgs;
import io.pulumi.awsnative.databrew.outputs.GetProjectResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProject {
/**
 * Resource schema for AWS::DataBrew::Project.
 * 
 */
    public static CompletableFuture<GetProjectResult> invokeAsync(GetProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:databrew:getProject", TypeShape.of(GetProjectResult.class), args == null ? GetProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}