// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetPublicDelegatedPrefixArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetPublicDelegatedPrefixResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPublicDelegatedPrefix {
    private GetPublicDelegatedPrefix() {}
    public interface BuilderApplicator {
        public void apply(GetPublicDelegatedPrefixArgs.Builder a);
    }
    private static GetPublicDelegatedPrefixArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPublicDelegatedPrefixArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified PublicDelegatedPrefix resource in the given region.
 * 
     */
    public static CompletableFuture<GetPublicDelegatedPrefixResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified PublicDelegatedPrefix resource in the given region.
     * 
     */
    public static CompletableFuture<GetPublicDelegatedPrefixResult> invokeAsync(GetPublicDelegatedPrefixArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getPublicDelegatedPrefix", TypeShape.of(GetPublicDelegatedPrefixResult.class), args == null ? GetPublicDelegatedPrefixArgs.Empty : args, Utilities.withVersion(options));
    }
}
