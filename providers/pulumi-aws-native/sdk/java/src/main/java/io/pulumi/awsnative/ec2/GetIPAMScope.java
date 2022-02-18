// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetIPAMScopeArgs;
import io.pulumi.awsnative.ec2.outputs.GetIPAMScopeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIPAMScope {
/**
 * Resource Schema of AWS::EC2::IPAMScope Type
 * 
 */
    public static CompletableFuture<GetIPAMScopeResult> invokeAsync(GetIPAMScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMScope", TypeShape.of(GetIPAMScopeResult.class), args == null ? GetIPAMScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}