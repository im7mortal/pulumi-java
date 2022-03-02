// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.SqlResourceSqlUserDefinedFunctionArgs;
import io.pulumi.azurenative.documentdb.outputs.SqlUserDefinedFunctionGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB userDefinedFunction.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:SqlResourceSqlUserDefinedFunction userDefinedFunctionName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/sqlDatabases/databaseName/sqlContainers/containerName/sqlUserDefinedFunctions/userDefinedFunctionName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:SqlResourceSqlUserDefinedFunction")
public class SqlResourceSqlUserDefinedFunction extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resource", type=SqlUserDefinedFunctionGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ SqlUserDefinedFunctionGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ SqlUserDefinedFunctionGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SqlResourceSqlUserDefinedFunctionArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.SqlResourceSqlUserDefinedFunctionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.SqlResourceSqlUserDefinedFunctionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlResourceSqlUserDefinedFunction(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlResourceSqlUserDefinedFunction(String name) {
        this(name, SqlResourceSqlUserDefinedFunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlResourceSqlUserDefinedFunction(String name, SqlResourceSqlUserDefinedFunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlResourceSqlUserDefinedFunction(String name, SqlResourceSqlUserDefinedFunctionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlUserDefinedFunction", name, args == null ? SqlResourceSqlUserDefinedFunctionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlResourceSqlUserDefinedFunction(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlUserDefinedFunction", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:SqlResourceSqlUserDefinedFunction").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:SqlResourceSqlUserDefinedFunction").build())
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
    public static SqlResourceSqlUserDefinedFunction get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlResourceSqlUserDefinedFunction(name, id, options);
    }
}
