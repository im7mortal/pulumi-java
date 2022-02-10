// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtNicDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtProtectedDiskDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareCbtMigrationDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareCbtMigrationDetailsResponse Empty = new VMwareCbtMigrationDetailsResponse();

    @InputImport(name="dataMoverRunAsAccountId", required=true)
    private final String dataMoverRunAsAccountId;

    public String getDataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }

    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    @InputImport(name="lastRecoveryPointReceived", required=true)
    private final String lastRecoveryPointReceived;

    public String getLastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

    @InputImport(name="licenseType")
    private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    @InputImport(name="migrationRecoveryPointId", required=true)
    private final String migrationRecoveryPointId;

    public String getMigrationRecoveryPointId() {
        return this.migrationRecoveryPointId;
    }

    @InputImport(name="osType", required=true)
    private final String osType;

    public String getOsType() {
        return this.osType;
    }

    @InputImport(name="protectedDisks")
    private final @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks;

    public List<VMwareCbtProtectedDiskDetailsResponse> getProtectedDisks() {
        return this.protectedDisks == null ? List.of() : this.protectedDisks;
    }

    @InputImport(name="snapshotRunAsAccountId", required=true)
    private final String snapshotRunAsAccountId;

    public String getSnapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    @InputImport(name="targetAvailabilitySetId")
    private final @Nullable String targetAvailabilitySetId;

    public Optional<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Optional.empty() : Optional.ofNullable(this.targetAvailabilitySetId);
    }

    @InputImport(name="targetBootDiagnosticsStorageAccountId")
    private final @Nullable String targetBootDiagnosticsStorageAccountId;

    public Optional<String> getTargetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.targetBootDiagnosticsStorageAccountId);
    }

    @InputImport(name="targetLocation", required=true)
    private final String targetLocation;

    public String getTargetLocation() {
        return this.targetLocation;
    }

    @InputImport(name="targetNetworkId")
    private final @Nullable String targetNetworkId;

    public Optional<String> getTargetNetworkId() {
        return this.targetNetworkId == null ? Optional.empty() : Optional.ofNullable(this.targetNetworkId);
    }

    @InputImport(name="targetResourceGroupId")
    private final @Nullable String targetResourceGroupId;

    public Optional<String> getTargetResourceGroupId() {
        return this.targetResourceGroupId == null ? Optional.empty() : Optional.ofNullable(this.targetResourceGroupId);
    }

    @InputImport(name="targetVmName")
    private final @Nullable String targetVmName;

    public Optional<String> getTargetVmName() {
        return this.targetVmName == null ? Optional.empty() : Optional.ofNullable(this.targetVmName);
    }

    @InputImport(name="targetVmSize")
    private final @Nullable String targetVmSize;

    public Optional<String> getTargetVmSize() {
        return this.targetVmSize == null ? Optional.empty() : Optional.ofNullable(this.targetVmSize);
    }

    @InputImport(name="vmNics")
    private final @Nullable List<VMwareCbtNicDetailsResponse> vmNics;

    public List<VMwareCbtNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }

    @InputImport(name="vmwareMachineId", required=true)
    private final String vmwareMachineId;

    public String getVmwareMachineId() {
        return this.vmwareMachineId;
    }

    public VMwareCbtMigrationDetailsResponse(
        String dataMoverRunAsAccountId,
        String instanceType,
        String lastRecoveryPointReceived,
        @Nullable String licenseType,
        String migrationRecoveryPointId,
        String osType,
        @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks,
        String snapshotRunAsAccountId,
        @Nullable String targetAvailabilitySetId,
        @Nullable String targetBootDiagnosticsStorageAccountId,
        String targetLocation,
        @Nullable String targetNetworkId,
        @Nullable String targetResourceGroupId,
        @Nullable String targetVmName,
        @Nullable String targetVmSize,
        @Nullable List<VMwareCbtNicDetailsResponse> vmNics,
        String vmwareMachineId) {
        this.dataMoverRunAsAccountId = Objects.requireNonNull(dataMoverRunAsAccountId, "expected parameter 'dataMoverRunAsAccountId' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived, "expected parameter 'lastRecoveryPointReceived' to be non-null");
        this.licenseType = licenseType;
        this.migrationRecoveryPointId = Objects.requireNonNull(migrationRecoveryPointId, "expected parameter 'migrationRecoveryPointId' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.protectedDisks = protectedDisks;
        this.snapshotRunAsAccountId = Objects.requireNonNull(snapshotRunAsAccountId, "expected parameter 'snapshotRunAsAccountId' to be non-null");
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        this.targetLocation = Objects.requireNonNull(targetLocation, "expected parameter 'targetLocation' to be non-null");
        this.targetNetworkId = targetNetworkId;
        this.targetResourceGroupId = targetResourceGroupId;
        this.targetVmName = targetVmName;
        this.targetVmSize = targetVmSize;
        this.vmNics = vmNics;
        this.vmwareMachineId = Objects.requireNonNull(vmwareMachineId, "expected parameter 'vmwareMachineId' to be non-null");
    }

    private VMwareCbtMigrationDetailsResponse() {
        this.dataMoverRunAsAccountId = null;
        this.instanceType = null;
        this.lastRecoveryPointReceived = null;
        this.licenseType = null;
        this.migrationRecoveryPointId = null;
        this.osType = null;
        this.protectedDisks = List.of();
        this.snapshotRunAsAccountId = null;
        this.targetAvailabilitySetId = null;
        this.targetBootDiagnosticsStorageAccountId = null;
        this.targetLocation = null;
        this.targetNetworkId = null;
        this.targetResourceGroupId = null;
        this.targetVmName = null;
        this.targetVmSize = null;
        this.vmNics = List.of();
        this.vmwareMachineId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtMigrationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataMoverRunAsAccountId;
        private String instanceType;
        private String lastRecoveryPointReceived;
        private @Nullable String licenseType;
        private String migrationRecoveryPointId;
        private String osType;
        private @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks;
        private String snapshotRunAsAccountId;
        private @Nullable String targetAvailabilitySetId;
        private @Nullable String targetBootDiagnosticsStorageAccountId;
        private String targetLocation;
        private @Nullable String targetNetworkId;
        private @Nullable String targetResourceGroupId;
        private @Nullable String targetVmName;
        private @Nullable String targetVmSize;
        private @Nullable List<VMwareCbtNicDetailsResponse> vmNics;
        private String vmwareMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtMigrationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataMoverRunAsAccountId = defaults.dataMoverRunAsAccountId;
    	      this.instanceType = defaults.instanceType;
    	      this.lastRecoveryPointReceived = defaults.lastRecoveryPointReceived;
    	      this.licenseType = defaults.licenseType;
    	      this.migrationRecoveryPointId = defaults.migrationRecoveryPointId;
    	      this.osType = defaults.osType;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.snapshotRunAsAccountId = defaults.snapshotRunAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.vmNics = defaults.vmNics;
    	      this.vmwareMachineId = defaults.vmwareMachineId;
        }

        public Builder setDataMoverRunAsAccountId(String dataMoverRunAsAccountId) {
            this.dataMoverRunAsAccountId = Objects.requireNonNull(dataMoverRunAsAccountId);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLastRecoveryPointReceived(String lastRecoveryPointReceived) {
            this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived);
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setMigrationRecoveryPointId(String migrationRecoveryPointId) {
            this.migrationRecoveryPointId = Objects.requireNonNull(migrationRecoveryPointId);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setProtectedDisks(@Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = protectedDisks;
            return this;
        }

        public Builder setSnapshotRunAsAccountId(String snapshotRunAsAccountId) {
            this.snapshotRunAsAccountId = Objects.requireNonNull(snapshotRunAsAccountId);
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder setTargetBootDiagnosticsStorageAccountId(@Nullable String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }

        public Builder setTargetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }

        public Builder setTargetNetworkId(@Nullable String targetNetworkId) {
            this.targetNetworkId = targetNetworkId;
            return this;
        }

        public Builder setTargetResourceGroupId(@Nullable String targetResourceGroupId) {
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        public Builder setTargetVmName(@Nullable String targetVmName) {
            this.targetVmName = targetVmName;
            return this;
        }

        public Builder setTargetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }

        public Builder setVmNics(@Nullable List<VMwareCbtNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }

        public Builder setVmwareMachineId(String vmwareMachineId) {
            this.vmwareMachineId = Objects.requireNonNull(vmwareMachineId);
            return this;
        }

        public VMwareCbtMigrationDetailsResponse build() {
            return new VMwareCbtMigrationDetailsResponse(dataMoverRunAsAccountId, instanceType, lastRecoveryPointReceived, licenseType, migrationRecoveryPointId, osType, protectedDisks, snapshotRunAsAccountId, targetAvailabilitySetId, targetBootDiagnosticsStorageAccountId, targetLocation, targetNetworkId, targetResourceGroupId, targetVmName, targetVmSize, vmNics, vmwareMachineId);
        }
    }
}