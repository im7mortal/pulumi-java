// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.GetAccessPolicyArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.GetAccessPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPolicy {
    private GetAccessPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetAccessPolicyArgs.Builder a);
    }
    private static GetAccessPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccessPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Policy that determines how a video can be accessed.
 * API Version: 2021-05-01-preview.
 * 
     *
     * Policy that determines how a video can be accessed.
 * 
     */
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Policy that determines how a video can be accessed.
     * API Version: 2021-05-01-preview.
     * 
     *
         * Policy that determines how a video can be accessed.
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(GetAccessPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args == null ? GetAccessPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
