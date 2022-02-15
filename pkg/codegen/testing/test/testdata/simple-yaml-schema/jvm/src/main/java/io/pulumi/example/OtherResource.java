// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.example.OtherResourceArgs;
import io.pulumi.example.Resource;
import io.pulumi.example.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="example::OtherResource")
public class OtherResource extends io.pulumi.resources.ComponentResource {
    @OutputExport(name="foo", type=Resource.class, parameters={})
    private Output</* @Nullable */ Resource> foo;

    public Output</* @Nullable */ Resource> getFoo() {
        return this.foo;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OtherResource(String name, @Nullable OtherResourceArgs args, @Nullable io.pulumi.resources.ComponentResourceOptions options) {
        super("example::OtherResource", name, args == null ? OtherResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()), true);
    }

    private static io.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.ComponentResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.ComponentResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
