// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InsightFiltersThreatIntelIndicatorLastObservedAtDateRange {
    /**
     * A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    private final String unit;
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    private final Integer value;

    @OutputCustomType.Constructor({"unit","value"})
    private InsightFiltersThreatIntelIndicatorLastObservedAtDateRange(
        String unit,
        Integer value) {
        this.unit = Objects.requireNonNull(unit);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * A date range unit for the date filter. Valid values: `DAYS`.
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
    */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersThreatIntelIndicatorLastObservedAtDateRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersThreatIntelIndicatorLastObservedAtDateRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersThreatIntelIndicatorLastObservedAtDateRange build() {
            return new InsightFiltersThreatIntelIndicatorLastObservedAtDateRange(unit, value);
        }
    }
}
