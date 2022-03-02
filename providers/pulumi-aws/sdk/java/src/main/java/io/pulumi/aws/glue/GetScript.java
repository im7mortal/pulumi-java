// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.inputs.GetScriptArgs;
import io.pulumi.aws.glue.outputs.GetScriptResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScript {
    private GetScript() {}
    public interface BuilderApplicator {
        public void apply(GetScriptArgs.Builder a);
    }
    private static GetScriptArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetScriptArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG).
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getScript.
 * 
     *
     * A collection of values returned by getScript.
 * 
     */
    public static CompletableFuture<GetScriptResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG).
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getScript.
     * 
     *
         * A collection of values returned by getScript.
     * 
     */
    public static CompletableFuture<GetScriptResult> invokeAsync(GetScriptArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:glue/getScript:getScript", TypeShape.of(GetScriptResult.class), args == null ? GetScriptArgs.Empty : args, Utilities.withVersion(options));
    }
}
