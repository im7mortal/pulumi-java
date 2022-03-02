// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TaskDefinitionInferenceAccelerator {
    /**
     * Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    private final String deviceName;
    /**
     * Elastic Inference accelerator type to use.
     * 
     */
    private final String deviceType;

    @OutputCustomType.Constructor({"deviceName","deviceType"})
    private TaskDefinitionInferenceAccelerator(
        String deviceName,
        String deviceType) {
        this.deviceName = Objects.requireNonNull(deviceName);
        this.deviceType = Objects.requireNonNull(deviceType);
    }

    /**
     * Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Elastic Inference accelerator type to use.
     * 
    */
    public String getDeviceType() {
        return this.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String deviceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }
        public TaskDefinitionInferenceAccelerator build() {
            return new TaskDefinitionInferenceAccelerator(deviceName, deviceType);
        }
    }
}
