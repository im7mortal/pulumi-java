// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lakeformation.inputs.GetResourceArgs;
import io.pulumi.aws.lakeformation.outputs.GetResourceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResource {
    private GetResource() {}
    public interface BuilderApplicator {
        public void apply(GetResourceArgs.Builder a);
    }
    private static GetResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about a Lake Formation resource.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getResource.
 * 
     *
     * A collection of values returned by getResource.
 * 
     */
    public static CompletableFuture<GetResourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about a Lake Formation resource.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getResource.
     * 
     *
         * A collection of values returned by getResource.
     * 
     */
    public static CompletableFuture<GetResourceResult> invokeAsync(GetResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getResource:getResource", TypeShape.of(GetResourceResult.class), args == null ? GetResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
