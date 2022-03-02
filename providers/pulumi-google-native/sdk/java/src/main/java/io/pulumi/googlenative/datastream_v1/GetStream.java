// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1.inputs.GetStreamArgs;
import io.pulumi.googlenative.datastream_v1.outputs.GetStreamResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStream {
    private GetStream() {}
    public interface BuilderApplicator {
        public void apply(GetStreamArgs.Builder a);
    }
    private static GetStreamArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetStreamArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this method to get details about a stream.
 * 
     */
    public static CompletableFuture<GetStreamResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this method to get details about a stream.
     * 
     */
    public static CompletableFuture<GetStreamResult> invokeAsync(GetStreamArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastream/v1:getStream", TypeShape.of(GetStreamResult.class), args == null ? GetStreamArgs.Empty : args, Utilities.withVersion(options));
    }
}
