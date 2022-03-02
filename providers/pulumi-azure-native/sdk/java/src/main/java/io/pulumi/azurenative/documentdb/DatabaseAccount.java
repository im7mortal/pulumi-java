// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.DatabaseAccountArgs;
import io.pulumi.azurenative.documentdb.outputs.ApiPropertiesResponse;
import io.pulumi.azurenative.documentdb.outputs.CapabilityResponse;
import io.pulumi.azurenative.documentdb.outputs.ConsistencyPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.ContinuousModeBackupPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.CorsPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.FailoverPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.IpAddressOrRangeResponse;
import io.pulumi.azurenative.documentdb.outputs.LocationResponse;
import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.documentdb.outputs.PeriodicModeBackupPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.documentdb.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
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
 * An Azure Cosmos DB database account.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:DatabaseAccount ddb1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:DatabaseAccount")
public class DatabaseAccount extends io.pulumi.resources.CustomResource {
    /**
     * API specific properties.
     * 
     */
    @OutputExport(name="apiProperties", type=ApiPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ApiPropertiesResponse> apiProperties;

    /**
     * @return API specific properties.
     * 
     */
    public Output</* @Nullable */ ApiPropertiesResponse> getApiProperties() {
        return this.apiProperties;
    }
    /**
     * The object representing the policy for taking backups on an account.
     * 
     */
    @OutputExport(name="backupPolicy", type=Either.class, parameters={ContinuousModeBackupPolicyResponse.class, PeriodicModeBackupPolicyResponse.class})
    private Output</* @Nullable */ Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse>> backupPolicy;

    /**
     * @return The object representing the policy for taking backups on an account.
     * 
     */
    public Output</* @Nullable */ Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse>> getBackupPolicy() {
        return this.backupPolicy;
    }
    /**
     * List of Cosmos DB capabilities for the account
     * 
     */
    @OutputExport(name="capabilities", type=List.class, parameters={CapabilityResponse.class})
    private Output</* @Nullable */ List<CapabilityResponse>> capabilities;

    /**
     * @return List of Cosmos DB capabilities for the account
     * 
     */
    public Output</* @Nullable */ List<CapabilityResponse>> getCapabilities() {
        return this.capabilities;
    }
    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    @OutputExport(name="connectorOffer", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorOffer;

    /**
     * @return The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    public Output</* @Nullable */ String> getConnectorOffer() {
        return this.connectorOffer;
    }
    /**
     * The consistency policy for the Cosmos DB database account.
     * 
     */
    @OutputExport(name="consistencyPolicy", type=ConsistencyPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ConsistencyPolicyResponse> consistencyPolicy;

    /**
     * @return The consistency policy for the Cosmos DB database account.
     * 
     */
    public Output</* @Nullable */ ConsistencyPolicyResponse> getConsistencyPolicy() {
        return this.consistencyPolicy;
    }
    /**
     * The CORS policy for the Cosmos DB database account.
     * 
     */
    @OutputExport(name="cors", type=List.class, parameters={CorsPolicyResponse.class})
    private Output</* @Nullable */ List<CorsPolicyResponse>> cors;

    /**
     * @return The CORS policy for the Cosmos DB database account.
     * 
     */
    public Output</* @Nullable */ List<CorsPolicyResponse>> getCors() {
        return this.cors;
    }
    /**
     * The offer type for the Cosmos DB database account. Default value: Standard.
     * 
     */
    @OutputExport(name="databaseAccountOfferType", type=String.class, parameters={})
    private Output<String> databaseAccountOfferType;

    /**
     * @return The offer type for the Cosmos DB database account. Default value: Standard.
     * 
     */
    public Output<String> getDatabaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }
    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
     */
    @OutputExport(name="defaultIdentity", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultIdentity;

    /**
     * @return The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
     */
    public Output</* @Nullable */ String> getDefaultIdentity() {
        return this.defaultIdentity;
    }
    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    @OutputExport(name="disableKeyBasedMetadataWriteAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableKeyBasedMetadataWriteAccess;

    /**
     * @return Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }
    /**
     * The connection endpoint for the Cosmos DB database account.
     * 
     */
    @OutputExport(name="documentEndpoint", type=String.class, parameters={})
    private Output<String> documentEndpoint;

    /**
     * @return The connection endpoint for the Cosmos DB database account.
     * 
     */
    public Output<String> getDocumentEndpoint() {
        return this.documentEndpoint;
    }
    /**
     * Flag to indicate whether to enable storage analytics.
     * 
     */
    @OutputExport(name="enableAnalyticalStorage", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAnalyticalStorage;

    /**
     * @return Flag to indicate whether to enable storage analytics.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }
    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    @OutputExport(name="enableAutomaticFailover", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticFailover;

    /**
     * @return Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }
    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    @OutputExport(name="enableCassandraConnector", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCassandraConnector;

    /**
     * @return Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableCassandraConnector() {
        return this.enableCassandraConnector;
    }
    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
     */
    @OutputExport(name="enableFreeTier", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFreeTier;

    /**
     * @return Flag to indicate whether Free Tier is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableFreeTier() {
        return this.enableFreeTier;
    }
    /**
     * Enables the account to write in multiple locations
     * 
     */
    @OutputExport(name="enableMultipleWriteLocations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableMultipleWriteLocations;

    /**
     * @return Enables the account to write in multiple locations
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }
    /**
     * An array that contains the regions ordered by their failover priorities.
     * 
     */
    @OutputExport(name="failoverPolicies", type=List.class, parameters={FailoverPolicyResponse.class})
    private Output<List<FailoverPolicyResponse>> failoverPolicies;

    /**
     * @return An array that contains the regions ordered by their failover priorities.
     * 
     */
    public Output<List<FailoverPolicyResponse>> getFailoverPolicies() {
        return this.failoverPolicies;
    }
    /**
     * Identity for the resource.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * List of IpRules.
     * 
     */
    @OutputExport(name="ipRules", type=List.class, parameters={IpAddressOrRangeResponse.class})
    private Output</* @Nullable */ List<IpAddressOrRangeResponse>> ipRules;

    /**
     * @return List of IpRules.
     * 
     */
    public Output</* @Nullable */ List<IpAddressOrRangeResponse>> getIpRules() {
        return this.ipRules;
    }
    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    @OutputExport(name="isVirtualNetworkFilterEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isVirtualNetworkFilterEnabled;

    /**
     * @return Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }
    /**
     * The URI of the key vault
     * 
     */
    @OutputExport(name="keyVaultKeyUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultKeyUri;

    /**
     * @return The URI of the key vault
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }
    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
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
     * An array that contains all of the locations enabled for the Cosmos DB account.
     * 
     */
    @OutputExport(name="locations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> locations;

    /**
     * @return An array that contains all of the locations enabled for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> getLocations() {
        return this.locations;
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
    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
     */
    @OutputExport(name="networkAclBypass", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkAclBypass;

    /**
     * @return Indicates what services are allowed to bypass firewall checks.
     * 
     */
    public Output</* @Nullable */ String> getNetworkAclBypass() {
        return this.networkAclBypass;
    }
    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    @OutputExport(name="networkAclBypassResourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> networkAclBypassResourceIds;

    /**
     * @return An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    public Output</* @Nullable */ List<String>> getNetworkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }
    /**
     * List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether requests from Public Network are allowed
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * An array that contains of the read locations enabled for the Cosmos DB account.
     * 
     */
    @OutputExport(name="readLocations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> readLocations;

    /**
     * @return An array that contains of the read locations enabled for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> getReadLocations() {
        return this.readLocations;
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
    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    @OutputExport(name="virtualNetworkRules", type=List.class, parameters={VirtualNetworkRuleResponse.class})
    private Output</* @Nullable */ List<VirtualNetworkRuleResponse>> virtualNetworkRules;

    /**
     * @return List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    public Output</* @Nullable */ List<VirtualNetworkRuleResponse>> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }
    /**
     * An array that contains the write location for the Cosmos DB account.
     * 
     */
    @OutputExport(name="writeLocations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> writeLocations;

    /**
     * @return An array that contains the write location for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> getWriteLocations() {
        return this.writeLocations;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.DatabaseAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.DatabaseAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DatabaseAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseAccount(String name) {
        this(name, DatabaseAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseAccount(String name, DatabaseAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseAccount(String name, DatabaseAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:DatabaseAccount", name, args == null ? DatabaseAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabaseAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:DatabaseAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150401:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150408:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20151106:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160319:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160331:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:DatabaseAccount").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:DatabaseAccount").build())
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
    public static DatabaseAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseAccount(name, id, options);
    }
}
