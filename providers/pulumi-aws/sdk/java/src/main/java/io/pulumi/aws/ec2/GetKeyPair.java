// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetKeyPairArgs;
import io.pulumi.aws.ec2.outputs.GetKeyPairResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKeyPair {
    private GetKeyPair() {}
    public interface BuilderApplicator {
        public void apply(GetKeyPairArgs.Builder a);
    }
    private static GetKeyPairArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyPairArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information about a specific EC2 Key Pair.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getKeyPair.
 * 
     *
     * A collection of values returned by getKeyPair.
 * 
     */
    public static CompletableFuture<GetKeyPairResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information about a specific EC2 Key Pair.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getKeyPair.
     * 
     *
         * A collection of values returned by getKeyPair.
     * 
     */
    public static CompletableFuture<GetKeyPairResult> invokeAsync(@Nullable GetKeyPairArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getKeyPair:getKeyPair", TypeShape.of(GetKeyPairResult.class), args == null ? GetKeyPairArgs.Empty : args, Utilities.withVersion(options));
    }
}
