// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetScheduledTriggerArgs;
import io.pulumi.azurenative.datashare.outputs.GetScheduledTriggerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScheduledTrigger {
    private GetScheduledTrigger() {}
    public interface BuilderApplicator {
        public void apply(GetScheduledTriggerArgs.Builder a);
    }
    private static GetScheduledTriggerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetScheduledTriggerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A type of trigger based on schedule
 * API Version: 2020-09-01.
 * 
     *
     * A type of trigger based on schedule
 * 
     */
    public static CompletableFuture<GetScheduledTriggerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A type of trigger based on schedule
     * API Version: 2020-09-01.
     * 
     *
         * A type of trigger based on schedule
     * 
     */
    public static CompletableFuture<GetScheduledTriggerResult> invokeAsync(GetScheduledTriggerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getScheduledTrigger", TypeShape.of(GetScheduledTriggerResult.class), args == null ? GetScheduledTriggerArgs.Empty : args, Utilities.withVersion(options));
    }
}
