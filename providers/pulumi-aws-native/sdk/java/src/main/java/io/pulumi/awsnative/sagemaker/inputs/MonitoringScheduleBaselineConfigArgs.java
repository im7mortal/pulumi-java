// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleConstraintsResourceArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStatisticsResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class MonitoringScheduleBaselineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleBaselineConfigArgs Empty = new MonitoringScheduleBaselineConfigArgs();

    @InputImport(name="constraintsResource")
    private final @Nullable Input<MonitoringScheduleConstraintsResourceArgs> constraintsResource;

    public Input<MonitoringScheduleConstraintsResourceArgs> getConstraintsResource() {
        return this.constraintsResource == null ? Input.empty() : this.constraintsResource;
    }

    @InputImport(name="statisticsResource")
    private final @Nullable Input<MonitoringScheduleStatisticsResourceArgs> statisticsResource;

    public Input<MonitoringScheduleStatisticsResourceArgs> getStatisticsResource() {
        return this.statisticsResource == null ? Input.empty() : this.statisticsResource;
    }

    public MonitoringScheduleBaselineConfigArgs(
        @Nullable Input<MonitoringScheduleConstraintsResourceArgs> constraintsResource,
        @Nullable Input<MonitoringScheduleStatisticsResourceArgs> statisticsResource) {
        this.constraintsResource = constraintsResource;
        this.statisticsResource = statisticsResource;
    }

    private MonitoringScheduleBaselineConfigArgs() {
        this.constraintsResource = Input.empty();
        this.statisticsResource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleBaselineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MonitoringScheduleConstraintsResourceArgs> constraintsResource;
        private @Nullable Input<MonitoringScheduleStatisticsResourceArgs> statisticsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleBaselineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintsResource = defaults.constraintsResource;
    	      this.statisticsResource = defaults.statisticsResource;
        }

        public Builder setConstraintsResource(@Nullable Input<MonitoringScheduleConstraintsResourceArgs> constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public Builder setConstraintsResource(@Nullable MonitoringScheduleConstraintsResourceArgs constraintsResource) {
            this.constraintsResource = Input.ofNullable(constraintsResource);
            return this;
        }

        public Builder setStatisticsResource(@Nullable Input<MonitoringScheduleStatisticsResourceArgs> statisticsResource) {
            this.statisticsResource = statisticsResource;
            return this;
        }

        public Builder setStatisticsResource(@Nullable MonitoringScheduleStatisticsResourceArgs statisticsResource) {
            this.statisticsResource = Input.ofNullable(statisticsResource);
            return this;
        }

        public MonitoringScheduleBaselineConfigArgs build() {
            return new MonitoringScheduleBaselineConfigArgs(constraintsResource, statisticsResource);
        }
    }
}
