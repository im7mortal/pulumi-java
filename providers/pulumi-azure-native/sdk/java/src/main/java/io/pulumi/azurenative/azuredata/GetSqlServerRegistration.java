// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azuredata.inputs.GetSqlServerRegistrationArgs;
import io.pulumi.azurenative.azuredata.outputs.GetSqlServerRegistrationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlServerRegistration {
    private GetSqlServerRegistration() {}
    public interface BuilderApplicator {
        public void apply(GetSqlServerRegistrationArgs.Builder a);
    }
    private static GetSqlServerRegistrationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSqlServerRegistrationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A SQL server registration.
 * API Version: 2019-07-24-preview.
 * 
     *
     * A SQL server registration.
 * 
     */
    public static CompletableFuture<GetSqlServerRegistrationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A SQL server registration.
     * API Version: 2019-07-24-preview.
     * 
     *
         * A SQL server registration.
     * 
     */
    public static CompletableFuture<GetSqlServerRegistrationResult> invokeAsync(GetSqlServerRegistrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azuredata:getSqlServerRegistration", TypeShape.of(GetSqlServerRegistrationResult.class), args == null ? GetSqlServerRegistrationArgs.Empty : args, Utilities.withVersion(options));
    }
}
