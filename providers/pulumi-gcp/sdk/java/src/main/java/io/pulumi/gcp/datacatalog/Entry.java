// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.EntryArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryState;
import io.pulumi.gcp.datacatalog.outputs.EntryBigqueryDateShardedSpec;
import io.pulumi.gcp.datacatalog.outputs.EntryBigqueryTableSpec;
import io.pulumi.gcp.datacatalog.outputs.EntryGcsFilesetSpec;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Entry Metadata. A Data Catalog Entry resource represents another resource in Google Cloud Platform
 * (such as a BigQuery dataset or a Pub/Sub topic) or outside of Google Cloud Platform. Clients can use
 * the linkedResource field in the Entry resource to refer to the original resource ID of the source system.
 * 
 * An Entry resource contains resource details, such as its schema. An Entry can also be used to attach
 * flexible metadata, such as a Tag.
 * 
 * To get more information about Entry, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Entry can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/entry:Entry default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/entry:Entry")
public class Entry extends io.pulumi.resources.CustomResource {
    /**
     * Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
     * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    @OutputExport(name="bigqueryDateShardedSpecs", type=List.class, parameters={EntryBigqueryDateShardedSpec.class})
    private Output<List<EntryBigqueryDateShardedSpec>> bigqueryDateShardedSpecs;

    /**
     * @return Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
     * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    public Output<List<EntryBigqueryDateShardedSpec>> getBigqueryDateShardedSpecs() {
        return this.bigqueryDateShardedSpecs;
    }
    /**
     * Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * 
     */
    @OutputExport(name="bigqueryTableSpecs", type=List.class, parameters={EntryBigqueryTableSpec.class})
    private Output<List<EntryBigqueryTableSpec>> bigqueryTableSpecs;

    /**
     * @return Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * 
     */
    public Output<List<EntryBigqueryTableSpec>> getBigqueryTableSpecs() {
        return this.bigqueryTableSpecs;
    }
    /**
     * Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Display information such as title and description. A short name to identify the entry,
     * for example, "Analytics Data - Jan 2011".
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display information such as title and description. A short name to identify the entry,
     * for example, "Analytics Data - Jan 2011".
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the entry group this entry is in.
     * 
     */
    @OutputExport(name="entryGroup", type=String.class, parameters={})
    private Output<String> entryGroup;

    /**
     * @return The name of the entry group this entry is in.
     * 
     */
    public Output<String> getEntryGroup() {
        return this.entryGroup;
    }
    /**
     * The id of the entry to create.
     * 
     */
    @OutputExport(name="entryId", type=String.class, parameters={})
    private Output<String> entryId;

    /**
     * @return The id of the entry to create.
     * 
     */
    public Output<String> getEntryId() {
        return this.entryId;
    }
    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="gcsFilesetSpec", type=EntryGcsFilesetSpec.class, parameters={})
    private Output</* @Nullable */ EntryGcsFilesetSpec> gcsFilesetSpec;

    /**
     * @return Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ EntryGcsFilesetSpec> getGcsFilesetSpec() {
        return this.gcsFilesetSpec;
    }
    /**
     * This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    @OutputExport(name="integratedSystem", type=String.class, parameters={})
    private Output<String> integratedSystem;

    /**
     * @return This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    public Output<String> getIntegratedSystem() {
        return this.integratedSystem;
    }
    /**
     * The resource this metadata entry refers to.
     * For Google Cloud Platform resources, linkedResource is the full name of the resource.
     * For example, the linkedResource for a table resource from BigQuery is:
     * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
     * this field is optional and defaults to an empty string.
     * 
     */
    @OutputExport(name="linkedResource", type=String.class, parameters={})
    private Output<String> linkedResource;

    /**
     * @return The resource this metadata entry refers to.
     * For Google Cloud Platform resources, linkedResource is the full name of the resource.
     * For example, the linkedResource for a table resource from BigQuery is:
     * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
     * this field is optional and defaults to an empty string.
     * 
     */
    public Output<String> getLinkedResource() {
        return this.linkedResource;
    }
    /**
     * The Data Catalog resource name of the entry in URL format. Example:
     * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
     * child resources may not actually be stored in the location in this name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Data Catalog resource name of the entry in URL format. Example:
     * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
     * child resources may not actually be stored in the location in this name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    @OutputExport(name="schema", type=String.class, parameters={})
    private Output</* @Nullable */ String> schema;

    /**
     * @return Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    public Output</* @Nullable */ String> getSchema() {
        return this.schema;
    }
    /**
     * The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * This field indicates the entry's source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @OutputExport(name="userSpecifiedSystem", type=String.class, parameters={})
    private Output</* @Nullable */ String> userSpecifiedSystem;

    /**
     * @return This field indicates the entry's source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    public Output</* @Nullable */ String> getUserSpecifiedSystem() {
        return this.userSpecifiedSystem;
    }
    /**
     * Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example "my_special_type".
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @OutputExport(name="userSpecifiedType", type=String.class, parameters={})
    private Output</* @Nullable */ String> userSpecifiedType;

    /**
     * @return Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example "my_special_type".
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    public Output</* @Nullable */ String> getUserSpecifiedType() {
        return this.userSpecifiedType;
    }

    public interface BuilderApplicator {
        public void apply(EntryArgs.Builder a);
    }
    private static io.pulumi.gcp.datacatalog.EntryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.datacatalog.EntryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Entry(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entry(String name) {
        this(name, EntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entry(String name, EntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entry(String name, EntryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/entry:Entry", name, args == null ? EntryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Entry(String name, Input<String> id, @Nullable EntryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/entry:Entry", name, state, makeResourceOptions(options, id));
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
    public static Entry get(String name, Input<String> id, @Nullable EntryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Entry(name, id, state, options);
    }
}
