// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.inputs.GetImageRecipeArgs;
import io.pulumi.awsnative.imagebuilder.outputs.GetImageRecipeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImageRecipe {
    private GetImageRecipe() {}
    public interface BuilderApplicator {
        public void apply(GetImageRecipeArgs.Builder a);
    }
    private static GetImageRecipeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetImageRecipeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::ImageBuilder::ImageRecipe
 * 
     */
    public static CompletableFuture<GetImageRecipeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::ImageBuilder::ImageRecipe
     * 
     */
    public static CompletableFuture<GetImageRecipeResult> invokeAsync(GetImageRecipeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getImageRecipe", TypeShape.of(GetImageRecipeResult.class), args == null ? GetImageRecipeArgs.Empty : args, Utilities.withVersion(options));
    }
}
