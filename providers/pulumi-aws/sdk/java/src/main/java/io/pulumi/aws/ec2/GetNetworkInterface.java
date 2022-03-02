// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs;
import io.pulumi.aws.ec2.outputs.GetNetworkInterfaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkInterface {
    private GetNetworkInterface() {}
    public interface BuilderApplicator {
        public void apply(GetNetworkInterfaceArgs.Builder a);
    }
    private static GetNetworkInterfaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNetworkInterfaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information about a Network Interface.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getNetworkInterface.
 * 
     *
     * A collection of values returned by getNetworkInterface.
 * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information about a Network Interface.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getNetworkInterface.
     * 
     *
         * A collection of values returned by getNetworkInterface.
     * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(@Nullable GetNetworkInterfaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getNetworkInterface:getNetworkInterface", TypeShape.of(GetNetworkInterfaceResult.class), args == null ? GetNetworkInterfaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
