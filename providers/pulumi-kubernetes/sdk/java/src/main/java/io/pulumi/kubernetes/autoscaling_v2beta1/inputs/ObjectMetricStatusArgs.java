// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetricStatusArgs Empty = new ObjectMetricStatusArgs();

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @InputImport(name="averageValue")
    private final @Nullable Input<String> averageValue;

    public Input<String> getAverageValue() {
        return this.averageValue == null ? Input.empty() : this.averageValue;
    }

    /**
     * currentValue is the current value of the metric (as a quantity).
     * 
     */
    @InputImport(name="currentValue", required=true)
    private final Input<String> currentValue;

    public Input<String> getCurrentValue() {
        return this.currentValue;
    }

    /**
     * metricName is the name of the metric in question.
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @InputImport(name="selector")
    private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    /**
     * target is the described Kubernetes object.
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<CrossVersionObjectReferenceArgs> target;

    public Input<CrossVersionObjectReferenceArgs> getTarget() {
        return this.target;
    }

    public ObjectMetricStatusArgs(
        @Nullable Input<String> averageValue,
        Input<String> currentValue,
        Input<String> metricName,
        @Nullable Input<LabelSelectorArgs> selector,
        Input<CrossVersionObjectReferenceArgs> target) {
        this.averageValue = averageValue;
        this.currentValue = Objects.requireNonNull(currentValue, "expected parameter 'currentValue' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.selector = selector;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ObjectMetricStatusArgs() {
        this.averageValue = Input.empty();
        this.currentValue = Input.empty();
        this.metricName = Input.empty();
        this.selector = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> averageValue;
        private Input<String> currentValue;
        private Input<String> metricName;
        private @Nullable Input<LabelSelectorArgs> selector;
        private Input<CrossVersionObjectReferenceArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.currentValue = defaults.currentValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
        }

        public Builder setAverageValue(@Nullable Input<String> averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder setAverageValue(@Nullable String averageValue) {
            this.averageValue = Input.ofNullable(averageValue);
            return this;
        }

        public Builder setCurrentValue(Input<String> currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }

        public Builder setCurrentValue(String currentValue) {
            this.currentValue = Input.of(Objects.requireNonNull(currentValue));
            return this;
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

        public Builder setTarget(Input<CrossVersionObjectReferenceArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(CrossVersionObjectReferenceArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }

        public ObjectMetricStatusArgs build() {
            return new ObjectMetricStatusArgs(averageValue, currentValue, metricName, selector, target);
        }
    }
}
