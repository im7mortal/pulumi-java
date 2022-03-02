// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AcceleratorConfigResponse {
    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    private final Integer acceleratorCount;
    /**
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * 
     */
    private final String acceleratorType;

    @OutputCustomType.Constructor({"acceleratorCount","acceleratorType"})
    private AcceleratorConfigResponse(
        Integer acceleratorCount,
        String acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
        this.acceleratorType = Objects.requireNonNull(acceleratorType);
    }

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
    */
    public Integer getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(acceleratorCount, acceleratorType);
        }
    }
}
