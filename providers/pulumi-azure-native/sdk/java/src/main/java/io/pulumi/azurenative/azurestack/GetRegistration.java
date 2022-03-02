// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestack.inputs.GetRegistrationArgs;
import io.pulumi.azurenative.azurestack.outputs.GetRegistrationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistration {
    private GetRegistration() {}
    public interface BuilderApplicator {
        public void apply(GetRegistrationArgs.Builder a);
    }
    private static GetRegistrationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegistrationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Registration information.
 * API Version: 2017-06-01.
 * 
     *
     * Registration information.
 * 
     */
    public static CompletableFuture<GetRegistrationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Registration information.
     * API Version: 2017-06-01.
     * 
     *
         * Registration information.
     * 
     */
    public static CompletableFuture<GetRegistrationResult> invokeAsync(GetRegistrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getRegistration", TypeShape.of(GetRegistrationResult.class), args == null ? GetRegistrationArgs.Empty : args, Utilities.withVersion(options));
    }
}
