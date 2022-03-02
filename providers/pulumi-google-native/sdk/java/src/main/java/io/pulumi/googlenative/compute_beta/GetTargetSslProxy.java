// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetTargetSslProxyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetTargetSslProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetSslProxy {
    private GetTargetSslProxy() {}
    public interface BuilderApplicator {
        public void apply(GetTargetSslProxyArgs.Builder a);
    }
    private static GetTargetSslProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetSslProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by making a list() request.
 * 
     */
    public static CompletableFuture<GetTargetSslProxyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by making a list() request.
     * 
     */
    public static CompletableFuture<GetTargetSslProxyResult> invokeAsync(GetTargetSslProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getTargetSslProxy", TypeShape.of(GetTargetSslProxyResult.class), args == null ? GetTargetSslProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
