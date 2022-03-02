// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDatabaseAdvisorArgs;
import io.pulumi.azurenative.sql.outputs.GetDatabaseAdvisorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabaseAdvisor {
    private GetDatabaseAdvisor() {}
    public interface BuilderApplicator {
        public void apply(GetDatabaseAdvisorArgs.Builder a);
    }
    private static GetDatabaseAdvisorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDatabaseAdvisorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Database, Server or Elastic Pool Advisor.
 * API Version: 2020-11-01-preview.
 * 
     *
     * Database, Server or Elastic Pool Advisor.
 * 
     */
    public static CompletableFuture<GetDatabaseAdvisorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Database, Server or Elastic Pool Advisor.
     * API Version: 2020-11-01-preview.
     * 
     *
         * Database, Server or Elastic Pool Advisor.
     * 
     */
    public static CompletableFuture<GetDatabaseAdvisorResult> invokeAsync(GetDatabaseAdvisorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDatabaseAdvisor", TypeShape.of(GetDatabaseAdvisorResult.class), args == null ? GetDatabaseAdvisorArgs.Empty : args, Utilities.withVersion(options));
    }
}
