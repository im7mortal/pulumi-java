// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.inputs.GetDocumentArgs;
import io.pulumi.googlenative.dialogflow_v2.outputs.GetDocumentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDocument {
    private GetDocument() {}
    public interface BuilderApplicator {
        public void apply(GetDocumentArgs.Builder a);
    }
    private static GetDocumentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDocumentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the specified document.
 * 
     */
    public static CompletableFuture<GetDocumentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the specified document.
     * 
     */
    public static CompletableFuture<GetDocumentResult> invokeAsync(GetDocumentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v2:getDocument", TypeShape.of(GetDocumentResult.class), args == null ? GetDocumentArgs.Empty : args, Utilities.withVersion(options));
    }
}
