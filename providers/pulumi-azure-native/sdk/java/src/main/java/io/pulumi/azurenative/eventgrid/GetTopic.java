// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetTopicArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetTopicResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopic {
    private GetTopic() {}
    public interface BuilderApplicator {
        public void apply(GetTopicArgs.Builder a);
    }
    private static GetTopicArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTopicArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * EventGrid Topic
 * API Version: 2020-06-01.
 * 
     *
     * EventGrid Topic
 * 
     */
    public static CompletableFuture<GetTopicResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * EventGrid Topic
     * API Version: 2020-06-01.
     * 
     *
         * EventGrid Topic
     * 
     */
    public static CompletableFuture<GetTopicResult> invokeAsync(GetTopicArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopic", TypeShape.of(GetTopicResult.class), args == null ? GetTopicArgs.Empty : args, Utilities.withVersion(options));
    }
}
