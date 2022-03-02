// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.domainregistration.inputs.GetDomainOwnershipIdentifierArgs;
import io.pulumi.azurenative.domainregistration.outputs.GetDomainOwnershipIdentifierResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDomainOwnershipIdentifier {
    private GetDomainOwnershipIdentifier() {}
    public interface BuilderApplicator {
        public void apply(GetDomainOwnershipIdentifierArgs.Builder a);
    }
    private static GetDomainOwnershipIdentifierArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDomainOwnershipIdentifierArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Domain ownership Identifier.
 * API Version: 2020-10-01.
 * 
     *
     * Domain ownership Identifier.
 * 
     */
    public static CompletableFuture<GetDomainOwnershipIdentifierResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Domain ownership Identifier.
     * API Version: 2020-10-01.
     * 
     *
         * Domain ownership Identifier.
     * 
     */
    public static CompletableFuture<GetDomainOwnershipIdentifierResult> invokeAsync(GetDomainOwnershipIdentifierArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:domainregistration:getDomainOwnershipIdentifier", TypeShape.of(GetDomainOwnershipIdentifierResult.class), args == null ? GetDomainOwnershipIdentifierArgs.Empty : args, Utilities.withVersion(options));
    }
}
