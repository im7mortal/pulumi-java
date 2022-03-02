// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.SchemaArgs;
import io.pulumi.gcp.pubsub.inputs.SchemaState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A schema is a format that messages must follow,
 * creating a contract between publisher and subscriber that Pub/Sub will enforce.
 * 
 * To get more information about Schema, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas)
 * * How-to Guides
 *     * [Creating and managing schemas](https://cloud.google.com/pubsub/docs/schemas)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Schema can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/schema:Schema default projects/{{project}}/schemas/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/schema:Schema default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/schema:Schema default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/schema:Schema")
public class Schema extends io.pulumi.resources.CustomResource {
    /**
     * The definition of the schema.
     * This should contain a string representing the full definition of the schema
     * that is a valid schema definition of the type specified in type.
     * 
     */
    @OutputExport(name="definition", type=String.class, parameters={})
    private Output</* @Nullable */ String> definition;

    /**
     * @return The definition of the schema.
     * This should contain a string representing the full definition of the schema
     * that is a valid schema definition of the type specified in type.
     * 
     */
    public Output</* @Nullable */ String> getDefinition() {
        return this.definition;
    }
    /**
     * The ID to use for the schema, which will become the final component of the schema's resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The ID to use for the schema, which will become the final component of the schema's resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The type of the schema definition
     * Default value is `TYPE_UNSPECIFIED`.
     * Possible values are `TYPE_UNSPECIFIED`, `PROTOCOL_BUFFER`, and `AVRO`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the schema definition
     * Default value is `TYPE_UNSPECIFIED`.
     * Possible values are `TYPE_UNSPECIFIED`, `PROTOCOL_BUFFER`, and `AVRO`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SchemaArgs.Builder a);
    }
    private static io.pulumi.gcp.pubsub.SchemaArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.pubsub.SchemaArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Schema(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, @Nullable SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, @Nullable SchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/schema:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schema(String name, Input<String> id, @Nullable SchemaState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/schema:Schema", name, state, makeResourceOptions(options, id));
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
    public static Schema get(String name, Input<String> id, @Nullable SchemaState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
