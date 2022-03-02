// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.inputs.GetServiceArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetService {
    private GetService() {}
    public interface BuilderApplicator {
        public void apply(GetServiceArgs.Builder a);
    }
    private static GetServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get the named Service.
 * 
     */
    public static CompletableFuture<GetServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get the named Service.
     * 
     */
    public static CompletableFuture<GetServiceResult> invokeAsync(GetServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getService", TypeShape.of(GetServiceResult.class), args == null ? GetServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
