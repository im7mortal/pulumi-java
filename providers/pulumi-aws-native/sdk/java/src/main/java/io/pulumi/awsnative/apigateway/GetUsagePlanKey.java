// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetUsagePlanKeyArgs;
import io.pulumi.awsnative.apigateway.outputs.GetUsagePlanKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUsagePlanKey {
    private GetUsagePlanKey() {}
    public interface BuilderApplicator {
        public void apply(GetUsagePlanKeyArgs.Builder a);
    }
    private static GetUsagePlanKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetUsagePlanKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::ApiGateway::UsagePlanKey
 * 
     */
    public static CompletableFuture<GetUsagePlanKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::ApiGateway::UsagePlanKey
     * 
     */
    public static CompletableFuture<GetUsagePlanKeyResult> invokeAsync(GetUsagePlanKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getUsagePlanKey", TypeShape.of(GetUsagePlanKeyResult.class), args == null ? GetUsagePlanKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
