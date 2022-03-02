// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.management.inputs.GetEntityArgs;
import io.pulumi.azurenative.management.outputs.GetEntityResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntity {
    private GetEntity() {}
    public interface BuilderApplicator {
        public void apply(GetEntityArgs.Builder a);
    }
    private static GetEntityArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEntityArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Describes the result of the request to view entities.
 * API Version: 2020-05-01.
 * 
     *
     * Describes the result of the request to view entities.
 * 
     */
    public static CompletableFuture<GetEntityResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Describes the result of the request to view entities.
     * API Version: 2020-05-01.
     * 
     *
         * Describes the result of the request to view entities.
     * 
     */
    public static CompletableFuture<GetEntityResult> invokeAsync(@Nullable GetEntityArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:management:getEntity", TypeShape.of(GetEntityResult.class), args == null ? GetEntityArgs.Empty : args, Utilities.withVersion(options));
    }
}
