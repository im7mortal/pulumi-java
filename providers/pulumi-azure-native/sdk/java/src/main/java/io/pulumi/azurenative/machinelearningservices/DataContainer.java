// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.DataContainerArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.DataContainerResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Azure Resource Manager resource envelope.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:DataContainer datacontainer123 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg123/providers/Microsoft.MachineLearningServices/workspaces/workspace123/data/datacontainer123 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:DataContainer")
public class DataContainer extends io.pulumi.resources.CustomResource {
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
     * Additional attributes of the entity.
     * 
     */
    @OutputExport(name="properties", type=DataContainerResponse.class, parameters={})
    private Output<DataContainerResponse> properties;

    /**
     * @return Additional attributes of the entity.
     * 
     */
    public Output<DataContainerResponse> getProperties() {
        return this.properties;
    }
    /**
     * System data associated with resource provider
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System data associated with resource provider
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
        public void apply(DataContainerArgs.Builder a);
    }
    private static io.pulumi.azurenative.machinelearningservices.DataContainerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.machinelearningservices.DataContainerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataContainer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataContainer(String name) {
        this(name, DataContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataContainer(String name, DataContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataContainer(String name, DataContainerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:DataContainer", name, args == null ? DataContainerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataContainer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:DataContainer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210301preview:DataContainer").build())
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
    public static DataContainer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataContainer(name, id, options);
    }
}
