// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.registrygeoreplication;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.registrygeoreplication.ProviderArgs;
import io.pulumi.registrygeoreplication.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="pulumi:providers:registrygeoreplication")
public class Provider extends io.pulumi.resources.ProviderResource {
    public Provider(String name, @Nullable ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("registrygeoreplication", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
