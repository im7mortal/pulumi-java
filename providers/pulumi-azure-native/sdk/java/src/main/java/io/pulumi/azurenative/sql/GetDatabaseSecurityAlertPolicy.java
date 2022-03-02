// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDatabaseSecurityAlertPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetDatabaseSecurityAlertPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabaseSecurityAlertPolicy {
    private GetDatabaseSecurityAlertPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetDatabaseSecurityAlertPolicyArgs.Builder a);
    }
    private static GetDatabaseSecurityAlertPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDatabaseSecurityAlertPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A database security alert policy.
 * API Version: 2020-11-01-preview.
 * 
     *
     * A database security alert policy.
 * 
     */
    public static CompletableFuture<GetDatabaseSecurityAlertPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A database security alert policy.
     * API Version: 2020-11-01-preview.
     * 
     *
         * A database security alert policy.
     * 
     */
    public static CompletableFuture<GetDatabaseSecurityAlertPolicyResult> invokeAsync(GetDatabaseSecurityAlertPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDatabaseSecurityAlertPolicy", TypeShape.of(GetDatabaseSecurityAlertPolicyResult.class), args == null ? GetDatabaseSecurityAlertPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
