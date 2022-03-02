// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDnsServiceArgs;
import io.pulumi.azurenative.avs.outputs.GetWorkloadNetworkDnsServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkloadNetworkDnsService {
    private GetWorkloadNetworkDnsService() {}
    public interface BuilderApplicator {
        public void apply(GetWorkloadNetworkDnsServiceArgs.Builder a);
    }
    private static GetWorkloadNetworkDnsServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWorkloadNetworkDnsServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * NSX DNS Service
 * API Version: 2020-07-17-preview.
 * 
     *
     * NSX DNS Service
 * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * NSX DNS Service
     * API Version: 2020-07-17-preview.
     * 
     *
         * NSX DNS Service
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsServiceResult> invokeAsync(GetWorkloadNetworkDnsServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkDnsService", TypeShape.of(GetWorkloadNetworkDnsServiceResult.class), args == null ? GetWorkloadNetworkDnsServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
