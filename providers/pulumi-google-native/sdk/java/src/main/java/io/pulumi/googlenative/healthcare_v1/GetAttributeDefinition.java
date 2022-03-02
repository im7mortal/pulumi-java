// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.inputs.GetAttributeDefinitionArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GetAttributeDefinitionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAttributeDefinition {
    private GetAttributeDefinition() {}
    public interface BuilderApplicator {
        public void apply(GetAttributeDefinitionArgs.Builder a);
    }
    private static GetAttributeDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAttributeDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified Attribute definition.
 * 
     */
    public static CompletableFuture<GetAttributeDefinitionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified Attribute definition.
     * 
     */
    public static CompletableFuture<GetAttributeDefinitionResult> invokeAsync(GetAttributeDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1:getAttributeDefinition", TypeShape.of(GetAttributeDefinitionResult.class), args == null ? GetAttributeDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
