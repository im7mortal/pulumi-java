// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetDefaultTagsArgs;
import io.pulumi.aws.outputs.GetDefaultTagsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultTags {
    private GetDefaultTags() {}
    public interface BuilderApplicator {
        public void apply(GetDefaultTagsArgs.Builder a);
    }
    private static GetDefaultTagsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDefaultTagsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    public static CompletableFuture<GetDefaultTagsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDefaultTagsResult> invokeAsync(@Nullable GetDefaultTagsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getDefaultTags:getDefaultTags", TypeShape.of(GetDefaultTagsResult.class), args == null ? GetDefaultTagsArgs.Empty : args, Utilities.withVersion(options));
    }
}
