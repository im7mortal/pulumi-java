// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.inputs.GetTopicRuleArgs;
import io.pulumi.awsnative.iot.outputs.GetTopicRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopicRule {
    private GetTopicRule() {}
    public interface BuilderApplicator {
        public void apply(GetTopicRuleArgs.Builder a);
    }
    private static GetTopicRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTopicRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::IoT::TopicRule
 * 
     */
    public static CompletableFuture<GetTopicRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::IoT::TopicRule
     * 
     */
    public static CompletableFuture<GetTopicRuleResult> invokeAsync(GetTopicRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iot:getTopicRule", TypeShape.of(GetTopicRuleResult.class), args == null ? GetTopicRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
