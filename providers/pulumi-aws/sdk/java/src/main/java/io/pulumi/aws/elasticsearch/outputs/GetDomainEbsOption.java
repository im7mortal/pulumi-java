// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDomainEbsOption {
    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    private final Boolean ebsEnabled;
    /**
     * The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
     * 
     */
    private final Integer iops;
    /**
     * The size of EBS volumes attached to data nodes (in GB).
     * 
     */
    private final Integer volumeSize;
    /**
     * The type of EBS volumes attached to data nodes.
     * 
     */
    private final String volumeType;

    @OutputCustomType.Constructor({"ebsEnabled","iops","volumeSize","volumeType"})
    private GetDomainEbsOption(
        Boolean ebsEnabled,
        Integer iops,
        Integer volumeSize,
        String volumeType) {
        this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
        this.iops = Objects.requireNonNull(iops);
        this.volumeSize = Objects.requireNonNull(volumeSize);
        this.volumeType = Objects.requireNonNull(volumeType);
    }

    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
    */
    public Boolean getEbsEnabled() {
        return this.ebsEnabled;
    }
    /**
     * The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
     * 
    */
    public Integer getIops() {
        return this.iops;
    }
    /**
     * The size of EBS volumes attached to data nodes (in GB).
     * 
    */
    public Integer getVolumeSize() {
        return this.volumeSize;
    }
    /**
     * The type of EBS volumes attached to data nodes.
     * 
    */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainEbsOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ebsEnabled;
        private Integer iops;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainEbsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ebsEnabled = defaults.ebsEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setEbsEnabled(Boolean ebsEnabled) {
            this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
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
        public GetDomainEbsOption build() {
            return new GetDomainEbsOption(ebsEnabled, iops, volumeSize, volumeType);
        }
    }
}
