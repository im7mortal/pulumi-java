// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.documentai_v1beta3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.documentai_v1beta3.inputs.GetProcessorArgs;
import io.pulumi.googlenative.documentai_v1beta3.outputs.GetProcessorResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProcessor {
    private GetProcessor() {}
    public interface BuilderApplicator {
        public void apply(GetProcessorArgs.Builder a);
    }
    private static GetProcessorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetProcessorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a processor detail.
 * 
     */
    public static CompletableFuture<GetProcessorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a processor detail.
     * 
     */
    public static CompletableFuture<GetProcessorResult> invokeAsync(GetProcessorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:documentai/v1beta3:getProcessor", TypeShape.of(GetProcessorResult.class), args == null ? GetProcessorArgs.Empty : args, Utilities.withVersion(options));
    }
}
