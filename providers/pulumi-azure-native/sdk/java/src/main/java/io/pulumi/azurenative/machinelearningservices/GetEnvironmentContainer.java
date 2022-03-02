// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetEnvironmentContainerArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetEnvironmentContainerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvironmentContainer {
    private GetEnvironmentContainer() {}
    public interface BuilderApplicator {
        public void apply(GetEnvironmentContainerArgs.Builder a);
    }
    private static GetEnvironmentContainerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEnvironmentContainerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Azure Resource Manager resource envelope.
 * API Version: 2021-03-01-preview.
 * 
     *
     * Azure Resource Manager resource envelope.
 * 
     */
    public static CompletableFuture<GetEnvironmentContainerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Azure Resource Manager resource envelope.
     * API Version: 2021-03-01-preview.
     * 
     *
         * Azure Resource Manager resource envelope.
     * 
     */
    public static CompletableFuture<GetEnvironmentContainerResult> invokeAsync(GetEnvironmentContainerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getEnvironmentContainer", TypeShape.of(GetEnvironmentContainerResult.class), args == null ? GetEnvironmentContainerArgs.Empty : args, Utilities.withVersion(options));
    }
}
