// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.inputs.GetEnvironmentArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.GetEnvironmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvironment {
    private GetEnvironment() {}
    public interface BuilderApplicator {
        public void apply(GetEnvironmentArgs.Builder a);
    }
    private static GetEnvironmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEnvironmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Environment.
 * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Environment.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(GetEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args == null ? GetEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
