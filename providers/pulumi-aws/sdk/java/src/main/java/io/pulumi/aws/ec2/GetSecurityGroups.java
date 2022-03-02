// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs;
import io.pulumi.aws.ec2.outputs.GetSecurityGroupsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityGroups {
    private GetSecurityGroups() {}
    public interface BuilderApplicator {
        public void apply(GetSecurityGroupsArgs.Builder a);
    }
    private static GetSecurityGroupsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSecurityGroupsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get IDs and VPC membership of Security Groups that are created
 * outside of this provider.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getSecurityGroups.
 * 
     *
     * A collection of values returned by getSecurityGroups.
 * 
     */
    public static CompletableFuture<GetSecurityGroupsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get IDs and VPC membership of Security Groups that are created
     * outside of this provider.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getSecurityGroups.
     * 
     *
         * A collection of values returned by getSecurityGroups.
     * 
     */
    public static CompletableFuture<GetSecurityGroupsResult> invokeAsync(@Nullable GetSecurityGroupsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getSecurityGroups:getSecurityGroups", TypeShape.of(GetSecurityGroupsResult.class), args == null ? GetSecurityGroupsArgs.Empty : args, Utilities.withVersion(options));
    }
}
