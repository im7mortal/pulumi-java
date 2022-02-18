// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ses.inputs.GetTemplateArgs;
import io.pulumi.awsnative.ses.outputs.GetTemplateResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTemplate {
/**
 * Resource Type definition for AWS::SES::Template
 * 
 */
    public static CompletableFuture<GetTemplateResult> invokeAsync(GetTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getTemplate", TypeShape.of(GetTemplateResult.class), args == null ? GetTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
