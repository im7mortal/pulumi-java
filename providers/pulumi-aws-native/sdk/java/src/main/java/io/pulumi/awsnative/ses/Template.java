// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ses.TemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SES::Template
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ses:Template")
public class Template extends io.pulumi.resources.CustomResource {
    @OutputExport(name="template", type=io.pulumi.awsnative.ses.outputs.Template.class, parameters={})
    private Output</* @Nullable */ io.pulumi.awsnative.ses.outputs.Template> template;

    public Output</* @Nullable */ io.pulumi.awsnative.ses.outputs.Template> getTemplate() {
        return this.template;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, @Nullable TemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Template(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:Template", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Template get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, options);
    }
}