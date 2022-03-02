// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetRunbookArgs;
import io.pulumi.azurenative.automation.outputs.GetRunbookResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRunbook {
    private GetRunbook() {}
    public interface BuilderApplicator {
        public void apply(GetRunbookArgs.Builder a);
    }
    private static GetRunbookArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRunbookArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Definition of the runbook type.
 * API Version: 2019-06-01.
 * 
     *
     * Definition of the runbook type.
 * 
     */
    public static CompletableFuture<GetRunbookResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Definition of the runbook type.
     * API Version: 2019-06-01.
     * 
     *
         * Definition of the runbook type.
     * 
     */
    public static CompletableFuture<GetRunbookResult> invokeAsync(GetRunbookArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getRunbook", TypeShape.of(GetRunbookResult.class), args == null ? GetRunbookArgs.Empty : args, Utilities.withVersion(options));
    }
}
