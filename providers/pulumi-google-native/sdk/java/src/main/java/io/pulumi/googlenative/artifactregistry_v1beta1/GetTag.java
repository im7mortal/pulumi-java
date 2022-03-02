// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.artifactregistry_v1beta1.inputs.GetTagArgs;
import io.pulumi.googlenative.artifactregistry_v1beta1.outputs.GetTagResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTag {
    private GetTag() {}
    public interface BuilderApplicator {
        public void apply(GetTagArgs.Builder a);
    }
    private static GetTagArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTagArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a tag.
 * 
     */
    public static CompletableFuture<GetTagResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a tag.
     * 
     */
    public static CompletableFuture<GetTagResult> invokeAsync(GetTagArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1beta1:getTag", TypeShape.of(GetTagResult.class), args == null ? GetTagArgs.Empty : args, Utilities.withVersion(options));
    }
}
