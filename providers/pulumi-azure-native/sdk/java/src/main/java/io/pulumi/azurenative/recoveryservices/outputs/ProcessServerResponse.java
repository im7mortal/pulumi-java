// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MobilityServiceUpdateResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProcessServerResponse {
    /**
     * Agent expiry date.
     * 
     */
    private final @Nullable String agentExpiryDate;
    /**
     * The version of the scout component on the server.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * The agent version details.
     * 
     */
    private final @Nullable VersionDetailsResponse agentVersionDetails;
    /**
     * The available memory.
     * 
     */
    private final @Nullable Double availableMemoryInBytes;
    /**
     * The available space.
     * 
     */
    private final @Nullable Double availableSpaceInBytes;
    /**
     * The percentage of the CPU load.
     * 
     */
    private final @Nullable String cpuLoad;
    /**
     * The CPU load status.
     * 
     */
    private final @Nullable String cpuLoadStatus;
    /**
     * The Process Server's friendly name.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The health of Process Server.
     * 
     */
    private final String health;
    /**
     * Health errors.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrors;
    /**
     * The agent generated Id.
     * 
     */
    private final @Nullable String hostId;
    /**
     * The Process Server Id.
     * 
     */
    private final @Nullable String id;
    /**
     * The IP address of the server.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The last heartbeat received from the server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * The servers configured with this PS.
     * 
     */
    private final @Nullable String machineCount;
    /**
     * The MARS communication status.
     * 
     */
    private final String marsCommunicationStatus;
    /**
     * The MARS registration status.
     * 
     */
    private final String marsRegistrationStatus;
    /**
     * The memory usage status.
     * 
     */
    private final @Nullable String memoryUsageStatus;
    /**
     * The list of the mobility service updates available on the Process Server.
     * 
     */
    private final @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
    /**
     * The OS type of the server.
     * 
     */
    private final @Nullable String osType;
    /**
     * OS Version of the process server. Note: This will get populated if user has CS version greater than 9.12.0.0.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * The PS service status.
     * 
     */
    private final @Nullable String psServiceStatus;
    /**
     * The process server stats refresh time.
     * 
     */
    private final String psStatsRefreshTime;
    /**
     * The number of replication pairs configured in this PS.
     * 
     */
    private final @Nullable String replicationPairCount;
    /**
     * The space usage status.
     * 
     */
    private final @Nullable String spaceUsageStatus;
    /**
     * The PS SSL cert expiry date.
     * 
     */
    private final @Nullable String sslCertExpiryDate;
    /**
     * CS SSL cert expiry date.
     * 
     */
    private final @Nullable Integer sslCertExpiryRemainingDays;
    /**
     * The percentage of the system load.
     * 
     */
    private final @Nullable String systemLoad;
    /**
     * The system load status.
     * 
     */
    private final @Nullable String systemLoadStatus;
    /**
     * The throughput in bytes.
     * 
     */
    private final Double throughputInBytes;
    /**
     * The throughput in MBps.
     * 
     */
    private final Double throughputInMBps;
    /**
     * The throughput status.
     * 
     */
    private final String throughputStatus;
    /**
     * The uploading pending data in bytes.
     * 
     */
    private final Double throughputUploadPendingDataInBytes;
    /**
     * The total memory.
     * 
     */
    private final @Nullable Double totalMemoryInBytes;
    /**
     * The total space.
     * 
     */
    private final @Nullable Double totalSpaceInBytes;
    /**
     * Version status
     * 
     */
    private final @Nullable String versionStatus;

    @OutputCustomType.Constructor({"agentExpiryDate","agentVersion","agentVersionDetails","availableMemoryInBytes","availableSpaceInBytes","cpuLoad","cpuLoadStatus","friendlyName","health","healthErrors","hostId","id","ipAddress","lastHeartbeat","machineCount","marsCommunicationStatus","marsRegistrationStatus","memoryUsageStatus","mobilityServiceUpdates","osType","osVersion","psServiceStatus","psStatsRefreshTime","replicationPairCount","spaceUsageStatus","sslCertExpiryDate","sslCertExpiryRemainingDays","systemLoad","systemLoadStatus","throughputInBytes","throughputInMBps","throughputStatus","throughputUploadPendingDataInBytes","totalMemoryInBytes","totalSpaceInBytes","versionStatus"})
    private ProcessServerResponse(
        @Nullable String agentExpiryDate,
        @Nullable String agentVersion,
        @Nullable VersionDetailsResponse agentVersionDetails,
        @Nullable Double availableMemoryInBytes,
        @Nullable Double availableSpaceInBytes,
        @Nullable String cpuLoad,
        @Nullable String cpuLoadStatus,
        @Nullable String friendlyName,
        String health,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String hostId,
        @Nullable String id,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable String machineCount,
        String marsCommunicationStatus,
        String marsRegistrationStatus,
        @Nullable String memoryUsageStatus,
        @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates,
        @Nullable String osType,
        @Nullable String osVersion,
        @Nullable String psServiceStatus,
        String psStatsRefreshTime,
        @Nullable String replicationPairCount,
        @Nullable String spaceUsageStatus,
        @Nullable String sslCertExpiryDate,
        @Nullable Integer sslCertExpiryRemainingDays,
        @Nullable String systemLoad,
        @Nullable String systemLoadStatus,
        Double throughputInBytes,
        Double throughputInMBps,
        String throughputStatus,
        Double throughputUploadPendingDataInBytes,
        @Nullable Double totalMemoryInBytes,
        @Nullable Double totalSpaceInBytes,
        @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.friendlyName = friendlyName;
        this.health = Objects.requireNonNull(health);
        this.healthErrors = healthErrors;
        this.hostId = hostId;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.machineCount = machineCount;
        this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
        this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
        this.memoryUsageStatus = memoryUsageStatus;
        this.mobilityServiceUpdates = mobilityServiceUpdates;
        this.osType = osType;
        this.osVersion = osVersion;
        this.psServiceStatus = psServiceStatus;
        this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
        this.replicationPairCount = replicationPairCount;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
        this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
        this.throughputStatus = Objects.requireNonNull(throughputStatus);
        this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
    }

    /**
     * Agent expiry date.
     * 
    */
    public Optional<String> getAgentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    /**
     * The version of the scout component on the server.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * The agent version details.
     * 
    */
    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }
    /**
     * The available memory.
     * 
    */
    public Optional<Double> getAvailableMemoryInBytes() {
        return Optional.ofNullable(this.availableMemoryInBytes);
    }
    /**
     * The available space.
     * 
    */
    public Optional<Double> getAvailableSpaceInBytes() {
        return Optional.ofNullable(this.availableSpaceInBytes);
    }
    /**
     * The percentage of the CPU load.
     * 
    */
    public Optional<String> getCpuLoad() {
        return Optional.ofNullable(this.cpuLoad);
    }
    /**
     * The CPU load status.
     * 
    */
    public Optional<String> getCpuLoadStatus() {
        return Optional.ofNullable(this.cpuLoadStatus);
    }
    /**
     * The Process Server's friendly name.
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The health of Process Server.
     * 
    */
    public String getHealth() {
        return this.health;
    }
    /**
     * Health errors.
     * 
    */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    /**
     * The agent generated Id.
     * 
    */
    public Optional<String> getHostId() {
        return Optional.ofNullable(this.hostId);
    }
    /**
     * The Process Server Id.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IP address of the server.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The last heartbeat received from the server.
     * 
    */
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * The servers configured with this PS.
     * 
    */
    public Optional<String> getMachineCount() {
        return Optional.ofNullable(this.machineCount);
    }
    /**
     * The MARS communication status.
     * 
    */
    public String getMarsCommunicationStatus() {
        return this.marsCommunicationStatus;
    }
    /**
     * The MARS registration status.
     * 
    */
    public String getMarsRegistrationStatus() {
        return this.marsRegistrationStatus;
    }
    /**
     * The memory usage status.
     * 
    */
    public Optional<String> getMemoryUsageStatus() {
        return Optional.ofNullable(this.memoryUsageStatus);
    }
    /**
     * The list of the mobility service updates available on the Process Server.
     * 
    */
    public List<MobilityServiceUpdateResponse> getMobilityServiceUpdates() {
        return this.mobilityServiceUpdates == null ? List.of() : this.mobilityServiceUpdates;
    }
    /**
     * The OS type of the server.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * OS Version of the process server. Note: This will get populated if user has CS version greater than 9.12.0.0.
     * 
    */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * The PS service status.
     * 
    */
    public Optional<String> getPsServiceStatus() {
        return Optional.ofNullable(this.psServiceStatus);
    }
    /**
     * The process server stats refresh time.
     * 
    */
    public String getPsStatsRefreshTime() {
        return this.psStatsRefreshTime;
    }
    /**
     * The number of replication pairs configured in this PS.
     * 
    */
    public Optional<String> getReplicationPairCount() {
        return Optional.ofNullable(this.replicationPairCount);
    }
    /**
     * The space usage status.
     * 
    */
    public Optional<String> getSpaceUsageStatus() {
        return Optional.ofNullable(this.spaceUsageStatus);
    }
    /**
     * The PS SSL cert expiry date.
     * 
    */
    public Optional<String> getSslCertExpiryDate() {
        return Optional.ofNullable(this.sslCertExpiryDate);
    }
    /**
     * CS SSL cert expiry date.
     * 
    */
    public Optional<Integer> getSslCertExpiryRemainingDays() {
        return Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }
    /**
     * The percentage of the system load.
     * 
    */
    public Optional<String> getSystemLoad() {
        return Optional.ofNullable(this.systemLoad);
    }
    /**
     * The system load status.
     * 
    */
    public Optional<String> getSystemLoadStatus() {
        return Optional.ofNullable(this.systemLoadStatus);
    }
    /**
     * The throughput in bytes.
     * 
    */
    public Double getThroughputInBytes() {
        return this.throughputInBytes;
    }
    /**
     * The throughput in MBps.
     * 
    */
    public Double getThroughputInMBps() {
        return this.throughputInMBps;
    }
    /**
     * The throughput status.
     * 
    */
    public String getThroughputStatus() {
        return this.throughputStatus;
    }
    /**
     * The uploading pending data in bytes.
     * 
    */
    public Double getThroughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }
    /**
     * The total memory.
     * 
    */
    public Optional<Double> getTotalMemoryInBytes() {
        return Optional.ofNullable(this.totalMemoryInBytes);
    }
    /**
     * The total space.
     * 
    */
    public Optional<Double> getTotalSpaceInBytes() {
        return Optional.ofNullable(this.totalSpaceInBytes);
    }
    /**
     * Version status
     * 
    */
    public Optional<String> getVersionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String friendlyName;
        private String health;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String hostId;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String machineCount;
        private String marsCommunicationStatus;
        private String marsRegistrationStatus;
        private @Nullable String memoryUsageStatus;
        private @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable String psServiceStatus;
        private String psStatsRefreshTime;
        private @Nullable String replicationPairCount;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private Double throughputInBytes;
        private Double throughputInMBps;
        private String throughputStatus;
        private Double throughputUploadPendingDataInBytes;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.friendlyName = defaults.friendlyName;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.hostId = defaults.hostId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.machineCount = defaults.machineCount;
    	      this.marsCommunicationStatus = defaults.marsCommunicationStatus;
    	      this.marsRegistrationStatus = defaults.marsRegistrationStatus;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.mobilityServiceUpdates = defaults.mobilityServiceUpdates;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.psServiceStatus = defaults.psServiceStatus;
    	      this.psStatsRefreshTime = defaults.psStatsRefreshTime;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputInMBps = defaults.throughputInMBps;
    	      this.throughputStatus = defaults.throughputStatus;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder setAgentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setAgentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder setAvailableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder setAvailableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder setCpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }

        public Builder setCpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder setMachineCount(@Nullable String machineCount) {
            this.machineCount = machineCount;
            return this;
        }

        public Builder setMarsCommunicationStatus(String marsCommunicationStatus) {
            this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
            return this;
        }

        public Builder setMarsRegistrationStatus(String marsRegistrationStatus) {
            this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
            return this;
        }

        public Builder setMemoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder setMobilityServiceUpdates(@Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates) {
            this.mobilityServiceUpdates = mobilityServiceUpdates;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder setPsServiceStatus(@Nullable String psServiceStatus) {
            this.psServiceStatus = psServiceStatus;
            return this;
        }

        public Builder setPsStatsRefreshTime(String psStatsRefreshTime) {
            this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
            return this;
        }

        public Builder setReplicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder setSpaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder setSslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder setSslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder setSystemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }

        public Builder setSystemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder setThroughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }

        public Builder setThroughputInMBps(Double throughputInMBps) {
            this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
            return this;
        }

        public Builder setThroughputStatus(String throughputStatus) {
            this.throughputStatus = Objects.requireNonNull(throughputStatus);
            return this;
        }

        public Builder setThroughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }

        public Builder setTotalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder setTotalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder setVersionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public ProcessServerResponse build() {
            return new ProcessServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, friendlyName, health, healthErrors, hostId, id, ipAddress, lastHeartbeat, machineCount, marsCommunicationStatus, marsRegistrationStatus, memoryUsageStatus, mobilityServiceUpdates, osType, osVersion, psServiceStatus, psStatsRefreshTime, replicationPairCount, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, throughputInBytes, throughputInMBps, throughputStatus, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, versionStatus);
        }
    }
}
