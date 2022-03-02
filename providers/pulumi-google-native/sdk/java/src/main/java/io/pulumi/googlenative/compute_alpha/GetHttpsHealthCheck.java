// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetHttpsHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetHttpsHealthCheckResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHttpsHealthCheck {
    private GetHttpsHealthCheck() {}
    public interface BuilderApplicator {
        public void apply(GetHttpsHealthCheckArgs.Builder a);
    }
    private static GetHttpsHealthCheckArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHttpsHealthCheckArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks by making a list() request.
 * 
     */
    public static CompletableFuture<GetHttpsHealthCheckResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks by making a list() request.
     * 
     */
    public static CompletableFuture<GetHttpsHealthCheckResult> invokeAsync(GetHttpsHealthCheckArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getHttpsHealthCheck", TypeShape.of(GetHttpsHealthCheckResult.class), args == null ? GetHttpsHealthCheckArgs.Empty : args, Utilities.withVersion(options));
    }
}
