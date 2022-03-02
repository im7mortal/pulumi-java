// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.botservice.inputs.GetEnterpriseChannelArgs;
import io.pulumi.azurenative.botservice.outputs.GetEnterpriseChannelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnterpriseChannel {
    private GetEnterpriseChannel() {}
    public interface BuilderApplicator {
        public void apply(GetEnterpriseChannelArgs.Builder a);
    }
    private static GetEnterpriseChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEnterpriseChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Enterprise Channel resource definition
 * API Version: 2018-07-12.
 * 
     *
     * Enterprise Channel resource definition
 * 
     */
    public static CompletableFuture<GetEnterpriseChannelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Enterprise Channel resource definition
     * API Version: 2018-07-12.
     * 
     *
         * Enterprise Channel resource definition
     * 
     */
    public static CompletableFuture<GetEnterpriseChannelResult> invokeAsync(GetEnterpriseChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:botservice:getEnterpriseChannel", TypeShape.of(GetEnterpriseChannelResult.class), args == null ? GetEnterpriseChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
