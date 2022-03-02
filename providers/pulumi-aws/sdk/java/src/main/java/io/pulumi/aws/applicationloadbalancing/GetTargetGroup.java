// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.applicationloadbalancing.inputs.GetTargetGroupArgs;
import io.pulumi.aws.applicationloadbalancing.outputs.GetTargetGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.applicationloadbalancing.getTargetGroup has been deprecated in favor of aws.alb.getTargetGroup */
public class GetTargetGroup {
    private GetTargetGroup() {}
    public interface BuilderApplicator {
        public void apply(GetTargetGroupArgs.Builder a);
    }
    private static GetTargetGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * > **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
 * 
 * Provides information about a Load Balancer Target Group.
 * 
 * This data source can prove useful when a module accepts an LB Target Group as an
 * input variable and needs to know its attributes. It can also be used to get the ARN of
 * an LB Target Group for use in other resources, given LB Target Group name.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getTargetGroup.
 * 
     *
     * A collection of values returned by getTargetGroup.
 * 
     * @Deprecated
     * aws.applicationloadbalancing.getTargetGroup has been deprecated in favor of aws.alb.getTargetGroup
 * 
     */
    public static CompletableFuture<GetTargetGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * > **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getTargetGroup.
     * 
     *
         * A collection of values returned by getTargetGroup.
     * 
     * @Deprecated
         * aws.applicationloadbalancing.getTargetGroup has been deprecated in favor of aws.alb.getTargetGroup
     * 
     */
    @Deprecated /* aws.applicationloadbalancing.getTargetGroup has been deprecated in favor of aws.alb.getTargetGroup */
    public static CompletableFuture<GetTargetGroupResult> invokeAsync(@Nullable GetTargetGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:applicationloadbalancing/getTargetGroup:getTargetGroup", TypeShape.of(GetTargetGroupResult.class), args == null ? GetTargetGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
