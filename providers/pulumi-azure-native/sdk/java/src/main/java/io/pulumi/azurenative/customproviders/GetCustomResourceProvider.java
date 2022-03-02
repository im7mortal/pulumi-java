// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customproviders.inputs.GetCustomResourceProviderArgs;
import io.pulumi.azurenative.customproviders.outputs.GetCustomResourceProviderResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomResourceProvider {
    private GetCustomResourceProvider() {}
    public interface BuilderApplicator {
        public void apply(GetCustomResourceProviderArgs.Builder a);
    }
    private static GetCustomResourceProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCustomResourceProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A manifest file that defines the custom resource provider resources.
 * API Version: 2018-09-01-preview.
 * 
     *
     * A manifest file that defines the custom resource provider resources.
 * 
     */
    public static CompletableFuture<GetCustomResourceProviderResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A manifest file that defines the custom resource provider resources.
     * API Version: 2018-09-01-preview.
     * 
     *
         * A manifest file that defines the custom resource provider resources.
     * 
     */
    public static CompletableFuture<GetCustomResourceProviderResult> invokeAsync(GetCustomResourceProviderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customproviders:getCustomResourceProvider", TypeShape.of(GetCustomResourceProviderResult.class), args == null ? GetCustomResourceProviderArgs.Empty : args, Utilities.withVersion(options));
    }
}
