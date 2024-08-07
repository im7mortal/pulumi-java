// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foo.nested_module;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.foo.Utilities;
import com.pulumi.foo.nested_module.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="foo:nested/module:Resource")
public class Resource extends com.pulumi.resources.CustomResource {
    @Export(name="bar", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bar;

    public Output<Optional<String>> bar() {
        return Codegen.optional(this.bar);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(java.lang.String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(java.lang.String name, @Nullable ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(java.lang.String name, @Nullable ResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foo:nested/module:Resource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Resource(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foo:nested/module:Resource", name, null, makeResourceOptions(options, id), false);
    }

    private static ResourceArgs makeArgs(@Nullable ResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResourceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "bar"
            ))
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
    public static Resource get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}
