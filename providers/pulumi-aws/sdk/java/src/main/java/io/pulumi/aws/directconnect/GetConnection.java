// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.inputs.GetConnectionArgs;
import io.pulumi.aws.directconnect.outputs.GetConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnection {
    private GetConnection() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionArgs.Builder a);
    }
    private static GetConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieve information about a Direct Connect Connection.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getConnection.
 * 
     *
     * A collection of values returned by getConnection.
 * 
     */
    public static CompletableFuture<GetConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieve information about a Direct Connect Connection.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getConnection.
     * 
     *
         * A collection of values returned by getConnection.
     * 
     */
    public static CompletableFuture<GetConnectionResult> invokeAsync(GetConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getConnection:getConnection", TypeShape.of(GetConnectionResult.class), args == null ? GetConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
