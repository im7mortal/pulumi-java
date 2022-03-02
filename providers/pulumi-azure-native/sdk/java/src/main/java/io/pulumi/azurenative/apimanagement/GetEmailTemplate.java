// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetEmailTemplateArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetEmailTemplateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEmailTemplate {
    private GetEmailTemplate() {}
    public interface BuilderApplicator {
        public void apply(GetEmailTemplateArgs.Builder a);
    }
    private static GetEmailTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEmailTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Email Template details.
 * API Version: 2020-12-01.
 * 
     *
     * Email Template details.
 * 
     */
    public static CompletableFuture<GetEmailTemplateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Email Template details.
     * API Version: 2020-12-01.
     * 
     *
         * Email Template details.
     * 
     */
    public static CompletableFuture<GetEmailTemplateResult> invokeAsync(GetEmailTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getEmailTemplate", TypeShape.of(GetEmailTemplateResult.class), args == null ? GetEmailTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
