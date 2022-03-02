// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.inputs.GetApplicationArgs;
import io.pulumi.azurenative.batch.outputs.GetApplicationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplication {
    private GetApplication() {}
    public interface BuilderApplicator {
        public void apply(GetApplicationArgs.Builder a);
    }
    private static GetApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Contains information about an application in a Batch account.
 * API Version: 2021-01-01.
 * 
     *
     * Contains information about an application in a Batch account.
 * 
     */
    public static CompletableFuture<GetApplicationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Contains information about an application in a Batch account.
     * API Version: 2021-01-01.
     * 
     *
         * Contains information about an application in a Batch account.
     * 
     */
    public static CompletableFuture<GetApplicationResult> invokeAsync(GetApplicationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getApplication", TypeShape.of(GetApplicationResult.class), args == null ? GetApplicationArgs.Empty : args, Utilities.withVersion(options));
    }
}
