// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.memcache_v1.outputs.TimeOfDayResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WeeklyMaintenanceWindowResponse {
    /**
     * @return Allows to define schedule that runs specified day of the week.
     * 
     */
    private final String day;
    /**
     * @return Duration of the time window.
     * 
     */
    private final String duration;
    /**
     * @return Start time of the window in UTC.
     * 
     */
    private final TimeOfDayResponse startTime;

    @CustomType.Constructor
    private WeeklyMaintenanceWindowResponse(
        @CustomType.Parameter("day") String day,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("startTime") TimeOfDayResponse startTime) {
        this.day = day;
        this.duration = duration;
        this.startTime = startTime;
    }

    /**
     * @return Allows to define schedule that runs specified day of the week.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return Duration of the time window.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Start time of the window in UTC.
     * 
     */
    public TimeOfDayResponse startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private TimeOfDayResponse startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(TimeOfDayResponse startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public WeeklyMaintenanceWindowResponse build() {
            return new WeeklyMaintenanceWindowResponse(day, duration, startTime);
        }
    }
}
