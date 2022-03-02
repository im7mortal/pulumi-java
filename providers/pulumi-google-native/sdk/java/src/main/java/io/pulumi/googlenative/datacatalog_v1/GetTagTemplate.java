// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1.inputs.GetTagTemplateArgs;
import io.pulumi.googlenative.datacatalog_v1.outputs.GetTagTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagTemplate {
    private GetTagTemplate() {}
    public interface BuilderApplicator {
        public void apply(GetTagTemplateArgs.Builder a);
    }
    private static GetTagTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTagTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a tag template.
 * 
     */
    public static CompletableFuture<GetTagTemplateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a tag template.
     * 
     */
    public static CompletableFuture<GetTagTemplateResult> invokeAsync(GetTagTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1:getTagTemplate", TypeShape.of(GetTagTemplateResult.class), args == null ? GetTagTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
