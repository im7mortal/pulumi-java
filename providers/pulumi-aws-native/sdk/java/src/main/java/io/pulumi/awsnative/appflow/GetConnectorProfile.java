// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appflow.inputs.GetConnectorProfileArgs;
import io.pulumi.awsnative.appflow.outputs.GetConnectorProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectorProfile {
    private GetConnectorProfile() {}
    public interface BuilderApplicator {
        public void apply(GetConnectorProfileArgs.Builder a);
    }
    private static GetConnectorProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectorProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::AppFlow::ConnectorProfile
 * 
     */
    public static CompletableFuture<GetConnectorProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::AppFlow::ConnectorProfile
     * 
     */
    public static CompletableFuture<GetConnectorProfileResult> invokeAsync(GetConnectorProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appflow:getConnectorProfile", TypeShape.of(GetConnectorProfileResult.class), args == null ? GetConnectorProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
