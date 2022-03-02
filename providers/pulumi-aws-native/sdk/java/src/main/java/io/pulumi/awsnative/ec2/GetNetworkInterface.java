// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInterfaceArgs;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInterfaceResult;
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
     * The AWS::EC2::NetworkInterface resource creates network interface
 * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The AWS::EC2::NetworkInterface resource creates network interface
     * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(GetNetworkInterfaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInterface", TypeShape.of(GetNetworkInterfaceResult.class), args == null ? GetNetworkInterfaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
