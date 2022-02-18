// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.SchemaVersionMetadataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource adds Key-Value metadata to a Schema version of Glue Schema Registry.
 * 
 */
@ResourceType(type="aws-native:glue:SchemaVersionMetadata")
public class SchemaVersionMetadata extends io.pulumi.resources.CustomResource {
    /**
     * Metadata key
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Metadata key
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    @OutputExport(name="schemaVersionId", type=String.class, parameters={})
    private Output<String> schemaVersionId;

    /**
     * @return Represents the version ID associated with the schema version.
     * 
     */
    public Output<String> getSchemaVersionId() {
        return this.schemaVersionId;
    }
    /**
     * Metadata value
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Metadata value
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaVersionMetadata(String name, SchemaVersionMetadataArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:SchemaVersionMetadata", name, args == null ? SchemaVersionMetadataArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SchemaVersionMetadata(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:SchemaVersionMetadata", name, null, makeResourceOptions(options, id));
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
    public static SchemaVersionMetadata get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SchemaVersionMetadata(name, id, options);
    }
}
