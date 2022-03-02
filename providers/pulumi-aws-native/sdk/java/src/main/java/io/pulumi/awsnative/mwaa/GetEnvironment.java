// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mwaa.inputs.GetEnvironmentArgs;
import io.pulumi.awsnative.mwaa.outputs.GetEnvironmentResult;
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
     * Resource schema for AWS::MWAA::Environment
 * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::MWAA::Environment
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(GetEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mwaa:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args == null ? GetEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
