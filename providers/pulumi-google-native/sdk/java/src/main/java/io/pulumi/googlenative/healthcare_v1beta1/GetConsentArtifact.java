// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GetConsentArtifactArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GetConsentArtifactResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConsentArtifact {
    private GetConsentArtifact() {}
    public interface BuilderApplicator {
        public void apply(GetConsentArtifactArgs.Builder a);
    }
    private static GetConsentArtifactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConsentArtifactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified Consent artifact.
 * 
     */
    public static CompletableFuture<GetConsentArtifactResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified Consent artifact.
     * 
     */
    public static CompletableFuture<GetConsentArtifactResult> invokeAsync(GetConsentArtifactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1beta1:getConsentArtifact", TypeShape.of(GetConsentArtifactResult.class), args == null ? GetConsentArtifactArgs.Empty : args, Utilities.withVersion(options));
    }
}
