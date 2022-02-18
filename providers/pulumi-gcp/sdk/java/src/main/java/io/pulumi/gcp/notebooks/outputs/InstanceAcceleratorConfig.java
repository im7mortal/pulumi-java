// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceAcceleratorConfig {
    /**
     * Count of cores of this accelerator.
     * 
     */
    private final Integer coreCount;
    /**
     * Type of this accelerator.
     * Possible values are `ACCELERATOR_TYPE_UNSPECIFIED`, `NVIDIA_TESLA_K80`, `NVIDIA_TESLA_P100`, `NVIDIA_TESLA_V100`, `NVIDIA_TESLA_P4`, `NVIDIA_TESLA_T4`, `NVIDIA_TESLA_T4_VWS`, `NVIDIA_TESLA_P100_VWS`, `NVIDIA_TESLA_P4_VWS`, `NVIDIA_TESLA_A100`, `TPU_V2`, and `TPU_V3`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"coreCount","type"})
    private InstanceAcceleratorConfig(
        Integer coreCount,
        String type) {
        this.coreCount = Objects.requireNonNull(coreCount);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Count of cores of this accelerator.
     * 
     */
    public Integer getCoreCount() {
        return this.coreCount;
    }
    /**
     * Type of this accelerator.
     * Possible values are `ACCELERATOR_TYPE_UNSPECIFIED`, `NVIDIA_TESLA_K80`, `NVIDIA_TESLA_P100`, `NVIDIA_TESLA_V100`, `NVIDIA_TESLA_P4`, `NVIDIA_TESLA_T4`, `NVIDIA_TESLA_T4_VWS`, `NVIDIA_TESLA_P100_VWS`, `NVIDIA_TESLA_P4_VWS`, `NVIDIA_TESLA_A100`, `TPU_V2`, and `TPU_V3`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAcceleratorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer coreCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAcceleratorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder setCoreCount(Integer coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public InstanceAcceleratorConfig build() {
            return new InstanceAcceleratorConfig(coreCount, type);
        }
    }
}