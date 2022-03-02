// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs;
import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVpcPeeringConnections {
    private GetVpcPeeringConnections() {}
    public interface BuilderApplicator {
        public void apply(GetVpcPeeringConnectionsArgs.Builder a);
    }
    private static GetVpcPeeringConnectionsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVpcPeeringConnectionsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get IDs of Amazon VPC peering connections
 * To get more details on each connection, use the data resource `aws.ec2.VpcPeeringConnection`
 * 
     *
     * A collection of arguments for invoking getVpcPeeringConnections.
 * 
     *
     * A collection of values returned by getVpcPeeringConnections.
 * 
     */
    public static CompletableFuture<GetVpcPeeringConnectionsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get IDs of Amazon VPC peering connections
     * To get more details on each connection, use the data resource `aws.ec2.VpcPeeringConnection`
     * 
     *
         * A collection of arguments for invoking getVpcPeeringConnections.
     * 
     *
         * A collection of values returned by getVpcPeeringConnections.
     * 
     */
    public static CompletableFuture<GetVpcPeeringConnectionsResult> invokeAsync(@Nullable GetVpcPeeringConnectionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getVpcPeeringConnections:getVpcPeeringConnections", TypeShape.of(GetVpcPeeringConnectionsResult.class), args == null ? GetVpcPeeringConnectionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
