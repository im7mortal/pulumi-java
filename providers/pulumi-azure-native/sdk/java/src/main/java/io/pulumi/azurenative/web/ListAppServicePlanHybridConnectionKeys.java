// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListAppServicePlanHybridConnectionKeysArgs;
import io.pulumi.azurenative.web.outputs.ListAppServicePlanHybridConnectionKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAppServicePlanHybridConnectionKeys {
    public static CompletableFuture<ListAppServicePlanHybridConnectionKeysResult> invokeAsync(ListAppServicePlanHybridConnectionKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listAppServicePlanHybridConnectionKeys", TypeShape.of(ListAppServicePlanHybridConnectionKeysResult.class), args == null ? ListAppServicePlanHybridConnectionKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}