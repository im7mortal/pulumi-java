// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.inputs.GetVaultArgs;
import io.pulumi.aws.backup.outputs.GetVaultResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVault {
    private GetVault() {}
    public interface BuilderApplicator {
        public void apply(GetVaultArgs.Builder a);
    }
    private static GetVaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information on an existing backup vault.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getVault.
 * 
     *
     * A collection of values returned by getVault.
 * 
     */
    public static CompletableFuture<GetVaultResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information on an existing backup vault.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getVault.
     * 
     *
         * A collection of values returned by getVault.
     * 
     */
    public static CompletableFuture<GetVaultResult> invokeAsync(GetVaultArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getVault:getVault", TypeShape.of(GetVaultResult.class), args == null ? GetVaultArgs.Empty : args, Utilities.withVersion(options));
    }
}
