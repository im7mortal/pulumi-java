// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.LaunchTemplateBlockDeviceMappingEbs;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchTemplateBlockDeviceMapping {
    /**
     * The name of the device to mount.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Configure EBS volume properties.
     * 
     */
    private final @Nullable LaunchTemplateBlockDeviceMappingEbs ebs;
    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
     */
    private final @Nullable String noDevice;
    /**
     * The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `"ephemeral0"`).
     * 
     */
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor({"deviceName","ebs","noDevice","virtualName"})
    private LaunchTemplateBlockDeviceMapping(
        @Nullable String deviceName,
        @Nullable LaunchTemplateBlockDeviceMappingEbs ebs,
        @Nullable String noDevice,
        @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The name of the device to mount.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Configure EBS volume properties.
     * 
    */
    public Optional<LaunchTemplateBlockDeviceMappingEbs> getEbs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
    */
    public Optional<String> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `"ephemeral0"`).
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable LaunchTemplateBlockDeviceMappingEbs ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setEbs(@Nullable LaunchTemplateBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setNoDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public LaunchTemplateBlockDeviceMapping build() {
            return new LaunchTemplateBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
