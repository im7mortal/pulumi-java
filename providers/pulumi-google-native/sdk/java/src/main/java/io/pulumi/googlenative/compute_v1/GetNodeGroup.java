// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetNodeGroupArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetNodeGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNodeGroup {
    private GetNodeGroup() {}
    public interface BuilderApplicator {
        public void apply(GetNodeGroupArgs.Builder a);
    }
    private static GetNodeGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNodeGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request. Note: the "nodes" field should not be used. Use nodeGroups.listNodes instead.
 * 
     */
    public static CompletableFuture<GetNodeGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request. Note: the "nodes" field should not be used. Use nodeGroups.listNodes instead.
     * 
     */
    public static CompletableFuture<GetNodeGroupResult> invokeAsync(GetNodeGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getNodeGroup", TypeShape.of(GetNodeGroupResult.class), args == null ? GetNodeGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
