// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1beta.inputs.GetConfigArgs;
import io.pulumi.googlenative.apigateway_v1beta.outputs.GetConfigResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfig {
    private GetConfig() {}
    public interface BuilderApplicator {
        public void apply(GetConfigArgs.Builder a);
    }
    private static GetConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single ApiConfig.
 * 
     */
    public static CompletableFuture<GetConfigResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single ApiConfig.
     * 
     */
    public static CompletableFuture<GetConfigResult> invokeAsync(GetConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getConfig", TypeShape.of(GetConfigResult.class), args == null ? GetConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
