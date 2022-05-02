// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDetailsResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloneJobResponse {
    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
    /**
     * @return The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    private final String createTime;
    /**
     * @return The time the clone job was ended.
     * 
     */
    private final String endTime;
    /**
     * @return Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The name of the clone.
     * 
     */
    private final String name;
    /**
     * @return State of the clone job.
     * 
     */
    private final String state;
    /**
     * @return The time the state was last updated.
     * 
     */
    private final String stateTime;

    @CustomType.Constructor
    private CloneJobResponse(
        @CustomType.Parameter("computeEngineTargetDetails") ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateTime") String stateTime) {
        this.computeEngineTargetDetails = computeEngineTargetDetails;
        this.createTime = createTime;
        this.endTime = endTime;
        this.error = error;
        this.name = name;
        this.state = state;
        this.stateTime = stateTime;
    }

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public ComputeEngineTargetDetailsResponse computeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * @return The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time the clone job was ended.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The name of the clone.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the clone job.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the state was last updated.
     * 
     */
    public String stateTime() {
        return this.stateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private String endTime;
        private StatusResponse error;
        private String name;
        private String state;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder computeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }        public CloneJobResponse build() {
            return new CloneJobResponse(computeEngineTargetDetails, createTime, endTime, error, name, state, stateTime);
        }
    }
}
