// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datastore.DataStoreIndexArgs;
import io.pulumi.gcp.datastore.inputs.DataStoreIndexState;
import io.pulumi.gcp.datastore.outputs.DataStoreIndexProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a composite index for Cloud Datastore.
 * 
 * To get more information about Index, see:
 * 
 * * [API documentation](https://cloud.google.com/datastore/docs/reference/admin/rest/v1/projects.indexes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/datastore/docs/concepts/indexes)
 * 
 * > **Warning:** This resource creates a Datastore Index on a project that has already
 * enabled a Datastore-compatible database. If you haven't already enabled
 * one, you can create a `gcp.appengine.Application` resource with
 * `database_type` set to `"CLOUD_DATASTORE_COMPATIBILITY"` to do so. Your
 * Datastore location will be the same as the App Engine location specified.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Index can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datastore/dataStoreIndex:DataStoreIndex default projects/{{project}}/indexes/{{index_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datastore/dataStoreIndex:DataStoreIndex default {{project}}/{{index_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datastore/dataStoreIndex:DataStoreIndex default {{index_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:datastore/dataStoreIndex:DataStoreIndex")
public class DataStoreIndex extends io.pulumi.resources.CustomResource {
    /**
     * Policy for including ancestors in the index.
     * Default value is `NONE`.
     * Possible values are `NONE` and `ALL_ANCESTORS`.
     * 
     */
    @OutputExport(name="ancestor", type=String.class, parameters={})
    private Output</* @Nullable */ String> ancestor;

    /**
     * @return Policy for including ancestors in the index.
     * Default value is `NONE`.
     * Possible values are `NONE` and `ALL_ANCESTORS`.
     * 
     */
    public Output</* @Nullable */ String> getAncestor() {
        return this.ancestor;
    }
    /**
     * The index id.
     * 
     */
    @OutputExport(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    /**
     * @return The index id.
     * 
     */
    public Output<String> getIndexId() {
        return this.indexId;
    }
    /**
     * The entity kind which the index applies to.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The entity kind which the index applies to.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
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
     * An ordered list of properties to index on.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="properties", type=List.class, parameters={DataStoreIndexProperty.class})
    private Output</* @Nullable */ List<DataStoreIndexProperty>> properties;

    /**
     * @return An ordered list of properties to index on.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<DataStoreIndexProperty>> getProperties() {
        return this.properties;
    }

    public interface BuilderApplicator {
        public void apply(DataStoreIndexArgs.Builder a);
    }
    private static io.pulumi.gcp.datastore.DataStoreIndexArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.datastore.DataStoreIndexArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataStoreIndex(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataStoreIndex(String name) {
        this(name, DataStoreIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataStoreIndex(String name, DataStoreIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataStoreIndex(String name, DataStoreIndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastore/dataStoreIndex:DataStoreIndex", name, args == null ? DataStoreIndexArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataStoreIndex(String name, Input<String> id, @Nullable DataStoreIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastore/dataStoreIndex:DataStoreIndex", name, state, makeResourceOptions(options, id));
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
    public static DataStoreIndex get(String name, Input<String> id, @Nullable DataStoreIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataStoreIndex(name, id, state, options);
    }
}
