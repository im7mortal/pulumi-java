// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.DefaultAdminRuleArgs;
import io.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Network default admin rule.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:DefaultAdminRule SampleAdminRule /subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager/securityAdminConfigurations/myTestSecurityConfig/ruleCollections/rules/SampleAdminRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DefaultAdminRule")
public class DefaultAdminRule extends io.pulumi.resources.CustomResource {
    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    @OutputExport(name="access", type=String.class, parameters={})
    private Output<String> access;

    /**
     * @return Indicates the access allowed for this particular rule
     * 
     */
    public Output<String> getAccess() {
        return this.access;
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The destination port ranges.
     * 
     */
    @OutputExport(name="destinationPortRanges", type=List.class, parameters={String.class})
    private Output<List<String>> destinationPortRanges;

    /**
     * @return The destination port ranges.
     * 
     */
    public Output<List<String>> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @OutputExport(name="destinations", type=List.class, parameters={AddressPrefixItemResponse.class})
    private Output<List<AddressPrefixItemResponse>> destinations;

    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public Output<List<AddressPrefixItemResponse>> getDestinations() {
        return this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    @OutputExport(name="direction", type=String.class, parameters={})
    private Output<String> direction;

    /**
     * @return Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    public Output<String> getDirection() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A friendly name for the rule.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Default rule flag.
     * 
     */
    @OutputExport(name="flag", type=String.class, parameters={})
    private Output</* @Nullable */ String> flag;

    /**
     * @return Default rule flag.
     * 
     */
    public Output</* @Nullable */ String> getFlag() {
        return this.flag;
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * Network protocol this rule applies to.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Network protocol this rule applies to.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The source port ranges.
     * 
     */
    @OutputExport(name="sourcePortRanges", type=List.class, parameters={String.class})
    private Output<List<String>> sourcePortRanges;

    /**
     * @return The source port ranges.
     * 
     */
    public Output<List<String>> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
     */
    @OutputExport(name="sources", type=List.class, parameters={AddressPrefixItemResponse.class})
    private Output<List<AddressPrefixItemResponse>> sources;

    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    public Output<List<AddressPrefixItemResponse>> getSources() {
        return this.sources;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DefaultAdminRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.DefaultAdminRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.DefaultAdminRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DefaultAdminRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultAdminRule(String name) {
        this(name, DefaultAdminRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultAdminRule(String name, DefaultAdminRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultAdminRule(String name, DefaultAdminRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DefaultAdminRule", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private DefaultAdminRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DefaultAdminRule", name, null, makeResourceOptions(options, id));
    }

    private static DefaultAdminRuleArgs makeArgs(DefaultAdminRuleArgs args) {
        var builder = args == null ? DefaultAdminRuleArgs.builder() : DefaultAdminRuleArgs.builder(args);
        return builder
            .setKind("Default")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20210201preview:DefaultAdminRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501preview:DefaultAdminRule").build())
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
    public static DefaultAdminRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultAdminRule(name, id, options);
    }
}
