// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.inputs.GetServerKeyArgs;
import io.pulumi.azurenative.dbforpostgresql.outputs.GetServerKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerKey {
    private GetServerKey() {}
    public interface BuilderApplicator {
        public void apply(GetServerKeyArgs.Builder a);
    }
    private static GetServerKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServerKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A PostgreSQL Server key.
 * API Version: 2020-01-01.
 * 
     *
     * A PostgreSQL Server key.
 * 
     */
    public static CompletableFuture<GetServerKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A PostgreSQL Server key.
     * API Version: 2020-01-01.
     * 
     *
         * A PostgreSQL Server key.
     * 
     */
    public static CompletableFuture<GetServerKeyResult> invokeAsync(GetServerKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServerKey", TypeShape.of(GetServerKeyResult.class), args == null ? GetServerKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
