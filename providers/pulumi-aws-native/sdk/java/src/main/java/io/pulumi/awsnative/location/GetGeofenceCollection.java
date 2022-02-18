// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.location.inputs.GetGeofenceCollectionArgs;
import io.pulumi.awsnative.location.outputs.GetGeofenceCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGeofenceCollection {
/**
 * Definition of AWS::Location::GeofenceCollection Resource Type
 * 
 */
    public static CompletableFuture<GetGeofenceCollectionResult> invokeAsync(GetGeofenceCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:location:getGeofenceCollection", TypeShape.of(GetGeofenceCollectionResult.class), args == null ? GetGeofenceCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
