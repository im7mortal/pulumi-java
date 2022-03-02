// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.inputs.ListNamespaceKeysArgs;
import io.pulumi.azurenative.eventhub.outputs.ListNamespaceKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListNamespaceKeys {
    private ListNamespaceKeys() {}
    public interface BuilderApplicator {
        public void apply(ListNamespaceKeysArgs.Builder a);
    }
    private static ListNamespaceKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListNamespaceKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Namespace/EventHub Connection String
 * API Version: 2017-04-01.
 * 
     *
     * Namespace/EventHub Connection String
 * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     *
         * Namespace/EventHub Connection String
     * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> invokeAsync(ListNamespaceKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:listNamespaceKeys", TypeShape.of(ListNamespaceKeysResult.class), args == null ? ListNamespaceKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
