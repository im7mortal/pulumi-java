// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.configuration.inputs.GetStoredQueryArgs;
import io.pulumi.awsnative.configuration.outputs.GetStoredQueryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStoredQuery {
/**
 * Resource Type definition for AWS::Config::StoredQuery
 * 
 */
    public static CompletableFuture<GetStoredQueryResult> invokeAsync(GetStoredQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:configuration:getStoredQuery", TypeShape.of(GetStoredQueryResult.class), args == null ? GetStoredQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}
