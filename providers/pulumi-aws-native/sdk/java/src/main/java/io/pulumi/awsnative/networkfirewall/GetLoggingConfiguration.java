// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.inputs.GetLoggingConfigurationArgs;
import io.pulumi.awsnative.networkfirewall.outputs.GetLoggingConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLoggingConfiguration {
/**
 * Resource type definition for AWS::NetworkFirewall::LoggingConfiguration
 * 
 */
    public static CompletableFuture<GetLoggingConfigurationResult> invokeAsync(GetLoggingConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getLoggingConfiguration", TypeShape.of(GetLoggingConfigurationResult.class), args == null ? GetLoggingConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
