// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetLocationObjectStorageArgs;
import io.pulumi.awsnative.datasync.outputs.GetLocationObjectStorageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocationObjectStorage {
    private GetLocationObjectStorage() {}
    public interface BuilderApplicator {
        public void apply(GetLocationObjectStorageArgs.Builder a);
    }
    private static GetLocationObjectStorageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLocationObjectStorageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::DataSync::LocationObjectStorage.
 * 
     */
    public static CompletableFuture<GetLocationObjectStorageResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::DataSync::LocationObjectStorage.
     * 
     */
    public static CompletableFuture<GetLocationObjectStorageResult> invokeAsync(GetLocationObjectStorageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getLocationObjectStorage", TypeShape.of(GetLocationObjectStorageResult.class), args == null ? GetLocationObjectStorageArgs.Empty : args, Utilities.withVersion(options));
    }
}
