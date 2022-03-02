// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.inputs.GetNodeGroupsArgs;
import io.pulumi.aws.eks.outputs.GetNodeGroupsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNodeGroups {
    private GetNodeGroups() {}
    public interface BuilderApplicator {
        public void apply(GetNodeGroupsArgs.Builder a);
    }
    private static GetNodeGroupsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNodeGroupsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources.
 * 
     *
     * A collection of arguments for invoking getNodeGroups.
 * 
     *
     * A collection of values returned by getNodeGroups.
 * 
     */
    public static CompletableFuture<GetNodeGroupsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources.
     * 
     *
         * A collection of arguments for invoking getNodeGroups.
     * 
     *
         * A collection of values returned by getNodeGroups.
     * 
     */
    public static CompletableFuture<GetNodeGroupsResult> invokeAsync(GetNodeGroupsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getNodeGroups:getNodeGroups", TypeShape.of(GetNodeGroupsResult.class), args == null ? GetNodeGroupsArgs.Empty : args, Utilities.withVersion(options));
    }
}
