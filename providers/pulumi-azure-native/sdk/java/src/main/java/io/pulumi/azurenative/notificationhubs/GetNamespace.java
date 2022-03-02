// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.inputs.GetNamespaceArgs;
import io.pulumi.azurenative.notificationhubs.outputs.GetNamespaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespace {
    private GetNamespace() {}
    public interface BuilderApplicator {
        public void apply(GetNamespaceArgs.Builder a);
    }
    private static GetNamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Description of a Namespace resource.
 * API Version: 2017-04-01.
 * 
     *
     * Description of a Namespace resource.
 * 
     */
    public static CompletableFuture<GetNamespaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Description of a Namespace resource.
     * API Version: 2017-04-01.
     * 
     *
         * Description of a Namespace resource.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> invokeAsync(GetNamespaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notificationhubs:getNamespace", TypeShape.of(GetNamespaceResult.class), args == null ? GetNamespaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
