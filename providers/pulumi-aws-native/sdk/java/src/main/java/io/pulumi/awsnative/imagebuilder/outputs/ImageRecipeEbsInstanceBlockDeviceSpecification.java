// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRecipeEbsInstanceBlockDeviceSpecification {
    /**
     * Use to configure delete on termination of the associated device.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Use to configure device encryption.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * Use to configure device IOPS.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Use to configure the KMS key to use when encrypting the device.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The snapshot that defines the device contents.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * For GP3 volumes only – The throughput in MiB/s that the volume supports.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * Use to override the device's volume size.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * Use to override the device's volume type.
     * 
     */
    private final @Nullable ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType;

    @OutputCustomType.Constructor({"deleteOnTermination","encrypted","iops","kmsKeyId","snapshotId","throughput","volumeSize","volumeType"})
    private ImageRecipeEbsInstanceBlockDeviceSpecification(
        @Nullable Boolean deleteOnTermination,
        @Nullable Boolean encrypted,
        @Nullable Integer iops,
        @Nullable String kmsKeyId,
        @Nullable String snapshotId,
        @Nullable Integer throughput,
        @Nullable Integer volumeSize,
        @Nullable ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Use to configure delete on termination of the associated device.
     * 
    */
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Use to configure device encryption.
     * 
    */
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * Use to configure device IOPS.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Use to configure the KMS key to use when encrypting the device.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The snapshot that defines the device contents.
     * 
    */
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * For GP3 volumes only – The throughput in MiB/s that the volume supports.
     * 
    */
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * Use to override the device's volume size.
     * 
    */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * Use to override the device's volume type.
     * 
    */
    public Optional<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeEbsInstanceBlockDeviceSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeEbsInstanceBlockDeviceSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public ImageRecipeEbsInstanceBlockDeviceSpecification build() {
            return new ImageRecipeEbsInstanceBlockDeviceSpecification(deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
