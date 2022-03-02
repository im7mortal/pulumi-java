// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.inputs.GetDimensionArgs;
import io.pulumi.awsnative.iot.outputs.GetDimensionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDimension {
    private GetDimension() {}
    public interface BuilderApplicator {
        public void apply(GetDimensionArgs.Builder a);
    }
    private static GetDimensionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDimensionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A dimension can be used to limit the scope of a metric used in a security profile for AWS IoT Device Defender.
 * 
     */
    public static CompletableFuture<GetDimensionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A dimension can be used to limit the scope of a metric used in a security profile for AWS IoT Device Defender.
     * 
     */
    public static CompletableFuture<GetDimensionResult> invokeAsync(GetDimensionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iot:getDimension", TypeShape.of(GetDimensionResult.class), args == null ? GetDimensionArgs.Empty : args, Utilities.withVersion(options));
    }
}
