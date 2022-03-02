// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1beta.inputs.GetVersionArgs;
import io.pulumi.googlenative.appengine_v1beta.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVersion {
    private GetVersion() {}
    public interface BuilderApplicator {
        public void apply(GetVersionArgs.Builder a);
    }
    private static GetVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
 * 
     */
    public static CompletableFuture<GetVersionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
     * 
     */
    public static CompletableFuture<GetVersionResult> invokeAsync(GetVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1beta:getVersion", TypeShape.of(GetVersionResult.class), args == null ? GetVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
