// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.inputs.GetBlockchainMemberArgs;
import io.pulumi.azurenative.blockchain.outputs.GetBlockchainMemberResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlockchainMember {
    private GetBlockchainMember() {}
    public interface BuilderApplicator {
        public void apply(GetBlockchainMemberArgs.Builder a);
    }
    private static GetBlockchainMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBlockchainMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Payload of the blockchain member which is exposed in the request/response of the resource provider.
 * API Version: 2018-06-01-preview.
 * 
     *
     * Payload of the blockchain member which is exposed in the request/response of the resource provider.
 * 
     */
    public static CompletableFuture<GetBlockchainMemberResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Payload of the blockchain member which is exposed in the request/response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     *
         * Payload of the blockchain member which is exposed in the request/response of the resource provider.
     * 
     */
    public static CompletableFuture<GetBlockchainMemberResult> invokeAsync(GetBlockchainMemberArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:getBlockchainMember", TypeShape.of(GetBlockchainMemberResult.class), args == null ? GetBlockchainMemberArgs.Empty : args, Utilities.withVersion(options));
    }
}
