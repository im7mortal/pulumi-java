// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetDataCollectorArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetDataCollectorResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataCollector {
    private GetDataCollector() {}
    public interface BuilderApplicator {
        public void apply(GetDataCollectorArgs.Builder a);
    }
    private static GetDataCollectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDataCollectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a data collector.
 * 
     */
    public static CompletableFuture<GetDataCollectorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a data collector.
     * 
     */
    public static CompletableFuture<GetDataCollectorResult> invokeAsync(GetDataCollectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDataCollector", TypeShape.of(GetDataCollectorResult.class), args == null ? GetDataCollectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
