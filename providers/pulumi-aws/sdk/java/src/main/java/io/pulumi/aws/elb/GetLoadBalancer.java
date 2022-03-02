// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.inputs.GetLoadBalancerArgs;
import io.pulumi.aws.elb.outputs.GetLoadBalancerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLoadBalancer {
    private GetLoadBalancer() {}
    public interface BuilderApplicator {
        public void apply(GetLoadBalancerArgs.Builder a);
    }
    private static GetLoadBalancerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLoadBalancerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information about a "classic" Elastic Load Balancer (ELB).
 * See `LB` Data Source if you are looking for "v2"
 * Application Load Balancer (ALB) or Network Load Balancer (NLB).
 * 
 * This data source can prove useful when a module accepts an LB as an input
 * variable and needs to, for example, determine the security groups associated
 * with it, etc.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getLoadBalancer.
 * 
     *
     * A collection of values returned by getLoadBalancer.
 * 
     */
    public static CompletableFuture<GetLoadBalancerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information about a "classic" Elastic Load Balancer (ELB).
     * See `LB` Data Source if you are looking for "v2"
     * Application Load Balancer (ALB) or Network Load Balancer (NLB).
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getLoadBalancer.
     * 
     *
         * A collection of values returned by getLoadBalancer.
     * 
     */
    public static CompletableFuture<GetLoadBalancerResult> invokeAsync(GetLoadBalancerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elb/getLoadBalancer:getLoadBalancer", TypeShape.of(GetLoadBalancerResult.class), args == null ? GetLoadBalancerArgs.Empty : args, Utilities.withVersion(options));
    }
}
