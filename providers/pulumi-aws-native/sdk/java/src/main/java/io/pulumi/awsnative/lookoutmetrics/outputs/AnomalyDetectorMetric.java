// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricAggregationFunction;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnomalyDetectorMetric {
    /**
     * Operator used to aggregate metric values
     * 
     */
    private final AnomalyDetectorMetricAggregationFunction aggregationFunction;
    private final String metricName;
    private final @Nullable String namespace;

    @OutputCustomType.Constructor({"aggregationFunction","metricName","namespace"})
    private AnomalyDetectorMetric(
        AnomalyDetectorMetricAggregationFunction aggregationFunction,
        String metricName,
        @Nullable String namespace) {
        this.aggregationFunction = Objects.requireNonNull(aggregationFunction);
        this.metricName = Objects.requireNonNull(metricName);
        this.namespace = namespace;
    }

    /**
     * Operator used to aggregate metric values
     * 
    */
    public AnomalyDetectorMetricAggregationFunction getAggregationFunction() {
        return this.aggregationFunction;
    }
    public String getMetricName() {
        return this.metricName;
    }
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricAggregationFunction aggregationFunction;
        private String metricName;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationFunction = defaults.aggregationFunction;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
        }

        public Builder setAggregationFunction(AnomalyDetectorMetricAggregationFunction aggregationFunction) {
            this.aggregationFunction = Objects.requireNonNull(aggregationFunction);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public AnomalyDetectorMetric build() {
            return new AnomalyDetectorMetric(aggregationFunction, metricName, namespace);
        }
    }
}
