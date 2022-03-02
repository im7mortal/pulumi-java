// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.inputs.GetConsentStoreArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GetConsentStoreResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConsentStore {
    private GetConsentStore() {}
    public interface BuilderApplicator {
        public void apply(GetConsentStoreArgs.Builder a);
    }
    private static GetConsentStoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConsentStoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified consent store.
 * 
     */
    public static CompletableFuture<GetConsentStoreResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified consent store.
     * 
     */
    public static CompletableFuture<GetConsentStoreResult> invokeAsync(GetConsentStoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1:getConsentStore", TypeShape.of(GetConsentStoreResult.class), args == null ? GetConsentStoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
