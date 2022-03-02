// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.inputs.GetMulticastGroupArgs;
import io.pulumi.awsnative.iotwireless.outputs.GetMulticastGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMulticastGroup {
    private GetMulticastGroup() {}
    public interface BuilderApplicator {
        public void apply(GetMulticastGroupArgs.Builder a);
    }
    private static GetMulticastGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMulticastGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Create and manage Multicast groups.
 * 
     */
    public static CompletableFuture<GetMulticastGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Create and manage Multicast groups.
     * 
     */
    public static CompletableFuture<GetMulticastGroupResult> invokeAsync(GetMulticastGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getMulticastGroup", TypeShape.of(GetMulticastGroupResult.class), args == null ? GetMulticastGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
