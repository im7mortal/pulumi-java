// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maps.inputs.ListAccountKeysArgs;
import io.pulumi.azurenative.maps.outputs.ListAccountKeysResult;
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
     * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
 * API Version: 2018-05-01.
 * 
     *
     * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
 * 
     */
    public static CompletableFuture<ListAccountKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
     * API Version: 2018-05-01.
     * 
     *
         * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
     * 
     */
    public static CompletableFuture<ListAccountKeysResult> invokeAsync(ListAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:listAccountKeys", TypeShape.of(ListAccountKeysResult.class), args == null ? ListAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
