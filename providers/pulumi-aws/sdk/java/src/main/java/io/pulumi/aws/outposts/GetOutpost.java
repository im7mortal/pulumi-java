// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.outposts.inputs.GetOutpostArgs;
import io.pulumi.aws.outposts.outputs.GetOutpostResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOutpost {
    private GetOutpost() {}
    public interface BuilderApplicator {
        public void apply(GetOutpostArgs.Builder a);
    }
    private static GetOutpostArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOutpostArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about an Outposts Outpost.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getOutpost.
 * 
     *
     * A collection of values returned by getOutpost.
 * 
     */
    public static CompletableFuture<GetOutpostResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about an Outposts Outpost.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getOutpost.
     * 
     *
         * A collection of values returned by getOutpost.
     * 
     */
    public static CompletableFuture<GetOutpostResult> invokeAsync(@Nullable GetOutpostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getOutpost:getOutpost", TypeShape.of(GetOutpostResult.class), args == null ? GetOutpostArgs.Empty : args, Utilities.withVersion(options));
    }
}
