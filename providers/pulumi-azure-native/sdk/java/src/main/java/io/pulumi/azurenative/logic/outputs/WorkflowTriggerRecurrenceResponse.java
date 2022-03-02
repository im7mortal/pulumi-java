// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RecurrenceScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTriggerRecurrenceResponse {
    /**
     * The end time.
     * 
     */
    private final @Nullable String endTime;
    /**
     * The frequency.
     * 
     */
    private final @Nullable String frequency;
    /**
     * The interval.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The recurrence schedule.
     * 
     */
    private final @Nullable RecurrenceScheduleResponse schedule;
    /**
     * The start time.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The time zone.
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"endTime","frequency","interval","schedule","startTime","timeZone"})
    private WorkflowTriggerRecurrenceResponse(
        @Nullable String endTime,
        @Nullable String frequency,
        @Nullable Integer interval,
        @Nullable RecurrenceScheduleResponse schedule,
        @Nullable String startTime,
        @Nullable String timeZone) {
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
        this.startTime = startTime;
        this.timeZone = timeZone;
    }

    /**
     * The end time.
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * The frequency.
     * 
    */
    public Optional<String> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * The interval.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The recurrence schedule.
     * 
    */
    public Optional<RecurrenceScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * The start time.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The time zone.
     * 
    */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTriggerRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String frequency;
        private @Nullable Integer interval;
        private @Nullable RecurrenceScheduleResponse schedule;
        private @Nullable String startTime;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTriggerRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setFrequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setSchedule(@Nullable RecurrenceScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public WorkflowTriggerRecurrenceResponse build() {
            return new WorkflowTriggerRecurrenceResponse(endTime, frequency, interval, schedule, startTime, timeZone);
        }
    }
}
