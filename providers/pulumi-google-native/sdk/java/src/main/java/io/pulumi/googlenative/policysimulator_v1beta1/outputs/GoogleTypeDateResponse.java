// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleTypeDateResponse {
    private final Integer day;
    private final Integer month;
    private final Integer year;

    @OutputCustomType.Constructor({"day","month","year"})
    private GoogleTypeDateResponse(
        Integer day,
        Integer month,
        Integer year) {
        this.day = Objects.requireNonNull(day);
        this.month = Objects.requireNonNull(month);
        this.year = Objects.requireNonNull(year);
    }

    public Integer getDay() {
        return this.day;
    }
    public Integer getMonth() {
        return this.month;
    }
    public Integer getYear() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeDateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder setDay(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setMonth(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder setYear(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }

        public GoogleTypeDateResponse build() {
            return new GoogleTypeDateResponse(day, month, year);
        }
    }
}