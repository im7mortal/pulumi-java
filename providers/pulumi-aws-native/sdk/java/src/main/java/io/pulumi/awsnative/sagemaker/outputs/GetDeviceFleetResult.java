// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DeviceFleetEdgeOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.DeviceFleetTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeviceFleetResult {
    /**
     * Description for the edge device fleet
     * 
     */
    private final @Nullable String description;
    /**
     * S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    private final @Nullable DeviceFleetEdgeOutputConfig outputConfig;
    /**
     * Role associated with the device fleet
     * 
     */
    private final @Nullable String roleArn;
    /**
     * Associate tags with the resource
     * 
     */
    private final @Nullable List<DeviceFleetTag> tags;

    @OutputCustomType.Constructor({"description","outputConfig","roleArn","tags"})
    private GetDeviceFleetResult(
        @Nullable String description,
        @Nullable DeviceFleetEdgeOutputConfig outputConfig,
        @Nullable String roleArn,
        @Nullable List<DeviceFleetTag> tags) {
        this.description = description;
        this.outputConfig = outputConfig;
        this.roleArn = roleArn;
        this.tags = tags;
    }

    /**
     * Description for the edge device fleet
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
    */
    public Optional<DeviceFleetEdgeOutputConfig> getOutputConfig() {
        return Optional.ofNullable(this.outputConfig);
    }
    /**
     * Role associated with the device fleet
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * Associate tags with the resource
     * 
    */
    public List<DeviceFleetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable DeviceFleetEdgeOutputConfig outputConfig;
        private @Nullable String roleArn;
        private @Nullable List<DeviceFleetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setOutputConfig(@Nullable DeviceFleetEdgeOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setTags(@Nullable List<DeviceFleetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDeviceFleetResult build() {
            return new GetDeviceFleetResult(description, outputConfig, roleArn, tags);
        }
    }
}
