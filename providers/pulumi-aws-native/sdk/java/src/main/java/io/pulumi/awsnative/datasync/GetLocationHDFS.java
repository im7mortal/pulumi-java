// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetLocationHDFSArgs;
import io.pulumi.awsnative.datasync.outputs.GetLocationHDFSResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocationHDFS {
    private GetLocationHDFS() {}
    public interface BuilderApplicator {
        public void apply(GetLocationHDFSArgs.Builder a);
    }
    private static GetLocationHDFSArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLocationHDFSArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::DataSync::LocationHDFS.
 * 
     */
    public static CompletableFuture<GetLocationHDFSResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::DataSync::LocationHDFS.
     * 
     */
    public static CompletableFuture<GetLocationHDFSResult> invokeAsync(GetLocationHDFSArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getLocationHDFS", TypeShape.of(GetLocationHDFSResult.class), args == null ? GetLocationHDFSArgs.Empty : args, Utilities.withVersion(options));
    }
}
