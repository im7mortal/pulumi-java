// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.oslogin_v1alpha.inputs.GetSshPublicKeyArgs;
import io.pulumi.googlenative.oslogin_v1alpha.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSshPublicKey {
    private GetSshPublicKey() {}
    public interface BuilderApplicator {
        public void apply(GetSshPublicKeyArgs.Builder a);
    }
    private static GetSshPublicKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSshPublicKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves an SSH public key.
 * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> invokeAsync(GetSshPublicKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1alpha:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args == null ? GetSshPublicKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
