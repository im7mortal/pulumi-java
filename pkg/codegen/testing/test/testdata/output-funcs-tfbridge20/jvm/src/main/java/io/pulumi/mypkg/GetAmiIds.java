// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.mypkg.Utilities;
import io.pulumi.mypkg.inputs.GetAmiIdsArgs;
import io.pulumi.mypkg.outputs.GetAmiIdsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
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
     * Taken from pulumi-AWS to regress an issue
 * 
     *
     * A collection of arguments for invoking getAmiIds.
 * 
     *
     * A collection of values returned by getAmiIds.
 * 
     * @Deprecated
     * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
 * 
     */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Taken from pulumi-AWS to regress an issue
     * 
     *
         * A collection of arguments for invoking getAmiIds.
     * 
     *
         * A collection of values returned by getAmiIds.
     * 
     * @Deprecated
         * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
     * 
     */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(GetAmiIdsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("mypkg::getAmiIds", TypeShape.of(GetAmiIdsResult.class), args == null ? GetAmiIdsArgs.Empty : args, Utilities.withVersion(options));
    }
}
