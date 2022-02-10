// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.example.PersonArgs;
import io.pulumi.example.Utilities;
import io.pulumi.example.outputs.Pet;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="example::Person")
public class Person extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="pets", type=List.class, parameters={Pet.class})
    private Output</* @Nullable */ List<Pet>> pets;

    public Output</* @Nullable */ List<Pet>> getPets() {
        return this.pets;
    }

    public Person(String name, @Nullable PersonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Person", name, args == null ? PersonArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Person(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Person", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Person get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Person(name, id, options);
    }
}