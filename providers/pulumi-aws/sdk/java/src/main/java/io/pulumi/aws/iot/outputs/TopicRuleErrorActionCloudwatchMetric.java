// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleErrorActionCloudwatchMetric {
    /**
     * The CloudWatch metric name.
     * 
     */
    private final String metricName;
    /**
     * The CloudWatch metric namespace name.
     * 
     */
    private final String metricNamespace;
    /**
     * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    private final @Nullable String metricTimestamp;
    /**
     * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    private final String metricUnit;
    /**
     * The CloudWatch metric value.
     * 
     */
    private final String metricValue;
    /**
     * The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"metricName","metricNamespace","metricTimestamp","metricUnit","metricValue","roleArn"})
    private TopicRuleErrorActionCloudwatchMetric(
        String metricName,
        String metricNamespace,
        @Nullable String metricTimestamp,
        String metricUnit,
        String metricValue,
        String roleArn) {
        this.metricName = Objects.requireNonNull(metricName);
        this.metricNamespace = Objects.requireNonNull(metricNamespace);
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = Objects.requireNonNull(metricUnit);
        this.metricValue = Objects.requireNonNull(metricValue);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * The CloudWatch metric name.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * The CloudWatch metric namespace name.
     * 
    */
    public String getMetricNamespace() {
        return this.metricNamespace;
    }
    /**
     * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
    */
    public Optional<String> getMetricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }
    /**
     * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
    */
    public String getMetricUnit() {
        return this.metricUnit;
    }
    /**
     * The CloudWatch metric value.
     * 
    */
    public String getMetricValue() {
        return this.metricValue;
    }
    /**
     * The IAM role ARN that allows access to the CloudWatch metric.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionCloudwatchMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String metricNamespace;
        private @Nullable String metricTimestamp;
        private String metricUnit;
        private String metricValue;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionCloudwatchMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricNamespace(String metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }

        public Builder setMetricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }

        public Builder setMetricUnit(String metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }

        public Builder setMetricValue(String metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleErrorActionCloudwatchMetric build() {
            return new TopicRuleErrorActionCloudwatchMetric(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
