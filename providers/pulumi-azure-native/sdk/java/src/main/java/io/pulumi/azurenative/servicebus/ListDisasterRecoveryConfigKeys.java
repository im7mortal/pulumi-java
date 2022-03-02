// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.inputs.ListDisasterRecoveryConfigKeysArgs;
import io.pulumi.azurenative.servicebus.outputs.ListDisasterRecoveryConfigKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDisasterRecoveryConfigKeys {
    private ListDisasterRecoveryConfigKeys() {}
    public interface BuilderApplicator {
        public void apply(ListDisasterRecoveryConfigKeysArgs.Builder a);
    }
    private static ListDisasterRecoveryConfigKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListDisasterRecoveryConfigKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Namespace/ServiceBus Connection String
 * API Version: 2017-04-01.
 * 
     *
     * Namespace/ServiceBus Connection String
 * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     *
         * Namespace/ServiceBus Connection String
     * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> invokeAsync(ListDisasterRecoveryConfigKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listDisasterRecoveryConfigKeys", TypeShape.of(ListDisasterRecoveryConfigKeysResult.class), args == null ? ListDisasterRecoveryConfigKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
