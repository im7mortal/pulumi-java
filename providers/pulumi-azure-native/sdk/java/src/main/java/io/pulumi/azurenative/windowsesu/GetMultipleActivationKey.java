// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsesu;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.windowsesu.inputs.GetMultipleActivationKeyArgs;
import io.pulumi.azurenative.windowsesu.outputs.GetMultipleActivationKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMultipleActivationKey {
    private GetMultipleActivationKey() {}
    public interface BuilderApplicator {
        public void apply(GetMultipleActivationKeyArgs.Builder a);
    }
    private static GetMultipleActivationKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMultipleActivationKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * MAK key details.
 * API Version: 2019-09-16-preview.
 * 
     *
     * MAK key details.
 * 
     */
    public static CompletableFuture<GetMultipleActivationKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * MAK key details.
     * API Version: 2019-09-16-preview.
     * 
     *
         * MAK key details.
     * 
     */
    public static CompletableFuture<GetMultipleActivationKeyResult> invokeAsync(GetMultipleActivationKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:windowsesu:getMultipleActivationKey", TypeShape.of(GetMultipleActivationKeyResult.class), args == null ? GetMultipleActivationKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
