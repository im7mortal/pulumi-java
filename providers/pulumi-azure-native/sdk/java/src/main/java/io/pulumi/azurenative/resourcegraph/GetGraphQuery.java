// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourcegraph;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resourcegraph.inputs.GetGraphQueryArgs;
import io.pulumi.azurenative.resourcegraph.outputs.GetGraphQueryResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGraphQuery {
    private GetGraphQuery() {}
    public interface BuilderApplicator {
        public void apply(GetGraphQueryArgs.Builder a);
    }
    private static GetGraphQueryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGraphQueryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Graph Query entity definition.
 * API Version: 2018-09-01-preview.
 * 
     *
     * Graph Query entity definition.
 * 
     */
    public static CompletableFuture<GetGraphQueryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Graph Query entity definition.
     * API Version: 2018-09-01-preview.
     * 
     *
         * Graph Query entity definition.
     * 
     */
    public static CompletableFuture<GetGraphQueryResult> invokeAsync(GetGraphQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resourcegraph:getGraphQuery", TypeShape.of(GetGraphQueryResult.class), args == null ? GetGraphQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}
