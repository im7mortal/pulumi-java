// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.redshift.inputs.ScheduledActionTypeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * If true, the schedule is enabled. If false, the scheduled action does not trigger.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The IAM role to assume to run the target action.
     * 
     */
    @InputImport(name="iamRole")
    private final @Nullable Input<String> iamRole;

    public Input<String> getIamRole() {
        return this.iamRole == null ? Input.empty() : this.iamRole;
    }

    /**
     * The schedule in `at( )` or `cron( )` format.
     * 
     */
    @InputImport(name="schedule")
    private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The description of the scheduled action.
     * 
     */
    @InputImport(name="scheduledActionDescription")
    private final @Nullable Input<String> scheduledActionDescription;

    public Input<String> getScheduledActionDescription() {
        return this.scheduledActionDescription == null ? Input.empty() : this.scheduledActionDescription;
    }

    /**
     * The name of the scheduled action. The name must be unique within an account.
     * 
     */
    @InputImport(name="scheduledActionName")
    private final @Nullable Input<String> scheduledActionName;

    public Input<String> getScheduledActionName() {
        return this.scheduledActionName == null ? Input.empty() : this.scheduledActionName;
    }

    /**
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * 
     */
    @InputImport(name="targetAction")
    private final @Nullable Input<ScheduledActionTypeArgs> targetAction;

    public Input<ScheduledActionTypeArgs> getTargetAction() {
        return this.targetAction == null ? Input.empty() : this.targetAction;
    }

    public ScheduledActionArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> endTime,
        @Nullable Input<String> iamRole,
        @Nullable Input<String> schedule,
        @Nullable Input<String> scheduledActionDescription,
        @Nullable Input<String> scheduledActionName,
        @Nullable Input<String> startTime,
        @Nullable Input<ScheduledActionTypeArgs> targetAction) {
        this.enable = enable;
        this.endTime = endTime;
        this.iamRole = iamRole;
        this.schedule = schedule;
        this.scheduledActionDescription = scheduledActionDescription;
        this.scheduledActionName = scheduledActionName;
        this.startTime = startTime;
        this.targetAction = targetAction;
    }

    private ScheduledActionArgs() {
        this.enable = Input.empty();
        this.endTime = Input.empty();
        this.iamRole = Input.empty();
        this.schedule = Input.empty();
        this.scheduledActionDescription = Input.empty();
        this.scheduledActionName = Input.empty();
        this.startTime = Input.empty();
        this.targetAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> iamRole;
        private @Nullable Input<String> schedule;
        private @Nullable Input<String> scheduledActionDescription;
        private @Nullable Input<String> scheduledActionName;
        private @Nullable Input<String> startTime;
        private @Nullable Input<ScheduledActionTypeArgs> targetAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.endTime = defaults.endTime;
    	      this.iamRole = defaults.iamRole;
    	      this.schedule = defaults.schedule;
    	      this.scheduledActionDescription = defaults.scheduledActionDescription;
    	      this.scheduledActionName = defaults.scheduledActionName;
    	      this.startTime = defaults.startTime;
    	      this.targetAction = defaults.targetAction;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setIamRole(@Nullable Input<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder setIamRole(@Nullable String iamRole) {
            this.iamRole = Input.ofNullable(iamRole);
            return this;
        }

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setScheduledActionDescription(@Nullable Input<String> scheduledActionDescription) {
            this.scheduledActionDescription = scheduledActionDescription;
            return this;
        }

        public Builder setScheduledActionDescription(@Nullable String scheduledActionDescription) {
            this.scheduledActionDescription = Input.ofNullable(scheduledActionDescription);
            return this;
        }

        public Builder setScheduledActionName(@Nullable Input<String> scheduledActionName) {
            this.scheduledActionName = scheduledActionName;
            return this;
        }

        public Builder setScheduledActionName(@Nullable String scheduledActionName) {
            this.scheduledActionName = Input.ofNullable(scheduledActionName);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTargetAction(@Nullable Input<ScheduledActionTypeArgs> targetAction) {
            this.targetAction = targetAction;
            return this;
        }

        public Builder setTargetAction(@Nullable ScheduledActionTypeArgs targetAction) {
            this.targetAction = Input.ofNullable(targetAction);
            return this;
        }

        public ScheduledActionArgs build() {
            return new ScheduledActionArgs(enable, endTime, iamRole, schedule, scheduledActionDescription, scheduledActionName, startTime, targetAction);
        }
    }
}
