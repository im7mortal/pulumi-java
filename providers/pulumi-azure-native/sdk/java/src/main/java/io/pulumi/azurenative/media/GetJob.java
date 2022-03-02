// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetJobArgs;
import io.pulumi.azurenative.media.outputs.GetJobResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJob {
    private GetJob() {}
    public interface BuilderApplicator {
        public void apply(GetJobArgs.Builder a);
    }
    private static GetJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
 * API Version: 2020-05-01.
 * 
     *
     * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
 * 
     */
    public static CompletableFuture<GetJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
     * API Version: 2020-05-01.
     * 
     *
         * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
     * 
     */
    public static CompletableFuture<GetJobResult> invokeAsync(GetJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getJob", TypeShape.of(GetJobResult.class), args == null ? GetJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
