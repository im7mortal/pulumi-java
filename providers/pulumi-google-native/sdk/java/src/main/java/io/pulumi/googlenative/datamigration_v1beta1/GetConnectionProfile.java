// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.GetConnectionProfileArgs;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.GetConnectionProfileResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectionProfile {
    private GetConnectionProfile() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionProfileArgs.Builder a);
    }
    private static GetConnectionProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single connection profile.
 * 
     */
    public static CompletableFuture<GetConnectionProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single connection profile.
     * 
     */
    public static CompletableFuture<GetConnectionProfileResult> invokeAsync(GetConnectionProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getConnectionProfile", TypeShape.of(GetConnectionProfileResult.class), args == null ? GetConnectionProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
