// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeploymentInstanceResponse {
    /**
     * Discovery status of the deployment instance
     * 
     */
    private final String discoveryStatus;
    /**
     * Name of the deployment instance
     * 
     */
    private final String name;
    /**
     * Failed reason of the deployment instance
     * 
     */
    private final String reason;
    /**
     * Start time of the deployment instance
     * 
     */
    private final String startTime;
    /**
     * Status of the deployment instance
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"discoveryStatus","name","reason","startTime","status"})
    private DeploymentInstanceResponse(
        String discoveryStatus,
        String name,
        String reason,
        String startTime,
        String status) {
        this.discoveryStatus = Objects.requireNonNull(discoveryStatus);
        this.name = Objects.requireNonNull(name);
        this.reason = Objects.requireNonNull(reason);
        this.startTime = Objects.requireNonNull(startTime);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Discovery status of the deployment instance
     * 
    */
    public String getDiscoveryStatus() {
        return this.discoveryStatus;
    }
    /**
     * Name of the deployment instance
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Failed reason of the deployment instance
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * Start time of the deployment instance
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Status of the deployment instance
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String discoveryStatus;
        private String name;
        private String reason;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discoveryStatus = defaults.discoveryStatus;
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setDiscoveryStatus(String discoveryStatus) {
            this.discoveryStatus = Objects.requireNonNull(discoveryStatus);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DeploymentInstanceResponse build() {
            return new DeploymentInstanceResponse(discoveryStatus, name, reason, startTime, status);
        }
    }
}
