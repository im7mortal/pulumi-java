// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.outposts.inputs.GetSiteArgs;
import io.pulumi.aws.outposts.outputs.GetSiteResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSite {
    private GetSite() {}
    public interface BuilderApplicator {
        public void apply(GetSiteArgs.Builder a);
    }
    private static GetSiteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSiteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about an Outposts Site.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getSite.
 * 
     *
     * A collection of values returned by getSite.
 * 
     */
    public static CompletableFuture<GetSiteResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about an Outposts Site.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getSite.
     * 
     *
         * A collection of values returned by getSite.
     * 
     */
    public static CompletableFuture<GetSiteResult> invokeAsync(@Nullable GetSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getSite:getSite", TypeShape.of(GetSiteResult.class), args == null ? GetSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}
