// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration details about the monitoring schedule.
 * 
 */
public final class MonitoringScheduleScheduleConfig extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleScheduleConfig Empty = new MonitoringScheduleScheduleConfig();

    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
    private final String scheduleExpression;

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public MonitoringScheduleScheduleConfig(String scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private MonitoringScheduleScheduleConfig() {
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public MonitoringScheduleScheduleConfig build() {
            return new MonitoringScheduleScheduleConfig(scheduleExpression);
        }
    }
}
