// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.redhatopenshift.inputs.ListOpenShiftClusterCredentialsArgs;
import io.pulumi.azurenative.redhatopenshift.outputs.ListOpenShiftClusterCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListOpenShiftClusterCredentials {
    private ListOpenShiftClusterCredentials() {}
    public interface BuilderApplicator {
        public void apply(ListOpenShiftClusterCredentialsArgs.Builder a);
    }
    private static ListOpenShiftClusterCredentialsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListOpenShiftClusterCredentialsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * OpenShiftClusterCredentials represents an OpenShift cluster's credentials
 * API Version: 2020-04-30.
 * 
     *
     * OpenShiftClusterCredentials represents an OpenShift cluster's credentials
 * 
     */
    public static CompletableFuture<ListOpenShiftClusterCredentialsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * OpenShiftClusterCredentials represents an OpenShift cluster's credentials
     * API Version: 2020-04-30.
     * 
     *
         * OpenShiftClusterCredentials represents an OpenShift cluster's credentials
     * 
     */
    public static CompletableFuture<ListOpenShiftClusterCredentialsResult> invokeAsync(ListOpenShiftClusterCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:redhatopenshift:listOpenShiftClusterCredentials", TypeShape.of(ListOpenShiftClusterCredentialsResult.class), args == null ? ListOpenShiftClusterCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}
