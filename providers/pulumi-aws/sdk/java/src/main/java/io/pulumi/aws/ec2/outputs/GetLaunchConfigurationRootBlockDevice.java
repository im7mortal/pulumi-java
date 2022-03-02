// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchConfigurationRootBlockDevice {
    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    private final Boolean deleteOnTermination;
    /**
     * Whether the volume is Encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * The provisioned IOPs of the volume.
     * 
     */
    private final Integer iops;
    /**
     * The Throughput of the volume.
     * 
     */
    private final Boolean throughput;
    /**
     * The Size of the volume.
     * 
     */
    private final Integer volumeSize;
    /**
     * The Type of the volume.
     * 
     */
    private final String volumeType;

    @OutputCustomType.Constructor({"deleteOnTermination","encrypted","iops","throughput","volumeSize","volumeType"})
    private GetLaunchConfigurationRootBlockDevice(
        Boolean deleteOnTermination,
        Boolean encrypted,
        Integer iops,
        Boolean throughput,
        Integer volumeSize,
        String volumeType) {
        this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
        this.encrypted = Objects.requireNonNull(encrypted);
        this.iops = Objects.requireNonNull(iops);
        this.throughput = Objects.requireNonNull(throughput);
        this.volumeSize = Objects.requireNonNull(volumeSize);
        this.volumeType = Objects.requireNonNull(volumeType);
    }

    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
    */
    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * Whether the volume is Encrypted.
     * 
    */
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * The provisioned IOPs of the volume.
     * 
    */
    public Integer getIops() {
        return this.iops;
    }
    /**
     * The Throughput of the volume.
     * 
    */
    public Boolean getThroughput() {
        return this.throughput;
    }
    /**
     * The Size of the volume.
     * 
    */
    public Integer getVolumeSize() {
        return this.volumeSize;
    }
    /**
     * The Type of the volume.
     * 
    */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private Boolean encrypted;
        private Integer iops;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder setThroughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }

        public Builder setVolumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetLaunchConfigurationRootBlockDevice build() {
            return new GetLaunchConfigurationRootBlockDevice(deleteOnTermination, encrypted, iops, throughput, volumeSize, volumeType);
        }
    }
}
