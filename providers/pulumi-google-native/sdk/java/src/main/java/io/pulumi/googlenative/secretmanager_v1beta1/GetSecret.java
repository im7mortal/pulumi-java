// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.secretmanager_v1beta1.inputs.GetSecretArgs;
import io.pulumi.googlenative.secretmanager_v1beta1.outputs.GetSecretResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecret {
    private GetSecret() {}
    public interface BuilderApplicator {
        public void apply(GetSecretArgs.Builder a);
    }
    private static GetSecretArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSecretArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets metadata for a given Secret.
 * 
     */
    public static CompletableFuture<GetSecretResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets metadata for a given Secret.
     * 
     */
    public static CompletableFuture<GetSecretResult> invokeAsync(GetSecretArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:secretmanager/v1beta1:getSecret", TypeShape.of(GetSecretResult.class), args == null ? GetSecretArgs.Empty : args, Utilities.withVersion(options));
    }
}
