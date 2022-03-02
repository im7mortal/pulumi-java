// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GetInstructionArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GetInstructionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstruction {
    private GetInstruction() {}
    public interface BuilderApplicator {
        public void apply(GetInstructionArgs.Builder a);
    }
    private static GetInstructionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetInstructionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an instruction by resource name.
 * 
     */
    public static CompletableFuture<GetInstructionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an instruction by resource name.
     * 
     */
    public static CompletableFuture<GetInstructionResult> invokeAsync(GetInstructionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getInstruction", TypeShape.of(GetInstructionResult.class), args == null ? GetInstructionArgs.Empty : args, Utilities.withVersion(options));
    }
}
