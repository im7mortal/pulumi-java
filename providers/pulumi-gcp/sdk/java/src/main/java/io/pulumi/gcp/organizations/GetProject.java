// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.inputs.GetProjectArgs;
import io.pulumi.gcp.organizations.outputs.GetProjectResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProject {
/**
 * Use this data source to get project details.
 * For more information see
 * [API](https://cloud.google.com/resource-manager/reference/rest/v1/projects#Project)
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getProject.
 * 
 *
 * A collection of values returned by getProject.
 * 
 */
    public static CompletableFuture<GetProjectResult> invokeAsync(@Nullable GetProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getProject:getProject", TypeShape.of(GetProjectResult.class), args == null ? GetProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}