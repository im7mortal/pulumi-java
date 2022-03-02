// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.memcache_v1beta2.inputs.GetInstanceArgs;
import io.pulumi.googlenative.memcache_v1beta2.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstance {
    private GetInstance() {}
    public interface BuilderApplicator {
        public void apply(GetInstanceArgs.Builder a);
    }
    private static GetInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Instance.
 * 
     */
    public static CompletableFuture<GetInstanceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> invokeAsync(GetInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:memcache/v1beta2:getInstance", TypeShape.of(GetInstanceResult.class), args == null ? GetInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
