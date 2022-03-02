// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountBatchConfigurationArgs;
import io.pulumi.azurenative.logic.outputs.BatchConfigurationPropertiesResponse;
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
 * The batch configuration resource definition.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountBatchConfiguration testBatchConfiguration /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/batchConfigurations/testBatchConfiguration 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountBatchConfiguration")
public class IntegrationAccountBatchConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The batch configuration properties.
     * 
     */
    @OutputExport(name="properties", type=BatchConfigurationPropertiesResponse.class, parameters={})
    private Output<BatchConfigurationPropertiesResponse> properties;

    /**
     * @return The batch configuration properties.
     * 
     */
    public Output<BatchConfigurationPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationAccountBatchConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.IntegrationAccountBatchConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.IntegrationAccountBatchConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationAccountBatchConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountBatchConfiguration(String name) {
        this(name, IntegrationAccountBatchConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountBatchConfiguration(String name, IntegrationAccountBatchConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountBatchConfiguration(String name, IntegrationAccountBatchConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountBatchConfiguration", name, args == null ? IntegrationAccountBatchConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationAccountBatchConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountBatchConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20160601:IntegrationAccountBatchConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20180701preview:IntegrationAccountBatchConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationAccountBatchConfiguration").build())
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
    public static IntegrationAccountBatchConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountBatchConfiguration(name, id, options);
    }
}
