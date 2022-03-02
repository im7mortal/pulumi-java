// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cognitiveservices.inputs.ListAccountKeysArgs;
import io.pulumi.azurenative.cognitiveservices.outputs.ListAccountKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAccountKeys {
    private ListAccountKeys() {}
    public interface BuilderApplicator {
        public void apply(ListAccountKeysArgs.Builder a);
    }
    private static ListAccountKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListAccountKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The access keys for the cognitive services account.
 * API Version: 2017-04-18.
 * 
     *
     * The access keys for the cognitive services account.
 * 
     */
    public static CompletableFuture<ListAccountKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The access keys for the cognitive services account.
     * API Version: 2017-04-18.
     * 
     *
         * The access keys for the cognitive services account.
     * 
     */
    public static CompletableFuture<ListAccountKeysResult> invokeAsync(ListAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:listAccountKeys", TypeShape.of(ListAccountKeysResult.class), args == null ? ListAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
