// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppHostKeysArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppHostKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppHostKeys {
    private ListWebAppHostKeys() {}
    public interface BuilderApplicator {
        public void apply(ListWebAppHostKeysArgs.Builder a);
    }
    private static ListWebAppHostKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListWebAppHostKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Functions host level keys.
 * API Version: 2020-12-01.
 * 
     *
     * Functions host level keys.
 * 
     */
    public static CompletableFuture<ListWebAppHostKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Functions host level keys.
     * API Version: 2020-12-01.
     * 
     *
         * Functions host level keys.
     * 
     */
    public static CompletableFuture<ListWebAppHostKeysResult> invokeAsync(ListWebAppHostKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppHostKeys", TypeShape.of(ListWebAppHostKeysResult.class), args == null ? ListWebAppHostKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
