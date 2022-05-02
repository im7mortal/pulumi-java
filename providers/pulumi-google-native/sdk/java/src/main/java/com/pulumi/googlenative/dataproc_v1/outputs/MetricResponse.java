// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricResponse {
    /**
     * @return Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
     * 
     */
    private final List<String> metricOverrides;
    /**
     * @return MetricSource that should be enabled
     * 
     */
    private final String metricSource;

    @CustomType.Constructor
    private MetricResponse(
        @CustomType.Parameter("metricOverrides") List<String> metricOverrides,
        @CustomType.Parameter("metricSource") String metricSource) {
        this.metricOverrides = metricOverrides;
        this.metricSource = metricSource;
    }

    /**
     * @return Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
     * 
     */
    public List<String> metricOverrides() {
        return this.metricOverrides;
    }
    /**
     * @return MetricSource that should be enabled
     * 
     */
    public String metricSource() {
        return this.metricSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> metricOverrides;
        private String metricSource;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricOverrides = defaults.metricOverrides;
    	      this.metricSource = defaults.metricSource;
        }

        public Builder metricOverrides(List<String> metricOverrides) {
            this.metricOverrides = Objects.requireNonNull(metricOverrides);
            return this;
        }
        public Builder metricOverrides(String... metricOverrides) {
            return metricOverrides(List.of(metricOverrides));
        }
        public Builder metricSource(String metricSource) {
            this.metricSource = Objects.requireNonNull(metricSource);
            return this;
        }        public MetricResponse build() {
            return new MetricResponse(metricOverrides, metricSource);
        }
    }
}
