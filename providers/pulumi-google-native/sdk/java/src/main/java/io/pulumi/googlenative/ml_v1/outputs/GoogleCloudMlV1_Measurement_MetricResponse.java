// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_Measurement_MetricResponse {
    /**
     * Metric name.
     * 
     */
    private final String metric;
    /**
     * The value for this metric.
     * 
     */
    private final Double value;

    @OutputCustomType.Constructor({"metric","value"})
    private GoogleCloudMlV1_Measurement_MetricResponse(
        String metric,
        Double value) {
        this.metric = Objects.requireNonNull(metric);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Metric name.
     * 
    */
    public String getMetric() {
        return this.metric;
    }
    /**
     * The value for this metric.
     * 
    */
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_Measurement_MetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metric;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_Measurement_MetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.value = defaults.value;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudMlV1_Measurement_MetricResponse build() {
            return new GoogleCloudMlV1_Measurement_MetricResponse(metric, value);
        }
    }
}
