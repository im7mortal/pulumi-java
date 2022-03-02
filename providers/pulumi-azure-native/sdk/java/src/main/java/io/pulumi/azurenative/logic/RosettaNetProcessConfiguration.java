// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.RosettaNetProcessConfigurationArgs;
import io.pulumi.azurenative.logic.outputs.RosettaNetPipActivitySettingsResponse;
import io.pulumi.azurenative.logic.outputs.RosettaNetPipRoleSettingsResponse;
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
 * The integration account RosettaNet process configuration.
 * API Version: 2016-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:RosettaNetProcessConfiguration 3A4 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Logic/integrationAccounts/testia123/rosettaNetProcessConfigurations/3A4 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:RosettaNetProcessConfiguration")
public class RosettaNetProcessConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The RosettaNet process configuration activity settings.
     * 
     */
    @OutputExport(name="activitySettings", type=RosettaNetPipActivitySettingsResponse.class, parameters={})
    private Output<RosettaNetPipActivitySettingsResponse> activitySettings;

    /**
     * @return The RosettaNet process configuration activity settings.
     * 
     */
    public Output<RosettaNetPipActivitySettingsResponse> getActivitySettings() {
        return this.activitySettings;
    }
    /**
     * The changed time.
     * 
     */
    @OutputExport(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> getChangedTime() {
        return this.changedTime;
    }
    /**
     * The created time.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The integration account RosettaNet ProcessConfiguration properties.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The integration account RosettaNet ProcessConfiguration properties.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The RosettaNet initiator role settings.
     * 
     */
    @OutputExport(name="initiatorRoleSettings", type=RosettaNetPipRoleSettingsResponse.class, parameters={})
    private Output<RosettaNetPipRoleSettingsResponse> initiatorRoleSettings;

    /**
     * @return The RosettaNet initiator role settings.
     * 
     */
    public Output<RosettaNetPipRoleSettingsResponse> getInitiatorRoleSettings() {
        return this.initiatorRoleSettings;
    }
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
     * The metadata.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
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
     * The integration account RosettaNet process code.
     * 
     */
    @OutputExport(name="processCode", type=String.class, parameters={})
    private Output<String> processCode;

    /**
     * @return The integration account RosettaNet process code.
     * 
     */
    public Output<String> getProcessCode() {
        return this.processCode;
    }
    /**
     * The integration account RosettaNet process name.
     * 
     */
    @OutputExport(name="processName", type=String.class, parameters={})
    private Output<String> processName;

    /**
     * @return The integration account RosettaNet process name.
     * 
     */
    public Output<String> getProcessName() {
        return this.processName;
    }
    /**
     * The integration account RosettaNet process version.
     * 
     */
    @OutputExport(name="processVersion", type=String.class, parameters={})
    private Output<String> processVersion;

    /**
     * @return The integration account RosettaNet process version.
     * 
     */
    public Output<String> getProcessVersion() {
        return this.processVersion;
    }
    /**
     * The RosettaNet responder role settings.
     * 
     */
    @OutputExport(name="responderRoleSettings", type=RosettaNetPipRoleSettingsResponse.class, parameters={})
    private Output<RosettaNetPipRoleSettingsResponse> responderRoleSettings;

    /**
     * @return The RosettaNet responder role settings.
     * 
     */
    public Output<RosettaNetPipRoleSettingsResponse> getResponderRoleSettings() {
        return this.responderRoleSettings;
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
        public void apply(RosettaNetProcessConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.RosettaNetProcessConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.RosettaNetProcessConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RosettaNetProcessConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RosettaNetProcessConfiguration(String name) {
        this(name, RosettaNetProcessConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RosettaNetProcessConfiguration(String name, RosettaNetProcessConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RosettaNetProcessConfiguration(String name, RosettaNetProcessConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:RosettaNetProcessConfiguration", name, args == null ? RosettaNetProcessConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RosettaNetProcessConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:RosettaNetProcessConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20160601:RosettaNetProcessConfiguration").build())
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
    public static RosettaNetProcessConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RosettaNetProcessConfiguration(name, id, options);
    }
}
