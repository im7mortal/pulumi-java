// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSystemTopicEventSubscription {
    private GetSystemTopicEventSubscription() {}
    public interface BuilderApplicator {
        public void apply(GetSystemTopicEventSubscriptionArgs.Builder a);
    }
    private static GetSystemTopicEventSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSystemTopicEventSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Event Subscription
 * API Version: 2020-04-01-preview.
 * 
     *
     * Event Subscription
 * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     *
         * Event Subscription
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> invokeAsync(GetSystemTopicEventSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscription", TypeShape.of(GetSystemTopicEventSubscriptionResult.class), args == null ? GetSystemTopicEventSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
