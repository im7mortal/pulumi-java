// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetNotebookWorkspaceArgs;
import io.pulumi.azurenative.documentdb.outputs.GetNotebookWorkspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotebookWorkspace {
    private GetNotebookWorkspace() {}
    public interface BuilderApplicator {
        public void apply(GetNotebookWorkspaceArgs.Builder a);
    }
    private static GetNotebookWorkspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNotebookWorkspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A notebook workspace resource
 * API Version: 2021-03-15.
 * 
     *
     * A notebook workspace resource
 * 
     */
    public static CompletableFuture<GetNotebookWorkspaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A notebook workspace resource
     * API Version: 2021-03-15.
     * 
     *
         * A notebook workspace resource
     * 
     */
    public static CompletableFuture<GetNotebookWorkspaceResult> invokeAsync(GetNotebookWorkspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getNotebookWorkspace", TypeShape.of(GetNotebookWorkspaceResult.class), args == null ? GetNotebookWorkspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
