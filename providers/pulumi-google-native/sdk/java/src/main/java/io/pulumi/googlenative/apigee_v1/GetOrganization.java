// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetOrganizationArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetOrganizationResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganization {
    private GetOrganization() {}
    public interface BuilderApplicator {
        public void apply(GetOrganizationArgs.Builder a);
    }
    private static GetOrganizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOrganizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the profile for an Apigee organization. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
 * 
     */
    public static CompletableFuture<GetOrganizationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the profile for an Apigee organization. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
     * 
     */
    public static CompletableFuture<GetOrganizationResult> invokeAsync(GetOrganizationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getOrganization", TypeShape.of(GetOrganizationResult.class), args == null ? GetOrganizationArgs.Empty : args, Utilities.withVersion(options));
    }
}
