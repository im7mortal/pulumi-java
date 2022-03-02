// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListStaticSiteUsersArgs;
import io.pulumi.azurenative.web.outputs.ListStaticSiteUsersResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStaticSiteUsers {
    private ListStaticSiteUsers() {}
    public interface BuilderApplicator {
        public void apply(ListStaticSiteUsersArgs.Builder a);
    }
    private static ListStaticSiteUsersArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListStaticSiteUsersArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Collection of static site custom users.
 * API Version: 2020-12-01.
 * 
     *
     * Collection of static site custom users.
 * 
     */
    public static CompletableFuture<ListStaticSiteUsersResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Collection of static site custom users.
     * API Version: 2020-12-01.
     * 
     *
         * Collection of static site custom users.
     * 
     */
    public static CompletableFuture<ListStaticSiteUsersResult> invokeAsync(ListStaticSiteUsersArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listStaticSiteUsers", TypeShape.of(ListStaticSiteUsersResult.class), args == null ? ListStaticSiteUsersArgs.Empty : args, Utilities.withVersion(options));
    }
}
