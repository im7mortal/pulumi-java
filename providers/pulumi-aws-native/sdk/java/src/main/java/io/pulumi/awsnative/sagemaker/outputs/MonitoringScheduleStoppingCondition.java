// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class MonitoringScheduleStoppingCondition {
    /**
     * The maximum runtime allowed in seconds.
     * 
     */
    private final Integer maxRuntimeInSeconds;

    @OutputCustomType.Constructor({"maxRuntimeInSeconds"})
    private MonitoringScheduleStoppingCondition(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
    }

    /**
     * The maximum runtime allowed in seconds.
     * 
    */
    public Integer getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleStoppingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleStoppingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }
        public MonitoringScheduleStoppingCondition build() {
            return new MonitoringScheduleStoppingCondition(maxRuntimeInSeconds);
        }
    }
}
