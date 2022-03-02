// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1.inputs.GetWorkflowTemplateArgs;
import io.pulumi.googlenative.dataproc_v1.outputs.GetWorkflowTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkflowTemplate {
    private GetWorkflowTemplate() {}
    public interface BuilderApplicator {
        public void apply(GetWorkflowTemplateArgs.Builder a);
    }
    private static GetWorkflowTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWorkflowTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the latest workflow template.Can retrieve previously instantiated template by specifying optional version parameter.
 * 
     */
    public static CompletableFuture<GetWorkflowTemplateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the latest workflow template.Can retrieve previously instantiated template by specifying optional version parameter.
     * 
     */
    public static CompletableFuture<GetWorkflowTemplateResult> invokeAsync(GetWorkflowTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1:getWorkflowTemplate", TypeShape.of(GetWorkflowTemplateResult.class), args == null ? GetWorkflowTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
