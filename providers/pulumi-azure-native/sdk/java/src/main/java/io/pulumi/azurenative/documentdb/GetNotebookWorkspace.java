// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetNotebookWorkspaceArgs;
import io.pulumi.azurenative.documentdb.outputs.GetNotebookWorkspaceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotebookWorkspace {
    public static CompletableFuture<GetNotebookWorkspaceResult> invokeAsync(GetNotebookWorkspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getNotebookWorkspace", TypeShape.of(GetNotebookWorkspaceResult.class), args == null ? GetNotebookWorkspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}