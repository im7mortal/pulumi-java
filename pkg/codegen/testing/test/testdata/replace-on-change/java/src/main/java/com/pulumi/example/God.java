// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.Dog;
import com.pulumi.example.GodArgs;
import com.pulumi.example.Utilities;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="example::God")
public class God extends com.pulumi.resources.CustomResource {
    @Export(name="backwards", refs={Dog.class}, tree="[0]")
    private Output</* @Nullable */ Dog> backwards;

    public Output<Optional<Dog>> backwards() {
        return Codegen.optional(this.backwards);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public God(java.lang.String name) {
        this(name, GodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public God(java.lang.String name, @Nullable GodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public God(java.lang.String name, @Nullable GodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example::God", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private God(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example::God", name, null, makeResourceOptions(options, id), false);
    }

    private static GodArgs makeArgs(@Nullable GodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GodArgs.Empty : args;
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
    public static God get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new God(name, id, options);
    }
}
