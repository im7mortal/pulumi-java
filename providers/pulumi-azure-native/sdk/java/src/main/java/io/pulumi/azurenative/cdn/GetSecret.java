// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.inputs.GetSecretArgs;
import io.pulumi.azurenative.cdn.outputs.GetSecretResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
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
     * Friendly Secret name mapping to the any Secret or secret related information.
 * API Version: 2020-09-01.
 * 
     *
     * Friendly Secret name mapping to the any Secret or secret related information.
 * 
     */
    public static CompletableFuture<GetSecretResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Friendly Secret name mapping to the any Secret or secret related information.
     * API Version: 2020-09-01.
     * 
     *
         * Friendly Secret name mapping to the any Secret or secret related information.
     * 
     */
    public static CompletableFuture<GetSecretResult> invokeAsync(GetSecretArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getSecret", TypeShape.of(GetSecretResult.class), args == null ? GetSecretArgs.Empty : args, Utilities.withVersion(options));
    }
}
