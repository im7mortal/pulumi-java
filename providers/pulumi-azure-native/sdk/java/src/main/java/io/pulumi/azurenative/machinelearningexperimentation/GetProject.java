// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningexperimentation.inputs.GetProjectArgs;
import io.pulumi.azurenative.machinelearningexperimentation.outputs.GetProjectResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProject {
    private GetProject() {}
    public interface BuilderApplicator {
        public void apply(GetProjectArgs.Builder a);
    }
    private static GetProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An object that represents a machine learning project.
 * API Version: 2017-05-01-preview.
 * 
     *
     * An object that represents a machine learning project.
 * 
     */
    public static CompletableFuture<GetProjectResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An object that represents a machine learning project.
     * API Version: 2017-05-01-preview.
     * 
     *
         * An object that represents a machine learning project.
     * 
     */
    public static CompletableFuture<GetProjectResult> invokeAsync(GetProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningexperimentation:getProject", TypeShape.of(GetProjectResult.class), args == null ? GetProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}
