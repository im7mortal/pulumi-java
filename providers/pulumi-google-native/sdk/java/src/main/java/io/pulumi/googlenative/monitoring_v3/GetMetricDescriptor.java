// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.inputs.GetMetricDescriptorArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.GetMetricDescriptorResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMetricDescriptor {
    private GetMetricDescriptor() {}
    public interface BuilderApplicator {
        public void apply(GetMetricDescriptorArgs.Builder a);
    }
    private static GetMetricDescriptorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMetricDescriptorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a single metric descriptor. This method does not require a Workspace.
 * 
     */
    public static CompletableFuture<GetMetricDescriptorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a single metric descriptor. This method does not require a Workspace.
     * 
     */
    public static CompletableFuture<GetMetricDescriptorResult> invokeAsync(GetMetricDescriptorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getMetricDescriptor", TypeShape.of(GetMetricDescriptorResult.class), args == null ? GetMetricDescriptorArgs.Empty : args, Utilities.withVersion(options));
    }
}
