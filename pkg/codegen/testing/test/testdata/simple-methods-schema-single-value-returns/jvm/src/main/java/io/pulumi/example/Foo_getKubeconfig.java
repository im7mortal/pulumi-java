// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.example.Utilities;
import io.pulumi.example.inputs.Foo_getKubeconfigArgs;
import io.pulumi.example.outputs.Foo_getKubeconfigResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class Foo/getKubeconfig {
    public static CompletableFuture<Foo_getKubeconfigResult> invokeAsync(Foo_getKubeconfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("example::Foo/getKubeconfig", TypeShape.of(Foo_getKubeconfigResult.class), args == null ? Foo_getKubeconfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
