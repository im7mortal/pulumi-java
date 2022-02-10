// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.MountTargetPropertiesResponse;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseDataProtection;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseExportPolicy;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVolumeResult {
    private final @Nullable String backupId;
    private final String baremetalTenantId;
    private final String creationToken;
    private final @Nullable VolumePropertiesResponseDataProtection dataProtection;
    private final @Nullable String encryptionKeySource;
    private final @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
    private final String fileSystemId;
    private final String id;
    private final @Nullable Boolean isRestoring;
    private final @Nullable Boolean kerberosEnabled;
    private final @Nullable Boolean ldapEnabled;
    private final String location;
    private final List<MountTargetPropertiesResponse> mountTargets;
    private final String name;
    private final @Nullable List<String> protocolTypes;
    private final String provisioningState;
    private final @Nullable String securityStyle;
    private final @Nullable String serviceLevel;
    private final @Nullable Boolean smbContinuouslyAvailable;
    private final @Nullable Boolean smbEncryption;
    private final @Nullable Boolean snapshotDirectoryVisible;
    private final @Nullable String snapshotId;
    private final String subnetId;
    private final @Nullable Map<String,String> tags;
    private final @Nullable Double throughputMibps;
    private final String type;
    private final Double usageThreshold;
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"backupId","baremetalTenantId","creationToken","dataProtection","encryptionKeySource","exportPolicy","fileSystemId","id","isRestoring","kerberosEnabled","ldapEnabled","location","mountTargets","name","protocolTypes","provisioningState","securityStyle","serviceLevel","smbContinuouslyAvailable","smbEncryption","snapshotDirectoryVisible","snapshotId","subnetId","tags","throughputMibps","type","usageThreshold","volumeType"})
    private GetVolumeResult(
        @Nullable String backupId,
        String baremetalTenantId,
        String creationToken,
        @Nullable VolumePropertiesResponseDataProtection dataProtection,
        @Nullable String encryptionKeySource,
        @Nullable VolumePropertiesResponseExportPolicy exportPolicy,
        String fileSystemId,
        String id,
        @Nullable Boolean isRestoring,
        @Nullable Boolean kerberosEnabled,
        @Nullable Boolean ldapEnabled,
        String location,
        List<MountTargetPropertiesResponse> mountTargets,
        String name,
        @Nullable List<String> protocolTypes,
        String provisioningState,
        @Nullable String securityStyle,
        @Nullable String serviceLevel,
        @Nullable Boolean smbContinuouslyAvailable,
        @Nullable Boolean smbEncryption,
        @Nullable Boolean snapshotDirectoryVisible,
        @Nullable String snapshotId,
        String subnetId,
        @Nullable Map<String,String> tags,
        @Nullable Double throughputMibps,
        String type,
        Double usageThreshold,
        @Nullable String volumeType) {
        this.backupId = backupId;
        this.baremetalTenantId = Objects.requireNonNull(baremetalTenantId);
        this.creationToken = Objects.requireNonNull(creationToken);
        this.dataProtection = dataProtection;
        this.encryptionKeySource = encryptionKeySource;
        this.exportPolicy = exportPolicy;
        this.fileSystemId = Objects.requireNonNull(fileSystemId);
        this.id = Objects.requireNonNull(id);
        this.isRestoring = isRestoring;
        this.kerberosEnabled = kerberosEnabled;
        this.ldapEnabled = ldapEnabled;
        this.location = Objects.requireNonNull(location);
        this.mountTargets = Objects.requireNonNull(mountTargets);
        this.name = Objects.requireNonNull(name);
        this.protocolTypes = protocolTypes;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.securityStyle = securityStyle;
        this.serviceLevel = serviceLevel;
        this.smbContinuouslyAvailable = smbContinuouslyAvailable;
        this.smbEncryption = smbEncryption;
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        this.snapshotId = snapshotId;
        this.subnetId = Objects.requireNonNull(subnetId);
        this.tags = tags;
        this.throughputMibps = throughputMibps;
        this.type = Objects.requireNonNull(type);
        this.usageThreshold = Objects.requireNonNull(usageThreshold);
        this.volumeType = volumeType;
    }

    public Optional<String> getBackupId() {
        return Optional.ofNullable(this.backupId);
    }
    public String getBaremetalTenantId() {
        return this.baremetalTenantId;
    }
    public String getCreationToken() {
        return this.creationToken;
    }
    public Optional<VolumePropertiesResponseDataProtection> getDataProtection() {
        return Optional.ofNullable(this.dataProtection);
    }
    public Optional<String> getEncryptionKeySource() {
        return Optional.ofNullable(this.encryptionKeySource);
    }
    public Optional<VolumePropertiesResponseExportPolicy> getExportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIsRestoring() {
        return Optional.ofNullable(this.isRestoring);
    }
    public Optional<Boolean> getKerberosEnabled() {
        return Optional.ofNullable(this.kerberosEnabled);
    }
    public Optional<Boolean> getLdapEnabled() {
        return Optional.ofNullable(this.ldapEnabled);
    }
    public String getLocation() {
        return this.location;
    }
    public List<MountTargetPropertiesResponse> getMountTargets() {
        return this.mountTargets;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getProtocolTypes() {
        return this.protocolTypes == null ? List.of() : this.protocolTypes;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSecurityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }
    public Optional<String> getServiceLevel() {
        return Optional.ofNullable(this.serviceLevel);
    }
    public Optional<Boolean> getSmbContinuouslyAvailable() {
        return Optional.ofNullable(this.smbContinuouslyAvailable);
    }
    public Optional<Boolean> getSmbEncryption() {
        return Optional.ofNullable(this.smbEncryption);
    }
    public Optional<Boolean> getSnapshotDirectoryVisible() {
        return Optional.ofNullable(this.snapshotDirectoryVisible);
    }
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    public String getSubnetId() {
        return this.subnetId;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<Double> getThroughputMibps() {
        return Optional.ofNullable(this.throughputMibps);
    }
    public String getType() {
        return this.type;
    }
    public Double getUsageThreshold() {
        return this.usageThreshold;
    }
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupId;
        private String baremetalTenantId;
        private String creationToken;
        private @Nullable VolumePropertiesResponseDataProtection dataProtection;
        private @Nullable String encryptionKeySource;
        private @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
        private String fileSystemId;
        private String id;
        private @Nullable Boolean isRestoring;
        private @Nullable Boolean kerberosEnabled;
        private @Nullable Boolean ldapEnabled;
        private String location;
        private List<MountTargetPropertiesResponse> mountTargets;
        private String name;
        private @Nullable List<String> protocolTypes;
        private String provisioningState;
        private @Nullable String securityStyle;
        private @Nullable String serviceLevel;
        private @Nullable Boolean smbContinuouslyAvailable;
        private @Nullable Boolean smbEncryption;
        private @Nullable Boolean snapshotDirectoryVisible;
        private @Nullable String snapshotId;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable Double throughputMibps;
        private String type;
        private Double usageThreshold;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.baremetalTenantId = defaults.baremetalTenantId;
    	      this.creationToken = defaults.creationToken;
    	      this.dataProtection = defaults.dataProtection;
    	      this.encryptionKeySource = defaults.encryptionKeySource;
    	      this.exportPolicy = defaults.exportPolicy;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.isRestoring = defaults.isRestoring;
    	      this.kerberosEnabled = defaults.kerberosEnabled;
    	      this.ldapEnabled = defaults.ldapEnabled;
    	      this.location = defaults.location;
    	      this.mountTargets = defaults.mountTargets;
    	      this.name = defaults.name;
    	      this.protocolTypes = defaults.protocolTypes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityStyle = defaults.securityStyle;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.smbContinuouslyAvailable = defaults.smbContinuouslyAvailable;
    	      this.smbEncryption = defaults.smbEncryption;
    	      this.snapshotDirectoryVisible = defaults.snapshotDirectoryVisible;
    	      this.snapshotId = defaults.snapshotId;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.throughputMibps = defaults.throughputMibps;
    	      this.type = defaults.type;
    	      this.usageThreshold = defaults.usageThreshold;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setBackupId(@Nullable String backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder setBaremetalTenantId(String baremetalTenantId) {
            this.baremetalTenantId = Objects.requireNonNull(baremetalTenantId);
            return this;
        }

        public Builder setCreationToken(String creationToken) {
            this.creationToken = Objects.requireNonNull(creationToken);
            return this;
        }

        public Builder setDataProtection(@Nullable VolumePropertiesResponseDataProtection dataProtection) {
            this.dataProtection = dataProtection;
            return this;
        }

        public Builder setEncryptionKeySource(@Nullable String encryptionKeySource) {
            this.encryptionKeySource = encryptionKeySource;
            return this;
        }

        public Builder setExportPolicy(@Nullable VolumePropertiesResponseExportPolicy exportPolicy) {
            this.exportPolicy = exportPolicy;
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsRestoring(@Nullable Boolean isRestoring) {
            this.isRestoring = isRestoring;
            return this;
        }

        public Builder setKerberosEnabled(@Nullable Boolean kerberosEnabled) {
            this.kerberosEnabled = kerberosEnabled;
            return this;
        }

        public Builder setLdapEnabled(@Nullable Boolean ldapEnabled) {
            this.ldapEnabled = ldapEnabled;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMountTargets(List<MountTargetPropertiesResponse> mountTargets) {
            this.mountTargets = Objects.requireNonNull(mountTargets);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocolTypes(@Nullable List<String> protocolTypes) {
            this.protocolTypes = protocolTypes;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecurityStyle(@Nullable String securityStyle) {
            this.securityStyle = securityStyle;
            return this;
        }

        public Builder setServiceLevel(@Nullable String serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }

        public Builder setSmbContinuouslyAvailable(@Nullable Boolean smbContinuouslyAvailable) {
            this.smbContinuouslyAvailable = smbContinuouslyAvailable;
            return this;
        }

        public Builder setSmbEncryption(@Nullable Boolean smbEncryption) {
            this.smbEncryption = smbEncryption;
            return this;
        }

        public Builder setSnapshotDirectoryVisible(@Nullable Boolean snapshotDirectoryVisible) {
            this.snapshotDirectoryVisible = snapshotDirectoryVisible;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThroughputMibps(@Nullable Double throughputMibps) {
            this.throughputMibps = throughputMibps;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsageThreshold(Double usageThreshold) {
            this.usageThreshold = Objects.requireNonNull(usageThreshold);
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public GetVolumeResult build() {
            return new GetVolumeResult(backupId, baremetalTenantId, creationToken, dataProtection, encryptionKeySource, exportPolicy, fileSystemId, id, isRestoring, kerberosEnabled, ldapEnabled, location, mountTargets, name, protocolTypes, provisioningState, securityStyle, serviceLevel, smbContinuouslyAvailable, smbEncryption, snapshotDirectoryVisible, snapshotId, subnetId, tags, throughputMibps, type, usageThreshold, volumeType);
        }
    }
}