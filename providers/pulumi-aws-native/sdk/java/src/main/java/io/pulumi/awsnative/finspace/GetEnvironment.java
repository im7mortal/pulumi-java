// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.finspace.inputs.GetEnvironmentArgs;
import io.pulumi.awsnative.finspace.outputs.GetEnvironmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
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
     * An example resource schema demonstrating some basic constructs and validation rules.
 * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(GetEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:finspace:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args == null ? GetEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
