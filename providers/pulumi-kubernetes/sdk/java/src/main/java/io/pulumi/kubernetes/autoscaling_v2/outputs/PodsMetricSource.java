// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricIdentifier;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricTarget;
import java.util.Objects;

@OutputCustomType
public final class PodsMetricSource {
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    private final MetricIdentifier metric;
    /**
     * target specifies the target value for the given metric
     * 
     */
    private final MetricTarget target;

    @OutputCustomType.Constructor({"metric","target"})
    private PodsMetricSource(
        MetricIdentifier metric,
        MetricTarget target) {
        this.metric = Objects.requireNonNull(metric);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * metric identifies the target metric by name and selector
     * 
    */
    public MetricIdentifier getMetric() {
        return this.metric;
    }
    /**
     * target specifies the target value for the given metric
     * 
    */
    public MetricTarget getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricIdentifier metric;
        private MetricTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder setMetric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setTarget(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public PodsMetricSource build() {
            return new PodsMetricSource(metric, target);
        }
    }
}
