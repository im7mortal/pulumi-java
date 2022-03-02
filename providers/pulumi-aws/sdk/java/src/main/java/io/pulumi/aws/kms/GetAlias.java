// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kms.inputs.GetAliasArgs;
import io.pulumi.aws.kms.outputs.GetAliasResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAlias {
    private GetAlias() {}
    public interface BuilderApplicator {
        public void apply(GetAliasArgs.Builder a);
    }
    private static GetAliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the ARN of a KMS key alias.
 * By using this data source, you can reference key alias
 * without having to hard code the ARN as input.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getAlias.
 * 
     *
     * A collection of values returned by getAlias.
 * 
     */
    public static CompletableFuture<GetAliasResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getAlias.
     * 
     *
         * A collection of values returned by getAlias.
     * 
     */
    public static CompletableFuture<GetAliasResult> invokeAsync(GetAliasArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getAlias:getAlias", TypeShape.of(GetAliasResult.class), args == null ? GetAliasArgs.Empty : args, Utilities.withVersion(options));
    }
}
