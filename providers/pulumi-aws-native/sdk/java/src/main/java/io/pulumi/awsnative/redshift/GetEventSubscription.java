// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.inputs.GetEventSubscriptionArgs;
import io.pulumi.awsnative.redshift.outputs.GetEventSubscriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventSubscription {
    private GetEventSubscription() {}
    public interface BuilderApplicator {
        public void apply(GetEventSubscriptionArgs.Builder a);
    }
    private static GetEventSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEventSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The `AWS::Redshift::EventSubscription` resource creates an Amazon Redshift Event Subscription.
 * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The `AWS::Redshift::EventSubscription` resource creates an Amazon Redshift Event Subscription.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> invokeAsync(GetEventSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getEventSubscription", TypeShape.of(GetEventSubscriptionResult.class), args == null ? GetEventSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
