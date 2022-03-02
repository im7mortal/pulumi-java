// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.DatabaseArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a Kusto database.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:Database KustoClusterRPTest4/KustoDatabase8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8 
 * ```
 * 
 * @Deprecated
 * Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase.
 * 
 */
@Deprecated /* Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase. */
@ResourceType(type="azure-native:kusto:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * Kind of the database
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the database
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.kusto.DatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.kusto.DatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Database(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20170907privatepreview:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20180907preview:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:Database").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:Database").build())
            ))
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
    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
