// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RecurrentScheduleResponse {
    private final List<String> days;
    private final List<Integer> hours;
    private final List<Integer> minutes;
    private final String timeZone;

    @OutputCustomType.Constructor({"days","hours","minutes","timeZone"})
    private RecurrentScheduleResponse(
        List<String> days,
        List<Integer> hours,
        List<Integer> minutes,
        String timeZone) {
        this.days = Objects.requireNonNull(days);
        this.hours = Objects.requireNonNull(hours);
        this.minutes = Objects.requireNonNull(minutes);
        this.timeZone = Objects.requireNonNull(timeZone);
    }

    public List<String> getDays() {
        return this.days;
    }
    public List<Integer> getHours() {
        return this.hours;
    }
    public List<Integer> getMinutes() {
        return this.minutes;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrentScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private List<Integer> hours;
        private List<Integer> minutes;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrentScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDays(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setHours(List<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setMinutes(List<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public RecurrentScheduleResponse build() {
            return new RecurrentScheduleResponse(days, hours, minutes, timeZone);
        }
    }
}