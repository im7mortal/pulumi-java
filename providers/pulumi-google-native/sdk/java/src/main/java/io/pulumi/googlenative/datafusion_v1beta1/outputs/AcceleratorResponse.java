// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AcceleratorResponse {
    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    private final String acceleratorType;

    @OutputCustomType.Constructor({"acceleratorType"})
    private AcceleratorResponse(String acceleratorType) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType);
    }

    /**
     * The type of an accelator for a CDF instance.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public AcceleratorResponse build() {
            return new AcceleratorResponse(acceleratorType);
        }
    }
}
