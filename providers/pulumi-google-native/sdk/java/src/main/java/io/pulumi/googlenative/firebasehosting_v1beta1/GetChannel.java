// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebasehosting_v1beta1.inputs.GetChannelArgs;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.GetChannelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannel {
    private GetChannel() {}
    public interface BuilderApplicator {
        public void apply(GetChannelArgs.Builder a);
    }
    private static GetChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves information for the specified channel of the specified site.
 * 
     */
    public static CompletableFuture<GetChannelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves information for the specified channel of the specified site.
     * 
     */
    public static CompletableFuture<GetChannelResult> invokeAsync(GetChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebasehosting/v1beta1:getChannel", TypeShape.of(GetChannelResult.class), args == null ? GetChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
