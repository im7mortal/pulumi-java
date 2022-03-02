// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.GetBlobInventoryPolicyArgs;
import io.pulumi.azurenative.storage.outputs.GetBlobInventoryPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlobInventoryPolicy {
    private GetBlobInventoryPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetBlobInventoryPolicyArgs.Builder a);
    }
    private static GetBlobInventoryPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBlobInventoryPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The storage account blob inventory policy.
 * API Version: 2021-02-01.
 * 
     *
     * The storage account blob inventory policy.
 * 
     */
    public static CompletableFuture<GetBlobInventoryPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The storage account blob inventory policy.
     * API Version: 2021-02-01.
     * 
     *
         * The storage account blob inventory policy.
     * 
     */
    public static CompletableFuture<GetBlobInventoryPolicyResult> invokeAsync(GetBlobInventoryPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:getBlobInventoryPolicy", TypeShape.of(GetBlobInventoryPolicyResult.class), args == null ? GetBlobInventoryPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
