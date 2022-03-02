// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs;
import io.pulumi.aws.autoscaling.outputs.GetAmiIdsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAmiIds {
    private GetAmiIds() {}
    public interface BuilderApplicator {
        public void apply(GetAmiIdsArgs.Builder a);
    }
    private static GetAmiIdsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAmiIdsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
 * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getAmiIds.
 * 
     *
     * A collection of values returned by getAmiIds.
 * 
     */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getAmiIds.
     * 
     *
         * A collection of values returned by getAmiIds.
     * 
     */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(@Nullable GetAmiIdsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getAmiIds:getAmiIds", TypeShape.of(GetAmiIdsResult.class), args == null ? GetAmiIdsArgs.Empty : args, Utilities.withVersion(options));
    }
}
