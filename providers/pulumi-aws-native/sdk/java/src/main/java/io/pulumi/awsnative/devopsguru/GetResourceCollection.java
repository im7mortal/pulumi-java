// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devopsguru.inputs.GetResourceCollectionArgs;
import io.pulumi.awsnative.devopsguru.outputs.GetResourceCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceCollection {
/**
 * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
 * 
 */
    public static CompletableFuture<GetResourceCollectionResult> invokeAsync(GetResourceCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devopsguru:getResourceCollection", TypeShape.of(GetResourceCollectionResult.class), args == null ? GetResourceCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
