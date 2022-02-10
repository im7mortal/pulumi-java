// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.example.PetArgs;
import io.pulumi.example.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="example::Pet")
public class Pet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }

    public Pet(String name, @Nullable PetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Pet", name, args == null ? PetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Pet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Pet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Pet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pet(name, id, options);
    }
}