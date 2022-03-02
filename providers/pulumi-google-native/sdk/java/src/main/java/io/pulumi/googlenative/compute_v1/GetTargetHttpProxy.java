// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetTargetHttpProxyArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetTargetHttpProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetHttpProxy {
    private GetTargetHttpProxy() {}
    public interface BuilderApplicator {
        public void apply(GetTargetHttpProxyArgs.Builder a);
    }
    private static GetTargetHttpProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetHttpProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by making a list() request.
 * 
     */
    public static CompletableFuture<GetTargetHttpProxyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by making a list() request.
     * 
     */
    public static CompletableFuture<GetTargetHttpProxyResult> invokeAsync(GetTargetHttpProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getTargetHttpProxy", TypeShape.of(GetTargetHttpProxyResult.class), args == null ? GetTargetHttpProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
