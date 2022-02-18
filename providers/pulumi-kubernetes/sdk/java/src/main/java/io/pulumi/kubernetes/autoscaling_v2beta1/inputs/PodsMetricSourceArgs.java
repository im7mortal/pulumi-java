// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 * 
 */
public final class PodsMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricSourceArgs Empty = new PodsMetricSourceArgs();

    /**
     * metricName is the name of the metric in question
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    @InputImport(name="selector")
    private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    /**
     * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @InputImport(name="targetAverageValue", required=true)
    private final Input<String> targetAverageValue;

    public Input<String> getTargetAverageValue() {
        return this.targetAverageValue;
    }

    public PodsMetricSourceArgs(
        Input<String> metricName,
        @Nullable Input<LabelSelectorArgs> selector,
        Input<String> targetAverageValue) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.selector = selector;
        this.targetAverageValue = Objects.requireNonNull(targetAverageValue, "expected parameter 'targetAverageValue' to be non-null");
    }

    private PodsMetricSourceArgs() {
        this.metricName = Input.empty();
        this.selector = Input.empty();
        this.targetAverageValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> metricName;
        private @Nullable Input<LabelSelectorArgs> selector;
        private Input<String> targetAverageValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setSelector(@Nullable Input<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setTargetAverageValue(Input<String> targetAverageValue) {
            this.targetAverageValue = Objects.requireNonNull(targetAverageValue);
            return this;
        }

        public Builder setTargetAverageValue(String targetAverageValue) {
            this.targetAverageValue = Input.of(Objects.requireNonNull(targetAverageValue));
            return this;
        }

        public PodsMetricSourceArgs build() {
            return new PodsMetricSourceArgs(metricName, selector, targetAverageValue);
        }
    }
}
