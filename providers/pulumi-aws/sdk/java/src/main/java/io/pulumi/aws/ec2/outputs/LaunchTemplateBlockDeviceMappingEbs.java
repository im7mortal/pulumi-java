// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchTemplateBlockDeviceMappingEbs {
    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `false` if not set. See [Preserving Amazon EBS Volumes on Instance Termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination) for more information.
     * 
     */
    private final @Nullable String deleteOnTermination;
    /**
     * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
     * on the volume (Default: `false`). Cannot be used with `snapshot_id`.
     * 
     */
    private final @Nullable String encrypted;
    /**
     * The amount of provisioned
     * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
     * This must be set with a `volume_type` of `"io1/io2"`.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted volume.
     * `encrypted` must be set to `true` when this is set.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The Snapshot ID to mount.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * The throughput to provision for a `gp3` volume in MiB/s (specified as an integer, e.g., 500), with a maximum of 1,000 MiB/s.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * The size of the volume in gigabytes.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * The volume type. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"deleteOnTermination","encrypted","iops","kmsKeyId","snapshotId","throughput","volumeSize","volumeType"})
    private LaunchTemplateBlockDeviceMappingEbs(
        @Nullable String deleteOnTermination,
        @Nullable String encrypted,
        @Nullable Integer iops,
        @Nullable String kmsKeyId,
        @Nullable String snapshotId,
        @Nullable Integer throughput,
        @Nullable Integer volumeSize,
        @Nullable String volumeType) {
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
     * Whether the volume should be destroyed on instance termination. Defaults to `false` if not set. See [Preserving Amazon EBS Volumes on Instance Termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination) for more information.
     * 
    */
    public Optional<String> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
     * on the volume (Default: `false`). Cannot be used with `snapshot_id`.
     * 
    */
    public Optional<String> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * The amount of provisioned
     * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
     * This must be set with a `volume_type` of `"io1/io2"`.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted volume.
     * `encrypted` must be set to `true` when this is set.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The Snapshot ID to mount.
     * 
    */
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * The throughput to provision for a `gp3` volume in MiB/s (specified as an integer, e.g., 500), with a maximum of 1,000 MiB/s.
     * 
    */
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * The size of the volume in gigabytes.
     * 
    */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * The volume type. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateBlockDeviceMappingEbs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOnTermination;
        private @Nullable String encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateBlockDeviceMappingEbs defaults) {
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

        public Builder setDeleteOnTermination(@Nullable String deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setEncrypted(@Nullable String encrypted) {
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

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public LaunchTemplateBlockDeviceMappingEbs build() {
            return new LaunchTemplateBlockDeviceMappingEbs(deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
