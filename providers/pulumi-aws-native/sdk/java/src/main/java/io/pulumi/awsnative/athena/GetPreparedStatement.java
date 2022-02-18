// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.inputs.GetPreparedStatementArgs;
import io.pulumi.awsnative.athena.outputs.GetPreparedStatementResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPreparedStatement {
/**
 * Resource schema for AWS::Athena::PreparedStatement
 * 
 */
    public static CompletableFuture<GetPreparedStatementResult> invokeAsync(GetPreparedStatementArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getPreparedStatement", TypeShape.of(GetPreparedStatementResult.class), args == null ? GetPreparedStatementArgs.Empty : args, Utilities.withVersion(options));
    }
}