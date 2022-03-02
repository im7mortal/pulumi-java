// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"max","min"})
    private IDRange(
        Integer max,
        Integer min) {
        this.max = Objects.requireNonNull(max);
        this.min = Objects.requireNonNull(min);
    }

    /**
     * max is the end of the range, inclusive.
     * 
    */
    public Integer getMax() {
        return this.max;
    }
    /**
     * min is the start of the range, inclusive.
     * 
    */
    public Integer getMin() {
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

        public Builder setMax(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMin(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public IDRange build() {
            return new IDRange(max, min);
        }
    }
}
