// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetInstancePoolArgs;
import io.pulumi.azurenative.sql.outputs.GetInstancePoolResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstancePool {
    private GetInstancePool() {}
    public interface BuilderApplicator {
        public void apply(GetInstancePoolArgs.Builder a);
    }
    private static GetInstancePoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstancePoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An Azure SQL instance pool.
 * API Version: 2020-11-01-preview.
 * 
     *
     * An Azure SQL instance pool.
 * 
     */
    public static CompletableFuture<GetInstancePoolResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An Azure SQL instance pool.
     * API Version: 2020-11-01-preview.
     * 
     *
         * An Azure SQL instance pool.
     * 
     */
    public static CompletableFuture<GetInstancePoolResult> invokeAsync(GetInstancePoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getInstancePool", TypeShape.of(GetInstancePoolResult.class), args == null ? GetInstancePoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
