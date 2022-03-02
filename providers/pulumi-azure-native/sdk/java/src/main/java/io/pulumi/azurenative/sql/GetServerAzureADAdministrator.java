// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetServerAzureADAdministratorArgs;
import io.pulumi.azurenative.sql.outputs.GetServerAzureADAdministratorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerAzureADAdministrator {
    private GetServerAzureADAdministrator() {}
    public interface BuilderApplicator {
        public void apply(GetServerAzureADAdministratorArgs.Builder a);
    }
    private static GetServerAzureADAdministratorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServerAzureADAdministratorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Azure Active Directory administrator.
 * API Version: 2020-11-01-preview.
 * 
     *
     * Azure Active Directory administrator.
 * 
     */
    public static CompletableFuture<GetServerAzureADAdministratorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Azure Active Directory administrator.
     * API Version: 2020-11-01-preview.
     * 
     *
         * Azure Active Directory administrator.
     * 
     */
    public static CompletableFuture<GetServerAzureADAdministratorResult> invokeAsync(GetServerAzureADAdministratorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getServerAzureADAdministrator", TypeShape.of(GetServerAzureADAdministratorResult.class), args == null ? GetServerAzureADAdministratorArgs.Empty : args, Utilities.withVersion(options));
    }
}
