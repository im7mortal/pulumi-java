// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.inputs.GetActionRuleByNameArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.GetActionRuleByNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetActionRuleByName {
    public static CompletableFuture<GetActionRuleByNameResult> invokeAsync(GetActionRuleByNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getActionRuleByName", TypeShape.of(GetActionRuleByNameResult.class), args == null ? GetActionRuleByNameArgs.Empty : args, Utilities.withVersion(options));
    }
}
