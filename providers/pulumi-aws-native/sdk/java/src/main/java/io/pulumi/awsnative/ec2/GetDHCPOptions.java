// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetDHCPOptionsArgs;
import io.pulumi.awsnative.ec2.outputs.GetDHCPOptionsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDHCPOptions {
/**
 * Resource Type definition for AWS::EC2::DHCPOptions
 * 
 */
    public static CompletableFuture<GetDHCPOptionsResult> invokeAsync(GetDHCPOptionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getDHCPOptions", TypeShape.of(GetDHCPOptionsResult.class), args == null ? GetDHCPOptionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
