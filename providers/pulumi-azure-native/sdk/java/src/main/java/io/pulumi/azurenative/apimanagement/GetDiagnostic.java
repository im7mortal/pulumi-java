// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetDiagnosticArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetDiagnosticResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDiagnostic {
    private GetDiagnostic() {}
    public interface BuilderApplicator {
        public void apply(GetDiagnosticArgs.Builder a);
    }
    private static GetDiagnosticArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDiagnosticArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Diagnostic details.
 * API Version: 2020-12-01.
 * 
     *
     * Diagnostic details.
 * 
     */
    public static CompletableFuture<GetDiagnosticResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Diagnostic details.
     * API Version: 2020-12-01.
     * 
     *
         * Diagnostic details.
     * 
     */
    public static CompletableFuture<GetDiagnosticResult> invokeAsync(GetDiagnosticArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getDiagnostic", TypeShape.of(GetDiagnosticResult.class), args == null ? GetDiagnosticArgs.Empty : args, Utilities.withVersion(options));
    }
}
