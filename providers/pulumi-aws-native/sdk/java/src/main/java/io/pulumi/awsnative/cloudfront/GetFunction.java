// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.inputs.GetFunctionArgs;
import io.pulumi.awsnative.cloudfront.outputs.GetFunctionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFunction {
    private GetFunction() {}
    public interface BuilderApplicator {
        public void apply(GetFunctionArgs.Builder a);
    }
    private static GetFunctionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFunctionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::CloudFront::Function
 * 
     */
    public static CompletableFuture<GetFunctionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::CloudFront::Function
     * 
     */
    public static CompletableFuture<GetFunctionResult> invokeAsync(GetFunctionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getFunction", TypeShape.of(GetFunctionResult.class), args == null ? GetFunctionArgs.Empty : args, Utilities.withVersion(options));
    }
}
