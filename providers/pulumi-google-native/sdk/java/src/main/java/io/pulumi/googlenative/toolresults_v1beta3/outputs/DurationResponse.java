// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DurationResponse {
    /**
     * Signed fractions of a second at nanosecond resolution of the span of time. Durations less than one second are represented with a 0 `seconds` field and a positive or negative `nanos` field. For durations of one second or more, a non-zero value for the `nanos` field must be of the same sign as the `seconds` field. Must be from -999,999,999 to +999,999,999 inclusive.
     * 
     */
    private final Integer nanos;
    /**
     * Signed seconds of the span of time. Must be from -315,576,000,000 to +315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    private final String seconds;

    @OutputCustomType.Constructor({"nanos","seconds"})
    private DurationResponse(
        Integer nanos,
        String seconds) {
        this.nanos = Objects.requireNonNull(nanos);
        this.seconds = Objects.requireNonNull(seconds);
    }

    /**
     * Signed fractions of a second at nanosecond resolution of the span of time. Durations less than one second are represented with a 0 `seconds` field and a positive or negative `nanos` field. For durations of one second or more, a non-zero value for the `nanos` field must be of the same sign as the `seconds` field. Must be from -999,999,999 to +999,999,999 inclusive.
     * 
    */
    public Integer getNanos() {
        return this.nanos;
    }
    /**
     * Signed seconds of the span of time. Must be from -315,576,000,000 to +315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
    */
    public String getSeconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private String seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setSeconds(String seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }
        public DurationResponse build() {
            return new DurationResponse(nanos, seconds);
        }
    }
}
