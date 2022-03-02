// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetCertificateArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetCertificateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificate {
    private GetCertificate() {}
    public interface BuilderApplicator {
        public void apply(GetCertificateArgs.Builder a);
    }
    private static GetCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Certificate details.
 * API Version: 2020-12-01.
 * 
     *
     * Certificate details.
 * 
     */
    public static CompletableFuture<GetCertificateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Certificate details.
     * API Version: 2020-12-01.
     * 
     *
         * Certificate details.
     * 
     */
    public static CompletableFuture<GetCertificateResult> invokeAsync(GetCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getCertificate", TypeShape.of(GetCertificateResult.class), args == null ? GetCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
