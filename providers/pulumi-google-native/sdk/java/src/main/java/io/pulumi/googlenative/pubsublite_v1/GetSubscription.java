// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsublite_v1.inputs.GetSubscriptionArgs;
import io.pulumi.googlenative.pubsublite_v1.outputs.GetSubscriptionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubscription {
    private GetSubscription() {}
    public interface BuilderApplicator {
        public void apply(GetSubscriptionArgs.Builder a);
    }
    private static GetSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the subscription configuration.
 * 
     */
    public static CompletableFuture<GetSubscriptionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the subscription configuration.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> invokeAsync(GetSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsublite/v1:getSubscription", TypeShape.of(GetSubscriptionResult.class), args == null ? GetSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
