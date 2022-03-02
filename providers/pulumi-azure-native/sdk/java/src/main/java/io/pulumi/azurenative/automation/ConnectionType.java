// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.ConnectionTypeArgs;
import io.pulumi.azurenative.automation.outputs.FieldDefinitionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the connection type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:ConnectionType myCT /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount22/connectionTypes/myCT 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:ConnectionType")
public class ConnectionType extends io.pulumi.resources.CustomResource {
    /**
     * Gets the creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation time.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets the field definitions of the connection type.
     * 
     */
    @OutputExport(name="fieldDefinitions", type=Map.class, parameters={String.class, FieldDefinitionResponse.class})
    private Output<Map<String,FieldDefinitionResponse>> fieldDefinitions;

    /**
     * @return Gets the field definitions of the connection type.
     * 
     */
    public Output<Map<String,FieldDefinitionResponse>> getFieldDefinitions() {
        return this.fieldDefinitions;
    }
    /**
     * Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    @OutputExport(name="isGlobal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGlobal;

    /**
     * @return Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsGlobal() {
        return this.isGlobal;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Gets the name of the connection type.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the name of the connection type.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ConnectionTypeArgs.Builder a);
    }
    private static io.pulumi.azurenative.automation.ConnectionTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.automation.ConnectionTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConnectionType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionType(String name) {
        this(name, ConnectionTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionType(String name, ConnectionTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionType(String name, ConnectionTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:ConnectionType", name, args == null ? ConnectionTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectionType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:ConnectionType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:ConnectionType").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:ConnectionType").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:ConnectionType").build())
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
    public static ConnectionType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionType(name, id, options);
    }
}
