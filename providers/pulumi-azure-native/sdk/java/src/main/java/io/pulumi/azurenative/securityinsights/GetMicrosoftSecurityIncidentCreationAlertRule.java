// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetMicrosoftSecurityIncidentCreationAlertRuleArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetMicrosoftSecurityIncidentCreationAlertRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMicrosoftSecurityIncidentCreationAlertRule {
    public static CompletableFuture<GetMicrosoftSecurityIncidentCreationAlertRuleResult> invokeAsync(GetMicrosoftSecurityIncidentCreationAlertRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getMicrosoftSecurityIncidentCreationAlertRule", TypeShape.of(GetMicrosoftSecurityIncidentCreationAlertRuleResult.class), args == null ? GetMicrosoftSecurityIncidentCreationAlertRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}