// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetClientCertificateArgs;
import io.pulumi.awsnative.apigateway.outputs.GetClientCertificateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClientCertificate {
    private GetClientCertificate() {}
    public interface BuilderApplicator {
        public void apply(GetClientCertificateArgs.Builder a);
    }
    private static GetClientCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetClientCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::ApiGateway::ClientCertificate
 * 
     */
    public static CompletableFuture<GetClientCertificateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::ApiGateway::ClientCertificate
     * 
     */
    public static CompletableFuture<GetClientCertificateResult> invokeAsync(GetClientCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getClientCertificate", TypeShape.of(GetClientCertificateResult.class), args == null ? GetClientCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
