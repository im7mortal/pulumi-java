// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterPropertiesResponse {
    /**
     * Represents the number of streaming units currently being used on the cluster.
     * 
     */
    private final Integer capacityAllocated;
    /**
     * Represents the sum of the SUs of all streaming jobs associated with the cluster. If all of the jobs were running, this would be the capacity allocated.
     * 
     */
    private final Integer capacityAssigned;
    /**
     * Unique identifier for the cluster.
     * 
     */
    private final String clusterId;
    /**
     * The date this cluster was created.
     * 
     */
    private final String createdDate;
    /**
     * The status of the cluster provisioning. The three terminal states are: Succeeded, Failed and Canceled
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"capacityAllocated","capacityAssigned","clusterId","createdDate","provisioningState"})
    private ClusterPropertiesResponse(
        Integer capacityAllocated,
        Integer capacityAssigned,
        String clusterId,
        String createdDate,
        String provisioningState) {
        this.capacityAllocated = Objects.requireNonNull(capacityAllocated);
        this.capacityAssigned = Objects.requireNonNull(capacityAssigned);
        this.clusterId = Objects.requireNonNull(clusterId);
        this.createdDate = Objects.requireNonNull(createdDate);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Represents the number of streaming units currently being used on the cluster.
     * 
    */
    public Integer getCapacityAllocated() {
        return this.capacityAllocated;
    }
    /**
     * Represents the sum of the SUs of all streaming jobs associated with the cluster. If all of the jobs were running, this would be the capacity allocated.
     * 
    */
    public Integer getCapacityAssigned() {
        return this.capacityAssigned;
    }
    /**
     * Unique identifier for the cluster.
     * 
    */
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * The date this cluster was created.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The status of the cluster provisioning. The three terminal states are: Succeeded, Failed and Canceled
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacityAllocated;
        private Integer capacityAssigned;
        private String clusterId;
        private String createdDate;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityAllocated = defaults.capacityAllocated;
    	      this.capacityAssigned = defaults.capacityAssigned;
    	      this.clusterId = defaults.clusterId;
    	      this.createdDate = defaults.createdDate;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setCapacityAllocated(Integer capacityAllocated) {
            this.capacityAllocated = Objects.requireNonNull(capacityAllocated);
            return this;
        }

        public Builder setCapacityAssigned(Integer capacityAssigned) {
            this.capacityAssigned = Objects.requireNonNull(capacityAssigned);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ClusterPropertiesResponse build() {
            return new ClusterPropertiesResponse(capacityAllocated, capacityAssigned, clusterId, createdDate, provisioningState);
        }
    }
}
