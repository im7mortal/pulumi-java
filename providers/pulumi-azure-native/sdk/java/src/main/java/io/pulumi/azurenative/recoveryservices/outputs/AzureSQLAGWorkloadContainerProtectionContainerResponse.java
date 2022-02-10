// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureWorkloadContainerExtendedInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureSQLAGWorkloadContainerProtectionContainerResponse {
    private final @Nullable String backupManagementType;
    private final String containerType;
    private final @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;
    private final @Nullable String friendlyName;
    private final @Nullable String healthStatus;
    private final @Nullable String lastUpdatedTime;
    private final @Nullable String operationType;
    private final @Nullable String registrationStatus;
    private final @Nullable String sourceResourceId;
    private final @Nullable String workloadType;

    @OutputCustomType.Constructor({"backupManagementType","containerType","extendedInfo","friendlyName","healthStatus","lastUpdatedTime","operationType","registrationStatus","sourceResourceId","workloadType"})
    private AzureSQLAGWorkloadContainerProtectionContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String lastUpdatedTime,
        @Nullable String operationType,
        @Nullable String registrationStatus,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType);
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.lastUpdatedTime = lastUpdatedTime;
        this.operationType = operationType;
        this.registrationStatus = registrationStatus;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    public String getContainerType() {
        return this.containerType;
    }
    public Optional<AzureWorkloadContainerExtendedInfoResponse> getExtendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public Optional<String> getHealthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<String> getOperationType() {
        return Optional.ofNullable(this.operationType);
    }
    public Optional<String> getRegistrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    public Optional<String> getWorkloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSQLAGWorkloadContainerProtectionContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String lastUpdatedTime;
        private @Nullable String operationType;
        private @Nullable String registrationStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSQLAGWorkloadContainerProtectionContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.operationType = defaults.operationType;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setOperationType(@Nullable String operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public AzureSQLAGWorkloadContainerProtectionContainerResponse build() {
            return new AzureSQLAGWorkloadContainerProtectionContainerResponse(backupManagementType, containerType, extendedInfo, friendlyName, healthStatus, lastUpdatedTime, operationType, registrationStatus, sourceResourceId, workloadType);
        }
    }
}