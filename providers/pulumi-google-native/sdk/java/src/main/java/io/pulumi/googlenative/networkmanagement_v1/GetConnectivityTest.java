// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkmanagement_v1.inputs.GetConnectivityTestArgs;
import io.pulumi.googlenative.networkmanagement_v1.outputs.GetConnectivityTestResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectivityTest {
    private GetConnectivityTest() {}
    public interface BuilderApplicator {
        public void apply(GetConnectivityTestArgs.Builder a);
    }
    private static GetConnectivityTestArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectivityTestArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the details of a specific Connectivity Test.
 * 
     */
    public static CompletableFuture<GetConnectivityTestResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the details of a specific Connectivity Test.
     * 
     */
    public static CompletableFuture<GetConnectivityTestResult> invokeAsync(GetConnectivityTestArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkmanagement/v1:getConnectivityTest", TypeShape.of(GetConnectivityTestResult.class), args == null ? GetConnectivityTestArgs.Empty : args, Utilities.withVersion(options));
    }
}
