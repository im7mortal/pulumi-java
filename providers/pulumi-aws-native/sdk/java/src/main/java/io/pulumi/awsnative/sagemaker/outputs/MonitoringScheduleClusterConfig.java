// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitoringScheduleClusterConfig {
    /**
     * The number of ML compute instances to use in the model monitoring job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
     * 
     */
    private final Integer instanceCount;
    /**
     * The ML compute instance type for the processing job.
     * 
     */
    private final String instanceType;
    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     * 
     */
    private final @Nullable String volumeKmsKeyId;
    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
     * 
     */
    private final Integer volumeSizeInGB;

    @OutputCustomType.Constructor({"instanceCount","instanceType","volumeKmsKeyId","volumeSizeInGB"})
    private MonitoringScheduleClusterConfig(
        Integer instanceCount,
        String instanceType,
        @Nullable String volumeKmsKeyId,
        Integer volumeSizeInGB) {
        this.instanceCount = Objects.requireNonNull(instanceCount);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.volumeKmsKeyId = volumeKmsKeyId;
        this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
    }

    /**
     * The number of ML compute instances to use in the model monitoring job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
     * 
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }
    /**
     * The ML compute instance type for the processing job.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     * 
     */
    public Optional<String> getVolumeKmsKeyId() {
        return Optional.ofNullable(this.volumeKmsKeyId);
    }
    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
     * 
     */
    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instanceCount;
        private String instanceType;
        private @Nullable String volumeKmsKeyId;
        private Integer volumeSizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.volumeKmsKeyId = defaults.volumeKmsKeyId;
    	      this.volumeSizeInGB = defaults.volumeSizeInGB;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setVolumeKmsKeyId(@Nullable String volumeKmsKeyId) {
            this.volumeKmsKeyId = volumeKmsKeyId;
            return this;
        }

        public Builder setVolumeSizeInGB(Integer volumeSizeInGB) {
            this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
            return this;
        }

        public MonitoringScheduleClusterConfig build() {
            return new MonitoringScheduleClusterConfig(instanceCount, instanceType, volumeKmsKeyId, volumeSizeInGB);
        }
    }
}
