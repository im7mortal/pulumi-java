// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs;
import io.pulumi.aws.ec2.outputs.GetTransitGatewayRouteTablesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransitGatewayRouteTables {
    private GetTransitGatewayRouteTables() {}
    public interface BuilderApplicator {
        public void apply(GetTransitGatewayRouteTablesArgs.Builder a);
    }
    private static GetTransitGatewayRouteTablesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTransitGatewayRouteTablesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getTransitGatewayRouteTables.
 * 
     *
     * A collection of values returned by getTransitGatewayRouteTables.
 * 
     */
    public static CompletableFuture<GetTransitGatewayRouteTablesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getTransitGatewayRouteTables.
     * 
     *
         * A collection of values returned by getTransitGatewayRouteTables.
     * 
     */
    public static CompletableFuture<GetTransitGatewayRouteTablesResult> invokeAsync(@Nullable GetTransitGatewayRouteTablesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getTransitGatewayRouteTables:getTransitGatewayRouteTables", TypeShape.of(GetTransitGatewayRouteTablesResult.class), args == null ? GetTransitGatewayRouteTablesArgs.Empty : args, Utilities.withVersion(options));
    }
}
