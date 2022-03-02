// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.inputs.GetKnowledgeBaseArgs;
import io.pulumi.googlenative.dialogflow_v2.outputs.GetKnowledgeBaseResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKnowledgeBase {
    private GetKnowledgeBase() {}
    public interface BuilderApplicator {
        public void apply(GetKnowledgeBaseArgs.Builder a);
    }
    private static GetKnowledgeBaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKnowledgeBaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the specified knowledge base.
 * 
     */
    public static CompletableFuture<GetKnowledgeBaseResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the specified knowledge base.
     * 
     */
    public static CompletableFuture<GetKnowledgeBaseResult> invokeAsync(GetKnowledgeBaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v2:getKnowledgeBase", TypeShape.of(GetKnowledgeBaseResult.class), args == null ? GetKnowledgeBaseArgs.Empty : args, Utilities.withVersion(options));
    }
}
