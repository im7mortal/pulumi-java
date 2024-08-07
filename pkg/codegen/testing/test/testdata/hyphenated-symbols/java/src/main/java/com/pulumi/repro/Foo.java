// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.repro;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.repro.FooArgs;
import com.pulumi.repro.Utilities;
import com.pulumi.repro.outputs.Bar;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="repro:index:Foo")
public class Foo extends com.pulumi.resources.CustomResource {
    @Export(name="conditionSets", refs={List.class,Bar.class}, tree="[0,[0,[0,1]]]")
    private Output</* @Nullable */ List<List<List<Bar>>>> conditionSets;

    public Output<Optional<List<List<List<Bar>>>>> conditionSets() {
        return Codegen.optional(this.conditionSets);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Foo(java.lang.String name) {
        this(name, FooArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Foo(java.lang.String name, @Nullable FooArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Foo(java.lang.String name, @Nullable FooArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("repro:index:Foo", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Foo(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("repro:index:Foo", name, null, makeResourceOptions(options, id), false);
    }

    private static FooArgs makeArgs(@Nullable FooArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FooArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Foo get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Foo(name, id, options);
    }
}
