// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.elastic.inputs.ListMonitoredResourceArgs;
import io.pulumi.azurenative.elastic.outputs.ListMonitoredResourceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListMonitoredResource {
    private ListMonitoredResource() {}
    public interface BuilderApplicator {
        public void apply(ListMonitoredResourceArgs.Builder a);
    }
    private static ListMonitoredResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListMonitoredResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response of a list operation.
 * API Version: 2020-07-01.
 * 
     *
     * Response of a list operation.
 * 
     */
    public static CompletableFuture<ListMonitoredResourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response of a list operation.
     * API Version: 2020-07-01.
     * 
     *
         * Response of a list operation.
     * 
     */
    public static CompletableFuture<ListMonitoredResourceResult> invokeAsync(ListMonitoredResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:elastic:listMonitoredResource", TypeShape.of(ListMonitoredResourceResult.class), args == null ? ListMonitoredResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
