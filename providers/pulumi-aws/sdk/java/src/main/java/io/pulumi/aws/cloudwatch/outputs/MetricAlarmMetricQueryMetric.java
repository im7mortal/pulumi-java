// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricAlarmMetricQueryMetric {
    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final @Nullable Map<String,String> dimensions;
    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final String metricName;
    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final @Nullable String namespace;
    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    private final Integer period;
    /**
     * The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    private final String stat;
    /**
     * The unit for this metric.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor({"dimensions","metricName","namespace","period","stat","unit"})
    private MetricAlarmMetricQueryMetric(
        @Nullable Map<String,String> dimensions,
        String metricName,
        @Nullable String namespace,
        Integer period,
        String stat,
        @Nullable String unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName);
        this.namespace = namespace;
        this.period = Objects.requireNonNull(period);
        this.stat = Objects.requireNonNull(stat);
        this.unit = unit;
    }

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
    */
    public Map<String,String> getDimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
    */
    public Integer getPeriod() {
        return this.period;
    }
    /**
     * The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
    */
    public String getStat() {
        return this.stat;
    }
    /**
     * The unit for this metric.
     * 
    */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmMetricQueryMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> dimensions;
        private String metricName;
        private @Nullable String namespace;
        private Integer period;
        private String stat;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmMetricQueryMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.period = defaults.period;
    	      this.stat = defaults.stat;
    	      this.unit = defaults.unit;
        }

        public Builder setDimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
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

        public Builder setPeriod(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }

        public Builder setStat(String stat) {
            this.stat = Objects.requireNonNull(stat);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public MetricAlarmMetricQueryMetric build() {
            return new MetricAlarmMetricQueryMetric(dimensions, metricName, namespace, period, stat, unit);
        }
    }
}
