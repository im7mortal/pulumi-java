// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.FuotaTaskLoRaWAN;
import io.pulumi.awsnative.iotwireless.outputs.FuotaTaskTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFuotaTaskResult {
    /**
     * FUOTA task arn. Returned after successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * Multicast group to associate. Only for update request.
     * 
     */
    private final @Nullable String associateMulticastGroup;
    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    private final @Nullable String associateWirelessDevice;
    /**
     * FUOTA task description
     * 
     */
    private final @Nullable String description;
    /**
     * Multicast group to disassociate. Only for update request.
     * 
     */
    private final @Nullable String disassociateMulticastGroup;
    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    private final @Nullable String disassociateWirelessDevice;
    /**
     * FUOTA task firmware update image binary S3 link
     * 
     */
    private final @Nullable String firmwareUpdateImage;
    /**
     * FUOTA task firmware IAM role for reading S3
     * 
     */
    private final @Nullable String firmwareUpdateRole;
    /**
     * FUOTA task status. Returned after successful read.
     * 
     */
    private final @Nullable String fuotaTaskStatus;
    /**
     * FUOTA task id. Returned after successful create.
     * 
     */
    private final @Nullable String id;
    /**
     * FUOTA task LoRaWAN
     * 
     */
    private final @Nullable FuotaTaskLoRaWAN loRaWAN;
    /**
     * Name of FUOTA task
     * 
     */
    private final @Nullable String name;
    /**
     * A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    private final @Nullable List<FuotaTaskTag> tags;

    @OutputCustomType.Constructor({"arn","associateMulticastGroup","associateWirelessDevice","description","disassociateMulticastGroup","disassociateWirelessDevice","firmwareUpdateImage","firmwareUpdateRole","fuotaTaskStatus","id","loRaWAN","name","tags"})
    private GetFuotaTaskResult(
        @Nullable String arn,
        @Nullable String associateMulticastGroup,
        @Nullable String associateWirelessDevice,
        @Nullable String description,
        @Nullable String disassociateMulticastGroup,
        @Nullable String disassociateWirelessDevice,
        @Nullable String firmwareUpdateImage,
        @Nullable String firmwareUpdateRole,
        @Nullable String fuotaTaskStatus,
        @Nullable String id,
        @Nullable FuotaTaskLoRaWAN loRaWAN,
        @Nullable String name,
        @Nullable List<FuotaTaskTag> tags) {
        this.arn = arn;
        this.associateMulticastGroup = associateMulticastGroup;
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateMulticastGroup = disassociateMulticastGroup;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.firmwareUpdateImage = firmwareUpdateImage;
        this.firmwareUpdateRole = firmwareUpdateRole;
        this.fuotaTaskStatus = fuotaTaskStatus;
        this.id = id;
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
    }

    /**
     * FUOTA task arn. Returned after successful create.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Multicast group to associate. Only for update request.
     * 
     */
    public Optional<String> getAssociateMulticastGroup() {
        return Optional.ofNullable(this.associateMulticastGroup);
    }
    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    public Optional<String> getAssociateWirelessDevice() {
        return Optional.ofNullable(this.associateWirelessDevice);
    }
    /**
     * FUOTA task description
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Multicast group to disassociate. Only for update request.
     * 
     */
    public Optional<String> getDisassociateMulticastGroup() {
        return Optional.ofNullable(this.disassociateMulticastGroup);
    }
    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    public Optional<String> getDisassociateWirelessDevice() {
        return Optional.ofNullable(this.disassociateWirelessDevice);
    }
    /**
     * FUOTA task firmware update image binary S3 link
     * 
     */
    public Optional<String> getFirmwareUpdateImage() {
        return Optional.ofNullable(this.firmwareUpdateImage);
    }
    /**
     * FUOTA task firmware IAM role for reading S3
     * 
     */
    public Optional<String> getFirmwareUpdateRole() {
        return Optional.ofNullable(this.firmwareUpdateRole);
    }
    /**
     * FUOTA task status. Returned after successful read.
     * 
     */
    public Optional<String> getFuotaTaskStatus() {
        return Optional.ofNullable(this.fuotaTaskStatus);
    }
    /**
     * FUOTA task id. Returned after successful create.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * FUOTA task LoRaWAN
     * 
     */
    public Optional<FuotaTaskLoRaWAN> getLoRaWAN() {
        return Optional.ofNullable(this.loRaWAN);
    }
    /**
     * Name of FUOTA task
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    public List<FuotaTaskTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFuotaTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String associateMulticastGroup;
        private @Nullable String associateWirelessDevice;
        private @Nullable String description;
        private @Nullable String disassociateMulticastGroup;
        private @Nullable String disassociateWirelessDevice;
        private @Nullable String firmwareUpdateImage;
        private @Nullable String firmwareUpdateRole;
        private @Nullable String fuotaTaskStatus;
        private @Nullable String id;
        private @Nullable FuotaTaskLoRaWAN loRaWAN;
        private @Nullable String name;
        private @Nullable List<FuotaTaskTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFuotaTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associateMulticastGroup = defaults.associateMulticastGroup;
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateMulticastGroup = defaults.disassociateMulticastGroup;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.firmwareUpdateImage = defaults.firmwareUpdateImage;
    	      this.firmwareUpdateRole = defaults.firmwareUpdateRole;
    	      this.fuotaTaskStatus = defaults.fuotaTaskStatus;
    	      this.id = defaults.id;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAssociateMulticastGroup(@Nullable String associateMulticastGroup) {
            this.associateMulticastGroup = associateMulticastGroup;
            return this;
        }

        public Builder setAssociateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisassociateMulticastGroup(@Nullable String disassociateMulticastGroup) {
            this.disassociateMulticastGroup = disassociateMulticastGroup;
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        public Builder setFirmwareUpdateImage(@Nullable String firmwareUpdateImage) {
            this.firmwareUpdateImage = firmwareUpdateImage;
            return this;
        }

        public Builder setFirmwareUpdateRole(@Nullable String firmwareUpdateRole) {
            this.firmwareUpdateRole = firmwareUpdateRole;
            return this;
        }

        public Builder setFuotaTaskStatus(@Nullable String fuotaTaskStatus) {
            this.fuotaTaskStatus = fuotaTaskStatus;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLoRaWAN(@Nullable FuotaTaskLoRaWAN loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<FuotaTaskTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetFuotaTaskResult build() {
            return new GetFuotaTaskResult(arn, associateMulticastGroup, associateWirelessDevice, description, disassociateMulticastGroup, disassociateWirelessDevice, firmwareUpdateImage, firmwareUpdateRole, fuotaTaskStatus, id, loRaWAN, name, tags);
        }
    }
}
