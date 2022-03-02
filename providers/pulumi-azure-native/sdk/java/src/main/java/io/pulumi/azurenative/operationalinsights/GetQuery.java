// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetQueryArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetQueryResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetQuery {
    private GetQuery() {}
    public interface BuilderApplicator {
        public void apply(GetQueryArgs.Builder a);
    }
    private static GetQueryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetQueryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A Log Analytics QueryPack-Query definition.
 * API Version: 2019-09-01-preview.
 * 
     *
     * A Log Analytics QueryPack-Query definition.
 * 
     */
    public static CompletableFuture<GetQueryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A Log Analytics QueryPack-Query definition.
     * API Version: 2019-09-01-preview.
     * 
     *
         * A Log Analytics QueryPack-Query definition.
     * 
     */
    public static CompletableFuture<GetQueryResult> invokeAsync(GetQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getQuery", TypeShape.of(GetQueryResult.class), args == null ? GetQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}
