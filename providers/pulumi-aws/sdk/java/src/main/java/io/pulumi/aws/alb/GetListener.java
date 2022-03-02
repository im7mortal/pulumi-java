// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.alb.inputs.GetListenerArgs;
import io.pulumi.aws.alb.outputs.GetListenerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetListener {
    private GetListener() {}
    public interface BuilderApplicator {
        public void apply(GetListenerArgs.Builder a);
    }
    private static GetListenerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetListenerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * Provides information about a Load Balancer Listener.
 * 
 * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getListener.
 * 
     *
     * A collection of values returned by getListener.
 * 
     */
    public static CompletableFuture<GetListenerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getListener.
     * 
     *
         * A collection of values returned by getListener.
     * 
     */
    public static CompletableFuture<GetListenerResult> invokeAsync(@Nullable GetListenerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:alb/getListener:getListener", TypeShape.of(GetListenerResult.class), args == null ? GetListenerArgs.Empty : args, Utilities.withVersion(options));
    }
}
