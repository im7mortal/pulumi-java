// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetEC2FleetArgs;
import io.pulumi.awsnative.ec2.outputs.GetEC2FleetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEC2Fleet {
    private GetEC2Fleet() {}
    public interface BuilderApplicator {
        public void apply(GetEC2FleetArgs.Builder a);
    }
    private static GetEC2FleetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEC2FleetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::EC2::EC2Fleet
 * 
     */
    public static CompletableFuture<GetEC2FleetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::EC2::EC2Fleet
     * 
     */
    public static CompletableFuture<GetEC2FleetResult> invokeAsync(GetEC2FleetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getEC2Fleet", TypeShape.of(GetEC2FleetResult.class), args == null ? GetEC2FleetArgs.Empty : args, Utilities.withVersion(options));
    }
}
