// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class HoursOfOperationConfigEndTime {
    /**
     * Specifies the hour of closing.
     * 
     */
    private final Integer hours;
    /**
     * Specifies the minute of closing.
     * 
     */
    private final Integer minutes;

    @OutputCustomType.Constructor({"hours","minutes"})
    private HoursOfOperationConfigEndTime(
        Integer hours,
        Integer minutes) {
        this.hours = Objects.requireNonNull(hours);
        this.minutes = Objects.requireNonNull(minutes);
    }

    /**
     * Specifies the hour of closing.
     * 
    */
    public Integer getHours() {
        return this.hours;
    }
    /**
     * Specifies the minute of closing.
     * 
    */
    public Integer getMinutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigEndTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigEndTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        public Builder setHours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public HoursOfOperationConfigEndTime build() {
            return new HoursOfOperationConfigEndTime(hours, minutes);
        }
    }
}
