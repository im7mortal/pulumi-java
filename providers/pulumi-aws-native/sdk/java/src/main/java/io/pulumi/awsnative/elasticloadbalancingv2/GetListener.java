// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.GetListenerArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.GetListenerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetListener {
/**
 * Resource Type definition for AWS::ElasticLoadBalancingV2::Listener
 * 
 */
    public static CompletableFuture<GetListenerResult> invokeAsync(GetListenerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticloadbalancingv2:getListener", TypeShape.of(GetListenerResult.class), args == null ? GetListenerArgs.Empty : args, Utilities.withVersion(options));
    }
}
