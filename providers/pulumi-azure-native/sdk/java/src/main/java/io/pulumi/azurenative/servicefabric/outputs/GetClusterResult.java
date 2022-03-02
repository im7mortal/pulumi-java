// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ApplicationTypeVersionsCleanupPolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.AzureActiveDirectoryResponse;
import io.pulumi.azurenative.servicefabric.outputs.CertificateDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateCommonNameResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateThumbprintResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClusterUpgradePolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClusterVersionDetailsResponse;
import io.pulumi.azurenative.servicefabric.outputs.DiagnosticsStorageAccountConfigResponse;
import io.pulumi.azurenative.servicefabric.outputs.NodeTypeDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ServerCertificateCommonNamesResponse;
import io.pulumi.azurenative.servicefabric.outputs.SettingsSectionDescriptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    private final @Nullable List<String> addOnFeatures;
    /**
     * The policy used to clean up unused versions.
     * 
     */
    private final @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy;
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
     */
    private final List<ClusterVersionDetailsResponse> availableClusterVersions;
    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    private final @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    private final @Nullable CertificateDescriptionResponse certificate;
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    private final @Nullable ServerCertificateCommonNamesResponse certificateCommonNames;
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    private final @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames;
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    private final @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints;
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    private final @Nullable String clusterCodeVersion;
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    private final String clusterEndpoint;
    /**
     * A service generated unique identifier for the cluster resource.
     * 
     */
    private final String clusterId;
    /**
     * The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to 'Automatic'.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
     */
    private final String clusterState;
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    private final @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig;
    /**
     * Azure resource etag.
     * 
     */
    private final String etag;
    /**
     * Indicates if the event store service is enabled.
     * 
     */
    private final @Nullable Boolean eventStoreServiceEnabled;
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    private final @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
    /**
     * Azure resource identifier.
     * 
     */
    private final String id;
    /**
     * Azure resource location.
     * 
     */
    private final String location;
    /**
     * The http management endpoint of the cluster.
     * 
     */
    private final String managementEndpoint;
    /**
     * Azure resource name.
     * 
     */
    private final String name;
    /**
     * The list of node types in the cluster.
     * 
     */
    private final List<NodeTypeDescriptionResponse> nodeTypes;
    /**
     * The provisioning state of the cluster resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    private final @Nullable String reliabilityLevel;
    /**
     * The server certificate used by reverse proxy.
     * 
     */
    private final @Nullable CertificateDescriptionResponse reverseProxyCertificate;
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    private final @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames;
    /**
     * Azure resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type.
     * 
     */
    private final String type;
    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    private final @Nullable ClusterUpgradePolicyResponse upgradeDescription;
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    private final @Nullable String upgradeMode;
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    private final @Nullable String vmImage;

    @OutputCustomType.Constructor({"addOnFeatures","applicationTypeVersionsCleanupPolicy","availableClusterVersions","azureActiveDirectory","certificate","certificateCommonNames","clientCertificateCommonNames","clientCertificateThumbprints","clusterCodeVersion","clusterEndpoint","clusterId","clusterState","diagnosticsStorageAccountConfig","etag","eventStoreServiceEnabled","fabricSettings","id","location","managementEndpoint","name","nodeTypes","provisioningState","reliabilityLevel","reverseProxyCertificate","reverseProxyCertificateCommonNames","tags","type","upgradeDescription","upgradeMode","vmImage"})
    private GetClusterResult(
        @Nullable List<String> addOnFeatures,
        @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy,
        List<ClusterVersionDetailsResponse> availableClusterVersions,
        @Nullable AzureActiveDirectoryResponse azureActiveDirectory,
        @Nullable CertificateDescriptionResponse certificate,
        @Nullable ServerCertificateCommonNamesResponse certificateCommonNames,
        @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames,
        @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints,
        @Nullable String clusterCodeVersion,
        String clusterEndpoint,
        String clusterId,
        String clusterState,
        @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig,
        String etag,
        @Nullable Boolean eventStoreServiceEnabled,
        @Nullable List<SettingsSectionDescriptionResponse> fabricSettings,
        String id,
        String location,
        String managementEndpoint,
        String name,
        List<NodeTypeDescriptionResponse> nodeTypes,
        String provisioningState,
        @Nullable String reliabilityLevel,
        @Nullable CertificateDescriptionResponse reverseProxyCertificate,
        @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable ClusterUpgradePolicyResponse upgradeDescription,
        @Nullable String upgradeMode,
        @Nullable String vmImage) {
        this.addOnFeatures = addOnFeatures;
        this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
        this.availableClusterVersions = Objects.requireNonNull(availableClusterVersions);
        this.azureActiveDirectory = azureActiveDirectory;
        this.certificate = certificate;
        this.certificateCommonNames = certificateCommonNames;
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterEndpoint = Objects.requireNonNull(clusterEndpoint);
        this.clusterId = Objects.requireNonNull(clusterId);
        this.clusterState = Objects.requireNonNull(clusterState);
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        this.etag = Objects.requireNonNull(etag);
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        this.fabricSettings = fabricSettings;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
        this.name = Objects.requireNonNull(name);
        this.nodeTypes = Objects.requireNonNull(nodeTypes);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.reliabilityLevel = reliabilityLevel;
        this.reverseProxyCertificate = reverseProxyCertificate;
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.upgradeDescription = upgradeDescription;
        this.upgradeMode = upgradeMode;
        this.vmImage = vmImage;
    }

    /**
     * The list of add-on features to enable in the cluster.
     * 
    */
    public List<String> getAddOnFeatures() {
        return this.addOnFeatures == null ? List.of() : this.addOnFeatures;
    }
    /**
     * The policy used to clean up unused versions.
     * 
    */
    public Optional<ApplicationTypeVersionsCleanupPolicyResponse> getApplicationTypeVersionsCleanupPolicy() {
        return Optional.ofNullable(this.applicationTypeVersionsCleanupPolicy);
    }
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
    */
    public List<ClusterVersionDetailsResponse> getAvailableClusterVersions() {
        return this.availableClusterVersions;
    }
    /**
     * The AAD authentication settings of the cluster.
     * 
    */
    public Optional<AzureActiveDirectoryResponse> getAzureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
    */
    public Optional<CertificateDescriptionResponse> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
    */
    public Optional<ServerCertificateCommonNamesResponse> getCertificateCommonNames() {
        return Optional.ofNullable(this.certificateCommonNames);
    }
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
    */
    public List<ClientCertificateCommonNameResponse> getClientCertificateCommonNames() {
        return this.clientCertificateCommonNames == null ? List.of() : this.clientCertificateCommonNames;
    }
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
    */
    public List<ClientCertificateThumbprintResponse> getClientCertificateThumbprints() {
        return this.clientCertificateThumbprints == null ? List.of() : this.clientCertificateThumbprints;
    }
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
    */
    public Optional<String> getClusterCodeVersion() {
        return Optional.ofNullable(this.clusterCodeVersion);
    }
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
    */
    public String getClusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * A service generated unique identifier for the cluster resource.
     * 
    */
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to 'Automatic'.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
    */
    public String getClusterState() {
        return this.clusterState;
    }
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
    */
    public Optional<DiagnosticsStorageAccountConfigResponse> getDiagnosticsStorageAccountConfig() {
        return Optional.ofNullable(this.diagnosticsStorageAccountConfig);
    }
    /**
     * Azure resource etag.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Indicates if the event store service is enabled.
     * 
    */
    public Optional<Boolean> getEventStoreServiceEnabled() {
        return Optional.ofNullable(this.eventStoreServiceEnabled);
    }
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
    */
    public List<SettingsSectionDescriptionResponse> getFabricSettings() {
        return this.fabricSettings == null ? List.of() : this.fabricSettings;
    }
    /**
     * Azure resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The http management endpoint of the cluster.
     * 
    */
    public String getManagementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * Azure resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of node types in the cluster.
     * 
    */
    public List<NodeTypeDescriptionResponse> getNodeTypes() {
        return this.nodeTypes;
    }
    /**
     * The provisioning state of the cluster resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
    */
    public Optional<String> getReliabilityLevel() {
        return Optional.ofNullable(this.reliabilityLevel);
    }
    /**
     * The server certificate used by reverse proxy.
     * 
    */
    public Optional<CertificateDescriptionResponse> getReverseProxyCertificate() {
        return Optional.ofNullable(this.reverseProxyCertificate);
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
    */
    public Optional<ServerCertificateCommonNamesResponse> getReverseProxyCertificateCommonNames() {
        return Optional.ofNullable(this.reverseProxyCertificateCommonNames);
    }
    /**
     * Azure resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The policy to use when upgrading the cluster.
     * 
    */
    public Optional<ClusterUpgradePolicyResponse> getUpgradeDescription() {
        return Optional.ofNullable(this.upgradeDescription);
    }
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
    */
    public Optional<String> getUpgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
    */
    public Optional<String> getVmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addOnFeatures;
        private @Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy;
        private List<ClusterVersionDetailsResponse> availableClusterVersions;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable CertificateDescriptionResponse certificate;
        private @Nullable ServerCertificateCommonNamesResponse certificateCommonNames;
        private @Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames;
        private @Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints;
        private @Nullable String clusterCodeVersion;
        private String clusterEndpoint;
        private String clusterId;
        private String clusterState;
        private @Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig;
        private String etag;
        private @Nullable Boolean eventStoreServiceEnabled;
        private @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
        private String id;
        private String location;
        private String managementEndpoint;
        private String name;
        private List<NodeTypeDescriptionResponse> nodeTypes;
        private String provisioningState;
        private @Nullable String reliabilityLevel;
        private @Nullable CertificateDescriptionResponse reverseProxyCertificate;
        private @Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ClusterUpgradePolicyResponse upgradeDescription;
        private @Nullable String upgradeMode;
        private @Nullable String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnFeatures = defaults.addOnFeatures;
    	      this.applicationTypeVersionsCleanupPolicy = defaults.applicationTypeVersionsCleanupPolicy;
    	      this.availableClusterVersions = defaults.availableClusterVersions;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.certificate = defaults.certificate;
    	      this.certificateCommonNames = defaults.certificateCommonNames;
    	      this.clientCertificateCommonNames = defaults.clientCertificateCommonNames;
    	      this.clientCertificateThumbprints = defaults.clientCertificateThumbprints;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.diagnosticsStorageAccountConfig = defaults.diagnosticsStorageAccountConfig;
    	      this.etag = defaults.etag;
    	      this.eventStoreServiceEnabled = defaults.eventStoreServiceEnabled;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managementEndpoint = defaults.managementEndpoint;
    	      this.name = defaults.name;
    	      this.nodeTypes = defaults.nodeTypes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.reliabilityLevel = defaults.reliabilityLevel;
    	      this.reverseProxyCertificate = defaults.reverseProxyCertificate;
    	      this.reverseProxyCertificateCommonNames = defaults.reverseProxyCertificateCommonNames;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeDescription = defaults.upgradeDescription;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAddOnFeatures(@Nullable List<String> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            return this;
        }

        public Builder setApplicationTypeVersionsCleanupPolicy(@Nullable ApplicationTypeVersionsCleanupPolicyResponse applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
            return this;
        }

        public Builder setAvailableClusterVersions(List<ClusterVersionDetailsResponse> availableClusterVersions) {
            this.availableClusterVersions = Objects.requireNonNull(availableClusterVersions);
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        public Builder setCertificate(@Nullable CertificateDescriptionResponse certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificateCommonNames(@Nullable ServerCertificateCommonNamesResponse certificateCommonNames) {
            this.certificateCommonNames = certificateCommonNames;
            return this;
        }

        public Builder setClientCertificateCommonNames(@Nullable List<ClientCertificateCommonNameResponse> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = clientCertificateCommonNames;
            return this;
        }

        public Builder setClientCertificateThumbprints(@Nullable List<ClientCertificateThumbprintResponse> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = clientCertificateThumbprints;
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }

        public Builder setClusterEndpoint(String clusterEndpoint) {
            this.clusterEndpoint = Objects.requireNonNull(clusterEndpoint);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterState(String clusterState) {
            this.clusterState = Objects.requireNonNull(clusterState);
            return this;
        }

        public Builder setDiagnosticsStorageAccountConfig(@Nullable DiagnosticsStorageAccountConfigResponse diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventStoreServiceEnabled(@Nullable Boolean eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = eventStoreServiceEnabled;
            return this;
        }

        public Builder setFabricSettings(@Nullable List<SettingsSectionDescriptionResponse> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagementEndpoint(String managementEndpoint) {
            this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeTypes(List<NodeTypeDescriptionResponse> nodeTypes) {
            this.nodeTypes = Objects.requireNonNull(nodeTypes);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setReliabilityLevel(@Nullable String reliabilityLevel) {
            this.reliabilityLevel = reliabilityLevel;
            return this;
        }

        public Builder setReverseProxyCertificate(@Nullable CertificateDescriptionResponse reverseProxyCertificate) {
            this.reverseProxyCertificate = reverseProxyCertificate;
            return this;
        }

        public Builder setReverseProxyCertificateCommonNames(@Nullable ServerCertificateCommonNamesResponse reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
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

        public Builder setUpgradeDescription(@Nullable ClusterUpgradePolicyResponse upgradeDescription) {
            this.upgradeDescription = upgradeDescription;
            return this;
        }

        public Builder setUpgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder setVmImage(@Nullable String vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(addOnFeatures, applicationTypeVersionsCleanupPolicy, availableClusterVersions, azureActiveDirectory, certificate, certificateCommonNames, clientCertificateCommonNames, clientCertificateThumbprints, clusterCodeVersion, clusterEndpoint, clusterId, clusterState, diagnosticsStorageAccountConfig, etag, eventStoreServiceEnabled, fabricSettings, id, location, managementEndpoint, name, nodeTypes, provisioningState, reliabilityLevel, reverseProxyCertificate, reverseProxyCertificateCommonNames, tags, type, upgradeDescription, upgradeMode, vmImage);
        }
    }
}
