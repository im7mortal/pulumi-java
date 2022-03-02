// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetDnsResourceReferenceByTarResourcesArgs;
import io.pulumi.azurenative.network.outputs.GetDnsResourceReferenceByTarResourcesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDnsResourceReferenceByTarResources {
    private GetDnsResourceReferenceByTarResources() {}
    public interface BuilderApplicator {
        public void apply(GetDnsResourceReferenceByTarResourcesArgs.Builder a);
    }
    private static GetDnsResourceReferenceByTarResourcesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDnsResourceReferenceByTarResourcesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents the properties of the Dns Resource Reference Result.
 * API Version: 2018-05-01.
 * 
     *
     * Represents the properties of the Dns Resource Reference Result.
 * 
     */
    public static CompletableFuture<GetDnsResourceReferenceByTarResourcesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents the properties of the Dns Resource Reference Result.
     * API Version: 2018-05-01.
     * 
     *
         * Represents the properties of the Dns Resource Reference Result.
     * 
     */
    public static CompletableFuture<GetDnsResourceReferenceByTarResourcesResult> invokeAsync(@Nullable GetDnsResourceReferenceByTarResourcesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getDnsResourceReferenceByTarResources", TypeShape.of(GetDnsResourceReferenceByTarResourcesResult.class), args == null ? GetDnsResourceReferenceByTarResourcesArgs.Empty : args, Utilities.withVersion(options));
    }
}
