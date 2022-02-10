// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetInstanceAttachmentArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetInstanceAttachmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceAttachment {
    public static CompletableFuture<GetInstanceAttachmentResult> invokeAsync(GetInstanceAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getInstanceAttachment", TypeShape.of(GetInstanceAttachmentResult.class), args == null ? GetInstanceAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}