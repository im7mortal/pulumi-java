// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.inputs.GetVMwareCollectorArgs;
import io.pulumi.azurenative.migrate.outputs.GetVMwareCollectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVMwareCollector {
    private GetVMwareCollector() {}
    public interface BuilderApplicator {
        public void apply(GetVMwareCollectorArgs.Builder a);
    }
    private static GetVMwareCollectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVMwareCollectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2019-10-01.
 * 
     */
    public static CompletableFuture<GetVMwareCollectorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetVMwareCollectorResult> invokeAsync(GetVMwareCollectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getVMwareCollector", TypeShape.of(GetVMwareCollectorResult.class), args == null ? GetVMwareCollectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
