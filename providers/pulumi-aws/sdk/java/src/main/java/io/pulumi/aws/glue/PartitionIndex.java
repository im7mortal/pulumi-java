// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.PartitionIndexArgs;
import io.pulumi.aws.glue.inputs.PartitionIndexState;
import io.pulumi.aws.glue.outputs.PartitionIndexPartitionIndex;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Partition Indexes can be imported with their catalog ID (usually AWS account ID), database name, table name, and index name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/partitionIndex:PartitionIndex example 123456789012:MyDatabase:MyTable:index-name
 * ```
 * 
 */
@ResourceType(type="aws:glue/partitionIndex:PartitionIndex")
public class PartitionIndex extends io.pulumi.resources.CustomResource {
    /**
     * The catalog ID where the table resides.
     * 
     */
    @OutputExport(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return The catalog ID where the table resides.
     * 
     */
    public Output<String> getCatalogId() {
        return this.catalogId;
    }
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    @OutputExport(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    public Output<String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Configuration block for a partition index. See `partition_index` below.
     * 
     */
    @OutputExport(name="partitionIndex", type=PartitionIndexPartitionIndex.class, parameters={})
    private Output<PartitionIndexPartitionIndex> partitionIndex;

    /**
     * @return Configuration block for a partition index. See `partition_index` below.
     * 
     */
    public Output<PartitionIndexPartitionIndex> getPartitionIndex() {
        return this.partitionIndex;
    }
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    public Output<String> getTableName() {
        return this.tableName;
    }

    public interface BuilderApplicator {
        public void apply(PartitionIndexArgs.Builder a);
    }
    private static io.pulumi.aws.glue.PartitionIndexArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.PartitionIndexArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PartitionIndex(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartitionIndex(String name) {
        this(name, PartitionIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartitionIndex(String name, PartitionIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartitionIndex(String name, PartitionIndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/partitionIndex:PartitionIndex", name, args == null ? PartitionIndexArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PartitionIndex(String name, Input<String> id, @Nullable PartitionIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/partitionIndex:PartitionIndex", name, state, makeResourceOptions(options, id));
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
    public static PartitionIndex get(String name, Input<String> id, @Nullable PartitionIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PartitionIndex(name, id, state, options);
    }
}
