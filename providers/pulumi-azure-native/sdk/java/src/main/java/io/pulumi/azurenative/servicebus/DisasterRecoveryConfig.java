// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.DisasterRecoveryConfigArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in List or Get Alias(Disaster Recovery configuration) operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:DisasterRecoveryConfig sdk-Namespace-8860 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ardsouzatestRG/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-8860/disasterRecoveryConfig/sdk-Namespace-8860 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:DisasterRecoveryConfig")
public class DisasterRecoveryConfig extends io.pulumi.resources.CustomResource {
    /**
     * Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    @OutputExport(name="alternateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alternateName;

    /**
     * @return Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    public Output</* @Nullable */ String> getAlternateName() {
        return this.alternateName;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    @OutputExport(name="partnerNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerNamespace;

    /**
     * @return ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    public Output</* @Nullable */ String> getPartnerNamespace() {
        return this.partnerNamespace;
    }
    /**
     * Number of entities pending to be replicated.
     * 
     */
    @OutputExport(name="pendingReplicationOperationsCount", type=Double.class, parameters={})
    private Output<Double> pendingReplicationOperationsCount;

    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    public Output<Double> getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    public Output<String> getRole() {
        return this.role;
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
        public void apply(DisasterRecoveryConfigArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicebus.DisasterRecoveryConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicebus.DisasterRecoveryConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DisasterRecoveryConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DisasterRecoveryConfig(String name) {
        this(name, DisasterRecoveryConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DisasterRecoveryConfig(String name, DisasterRecoveryConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DisasterRecoveryConfig(String name, DisasterRecoveryConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:DisasterRecoveryConfig", name, args == null ? DisasterRecoveryConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DisasterRecoveryConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:DisasterRecoveryConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicebus/v20170401:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20180101preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210101preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210601preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20211101:DisasterRecoveryConfig").build())
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
    public static DisasterRecoveryConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DisasterRecoveryConfig(name, id, options);
    }
}
