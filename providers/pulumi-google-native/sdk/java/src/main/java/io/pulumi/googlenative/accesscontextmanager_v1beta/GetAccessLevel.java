// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.GetAccessLevelArgs;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.GetAccessLevelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessLevel {
    private GetAccessLevel() {}
    public interface BuilderApplicator {
        public void apply(GetAccessLevelArgs.Builder a);
    }
    private static GetAccessLevelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccessLevelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get an Access Level by resource name.
 * 
     */
    public static CompletableFuture<GetAccessLevelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get an Access Level by resource name.
     * 
     */
    public static CompletableFuture<GetAccessLevelResult> invokeAsync(GetAccessLevelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:accesscontextmanager/v1beta:getAccessLevel", TypeShape.of(GetAccessLevelResult.class), args == null ? GetAccessLevelArgs.Empty : args, Utilities.withVersion(options));
    }
}
