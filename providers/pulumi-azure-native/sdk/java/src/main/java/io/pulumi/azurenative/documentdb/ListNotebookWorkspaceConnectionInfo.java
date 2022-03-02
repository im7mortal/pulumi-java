// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.ListNotebookWorkspaceConnectionInfoArgs;
import io.pulumi.azurenative.documentdb.outputs.ListNotebookWorkspaceConnectionInfoResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListNotebookWorkspaceConnectionInfo {
    private ListNotebookWorkspaceConnectionInfo() {}
    public interface BuilderApplicator {
        public void apply(ListNotebookWorkspaceConnectionInfoArgs.Builder a);
    }
    private static ListNotebookWorkspaceConnectionInfoArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListNotebookWorkspaceConnectionInfoArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The connection info for the given notebook workspace
 * API Version: 2021-03-15.
 * 
     *
     * The connection info for the given notebook workspace
 * 
     */
    public static CompletableFuture<ListNotebookWorkspaceConnectionInfoResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The connection info for the given notebook workspace
     * API Version: 2021-03-15.
     * 
     *
         * The connection info for the given notebook workspace
     * 
     */
    public static CompletableFuture<ListNotebookWorkspaceConnectionInfoResult> invokeAsync(ListNotebookWorkspaceConnectionInfoArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:listNotebookWorkspaceConnectionInfo", TypeShape.of(ListNotebookWorkspaceConnectionInfoResult.class), args == null ? ListNotebookWorkspaceConnectionInfoArgs.Empty : args, Utilities.withVersion(options));
    }
}
