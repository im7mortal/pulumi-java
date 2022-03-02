// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.azurenative.hybridcompute.outputs.ErrorDetailResponse;
import io.pulumi.azurenative.hybridcompute.outputs.LocationDataResponse;
import io.pulumi.azurenative.hybridcompute.outputs.MachineExtensionInstanceViewResponse;
import io.pulumi.azurenative.hybridcompute.outputs.MachinePropertiesResponseOsProfile;
import io.pulumi.azurenative.hybridcompute.outputs.MachineResponseIdentity;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMachineResult {
    /**
     * Specifies the AD fully qualified display name.
     * 
     */
    private final String adFqdn;
    /**
     * The hybrid machine agent full version.
     * 
     */
    private final String agentVersion;
    /**
     * Public Key that the client provides to be used during initial resource onboarding
     * 
     */
    private final @Nullable String clientPublicKey;
    /**
     * Specifies the hybrid machine display name.
     * 
     */
    private final String displayName;
    /**
     * Specifies the DNS fully qualified display name.
     * 
     */
    private final String dnsFqdn;
    /**
     * Specifies the Windows domain name.
     * 
     */
    private final String domainName;
    /**
     * Details about the error state.
     * 
     */
    private final List<ErrorDetailResponse> errorDetails;
    /**
     * Machine Extensions information
     * 
     */
    private final List<MachineExtensionInstanceViewResponse> extensions;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    private final @Nullable MachineResponseIdentity identity;
    /**
     * The time of the last status change.
     * 
     */
    private final String lastStatusChange;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Metadata pertaining to the geographic location of the resource.
     * 
     */
    private final @Nullable LocationDataResponse locationData;
    /**
     * Specifies the hybrid machine FQDN.
     * 
     */
    private final String machineFqdn;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The Operating System running on the hybrid machine.
     * 
     */
    private final String osName;
    /**
     * Specifies the operating system settings for the hybrid machine.
     * 
     */
    private final @Nullable MachinePropertiesResponseOsProfile osProfile;
    /**
     * Specifies the Operating System product SKU.
     * 
     */
    private final String osSku;
    /**
     * The version of Operating System running on the hybrid machine.
     * 
     */
    private final String osVersion;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The status of the hybrid machine agent.
     * 
     */
    private final String status;
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
    /**
     * Specifies the hybrid machine unique ID.
     * 
     */
    private final @Nullable String vmId;
    /**
     * Specifies the Arc Machine's unique SMBIOS ID
     * 
     */
    private final String vmUuid;

    @OutputCustomType.Constructor({"adFqdn","agentVersion","clientPublicKey","displayName","dnsFqdn","domainName","errorDetails","extensions","id","identity","lastStatusChange","location","locationData","machineFqdn","name","osName","osProfile","osSku","osVersion","provisioningState","status","tags","type","vmId","vmUuid"})
    private GetMachineResult(
        String adFqdn,
        String agentVersion,
        @Nullable String clientPublicKey,
        String displayName,
        String dnsFqdn,
        String domainName,
        List<ErrorDetailResponse> errorDetails,
        List<MachineExtensionInstanceViewResponse> extensions,
        String id,
        @Nullable MachineResponseIdentity identity,
        String lastStatusChange,
        String location,
        @Nullable LocationDataResponse locationData,
        String machineFqdn,
        String name,
        String osName,
        @Nullable MachinePropertiesResponseOsProfile osProfile,
        String osSku,
        String osVersion,
        String provisioningState,
        String status,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String vmId,
        String vmUuid) {
        this.adFqdn = Objects.requireNonNull(adFqdn);
        this.agentVersion = Objects.requireNonNull(agentVersion);
        this.clientPublicKey = clientPublicKey;
        this.displayName = Objects.requireNonNull(displayName);
        this.dnsFqdn = Objects.requireNonNull(dnsFqdn);
        this.domainName = Objects.requireNonNull(domainName);
        this.errorDetails = Objects.requireNonNull(errorDetails);
        this.extensions = Objects.requireNonNull(extensions);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.lastStatusChange = Objects.requireNonNull(lastStatusChange);
        this.location = Objects.requireNonNull(location);
        this.locationData = locationData;
        this.machineFqdn = Objects.requireNonNull(machineFqdn);
        this.name = Objects.requireNonNull(name);
        this.osName = Objects.requireNonNull(osName);
        this.osProfile = osProfile;
        this.osSku = Objects.requireNonNull(osSku);
        this.osVersion = Objects.requireNonNull(osVersion);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.vmId = vmId;
        this.vmUuid = Objects.requireNonNull(vmUuid);
    }

    /**
     * Specifies the AD fully qualified display name.
     * 
    */
    public String getAdFqdn() {
        return this.adFqdn;
    }
    /**
     * The hybrid machine agent full version.
     * 
    */
    public String getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Public Key that the client provides to be used during initial resource onboarding
     * 
    */
    public Optional<String> getClientPublicKey() {
        return Optional.ofNullable(this.clientPublicKey);
    }
    /**
     * Specifies the hybrid machine display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Specifies the DNS fully qualified display name.
     * 
    */
    public String getDnsFqdn() {
        return this.dnsFqdn;
    }
    /**
     * Specifies the Windows domain name.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Details about the error state.
     * 
    */
    public List<ErrorDetailResponse> getErrorDetails() {
        return this.errorDetails;
    }
    /**
     * Machine Extensions information
     * 
    */
    public List<MachineExtensionInstanceViewResponse> getExtensions() {
        return this.extensions;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<MachineResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The time of the last status change.
     * 
    */
    public String getLastStatusChange() {
        return this.lastStatusChange;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Metadata pertaining to the geographic location of the resource.
     * 
    */
    public Optional<LocationDataResponse> getLocationData() {
        return Optional.ofNullable(this.locationData);
    }
    /**
     * Specifies the hybrid machine FQDN.
     * 
    */
    public String getMachineFqdn() {
        return this.machineFqdn;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Operating System running on the hybrid machine.
     * 
    */
    public String getOsName() {
        return this.osName;
    }
    /**
     * Specifies the operating system settings for the hybrid machine.
     * 
    */
    public Optional<MachinePropertiesResponseOsProfile> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Specifies the Operating System product SKU.
     * 
    */
    public String getOsSku() {
        return this.osSku;
    }
    /**
     * The version of Operating System running on the hybrid machine.
     * 
    */
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The status of the hybrid machine agent.
     * 
    */
    public String getStatus() {
        return this.status;
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
    /**
     * Specifies the hybrid machine unique ID.
     * 
    */
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }
    /**
     * Specifies the Arc Machine's unique SMBIOS ID
     * 
    */
    public String getVmUuid() {
        return this.vmUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adFqdn;
        private String agentVersion;
        private @Nullable String clientPublicKey;
        private String displayName;
        private String dnsFqdn;
        private String domainName;
        private List<ErrorDetailResponse> errorDetails;
        private List<MachineExtensionInstanceViewResponse> extensions;
        private String id;
        private @Nullable MachineResponseIdentity identity;
        private String lastStatusChange;
        private String location;
        private @Nullable LocationDataResponse locationData;
        private String machineFqdn;
        private String name;
        private String osName;
        private @Nullable MachinePropertiesResponseOsProfile osProfile;
        private String osSku;
        private String osVersion;
        private String provisioningState;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String vmId;
        private String vmUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adFqdn = defaults.adFqdn;
    	      this.agentVersion = defaults.agentVersion;
    	      this.clientPublicKey = defaults.clientPublicKey;
    	      this.displayName = defaults.displayName;
    	      this.dnsFqdn = defaults.dnsFqdn;
    	      this.domainName = defaults.domainName;
    	      this.errorDetails = defaults.errorDetails;
    	      this.extensions = defaults.extensions;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.location = defaults.location;
    	      this.locationData = defaults.locationData;
    	      this.machineFqdn = defaults.machineFqdn;
    	      this.name = defaults.name;
    	      this.osName = defaults.osName;
    	      this.osProfile = defaults.osProfile;
    	      this.osSku = defaults.osSku;
    	      this.osVersion = defaults.osVersion;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vmId = defaults.vmId;
    	      this.vmUuid = defaults.vmUuid;
        }

        public Builder setAdFqdn(String adFqdn) {
            this.adFqdn = Objects.requireNonNull(adFqdn);
            return this;
        }

        public Builder setAgentVersion(String agentVersion) {
            this.agentVersion = Objects.requireNonNull(agentVersion);
            return this;
        }

        public Builder setClientPublicKey(@Nullable String clientPublicKey) {
            this.clientPublicKey = clientPublicKey;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDnsFqdn(String dnsFqdn) {
            this.dnsFqdn = Objects.requireNonNull(dnsFqdn);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setErrorDetails(List<ErrorDetailResponse> errorDetails) {
            this.errorDetails = Objects.requireNonNull(errorDetails);
            return this;
        }

        public Builder setExtensions(List<MachineExtensionInstanceViewResponse> extensions) {
            this.extensions = Objects.requireNonNull(extensions);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable MachineResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLastStatusChange(String lastStatusChange) {
            this.lastStatusChange = Objects.requireNonNull(lastStatusChange);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocationData(@Nullable LocationDataResponse locationData) {
            this.locationData = locationData;
            return this;
        }

        public Builder setMachineFqdn(String machineFqdn) {
            this.machineFqdn = Objects.requireNonNull(machineFqdn);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsName(String osName) {
            this.osName = Objects.requireNonNull(osName);
            return this;
        }

        public Builder setOsProfile(@Nullable MachinePropertiesResponseOsProfile osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setOsSku(String osSku) {
            this.osSku = Objects.requireNonNull(osSku);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
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

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmUuid(String vmUuid) {
            this.vmUuid = Objects.requireNonNull(vmUuid);
            return this;
        }
        public GetMachineResult build() {
            return new GetMachineResult(adFqdn, agentVersion, clientPublicKey, displayName, dnsFqdn, domainName, errorDetails, extensions, id, identity, lastStatusChange, location, locationData, machineFqdn, name, osName, osProfile, osSku, osVersion, provisioningState, status, tags, type, vmId, vmUuid);
        }
    }
}
