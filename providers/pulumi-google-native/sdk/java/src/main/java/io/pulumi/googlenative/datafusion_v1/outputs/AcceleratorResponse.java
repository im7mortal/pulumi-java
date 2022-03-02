// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1.outputs;

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
    /**
     * The state of the accelerator
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"acceleratorType","state"})
    private AcceleratorResponse(
        String acceleratorType,
        String state) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The type of an accelator for a CDF instance.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }
    /**
     * The state of the accelerator
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.state = defaults.state;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public AcceleratorResponse build() {
            return new AcceleratorResponse(acceleratorType, state);
        }
    }
}
