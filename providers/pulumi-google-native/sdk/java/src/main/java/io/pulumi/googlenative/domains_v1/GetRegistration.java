// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.domains_v1.inputs.GetRegistrationArgs;
import io.pulumi.googlenative.domains_v1.outputs.GetRegistrationResult;
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
     * Gets the details of a `Registration` resource.
 * 
     */
    public static CompletableFuture<GetRegistrationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the details of a `Registration` resource.
     * 
     */
    public static CompletableFuture<GetRegistrationResult> invokeAsync(GetRegistrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:domains/v1:getRegistration", TypeShape.of(GetRegistrationResult.class), args == null ? GetRegistrationArgs.Empty : args, Utilities.withVersion(options));
    }
}
