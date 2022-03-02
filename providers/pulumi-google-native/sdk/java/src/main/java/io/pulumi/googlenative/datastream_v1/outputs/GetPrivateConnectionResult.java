// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.ErrorResponse;
import io.pulumi.googlenative.datastream_v1.outputs.VpcPeeringConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetPrivateConnectionResult {
    /**
     * The create time of the resource.
     * 
     */
    private final String createTime;
    /**
     * Display name.
     * 
     */
    private final String displayName;
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
     */
    private final ErrorResponse error;
    /**
     * Labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource's name.
     * 
     */
    private final String name;
    /**
     * The state of the Private Connection.
     * 
     */
    private final String state;
    /**
     * The update time of the resource.
     * 
     */
    private final String updateTime;
    /**
     * VPC Peering Config.
     * 
     */
    private final VpcPeeringConfigResponse vpcPeeringConfig;

    @OutputCustomType.Constructor({"createTime","displayName","error","labels","name","state","updateTime","vpcPeeringConfig"})
    private GetPrivateConnectionResult(
        String createTime,
        String displayName,
        ErrorResponse error,
        Map<String,String> labels,
        String name,
        String state,
        String updateTime,
        VpcPeeringConfigResponse vpcPeeringConfig) {
        this.createTime = Objects.requireNonNull(createTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.error = Objects.requireNonNull(error);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.vpcPeeringConfig = Objects.requireNonNull(vpcPeeringConfig);
    }

    /**
     * The create time of the resource.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
    */
    public ErrorResponse getError() {
        return this.error;
    }
    /**
     * Labels.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource's name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the Private Connection.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The update time of the resource.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * VPC Peering Config.
     * 
    */
    public VpcPeeringConfigResponse getVpcPeeringConfig() {
        return this.vpcPeeringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private ErrorResponse error;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        private VpcPeeringConfigResponse vpcPeeringConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.vpcPeeringConfig = defaults.vpcPeeringConfig;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setError(ErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVpcPeeringConfig(VpcPeeringConfigResponse vpcPeeringConfig) {
            this.vpcPeeringConfig = Objects.requireNonNull(vpcPeeringConfig);
            return this;
        }
        public GetPrivateConnectionResult build() {
            return new GetPrivateConnectionResult(createTime, displayName, error, labels, name, state, updateTime, vpcPeeringConfig);
        }
    }
}
