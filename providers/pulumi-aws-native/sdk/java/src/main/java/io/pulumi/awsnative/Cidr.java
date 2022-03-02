// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.inputs.CidrArgs;
import io.pulumi.awsnative.outputs.CidrResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class Cidr {
    private Cidr() {}
    public interface BuilderApplicator {
        public void apply(CidrArgs.Builder a);
    }
    private static CidrArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = CidrArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    public static CompletableFuture<CidrResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    public static CompletableFuture<CidrResult> invokeAsync(CidrArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:cidr", TypeShape.of(CidrResult.class), args == null ? CidrArgs.Empty : args, Utilities.withVersion(options));
    }
}
