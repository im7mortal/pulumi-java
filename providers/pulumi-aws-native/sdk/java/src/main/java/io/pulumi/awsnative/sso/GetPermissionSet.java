// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sso.inputs.GetPermissionSetArgs;
import io.pulumi.awsnative.sso.outputs.GetPermissionSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPermissionSet {
    private GetPermissionSet() {}
    public interface BuilderApplicator {
        public void apply(GetPermissionSetArgs.Builder a);
    }
    private static GetPermissionSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPermissionSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for SSO PermissionSet
 * 
     */
    public static CompletableFuture<GetPermissionSetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for SSO PermissionSet
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> invokeAsync(GetPermissionSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getPermissionSet", TypeShape.of(GetPermissionSetResult.class), args == null ? GetPermissionSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
