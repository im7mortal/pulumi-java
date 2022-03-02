// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetTargetGrpcProxyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetTargetGrpcProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetGrpcProxy {
    private GetTargetGrpcProxy() {}
    public interface BuilderApplicator {
        public void apply(GetTargetGrpcProxyArgs.Builder a);
    }
    private static GetTargetGrpcProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetGrpcProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified TargetGrpcProxy resource in the given scope.
 * 
     */
    public static CompletableFuture<GetTargetGrpcProxyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified TargetGrpcProxy resource in the given scope.
     * 
     */
    public static CompletableFuture<GetTargetGrpcProxyResult> invokeAsync(GetTargetGrpcProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getTargetGrpcProxy", TypeShape.of(GetTargetGrpcProxyResult.class), args == null ? GetTargetGrpcProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
