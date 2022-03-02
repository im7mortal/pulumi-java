// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.orbital.inputs.GetContactProfileArgs;
import io.pulumi.azurenative.orbital.outputs.GetContactProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContactProfile {
    private GetContactProfile() {}
    public interface BuilderApplicator {
        public void apply(GetContactProfileArgs.Builder a);
    }
    private static GetContactProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContactProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
 * API Version: 2021-04-04-preview.
 * 
     *
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
 * 
     */
    public static CompletableFuture<GetContactProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * API Version: 2021-04-04-preview.
     * 
     *
         * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * 
     */
    public static CompletableFuture<GetContactProfileResult> invokeAsync(GetContactProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:getContactProfile", TypeShape.of(GetContactProfileResult.class), args == null ? GetContactProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
