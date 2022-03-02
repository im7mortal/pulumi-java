// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetLogProfileArgs;
import io.pulumi.azurenative.insights.outputs.GetLogProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLogProfile {
    private GetLogProfile() {}
    public interface BuilderApplicator {
        public void apply(GetLogProfileArgs.Builder a);
    }
    private static GetLogProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLogProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The log profile resource.
 * API Version: 2016-03-01.
 * 
     *
     * The log profile resource.
 * 
     */
    public static CompletableFuture<GetLogProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The log profile resource.
     * API Version: 2016-03-01.
     * 
     *
         * The log profile resource.
     * 
     */
    public static CompletableFuture<GetLogProfileResult> invokeAsync(GetLogProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getLogProfile", TypeShape.of(GetLogProfileResult.class), args == null ? GetLogProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
