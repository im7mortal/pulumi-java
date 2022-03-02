// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerbidedicated.CapacityDetailsArgs;
import io.pulumi.azurenative.powerbidedicated.outputs.CapacitySkuResponse;
import io.pulumi.azurenative.powerbidedicated.outputs.DedicatedCapacityAdministratorsResponse;
import io.pulumi.azurenative.powerbidedicated.outputs.SystemDataResponse;
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
 * Represents an instance of a Dedicated Capacity resource.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:powerbidedicated:CapacityDetails azsdktest /subscriptions/613192d7-503f-477a-9cfe-4efc3ee2bd60/resourceGroups/TestRG/providers/Microsoft.PowerBIDedicated/servers/azsdktest 
 * ```
 * 
 */
@ResourceType(type="azure-native:powerbidedicated:CapacityDetails")
public class CapacityDetails extends io.pulumi.resources.CustomResource {
    /**
     * A collection of Dedicated capacity administrators
     * 
     */
    @OutputExport(name="administration", type=DedicatedCapacityAdministratorsResponse.class, parameters={})
    private Output</* @Nullable */ DedicatedCapacityAdministratorsResponse> administration;

    /**
     * @return A collection of Dedicated capacity administrators
     * 
     */
    public Output</* @Nullable */ DedicatedCapacityAdministratorsResponse> getAdministration() {
        return this.administration;
    }
    /**
     * Capacity name
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return Capacity name
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Location of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value 'Gen2' is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value 'Gen2' is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
     */
    public Output</* @Nullable */ String> getMode() {
        return this.mode;
    }
    /**
     * The name of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current deployment state of PowerBI Dedicated resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment state of PowerBI Dedicated resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the PowerBI Dedicated capacity resource.
     * 
     */
    @OutputExport(name="sku", type=CapacitySkuResponse.class, parameters={})
    private Output<CapacitySkuResponse> sku;

    /**
     * @return The SKU of the PowerBI Dedicated capacity resource.
     * 
     */
    public Output<CapacitySkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The current state of PowerBI Dedicated resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of PowerBI Dedicated resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output</* @Nullable */ SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Tenant ID for the capacity. Used for creating Pro Plus capacity.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return Tenant ID for the capacity. Used for creating Pro Plus capacity.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CapacityDetailsArgs.Builder a);
    }
    private static io.pulumi.azurenative.powerbidedicated.CapacityDetailsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.powerbidedicated.CapacityDetailsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CapacityDetails(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityDetails(String name) {
        this(name, CapacityDetailsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityDetails(String name, CapacityDetailsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityDetails(String name, CapacityDetailsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerbidedicated:CapacityDetails", name, args == null ? CapacityDetailsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CapacityDetails(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerbidedicated:CapacityDetails", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:powerbidedicated/v20171001:CapacityDetails").build()),
                Input.of(Alias.builder().setType("azure-native:powerbidedicated/v20210101:CapacityDetails").build())
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
    public static CapacityDetails get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityDetails(name, id, options);
    }
}
