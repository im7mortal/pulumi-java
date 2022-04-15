// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * 
 */
public final class PodsMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricStatusArgs Empty = new PodsMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @Import(name="current", required=true)
      private final Output<MetricValueStatusArgs> current;

    public Output<MetricValueStatusArgs> current() {
        return this.current;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
      private final Output<MetricIdentifierArgs> metric;

    public Output<MetricIdentifierArgs> metric() {
        return this.metric;
    }

    public PodsMetricStatusArgs(
        Output<MetricValueStatusArgs> current,
        Output<MetricIdentifierArgs> metric) {
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private PodsMetricStatusArgs() {
        this.current = Codegen.empty();
        this.metric = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MetricValueStatusArgs> current;
        private Output<MetricIdentifierArgs> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        public Builder current(Output<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }
        public Builder current(MetricValueStatusArgs current) {
            this.current = Output.of(Objects.requireNonNull(current));
            return this;
        }
        public Builder metric(Output<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public Builder metric(MetricIdentifierArgs metric) {
            this.metric = Output.of(Objects.requireNonNull(metric));
            return this;
        }        public PodsMetricStatusArgs build() {
            return new PodsMetricStatusArgs(current, metric);
        }
    }
}
