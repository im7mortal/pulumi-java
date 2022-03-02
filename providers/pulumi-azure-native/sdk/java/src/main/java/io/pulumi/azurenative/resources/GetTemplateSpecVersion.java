// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetTemplateSpecVersionArgs;
import io.pulumi.azurenative.resources.outputs.GetTemplateSpecVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTemplateSpecVersion {
    private GetTemplateSpecVersion() {}
    public interface BuilderApplicator {
        public void apply(GetTemplateSpecVersionArgs.Builder a);
    }
    private static GetTemplateSpecVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTemplateSpecVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Template Spec Version object.
 * API Version: 2021-05-01.
 * 
     *
     * Template Spec Version object.
 * 
     */
    public static CompletableFuture<GetTemplateSpecVersionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Template Spec Version object.
     * API Version: 2021-05-01.
     * 
     *
         * Template Spec Version object.
     * 
     */
    public static CompletableFuture<GetTemplateSpecVersionResult> invokeAsync(GetTemplateSpecVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getTemplateSpecVersion", TypeShape.of(GetTemplateSpecVersionResult.class), args == null ? GetTemplateSpecVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
