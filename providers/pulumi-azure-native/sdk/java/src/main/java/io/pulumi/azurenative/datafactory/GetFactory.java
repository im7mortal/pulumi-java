// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.GetFactoryArgs;
import io.pulumi.azurenative.datafactory.outputs.GetFactoryResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFactory {
    private GetFactory() {}
    public interface BuilderApplicator {
        public void apply(GetFactoryArgs.Builder a);
    }
    private static GetFactoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFactoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Factory resource type.
 * API Version: 2018-06-01.
 * 
     *
     * Factory resource type.
 * 
     */
    public static CompletableFuture<GetFactoryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Factory resource type.
     * API Version: 2018-06-01.
     * 
     *
         * Factory resource type.
     * 
     */
    public static CompletableFuture<GetFactoryResult> invokeAsync(GetFactoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:getFactory", TypeShape.of(GetFactoryResult.class), args == null ? GetFactoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
