// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.amplifyuibuilder.ThemeArgs;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ThemeTags;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ThemeValues;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::AmplifyUIBuilder::Theme Resource Type
 * 
 */
@ResourceType(type="aws-native:amplifyuibuilder:Theme")
public class Theme extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="environmentName", type=String.class, parameters={})
    private Output<String> environmentName;

    public Output<String> getEnvironmentName() {
        return this.environmentName;
    }
    @OutputExport(name="modifiedAt", type=String.class, parameters={})
    private Output<String> modifiedAt;

    public Output<String> getModifiedAt() {
        return this.modifiedAt;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="overrides", type=List.class, parameters={ThemeValues.class})
    private Output</* @Nullable */ List<ThemeValues>> overrides;

    public Output</* @Nullable */ List<ThemeValues>> getOverrides() {
        return this.overrides;
    }
    @OutputExport(name="tags", type=ThemeTags.class, parameters={})
    private Output</* @Nullable */ ThemeTags> tags;

    public Output</* @Nullable */ ThemeTags> getTags() {
        return this.tags;
    }
    @OutputExport(name="values", type=List.class, parameters={ThemeValues.class})
    private Output<List<ThemeValues>> values;

    public Output<List<ThemeValues>> getValues() {
        return this.values;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Theme(String name, ThemeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Theme", name, args == null ? ThemeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Theme(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Theme", name, null, makeResourceOptions(options, id));
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
    public static Theme get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Theme(name, id, options);
    }
}
