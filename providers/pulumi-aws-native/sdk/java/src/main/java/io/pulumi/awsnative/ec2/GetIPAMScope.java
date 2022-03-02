// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetIPAMScopeArgs;
import io.pulumi.awsnative.ec2.outputs.GetIPAMScopeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIPAMScope {
    private GetIPAMScope() {}
    public interface BuilderApplicator {
        public void apply(GetIPAMScopeArgs.Builder a);
    }
    private static GetIPAMScopeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIPAMScopeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Schema of AWS::EC2::IPAMScope Type
 * 
     */
    public static CompletableFuture<GetIPAMScopeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Schema of AWS::EC2::IPAMScope Type
     * 
     */
    public static CompletableFuture<GetIPAMScopeResult> invokeAsync(GetIPAMScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMScope", TypeShape.of(GetIPAMScopeResult.class), args == null ? GetIPAMScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}
