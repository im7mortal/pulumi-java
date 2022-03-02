// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricValueStatus;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceMetricStatus {
    /**
     * current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * Name is the name of the resource in question.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"current","name"})
    private ResourceMetricStatus(
        MetricValueStatus current,
        String name) {
        this.current = Objects.requireNonNull(current);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * current contains the current value for the given metric
     * 
    */
    public MetricValueStatus getCurrent() {
        return this.current;
    }
    /**
     * Name is the name of the resource in question.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatus current;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder setCurrent(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ResourceMetricStatus build() {
            return new ResourceMetricStatus(current, name);
        }
    }
}
