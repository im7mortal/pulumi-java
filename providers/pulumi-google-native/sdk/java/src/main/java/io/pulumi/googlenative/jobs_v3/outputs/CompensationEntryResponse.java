// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v3.outputs.CompensationRangeResponse;
import io.pulumi.googlenative.jobs_v3.outputs.MoneyResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CompensationEntryResponse {
    /**
     * Optional. Compensation amount.
     * 
     */
    private final MoneyResponse amount;
    /**
     * Optional. Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus.
     * 
     */
    private final String description;
    /**
     * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
     * 
     */
    private final Double expectedUnitsPerYear;
    /**
     * Optional. Compensation range.
     * 
     */
    private final CompensationRangeResponse range;
    /**
     * Optional. Compensation type. Default is CompensationUnit.COMPENSATION_TYPE_UNSPECIFIED.
     * 
     */
    private final String type;
    /**
     * Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
     */
    private final String unit;

    @OutputCustomType.Constructor({"amount","description","expectedUnitsPerYear","range","type","unit"})
    private CompensationEntryResponse(
        MoneyResponse amount,
        String description,
        Double expectedUnitsPerYear,
        CompensationRangeResponse range,
        String type,
        String unit) {
        this.amount = Objects.requireNonNull(amount);
        this.description = Objects.requireNonNull(description);
        this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear);
        this.range = Objects.requireNonNull(range);
        this.type = Objects.requireNonNull(type);
        this.unit = Objects.requireNonNull(unit);
    }

    /**
     * Optional. Compensation amount.
     * 
    */
    public MoneyResponse getAmount() {
        return this.amount;
    }
    /**
     * Optional. Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
     * 
    */
    public Double getExpectedUnitsPerYear() {
        return this.expectedUnitsPerYear;
    }
    /**
     * Optional. Compensation range.
     * 
    */
    public CompensationRangeResponse getRange() {
        return this.range;
    }
    /**
     * Optional. Compensation type. Default is CompensationUnit.COMPENSATION_TYPE_UNSPECIFIED.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
    */
    public String getUnit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse amount;
        private String description;
        private Double expectedUnitsPerYear;
        private CompensationRangeResponse range;
        private String type;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.description = defaults.description;
    	      this.expectedUnitsPerYear = defaults.expectedUnitsPerYear;
    	      this.range = defaults.range;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(MoneyResponse amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpectedUnitsPerYear(Double expectedUnitsPerYear) {
            this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear);
            return this;
        }

        public Builder setRange(CompensationRangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public CompensationEntryResponse build() {
            return new CompensationEntryResponse(amount, description, expectedUnitsPerYear, range, type, unit);
        }
    }
}
