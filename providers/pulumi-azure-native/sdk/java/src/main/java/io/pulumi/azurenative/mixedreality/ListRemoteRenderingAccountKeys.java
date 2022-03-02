// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.mixedreality.inputs.ListRemoteRenderingAccountKeysArgs;
import io.pulumi.azurenative.mixedreality.outputs.ListRemoteRenderingAccountKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListRemoteRenderingAccountKeys {
    private ListRemoteRenderingAccountKeys() {}
    public interface BuilderApplicator {
        public void apply(ListRemoteRenderingAccountKeysArgs.Builder a);
    }
    private static ListRemoteRenderingAccountKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListRemoteRenderingAccountKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Developer Keys of account
 * API Version: 2021-01-01.
 * 
     *
     * Developer Keys of account
 * 
     */
    public static CompletableFuture<ListRemoteRenderingAccountKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     *
         * Developer Keys of account
     * 
     */
    public static CompletableFuture<ListRemoteRenderingAccountKeysResult> invokeAsync(ListRemoteRenderingAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:listRemoteRenderingAccountKeys", TypeShape.of(ListRemoteRenderingAccountKeysResult.class), args == null ? ListRemoteRenderingAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
