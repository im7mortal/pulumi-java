// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1beta.inputs.GetAppArgs;
import io.pulumi.googlenative.appengine_v1beta.outputs.GetAppResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApp {
    private GetApp() {}
    public interface BuilderApplicator {
        public void apply(GetAppArgs.Builder a);
    }
    private static GetAppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets information about an application.
 * 
     */
    public static CompletableFuture<GetAppResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets information about an application.
     * 
     */
    public static CompletableFuture<GetAppResult> invokeAsync(GetAppArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1beta:getApp", TypeShape.of(GetAppResult.class), args == null ? GetAppArgs.Empty : args, Utilities.withVersion(options));
    }
}
