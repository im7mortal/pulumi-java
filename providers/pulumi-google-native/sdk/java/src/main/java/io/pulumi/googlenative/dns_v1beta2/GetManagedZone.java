// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1beta2.inputs.GetManagedZoneArgs;
import io.pulumi.googlenative.dns_v1beta2.outputs.GetManagedZoneResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagedZone {
    private GetManagedZone() {}
    public interface BuilderApplicator {
        public void apply(GetManagedZoneArgs.Builder a);
    }
    private static GetManagedZoneArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetManagedZoneArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Fetches the representation of an existing ManagedZone.
 * 
     */
    public static CompletableFuture<GetManagedZoneResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Fetches the representation of an existing ManagedZone.
     * 
     */
    public static CompletableFuture<GetManagedZoneResult> invokeAsync(GetManagedZoneArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1beta2:getManagedZone", TypeShape.of(GetManagedZoneResult.class), args == null ? GetManagedZoneArgs.Empty : args, Utilities.withVersion(options));
    }
}
