// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GetDatasetArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GetDatasetResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataset {
    private GetDataset() {}
    public interface BuilderApplicator {
        public void apply(GetDatasetArgs.Builder a);
    }
    private static GetDatasetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDatasetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets any metadata associated with a dataset.
 * 
     */
    public static CompletableFuture<GetDatasetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets any metadata associated with a dataset.
     * 
     */
    public static CompletableFuture<GetDatasetResult> invokeAsync(GetDatasetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1beta1:getDataset", TypeShape.of(GetDatasetResult.class), args == null ? GetDatasetArgs.Empty : args, Utilities.withVersion(options));
    }
}
