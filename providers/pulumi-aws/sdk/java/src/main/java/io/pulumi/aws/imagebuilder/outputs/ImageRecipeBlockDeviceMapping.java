// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.ImageRecipeBlockDeviceMappingEbs;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRecipeBlockDeviceMapping {
    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * 
     */
    private final @Nullable ImageRecipeBlockDeviceMappingEbs ebs;
    /**
     * Set to `true` to remove a mapping from the parent image.
     * 
     */
    private final @Nullable Boolean noDevice;
    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor({"deviceName","ebs","noDevice","virtualName"})
    private ImageRecipeBlockDeviceMapping(
        @Nullable String deviceName,
        @Nullable ImageRecipeBlockDeviceMappingEbs ebs,
        @Nullable Boolean noDevice,
        @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * 
    */
    public Optional<ImageRecipeBlockDeviceMappingEbs> getEbs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * Set to `true` to remove a mapping from the parent image.
     * 
    */
    public Optional<Boolean> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable ImageRecipeBlockDeviceMappingEbs ebs;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeBlockDeviceMapping defaults) {
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

        public Builder setEbs(@Nullable ImageRecipeBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setNoDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public ImageRecipeBlockDeviceMapping build() {
            return new ImageRecipeBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
