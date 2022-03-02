// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebApp {
    private GetWebApp() {}
    public interface BuilderApplicator {
        public void apply(GetWebAppArgs.Builder a);
    }
    private static GetWebAppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWebAppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A web app, a mobile app backend, or an API app.
 * API Version: 2020-12-01.
 * 
     *
     * A web app, a mobile app backend, or an API app.
 * 
     */
    public static CompletableFuture<GetWebAppResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A web app, a mobile app backend, or an API app.
     * API Version: 2020-12-01.
     * 
     *
         * A web app, a mobile app backend, or an API app.
     * 
     */
    public static CompletableFuture<GetWebAppResult> invokeAsync(GetWebAppArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebApp", TypeShape.of(GetWebAppResult.class), args == null ? GetWebAppArgs.Empty : args, Utilities.withVersion(options));
    }
}
