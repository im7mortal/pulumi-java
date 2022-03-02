// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.inputs.GetApplicationTypeVersionArgs;
import io.pulumi.azurenative.servicefabric.outputs.GetApplicationTypeVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplicationTypeVersion {
    private GetApplicationTypeVersion() {}
    public interface BuilderApplicator {
        public void apply(GetApplicationTypeVersionArgs.Builder a);
    }
    private static GetApplicationTypeVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetApplicationTypeVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An application type version resource for the specified application type name resource.
 * API Version: 2020-03-01.
 * 
     *
     * An application type version resource for the specified application type name resource.
 * 
     */
    public static CompletableFuture<GetApplicationTypeVersionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An application type version resource for the specified application type name resource.
     * API Version: 2020-03-01.
     * 
     *
         * An application type version resource for the specified application type name resource.
     * 
     */
    public static CompletableFuture<GetApplicationTypeVersionResult> invokeAsync(GetApplicationTypeVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getApplicationTypeVersion", TypeShape.of(GetApplicationTypeVersionResult.class), args == null ? GetApplicationTypeVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
