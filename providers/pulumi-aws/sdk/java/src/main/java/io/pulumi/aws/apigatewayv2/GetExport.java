// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.inputs.GetExportArgs;
import io.pulumi.aws.apigatewayv2.outputs.GetExportResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExport {
    private GetExport() {}
    public interface BuilderApplicator {
        public void apply(GetExportArgs.Builder a);
    }
    private static GetExportArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetExportArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Exports a definition of an API in a particular output format and specification.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getExport.
 * 
     *
     * A collection of values returned by getExport.
 * 
     */
    public static CompletableFuture<GetExportResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Exports a definition of an API in a particular output format and specification.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getExport.
     * 
     *
         * A collection of values returned by getExport.
     * 
     */
    public static CompletableFuture<GetExportResult> invokeAsync(GetExportArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigatewayv2/getExport:getExport", TypeShape.of(GetExportResult.class), args == null ? GetExportArgs.Empty : args, Utilities.withVersion(options));
    }
}
