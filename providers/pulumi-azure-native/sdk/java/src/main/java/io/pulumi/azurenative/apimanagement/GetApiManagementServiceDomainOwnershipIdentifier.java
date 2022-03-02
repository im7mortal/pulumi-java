// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetApiManagementServiceDomainOwnershipIdentifierArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetApiManagementServiceDomainOwnershipIdentifierResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApiManagementServiceDomainOwnershipIdentifier {
    private GetApiManagementServiceDomainOwnershipIdentifier() {}
    public interface BuilderApplicator {
        public void apply(GetApiManagementServiceDomainOwnershipIdentifierArgs.Builder a);
    }
    private static GetApiManagementServiceDomainOwnershipIdentifierArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetApiManagementServiceDomainOwnershipIdentifierArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response of the GetDomainOwnershipIdentifier operation.
 * API Version: 2020-12-01.
 * 
     *
     * Response of the GetDomainOwnershipIdentifier operation.
 * 
     */
    public static CompletableFuture<GetApiManagementServiceDomainOwnershipIdentifierResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response of the GetDomainOwnershipIdentifier operation.
     * API Version: 2020-12-01.
     * 
     *
         * Response of the GetDomainOwnershipIdentifier operation.
     * 
     */
    public static CompletableFuture<GetApiManagementServiceDomainOwnershipIdentifierResult> invokeAsync(@Nullable GetApiManagementServiceDomainOwnershipIdentifierArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getApiManagementServiceDomainOwnershipIdentifier", TypeShape.of(GetApiManagementServiceDomainOwnershipIdentifierResult.class), args == null ? GetApiManagementServiceDomainOwnershipIdentifierArgs.Empty : args, Utilities.withVersion(options));
    }
}
