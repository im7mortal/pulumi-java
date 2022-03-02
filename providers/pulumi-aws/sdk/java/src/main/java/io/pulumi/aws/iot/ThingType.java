// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iot.ThingTypeArgs;
import io.pulumi.aws.iot.inputs.ThingTypeState;
import io.pulumi.aws.iot.outputs.ThingTypeProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS IoT Thing Type.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IOT Thing Types can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iot/thingType:ThingType example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/thingType:ThingType")
public class ThingType extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the created AWS IoT Thing Type.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the created AWS IoT Thing Type.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    @OutputExport(name="deprecated", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deprecated;

    /**
     * @return Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeprecated() {
        return this.deprecated;
    }
    /**
     * The name of the thing type.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the thing type.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * , Configuration block that can contain the following properties of the thing type:
     * 
     */
    @OutputExport(name="properties", type=ThingTypeProperties.class, parameters={})
    private Output</* @Nullable */ ThingTypeProperties> properties;

    /**
     * @return , Configuration block that can contain the following properties of the thing type:
     * 
     */
    public Output</* @Nullable */ ThingTypeProperties> getProperties() {
        return this.properties;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ThingTypeArgs.Builder a);
    }
    private static io.pulumi.aws.iot.ThingTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iot.ThingTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ThingType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ThingType(String name) {
        this(name, ThingTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ThingType(String name, @Nullable ThingTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ThingType(String name, @Nullable ThingTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingType:ThingType", name, args == null ? ThingTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ThingType(String name, Input<String> id, @Nullable ThingTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingType:ThingType", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ThingType get(String name, Input<String> id, @Nullable ThingTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ThingType(name, id, state, options);
    }
}
