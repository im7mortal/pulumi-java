// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.inputs.GetAssetArgs;
import io.pulumi.awsnative.iotsitewise.outputs.GetAssetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAsset {
    private GetAsset() {}
    public interface BuilderApplicator {
        public void apply(GetAssetArgs.Builder a);
    }
    private static GetAssetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAssetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Asset
 * 
     */
    public static CompletableFuture<GetAssetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::IoTSiteWise::Asset
     * 
     */
    public static CompletableFuture<GetAssetResult> invokeAsync(GetAssetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getAsset", TypeShape.of(GetAssetResult.class), args == null ? GetAssetArgs.Empty : args, Utilities.withVersion(options));
    }
}
