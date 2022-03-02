// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetAliasArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetAliasResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAlias {
    private GetAlias() {}
    public interface BuilderApplicator {
        public void apply(GetAliasArgs.Builder a);
    }
    private static GetAliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an alias.
 * 
     */
    public static CompletableFuture<GetAliasResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an alias.
     * 
     */
    public static CompletableFuture<GetAliasResult> invokeAsync(GetAliasArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getAlias", TypeShape.of(GetAliasResult.class), args == null ? GetAliasArgs.Empty : args, Utilities.withVersion(options));
    }
}
