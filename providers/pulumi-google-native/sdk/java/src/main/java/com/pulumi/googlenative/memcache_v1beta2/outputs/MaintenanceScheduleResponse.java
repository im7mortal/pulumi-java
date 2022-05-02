// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceScheduleResponse {
    /**
     * @return The end time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String endTime;
    /**
     * @return The deadline that the maintenance schedule start time can not go beyond, including reschedule.
     * 
     */
    private final String scheduleDeadlineTime;
    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private MaintenanceScheduleResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("scheduleDeadlineTime") String scheduleDeadlineTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    /**
     * @return The end time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The deadline that the maintenance schedule start time can not go beyond, including reschedule.
     * 
     */
    public String scheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public MaintenanceScheduleResponse build() {
            return new MaintenanceScheduleResponse(endTime, scheduleDeadlineTime, startTime);
        }
    }
}
