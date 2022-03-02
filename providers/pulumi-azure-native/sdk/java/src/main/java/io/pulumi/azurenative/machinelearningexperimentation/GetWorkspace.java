// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningexperimentation.inputs.GetWorkspaceArgs;
import io.pulumi.azurenative.machinelearningexperimentation.outputs.GetWorkspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkspace {
    private GetWorkspace() {}
    public interface BuilderApplicator {
        public void apply(GetWorkspaceArgs.Builder a);
    }
    private static GetWorkspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWorkspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An object that represents a machine learning team account workspace.
 * API Version: 2017-05-01-preview.
 * 
     *
     * An object that represents a machine learning team account workspace.
 * 
     */
    public static CompletableFuture<GetWorkspaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An object that represents a machine learning team account workspace.
     * API Version: 2017-05-01-preview.
     * 
     *
         * An object that represents a machine learning team account workspace.
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> invokeAsync(GetWorkspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningexperimentation:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args == null ? GetWorkspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
