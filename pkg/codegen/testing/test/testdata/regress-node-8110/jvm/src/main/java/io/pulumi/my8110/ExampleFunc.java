// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.my8110;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.my8110.Utilities;
import io.pulumi.my8110.inputs.ExampleFuncArgs;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ExampleFunc {
    public static CompletableFuture<> invokeAsync(@Nullable ExampleFuncArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("my8110::exampleFunc", TypeShape.of(.class), args == null ? ExampleFuncArgs.Empty : args, Utilities.withVersion(options));
    }
}
