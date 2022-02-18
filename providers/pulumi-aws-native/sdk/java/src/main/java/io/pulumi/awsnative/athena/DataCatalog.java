// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.DataCatalogArgs;
import io.pulumi.awsnative.athena.enums.DataCatalogType;
import io.pulumi.awsnative.athena.outputs.DataCatalogTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Athena::DataCatalog
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:athena:DataCatalog")
public class DataCatalog extends io.pulumi.resources.CustomResource {
    /**
     * A description of the data catalog to be created.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the data catalog to be created.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    @OutputExport(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    public Output</* @Nullable */ Object> getParameters() {
        return this.parameters;
    }
    /**
     * A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DataCatalogTag.class})
    private Output</* @Nullable */ List<DataCatalogTag>> tags;

    /**
     * @return A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    public Output</* @Nullable */ List<DataCatalogTag>> getTags() {
        return this.tags;
    }
    /**
     * The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    @OutputExport(name="type", type=DataCatalogType.class, parameters={})
    private Output<DataCatalogType> type;

    /**
     * @return The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    public Output<DataCatalogType> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCatalog(String name, DataCatalogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:DataCatalog", name, args == null ? DataCatalogArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataCatalog(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:DataCatalog", name, null, makeResourceOptions(options, id));
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
    public static DataCatalog get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataCatalog(name, id, options);
    }
}