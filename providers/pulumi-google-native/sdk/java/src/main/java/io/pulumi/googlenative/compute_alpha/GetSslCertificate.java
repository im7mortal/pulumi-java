// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetSslCertificateArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetSslCertificateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSslCertificate {
    private GetSslCertificate() {}
    public interface BuilderApplicator {
        public void apply(GetSslCertificateArgs.Builder a);
    }
    private static GetSslCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSslCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by making a list() request.
 * 
     */
    public static CompletableFuture<GetSslCertificateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by making a list() request.
     * 
     */
    public static CompletableFuture<GetSslCertificateResult> invokeAsync(GetSslCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getSslCertificate", TypeShape.of(GetSslCertificateResult.class), args == null ? GetSslCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
