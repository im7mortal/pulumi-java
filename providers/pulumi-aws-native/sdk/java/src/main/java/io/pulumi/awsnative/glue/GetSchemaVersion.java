// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.inputs.GetSchemaVersionArgs;
import io.pulumi.awsnative.glue.outputs.GetSchemaVersionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchemaVersion {
/**
 * This resource represents an individual schema version of a schema defined in Glue Schema Registry.
 * 
 */
    public static CompletableFuture<GetSchemaVersionResult> invokeAsync(GetSchemaVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:glue:getSchemaVersion", TypeShape.of(GetSchemaVersionResult.class), args == null ? GetSchemaVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
