// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.inputs.GetServiceAccountArgs;
import io.pulumi.googlenative.iam_v1.outputs.GetServiceAccountResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceAccount {
    private GetServiceAccount() {}
    public interface BuilderApplicator {
        public void apply(GetServiceAccountArgs.Builder a);
    }
    private static GetServiceAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a ServiceAccount.
 * 
     */
    public static CompletableFuture<GetServiceAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a ServiceAccount.
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> invokeAsync(GetServiceAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args == null ? GetServiceAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
