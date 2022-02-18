// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ses.ConfigurationSetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::SES::ConfigurationSet.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ses:ConfigurationSet")
public class ConfigurationSet extends io.pulumi.resources.CustomResource {
    /**
     * The name of the configuration set.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the configuration set.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:ConfigurationSet", name, args == null ? ConfigurationSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConfigurationSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:ConfigurationSet", name, null, makeResourceOptions(options, id));
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
    public static ConfigurationSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationSet(name, id, options);
    }
}
