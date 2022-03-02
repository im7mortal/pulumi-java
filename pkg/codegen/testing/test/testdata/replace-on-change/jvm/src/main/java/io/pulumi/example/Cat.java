// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.CatArgs;
import io.pulumi.example.God;
import io.pulumi.example.Utilities;
import io.pulumi.example.outputs.Toy;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="example::Cat")
public class Cat extends io.pulumi.resources.CustomResource {
    @OutputExport(name="foes", type=Map.class, parameters={String.class, Toy.class})
    private Output</* @Nullable */ Map<String,Toy>> foes;

    public Output</* @Nullable */ Map<String,Toy>> getFoes() {
        return this.foes;
    }
    @OutputExport(name="friends", type=List.class, parameters={Toy.class})
    private Output</* @Nullable */ List<Toy>> friends;

    public Output</* @Nullable */ List<Toy>> getFriends() {
        return this.friends;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="other", type=God.class, parameters={})
    private Output</* @Nullable */ God> other;

    public Output</* @Nullable */ God> getOther() {
        return this.other;
    }
    @OutputExport(name="toy", type=Toy.class, parameters={})
    private Output</* @Nullable */ Toy> toy;

    public Output</* @Nullable */ Toy> getToy() {
        return this.toy;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable CatArgs.Builder a);
    }
    private static io.pulumi.example.CatArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.example.CatArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cat(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cat(String name) {
        this(name, CatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cat(String name, @Nullable CatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cat(String name, @Nullable CatArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Cat", name, args == null ? CatArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cat(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Cat", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAdditionalSecretOutputs(List.of(
                "name"
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cat get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cat(name, id, options);
    }
}
