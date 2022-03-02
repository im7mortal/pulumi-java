// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetUserArgs;
import io.pulumi.azurenative.labservices.outputs.GetUserResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUser {
    private GetUser() {}
    public interface BuilderApplicator {
        public void apply(GetUserArgs.Builder a);
    }
    private static GetUserArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetUserArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The User registered to a lab
 * API Version: 2018-10-15.
 * 
     *
     * The User registered to a lab
 * 
     */
    public static CompletableFuture<GetUserResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     *
         * The User registered to a lab
     * 
     */
    public static CompletableFuture<GetUserResult> invokeAsync(GetUserArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getUser", TypeShape.of(GetUserResult.class), args == null ? GetUserArgs.Empty : args, Utilities.withVersion(options));
    }
}
