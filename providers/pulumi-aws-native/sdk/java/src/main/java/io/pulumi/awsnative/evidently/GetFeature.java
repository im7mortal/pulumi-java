// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.inputs.GetFeatureArgs;
import io.pulumi.awsnative.evidently.outputs.GetFeatureResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeature {
    private GetFeature() {}
    public interface BuilderApplicator {
        public void apply(GetFeatureArgs.Builder a);
    }
    private static GetFeatureArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFeatureArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::Evidently::Feature.
 * 
     */
    public static CompletableFuture<GetFeatureResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::Evidently::Feature.
     * 
     */
    public static CompletableFuture<GetFeatureResult> invokeAsync(GetFeatureArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:evidently:getFeature", TypeShape.of(GetFeatureResult.class), args == null ? GetFeatureArgs.Empty : args, Utilities.withVersion(options));
    }
}
