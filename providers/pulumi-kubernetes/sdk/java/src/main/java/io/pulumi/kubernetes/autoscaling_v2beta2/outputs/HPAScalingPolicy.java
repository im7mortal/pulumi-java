// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HPAScalingPolicy {
    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    private final Integer periodSeconds;
    /**
     * Type is used to specify the scaling policy.
     * 
     */
    private final String type;
    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    private final Integer value;

    @OutputCustomType.Constructor({"periodSeconds","type","value"})
    private HPAScalingPolicy(
        Integer periodSeconds,
        String type,
        Integer value) {
        this.periodSeconds = Objects.requireNonNull(periodSeconds);
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }
    /**
     * Type is used to specify the scaling policy.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer periodSeconds;
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(HPAScalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = Objects.requireNonNull(periodSeconds);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public HPAScalingPolicy build() {
            return new HPAScalingPolicy(periodSeconds, type, value);
        }
    }
}
