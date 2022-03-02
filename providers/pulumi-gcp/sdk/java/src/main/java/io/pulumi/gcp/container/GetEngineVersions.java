// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.inputs.GetEngineVersionsArgs;
import io.pulumi.gcp.container.outputs.GetEngineVersionsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEngineVersions {
    private GetEngineVersions() {}
    public interface BuilderApplicator {
        public void apply(GetEngineVersionsArgs.Builder a);
    }
    private static GetEngineVersionsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEngineVersionsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
 * 
 * > If you are using the `gcp.container.getEngineVersions` datasource with a
 * regional cluster, ensure that you have provided a region as the `location` to
 * the datasource. A region can have a different set of supported versions than
 * its component zones, and not all zones in a region are guaranteed to
 * support the same version.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getEngineVersions.
 * 
     *
     * A collection of values returned by getEngineVersions.
 * 
     */
    public static CompletableFuture<GetEngineVersionsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
     * 
     * > If you are using the `gcp.container.getEngineVersions` datasource with a
     * regional cluster, ensure that you have provided a region as the `location` to
     * the datasource. A region can have a different set of supported versions than
     * its component zones, and not all zones in a region are guaranteed to
     * support the same version.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getEngineVersions.
     * 
     *
         * A collection of values returned by getEngineVersions.
     * 
     */
    public static CompletableFuture<GetEngineVersionsResult> invokeAsync(@Nullable GetEngineVersionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:container/getEngineVersions:getEngineVersions", TypeShape.of(GetEngineVersionsResult.class), args == null ? GetEngineVersionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
