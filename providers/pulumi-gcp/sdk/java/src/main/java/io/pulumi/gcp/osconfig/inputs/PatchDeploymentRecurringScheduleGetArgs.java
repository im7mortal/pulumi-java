// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeOfDayGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeZoneGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleWeeklyGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleGetArgs Empty = new PatchDeploymentRecurringScheduleGetArgs();

    /**
     * The end time at which a recurring patch deployment schedule is no longer active.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="lastExecuteTime")
    private final @Nullable Input<String> lastExecuteTime;

    public Input<String> getLastExecuteTime() {
        return this.lastExecuteTime == null ? Input.empty() : this.lastExecuteTime;
    }

    /**
     * Schedule with monthly executions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="monthly")
    private final @Nullable Input<PatchDeploymentRecurringScheduleMonthlyGetArgs> monthly;

    public Input<PatchDeploymentRecurringScheduleMonthlyGetArgs> getMonthly() {
        return this.monthly == null ? Input.empty() : this.monthly;
    }

    /**
     * - 
     * The time the next patch job is scheduled to run.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="nextExecuteTime")
    private final @Nullable Input<String> nextExecuteTime;

    public Input<String> getNextExecuteTime() {
        return this.nextExecuteTime == null ? Input.empty() : this.nextExecuteTime;
    }

    /**
     * The time that the recurring schedule becomes effective. Defaults to createTime of the patch deployment.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Time of the day to run a recurring deployment.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeOfDay", required=true)
    private final Input<PatchDeploymentRecurringScheduleTimeOfDayGetArgs> timeOfDay;

    public Input<PatchDeploymentRecurringScheduleTimeOfDayGetArgs> getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * Defines the time zone that timeOfDay is relative to. The rules for daylight saving time are
     * determined by the chosen time zone.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeZone", required=true)
    private final Input<PatchDeploymentRecurringScheduleTimeZoneGetArgs> timeZone;

    public Input<PatchDeploymentRecurringScheduleTimeZoneGetArgs> getTimeZone() {
        return this.timeZone;
    }

    /**
     * Schedule with weekly executions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weekly")
    private final @Nullable Input<PatchDeploymentRecurringScheduleWeeklyGetArgs> weekly;

    public Input<PatchDeploymentRecurringScheduleWeeklyGetArgs> getWeekly() {
        return this.weekly == null ? Input.empty() : this.weekly;
    }

    public PatchDeploymentRecurringScheduleGetArgs(
        @Nullable Input<String> endTime,
        @Nullable Input<String> lastExecuteTime,
        @Nullable Input<PatchDeploymentRecurringScheduleMonthlyGetArgs> monthly,
        @Nullable Input<String> nextExecuteTime,
        @Nullable Input<String> startTime,
        Input<PatchDeploymentRecurringScheduleTimeOfDayGetArgs> timeOfDay,
        Input<PatchDeploymentRecurringScheduleTimeZoneGetArgs> timeZone,
        @Nullable Input<PatchDeploymentRecurringScheduleWeeklyGetArgs> weekly) {
        this.endTime = endTime;
        this.lastExecuteTime = lastExecuteTime;
        this.monthly = monthly;
        this.nextExecuteTime = nextExecuteTime;
        this.startTime = startTime;
        this.timeOfDay = Objects.requireNonNull(timeOfDay, "expected parameter 'timeOfDay' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.weekly = weekly;
    }

    private PatchDeploymentRecurringScheduleGetArgs() {
        this.endTime = Input.empty();
        this.lastExecuteTime = Input.empty();
        this.monthly = Input.empty();
        this.nextExecuteTime = Input.empty();
        this.startTime = Input.empty();
        this.timeOfDay = Input.empty();
        this.timeZone = Input.empty();
        this.weekly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> lastExecuteTime;
        private @Nullable Input<PatchDeploymentRecurringScheduleMonthlyGetArgs> monthly;
        private @Nullable Input<String> nextExecuteTime;
        private @Nullable Input<String> startTime;
        private Input<PatchDeploymentRecurringScheduleTimeOfDayGetArgs> timeOfDay;
        private Input<PatchDeploymentRecurringScheduleTimeZoneGetArgs> timeZone;
        private @Nullable Input<PatchDeploymentRecurringScheduleWeeklyGetArgs> weekly;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.monthly = defaults.monthly;
    	      this.nextExecuteTime = defaults.nextExecuteTime;
    	      this.startTime = defaults.startTime;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
    	      this.weekly = defaults.weekly;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setLastExecuteTime(@Nullable Input<String> lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }

        public Builder setLastExecuteTime(@Nullable String lastExecuteTime) {
            this.lastExecuteTime = Input.ofNullable(lastExecuteTime);
            return this;
        }

        public Builder setMonthly(@Nullable Input<PatchDeploymentRecurringScheduleMonthlyGetArgs> monthly) {
            this.monthly = monthly;
            return this;
        }

        public Builder setMonthly(@Nullable PatchDeploymentRecurringScheduleMonthlyGetArgs monthly) {
            this.monthly = Input.ofNullable(monthly);
            return this;
        }

        public Builder setNextExecuteTime(@Nullable Input<String> nextExecuteTime) {
            this.nextExecuteTime = nextExecuteTime;
            return this;
        }

        public Builder setNextExecuteTime(@Nullable String nextExecuteTime) {
            this.nextExecuteTime = Input.ofNullable(nextExecuteTime);
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

        public Builder setTimeOfDay(Input<PatchDeploymentRecurringScheduleTimeOfDayGetArgs> timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }

        public Builder setTimeOfDay(PatchDeploymentRecurringScheduleTimeOfDayGetArgs timeOfDay) {
            this.timeOfDay = Input.of(Objects.requireNonNull(timeOfDay));
            return this;
        }

        public Builder setTimeZone(Input<PatchDeploymentRecurringScheduleTimeZoneGetArgs> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setTimeZone(PatchDeploymentRecurringScheduleTimeZoneGetArgs timeZone) {
            this.timeZone = Input.of(Objects.requireNonNull(timeZone));
            return this;
        }

        public Builder setWeekly(@Nullable Input<PatchDeploymentRecurringScheduleWeeklyGetArgs> weekly) {
            this.weekly = weekly;
            return this;
        }

        public Builder setWeekly(@Nullable PatchDeploymentRecurringScheduleWeeklyGetArgs weekly) {
            this.weekly = Input.ofNullable(weekly);
            return this;
        }

        public PatchDeploymentRecurringScheduleGetArgs build() {
            return new PatchDeploymentRecurringScheduleGetArgs(endTime, lastExecuteTime, monthly, nextExecuteTime, startTime, timeOfDay, timeZone, weekly);
        }
    }
}