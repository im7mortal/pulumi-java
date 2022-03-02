// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devopsguru.inputs.GetResourceCollectionArgs;
import io.pulumi.awsnative.devopsguru.outputs.GetResourceCollectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceCollection {
    private GetResourceCollection() {}
    public interface BuilderApplicator {
        public void apply(GetResourceCollectionArgs.Builder a);
    }
    private static GetResourceCollectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResourceCollectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
 * 
     */
    public static CompletableFuture<GetResourceCollectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
     * 
     */
    public static CompletableFuture<GetResourceCollectionResult> invokeAsync(GetResourceCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devopsguru:getResourceCollection", TypeShape.of(GetResourceCollectionResult.class), args == null ? GetResourceCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
