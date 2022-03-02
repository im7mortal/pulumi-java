// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyStepScalingPolicyConfigurationStepAdjustment {
    /**
     * The lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
     * 
     */
    private final @Nullable String metricIntervalLowerBound;
    /**
     * The upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
     * 
     */
    private final @Nullable String metricIntervalUpperBound;
    /**
     * The number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
     * 
     */
    private final Integer scalingAdjustment;

    @OutputCustomType.Constructor({"metricIntervalLowerBound","metricIntervalUpperBound","scalingAdjustment"})
    private PolicyStepScalingPolicyConfigurationStepAdjustment(
        @Nullable String metricIntervalLowerBound,
        @Nullable String metricIntervalUpperBound,
        Integer scalingAdjustment) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
        this.metricIntervalUpperBound = metricIntervalUpperBound;
        this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment);
    }

    /**
     * The lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
     * 
    */
    public Optional<String> getMetricIntervalLowerBound() {
        return Optional.ofNullable(this.metricIntervalLowerBound);
    }
    /**
     * The upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
     * 
    */
    public Optional<String> getMetricIntervalUpperBound() {
        return Optional.ofNullable(this.metricIntervalUpperBound);
    }
    /**
     * The number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
     * 
    */
    public Integer getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStepScalingPolicyConfigurationStepAdjustment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String metricIntervalLowerBound;
        private @Nullable String metricIntervalUpperBound;
        private Integer scalingAdjustment;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStepScalingPolicyConfigurationStepAdjustment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricIntervalLowerBound = defaults.metricIntervalLowerBound;
    	      this.metricIntervalUpperBound = defaults.metricIntervalUpperBound;
    	      this.scalingAdjustment = defaults.scalingAdjustment;
        }

        public Builder setMetricIntervalLowerBound(@Nullable String metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }

        public Builder setMetricIntervalUpperBound(@Nullable String metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }

        public Builder setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment);
            return this;
        }
        public PolicyStepScalingPolicyConfigurationStepAdjustment build() {
            return new PolicyStepScalingPolicyConfigurationStepAdjustment(metricIntervalLowerBound, metricIntervalUpperBound, scalingAdjustment);
        }
    }
}
