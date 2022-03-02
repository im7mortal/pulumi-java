// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetScriptExecutionArgs;
import io.pulumi.azurenative.avs.outputs.GetScriptExecutionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScriptExecution {
    private GetScriptExecution() {}
    public interface BuilderApplicator {
        public void apply(GetScriptExecutionArgs.Builder a);
    }
    private static GetScriptExecutionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetScriptExecutionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An instance of a script executed by a user - custom or AVS
 * API Version: 2021-06-01.
 * 
     *
     * An instance of a script executed by a user - custom or AVS
 * 
     */
    public static CompletableFuture<GetScriptExecutionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     *
         * An instance of a script executed by a user - custom or AVS
     * 
     */
    public static CompletableFuture<GetScriptExecutionResult> invokeAsync(GetScriptExecutionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getScriptExecution", TypeShape.of(GetScriptExecutionResult.class), args == null ? GetScriptExecutionArgs.Empty : args, Utilities.withVersion(options));
    }
}
