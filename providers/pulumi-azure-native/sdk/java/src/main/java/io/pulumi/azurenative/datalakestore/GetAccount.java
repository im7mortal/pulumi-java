// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakestore.inputs.GetAccountArgs;
import io.pulumi.azurenative.datalakestore.outputs.GetAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccount {
    private GetAccount() {}
    public interface BuilderApplicator {
        public void apply(GetAccountArgs.Builder a);
    }
    private static GetAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Data Lake Store account information.
 * API Version: 2016-11-01.
 * 
     *
     * Data Lake Store account information.
 * 
     */
    public static CompletableFuture<GetAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Data Lake Store account information.
     * API Version: 2016-11-01.
     * 
     *
         * Data Lake Store account information.
     * 
     */
    public static CompletableFuture<GetAccountResult> invokeAsync(GetAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getAccount", TypeShape.of(GetAccountResult.class), args == null ? GetAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
