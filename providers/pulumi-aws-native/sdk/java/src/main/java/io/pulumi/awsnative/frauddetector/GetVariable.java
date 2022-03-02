// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.frauddetector.inputs.GetVariableArgs;
import io.pulumi.awsnative.frauddetector.outputs.GetVariableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVariable {
    private GetVariable() {}
    public interface BuilderApplicator {
        public void apply(GetVariableArgs.Builder a);
    }
    private static GetVariableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVariableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A resource schema for a Variable in Amazon Fraud Detector.
 * 
     */
    public static CompletableFuture<GetVariableResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A resource schema for a Variable in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetVariableResult> invokeAsync(GetVariableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getVariable", TypeShape.of(GetVariableResult.class), args == null ? GetVariableArgs.Empty : args, Utilities.withVersion(options));
    }
}
