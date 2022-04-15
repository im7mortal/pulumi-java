// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class IDRange {
    /**
     * max is the end of the range, inclusive.
     * 
     */
    private final Integer max;
    /**
     * min is the start of the range, inclusive.
     * 
     */
    private final Integer min;

    @CustomType.Constructor
    private IDRange(
        @CustomType.Parameter("max") Integer max,
        @CustomType.Parameter("min") Integer min) {
        this.max = max;
        this.min = min;
    }

    /**
     * max is the end of the range, inclusive.
     * 
    */
    public Integer max() {
        return this.max;
    }
    /**
     * min is the start of the range, inclusive.
     * 
    */
    public Integer min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IDRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer max;
        private Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(IDRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }        public IDRange build() {
            return new IDRange(max, min);
        }
    }
}
