// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetServiceAttachmentArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetServiceAttachmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceAttachment {
    private GetServiceAttachment() {}
    public interface BuilderApplicator {
        public void apply(GetServiceAttachmentArgs.Builder a);
    }
    private static GetServiceAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified ServiceAttachment resource in the given scope.
 * 
     */
    public static CompletableFuture<GetServiceAttachmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified ServiceAttachment resource in the given scope.
     * 
     */
    public static CompletableFuture<GetServiceAttachmentResult> invokeAsync(GetServiceAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getServiceAttachment", TypeShape.of(GetServiceAttachmentResult.class), args == null ? GetServiceAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
