// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ProcessServerDetailsResponse {
    /**
     * The available memory.
     * 
     */
    private final Double availableMemoryInBytes;
    /**
     * The available disk space.
     * 
     */
    private final Double availableSpaceInBytes;
    /**
     * The free disk space percentage.
     * 
     */
    private final Double freeSpacePercentage;
    /**
     * The health of the process server.
     * 
     */
    private final String health;
    /**
     * The health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * The historic health of the process server based on the health in last 24 hours.
     * 
     */
    private final String historicHealth;
    /**
     * The process server Id.
     * 
     */
    private final String id;
    /**
     * The last heartbeat received from the process server.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * The memory usage percentage.
     * 
     */
    private final Double memoryUsagePercentage;
    /**
     * The process server name.
     * 
     */
    private final String name;
    /**
     * The processor usage percentage.
     * 
     */
    private final Double processorUsagePercentage;
    /**
     * The throughput in bytes.
     * 
     */
    private final Double throughputInBytes;
    /**
     * The uploading pending data in bytes.
     * 
     */
    private final Double throughputUploadPendingDataInBytes;
    /**
     * The total memory.
     * 
     */
    private final Double totalMemoryInBytes;
    /**
     * The total disk space.
     * 
     */
    private final Double totalSpaceInBytes;
    /**
     * The used memory.
     * 
     */
    private final Double usedMemoryInBytes;
    /**
     * The used disk space.
     * 
     */
    private final Double usedSpaceInBytes;
    /**
     * The process server version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"availableMemoryInBytes","availableSpaceInBytes","freeSpacePercentage","health","healthErrors","historicHealth","id","lastHeartbeatUtc","memoryUsagePercentage","name","processorUsagePercentage","throughputInBytes","throughputUploadPendingDataInBytes","totalMemoryInBytes","totalSpaceInBytes","usedMemoryInBytes","usedSpaceInBytes","version"})
    private ProcessServerDetailsResponse(
        Double availableMemoryInBytes,
        Double availableSpaceInBytes,
        Double freeSpacePercentage,
        String health,
        List<HealthErrorResponse> healthErrors,
        String historicHealth,
        String id,
        String lastHeartbeatUtc,
        Double memoryUsagePercentage,
        String name,
        Double processorUsagePercentage,
        Double throughputInBytes,
        Double throughputUploadPendingDataInBytes,
        Double totalMemoryInBytes,
        Double totalSpaceInBytes,
        Double usedMemoryInBytes,
        Double usedSpaceInBytes,
        String version) {
        this.availableMemoryInBytes = Objects.requireNonNull(availableMemoryInBytes);
        this.availableSpaceInBytes = Objects.requireNonNull(availableSpaceInBytes);
        this.freeSpacePercentage = Objects.requireNonNull(freeSpacePercentage);
        this.health = Objects.requireNonNull(health);
        this.healthErrors = Objects.requireNonNull(healthErrors);
        this.historicHealth = Objects.requireNonNull(historicHealth);
        this.id = Objects.requireNonNull(id);
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
        this.memoryUsagePercentage = Objects.requireNonNull(memoryUsagePercentage);
        this.name = Objects.requireNonNull(name);
        this.processorUsagePercentage = Objects.requireNonNull(processorUsagePercentage);
        this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
        this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
        this.totalMemoryInBytes = Objects.requireNonNull(totalMemoryInBytes);
        this.totalSpaceInBytes = Objects.requireNonNull(totalSpaceInBytes);
        this.usedMemoryInBytes = Objects.requireNonNull(usedMemoryInBytes);
        this.usedSpaceInBytes = Objects.requireNonNull(usedSpaceInBytes);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The available memory.
     * 
    */
    public Double getAvailableMemoryInBytes() {
        return this.availableMemoryInBytes;
    }
    /**
     * The available disk space.
     * 
    */
    public Double getAvailableSpaceInBytes() {
        return this.availableSpaceInBytes;
    }
    /**
     * The free disk space percentage.
     * 
    */
    public Double getFreeSpacePercentage() {
        return this.freeSpacePercentage;
    }
    /**
     * The health of the process server.
     * 
    */
    public String getHealth() {
        return this.health;
    }
    /**
     * The health errors.
     * 
    */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors;
    }
    /**
     * The historic health of the process server based on the health in last 24 hours.
     * 
    */
    public String getHistoricHealth() {
        return this.historicHealth;
    }
    /**
     * The process server Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last heartbeat received from the process server.
     * 
    */
    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * The memory usage percentage.
     * 
    */
    public Double getMemoryUsagePercentage() {
        return this.memoryUsagePercentage;
    }
    /**
     * The process server name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The processor usage percentage.
     * 
    */
    public Double getProcessorUsagePercentage() {
        return this.processorUsagePercentage;
    }
    /**
     * The throughput in bytes.
     * 
    */
    public Double getThroughputInBytes() {
        return this.throughputInBytes;
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
    public Double getTotalMemoryInBytes() {
        return this.totalMemoryInBytes;
    }
    /**
     * The total disk space.
     * 
    */
    public Double getTotalSpaceInBytes() {
        return this.totalSpaceInBytes;
    }
    /**
     * The used memory.
     * 
    */
    public Double getUsedMemoryInBytes() {
        return this.usedMemoryInBytes;
    }
    /**
     * The used disk space.
     * 
    */
    public Double getUsedSpaceInBytes() {
        return this.usedSpaceInBytes;
    }
    /**
     * The process server version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double availableMemoryInBytes;
        private Double availableSpaceInBytes;
        private Double freeSpacePercentage;
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String historicHealth;
        private String id;
        private String lastHeartbeatUtc;
        private Double memoryUsagePercentage;
        private String name;
        private Double processorUsagePercentage;
        private Double throughputInBytes;
        private Double throughputUploadPendingDataInBytes;
        private Double totalMemoryInBytes;
        private Double totalSpaceInBytes;
        private Double usedMemoryInBytes;
        private Double usedSpaceInBytes;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.freeSpacePercentage = defaults.freeSpacePercentage;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.historicHealth = defaults.historicHealth;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.memoryUsagePercentage = defaults.memoryUsagePercentage;
    	      this.name = defaults.name;
    	      this.processorUsagePercentage = defaults.processorUsagePercentage;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.usedMemoryInBytes = defaults.usedMemoryInBytes;
    	      this.usedSpaceInBytes = defaults.usedSpaceInBytes;
    	      this.version = defaults.version;
        }

        public Builder setAvailableMemoryInBytes(Double availableMemoryInBytes) {
            this.availableMemoryInBytes = Objects.requireNonNull(availableMemoryInBytes);
            return this;
        }

        public Builder setAvailableSpaceInBytes(Double availableSpaceInBytes) {
            this.availableSpaceInBytes = Objects.requireNonNull(availableSpaceInBytes);
            return this;
        }

        public Builder setFreeSpacePercentage(Double freeSpacePercentage) {
            this.freeSpacePercentage = Objects.requireNonNull(freeSpacePercentage);
            return this;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }

        public Builder setHistoricHealth(String historicHealth) {
            this.historicHealth = Objects.requireNonNull(historicHealth);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setMemoryUsagePercentage(Double memoryUsagePercentage) {
            this.memoryUsagePercentage = Objects.requireNonNull(memoryUsagePercentage);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProcessorUsagePercentage(Double processorUsagePercentage) {
            this.processorUsagePercentage = Objects.requireNonNull(processorUsagePercentage);
            return this;
        }

        public Builder setThroughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }

        public Builder setThroughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }

        public Builder setTotalMemoryInBytes(Double totalMemoryInBytes) {
            this.totalMemoryInBytes = Objects.requireNonNull(totalMemoryInBytes);
            return this;
        }

        public Builder setTotalSpaceInBytes(Double totalSpaceInBytes) {
            this.totalSpaceInBytes = Objects.requireNonNull(totalSpaceInBytes);
            return this;
        }

        public Builder setUsedMemoryInBytes(Double usedMemoryInBytes) {
            this.usedMemoryInBytes = Objects.requireNonNull(usedMemoryInBytes);
            return this;
        }

        public Builder setUsedSpaceInBytes(Double usedSpaceInBytes) {
            this.usedSpaceInBytes = Objects.requireNonNull(usedSpaceInBytes);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ProcessServerDetailsResponse build() {
            return new ProcessServerDetailsResponse(availableMemoryInBytes, availableSpaceInBytes, freeSpacePercentage, health, healthErrors, historicHealth, id, lastHeartbeatUtc, memoryUsagePercentage, name, processorUsagePercentage, throughputInBytes, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, usedMemoryInBytes, usedSpaceInBytes, version);
        }
    }
}
