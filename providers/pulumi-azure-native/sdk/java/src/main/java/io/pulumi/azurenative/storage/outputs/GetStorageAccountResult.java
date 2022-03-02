// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.AzureFilesIdentityBasedAuthenticationResponse;
import io.pulumi.azurenative.storage.outputs.BlobRestoreStatusResponse;
import io.pulumi.azurenative.storage.outputs.CustomDomainResponse;
import io.pulumi.azurenative.storage.outputs.EncryptionResponse;
import io.pulumi.azurenative.storage.outputs.EndpointsResponse;
import io.pulumi.azurenative.storage.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.storage.outputs.GeoReplicationStatsResponse;
import io.pulumi.azurenative.storage.outputs.IdentityResponse;
import io.pulumi.azurenative.storage.outputs.KeyCreationTimeResponse;
import io.pulumi.azurenative.storage.outputs.KeyPolicyResponse;
import io.pulumi.azurenative.storage.outputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.storage.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.storage.outputs.RoutingPreferenceResponse;
import io.pulumi.azurenative.storage.outputs.SasPolicyResponse;
import io.pulumi.azurenative.storage.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageAccountResult {
    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    private final String accessTier;
    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    private final @Nullable Boolean allowBlobPublicAccess;
    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    private final @Nullable Boolean allowSharedKeyAccess;
    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
     */
    private final @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication;
    /**
     * Blob restore status
     * 
     */
    private final BlobRestoreStatusResponse blobRestoreStatus;
    /**
     * Gets the creation date and time of the storage account in UTC.
     * 
     */
    private final String creationTime;
    /**
     * Gets the custom domain the user assigned to this storage account.
     * 
     */
    private final CustomDomainResponse customDomain;
    /**
     * Allows https traffic only to storage service if sets to true.
     * 
     */
    private final @Nullable Boolean enableHttpsTrafficOnly;
    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
     */
    private final @Nullable Boolean enableNfsV3;
    /**
     * Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
     */
    private final EncryptionResponse encryption;
    /**
     * The extendedLocation of the resource.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
     */
    private final Boolean failoverInProgress;
    /**
     * Geo Replication Stats
     * 
     */
    private final GeoReplicationStatsResponse geoReplicationStats;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    private final @Nullable Boolean isHnsEnabled;
    /**
     * Storage account keys creation time.
     * 
     */
    private final KeyCreationTimeResponse keyCreationTime;
    /**
     * KeyPolicy assigned to the storage account.
     * 
     */
    private final KeyPolicyResponse keyPolicy;
    /**
     * Gets the Kind.
     * 
     */
    private final String kind;
    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    private final @Nullable String largeFileSharesState;
    /**
     * Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String lastGeoFailoverTime;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Network rule set
     * 
     */
    private final NetworkRuleSetResponse networkRuleSet;
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
     */
    private final EndpointsResponse primaryEndpoints;
    /**
     * Gets the location of the primary data center for the storage account.
     * 
     */
    private final String primaryLocation;
    /**
     * List of private endpoint connection associated with the specified storage account
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Gets the status of the storage account at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    private final @Nullable RoutingPreferenceResponse routingPreference;
    /**
     * SasPolicy assigned to the storage account.
     * 
     */
    private final SasPolicyResponse sasPolicy;
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
     */
    private final EndpointsResponse secondaryEndpoints;
    /**
     * Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String secondaryLocation;
    /**
     * Gets the SKU.
     * 
     */
    private final SkuResponse sku;
    /**
     * Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
     */
    private final String statusOfPrimary;
    /**
     * Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String statusOfSecondary;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accessTier","allowBlobPublicAccess","allowSharedKeyAccess","azureFilesIdentityBasedAuthentication","blobRestoreStatus","creationTime","customDomain","enableHttpsTrafficOnly","enableNfsV3","encryption","extendedLocation","failoverInProgress","geoReplicationStats","id","identity","isHnsEnabled","keyCreationTime","keyPolicy","kind","largeFileSharesState","lastGeoFailoverTime","location","minimumTlsVersion","name","networkRuleSet","primaryEndpoints","primaryLocation","privateEndpointConnections","provisioningState","routingPreference","sasPolicy","secondaryEndpoints","secondaryLocation","sku","statusOfPrimary","statusOfSecondary","tags","type"})
    private GetStorageAccountResult(
        String accessTier,
        @Nullable Boolean allowBlobPublicAccess,
        @Nullable Boolean allowSharedKeyAccess,
        @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication,
        BlobRestoreStatusResponse blobRestoreStatus,
        String creationTime,
        CustomDomainResponse customDomain,
        @Nullable Boolean enableHttpsTrafficOnly,
        @Nullable Boolean enableNfsV3,
        EncryptionResponse encryption,
        @Nullable ExtendedLocationResponse extendedLocation,
        Boolean failoverInProgress,
        GeoReplicationStatsResponse geoReplicationStats,
        String id,
        @Nullable IdentityResponse identity,
        @Nullable Boolean isHnsEnabled,
        KeyCreationTimeResponse keyCreationTime,
        KeyPolicyResponse keyPolicy,
        String kind,
        @Nullable String largeFileSharesState,
        String lastGeoFailoverTime,
        String location,
        @Nullable String minimumTlsVersion,
        String name,
        NetworkRuleSetResponse networkRuleSet,
        EndpointsResponse primaryEndpoints,
        String primaryLocation,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable RoutingPreferenceResponse routingPreference,
        SasPolicyResponse sasPolicy,
        EndpointsResponse secondaryEndpoints,
        String secondaryLocation,
        SkuResponse sku,
        String statusOfPrimary,
        String statusOfSecondary,
        @Nullable Map<String,String> tags,
        String type) {
        this.accessTier = Objects.requireNonNull(accessTier);
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        this.blobRestoreStatus = Objects.requireNonNull(blobRestoreStatus);
        this.creationTime = Objects.requireNonNull(creationTime);
        this.customDomain = Objects.requireNonNull(customDomain);
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        this.enableNfsV3 = enableNfsV3;
        this.encryption = Objects.requireNonNull(encryption);
        this.extendedLocation = extendedLocation;
        this.failoverInProgress = Objects.requireNonNull(failoverInProgress);
        this.geoReplicationStats = Objects.requireNonNull(geoReplicationStats);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.isHnsEnabled = isHnsEnabled;
        this.keyCreationTime = Objects.requireNonNull(keyCreationTime);
        this.keyPolicy = Objects.requireNonNull(keyPolicy);
        this.kind = Objects.requireNonNull(kind);
        this.largeFileSharesState = largeFileSharesState;
        this.lastGeoFailoverTime = Objects.requireNonNull(lastGeoFailoverTime);
        this.location = Objects.requireNonNull(location);
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = Objects.requireNonNull(name);
        this.networkRuleSet = Objects.requireNonNull(networkRuleSet);
        this.primaryEndpoints = Objects.requireNonNull(primaryEndpoints);
        this.primaryLocation = Objects.requireNonNull(primaryLocation);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routingPreference = routingPreference;
        this.sasPolicy = Objects.requireNonNull(sasPolicy);
        this.secondaryEndpoints = Objects.requireNonNull(secondaryEndpoints);
        this.secondaryLocation = Objects.requireNonNull(secondaryLocation);
        this.sku = Objects.requireNonNull(sku);
        this.statusOfPrimary = Objects.requireNonNull(statusOfPrimary);
        this.statusOfSecondary = Objects.requireNonNull(statusOfSecondary);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
    */
    public String getAccessTier() {
        return this.accessTier;
    }
    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
    */
    public Optional<Boolean> getAllowBlobPublicAccess() {
        return Optional.ofNullable(this.allowBlobPublicAccess);
    }
    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
    */
    public Optional<Boolean> getAllowSharedKeyAccess() {
        return Optional.ofNullable(this.allowSharedKeyAccess);
    }
    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
    */
    public Optional<AzureFilesIdentityBasedAuthenticationResponse> getAzureFilesIdentityBasedAuthentication() {
        return Optional.ofNullable(this.azureFilesIdentityBasedAuthentication);
    }
    /**
     * Blob restore status
     * 
    */
    public BlobRestoreStatusResponse getBlobRestoreStatus() {
        return this.blobRestoreStatus;
    }
    /**
     * Gets the creation date and time of the storage account in UTC.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets the custom domain the user assigned to this storage account.
     * 
    */
    public CustomDomainResponse getCustomDomain() {
        return this.customDomain;
    }
    /**
     * Allows https traffic only to storage service if sets to true.
     * 
    */
    public Optional<Boolean> getEnableHttpsTrafficOnly() {
        return Optional.ofNullable(this.enableHttpsTrafficOnly);
    }
    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
    */
    public Optional<Boolean> getEnableNfsV3() {
        return Optional.ofNullable(this.enableNfsV3);
    }
    /**
     * Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
    */
    public EncryptionResponse getEncryption() {
        return this.encryption;
    }
    /**
     * The extendedLocation of the resource.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
    */
    public Boolean getFailoverInProgress() {
        return this.failoverInProgress;
    }
    /**
     * Geo Replication Stats
     * 
    */
    public GeoReplicationStatsResponse getGeoReplicationStats() {
        return this.geoReplicationStats;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
    */
    public Optional<Boolean> getIsHnsEnabled() {
        return Optional.ofNullable(this.isHnsEnabled);
    }
    /**
     * Storage account keys creation time.
     * 
    */
    public KeyCreationTimeResponse getKeyCreationTime() {
        return this.keyCreationTime;
    }
    /**
     * KeyPolicy assigned to the storage account.
     * 
    */
    public KeyPolicyResponse getKeyPolicy() {
        return this.keyPolicy;
    }
    /**
     * Gets the Kind.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
    */
    public Optional<String> getLargeFileSharesState() {
        return Optional.ofNullable(this.largeFileSharesState);
    }
    /**
     * Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
    */
    public String getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
    */
    public Optional<String> getMinimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Network rule set
     * 
    */
    public NetworkRuleSetResponse getNetworkRuleSet() {
        return this.networkRuleSet;
    }
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
    */
    public EndpointsResponse getPrimaryEndpoints() {
        return this.primaryEndpoints;
    }
    /**
     * Gets the location of the primary data center for the storage account.
     * 
    */
    public String getPrimaryLocation() {
        return this.primaryLocation;
    }
    /**
     * List of private endpoint connection associated with the specified storage account
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Gets the status of the storage account at the time the operation was called.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
    */
    public Optional<RoutingPreferenceResponse> getRoutingPreference() {
        return Optional.ofNullable(this.routingPreference);
    }
    /**
     * SasPolicy assigned to the storage account.
     * 
    */
    public SasPolicyResponse getSasPolicy() {
        return this.sasPolicy;
    }
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
    */
    public EndpointsResponse getSecondaryEndpoints() {
        return this.secondaryEndpoints;
    }
    /**
     * Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
    */
    public String getSecondaryLocation() {
        return this.secondaryLocation;
    }
    /**
     * Gets the SKU.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
    */
    public String getStatusOfPrimary() {
        return this.statusOfPrimary;
    }
    /**
     * Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
    */
    public String getStatusOfSecondary() {
        return this.statusOfSecondary;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessTier;
        private @Nullable Boolean allowBlobPublicAccess;
        private @Nullable Boolean allowSharedKeyAccess;
        private @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication;
        private BlobRestoreStatusResponse blobRestoreStatus;
        private String creationTime;
        private CustomDomainResponse customDomain;
        private @Nullable Boolean enableHttpsTrafficOnly;
        private @Nullable Boolean enableNfsV3;
        private EncryptionResponse encryption;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private Boolean failoverInProgress;
        private GeoReplicationStatsResponse geoReplicationStats;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable Boolean isHnsEnabled;
        private KeyCreationTimeResponse keyCreationTime;
        private KeyPolicyResponse keyPolicy;
        private String kind;
        private @Nullable String largeFileSharesState;
        private String lastGeoFailoverTime;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private NetworkRuleSetResponse networkRuleSet;
        private EndpointsResponse primaryEndpoints;
        private String primaryLocation;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable RoutingPreferenceResponse routingPreference;
        private SasPolicyResponse sasPolicy;
        private EndpointsResponse secondaryEndpoints;
        private String secondaryLocation;
        private SkuResponse sku;
        private String statusOfPrimary;
        private String statusOfSecondary;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.allowBlobPublicAccess = defaults.allowBlobPublicAccess;
    	      this.allowSharedKeyAccess = defaults.allowSharedKeyAccess;
    	      this.azureFilesIdentityBasedAuthentication = defaults.azureFilesIdentityBasedAuthentication;
    	      this.blobRestoreStatus = defaults.blobRestoreStatus;
    	      this.creationTime = defaults.creationTime;
    	      this.customDomain = defaults.customDomain;
    	      this.enableHttpsTrafficOnly = defaults.enableHttpsTrafficOnly;
    	      this.enableNfsV3 = defaults.enableNfsV3;
    	      this.encryption = defaults.encryption;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.failoverInProgress = defaults.failoverInProgress;
    	      this.geoReplicationStats = defaults.geoReplicationStats;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isHnsEnabled = defaults.isHnsEnabled;
    	      this.keyCreationTime = defaults.keyCreationTime;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.kind = defaults.kind;
    	      this.largeFileSharesState = defaults.largeFileSharesState;
    	      this.lastGeoFailoverTime = defaults.lastGeoFailoverTime;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.primaryEndpoints = defaults.primaryEndpoints;
    	      this.primaryLocation = defaults.primaryLocation;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingPreference = defaults.routingPreference;
    	      this.sasPolicy = defaults.sasPolicy;
    	      this.secondaryEndpoints = defaults.secondaryEndpoints;
    	      this.secondaryLocation = defaults.secondaryLocation;
    	      this.sku = defaults.sku;
    	      this.statusOfPrimary = defaults.statusOfPrimary;
    	      this.statusOfSecondary = defaults.statusOfSecondary;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccessTier(String accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }

        public Builder setAllowBlobPublicAccess(@Nullable Boolean allowBlobPublicAccess) {
            this.allowBlobPublicAccess = allowBlobPublicAccess;
            return this;
        }

        public Builder setAllowSharedKeyAccess(@Nullable Boolean allowSharedKeyAccess) {
            this.allowSharedKeyAccess = allowSharedKeyAccess;
            return this;
        }

        public Builder setAzureFilesIdentityBasedAuthentication(@Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
            return this;
        }

        public Builder setBlobRestoreStatus(BlobRestoreStatusResponse blobRestoreStatus) {
            this.blobRestoreStatus = Objects.requireNonNull(blobRestoreStatus);
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setCustomDomain(CustomDomainResponse customDomain) {
            this.customDomain = Objects.requireNonNull(customDomain);
            return this;
        }

        public Builder setEnableHttpsTrafficOnly(@Nullable Boolean enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
            return this;
        }

        public Builder setEnableNfsV3(@Nullable Boolean enableNfsV3) {
            this.enableNfsV3 = enableNfsV3;
            return this;
        }

        public Builder setEncryption(EncryptionResponse encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setFailoverInProgress(Boolean failoverInProgress) {
            this.failoverInProgress = Objects.requireNonNull(failoverInProgress);
            return this;
        }

        public Builder setGeoReplicationStats(GeoReplicationStatsResponse geoReplicationStats) {
            this.geoReplicationStats = Objects.requireNonNull(geoReplicationStats);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIsHnsEnabled(@Nullable Boolean isHnsEnabled) {
            this.isHnsEnabled = isHnsEnabled;
            return this;
        }

        public Builder setKeyCreationTime(KeyCreationTimeResponse keyCreationTime) {
            this.keyCreationTime = Objects.requireNonNull(keyCreationTime);
            return this;
        }

        public Builder setKeyPolicy(KeyPolicyResponse keyPolicy) {
            this.keyPolicy = Objects.requireNonNull(keyPolicy);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLargeFileSharesState(@Nullable String largeFileSharesState) {
            this.largeFileSharesState = largeFileSharesState;
            return this;
        }

        public Builder setLastGeoFailoverTime(String lastGeoFailoverTime) {
            this.lastGeoFailoverTime = Objects.requireNonNull(lastGeoFailoverTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkRuleSet(NetworkRuleSetResponse networkRuleSet) {
            this.networkRuleSet = Objects.requireNonNull(networkRuleSet);
            return this;
        }

        public Builder setPrimaryEndpoints(EndpointsResponse primaryEndpoints) {
            this.primaryEndpoints = Objects.requireNonNull(primaryEndpoints);
            return this;
        }

        public Builder setPrimaryLocation(String primaryLocation) {
            this.primaryLocation = Objects.requireNonNull(primaryLocation);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoutingPreference(@Nullable RoutingPreferenceResponse routingPreference) {
            this.routingPreference = routingPreference;
            return this;
        }

        public Builder setSasPolicy(SasPolicyResponse sasPolicy) {
            this.sasPolicy = Objects.requireNonNull(sasPolicy);
            return this;
        }

        public Builder setSecondaryEndpoints(EndpointsResponse secondaryEndpoints) {
            this.secondaryEndpoints = Objects.requireNonNull(secondaryEndpoints);
            return this;
        }

        public Builder setSecondaryLocation(String secondaryLocation) {
            this.secondaryLocation = Objects.requireNonNull(secondaryLocation);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setStatusOfPrimary(String statusOfPrimary) {
            this.statusOfPrimary = Objects.requireNonNull(statusOfPrimary);
            return this;
        }

        public Builder setStatusOfSecondary(String statusOfSecondary) {
            this.statusOfSecondary = Objects.requireNonNull(statusOfSecondary);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStorageAccountResult build() {
            return new GetStorageAccountResult(accessTier, allowBlobPublicAccess, allowSharedKeyAccess, azureFilesIdentityBasedAuthentication, blobRestoreStatus, creationTime, customDomain, enableHttpsTrafficOnly, enableNfsV3, encryption, extendedLocation, failoverInProgress, geoReplicationStats, id, identity, isHnsEnabled, keyCreationTime, keyPolicy, kind, largeFileSharesState, lastGeoFailoverTime, location, minimumTlsVersion, name, networkRuleSet, primaryEndpoints, primaryLocation, privateEndpointConnections, provisioningState, routingPreference, sasPolicy, secondaryEndpoints, secondaryLocation, sku, statusOfPrimary, statusOfSecondary, tags, type);
        }
    }
}
