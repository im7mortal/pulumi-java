// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.inputs.GetUserSshKeyArgs;
import io.pulumi.aws.iam.outputs.GetUserSshKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUserSshKey {
    private GetUserSshKey() {}
    public interface BuilderApplicator {
        public void apply(GetUserSshKeyArgs.Builder a);
    }
    private static GetUserSshKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetUserSshKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information about a SSH public key associated with the specified IAM user.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getUserSshKey.
 * 
     *
     * A collection of values returned by getUserSshKey.
 * 
     */
    public static CompletableFuture<GetUserSshKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information about a SSH public key associated with the specified IAM user.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getUserSshKey.
     * 
     *
         * A collection of values returned by getUserSshKey.
     * 
     */
    public static CompletableFuture<GetUserSshKeyResult> invokeAsync(GetUserSshKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:iam/getUserSshKey:getUserSshKey", TypeShape.of(GetUserSshKeyResult.class), args == null ? GetUserSshKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
