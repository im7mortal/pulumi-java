// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.aws.securityhub.outputs.InsightFiltersThreatIntelIndicatorLastObservedAtDateRange;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InsightFiltersThreatIntelIndicatorLastObservedAt {
    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    private final @Nullable InsightFiltersThreatIntelIndicatorLastObservedAtDateRange dateRange;
    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    private final @Nullable String end;
    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    private final @Nullable String start;

    @OutputCustomType.Constructor({"dateRange","end","start"})
    private InsightFiltersThreatIntelIndicatorLastObservedAt(
        @Nullable InsightFiltersThreatIntelIndicatorLastObservedAtDateRange dateRange,
        @Nullable String end,
        @Nullable String start) {
        this.dateRange = dateRange;
        this.end = end;
        this.start = start;
    }

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
    */
    public Optional<InsightFiltersThreatIntelIndicatorLastObservedAtDateRange> getDateRange() {
        return Optional.ofNullable(this.dateRange);
    }
    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
    */
    public Optional<String> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
    */
    public Optional<String> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersThreatIntelIndicatorLastObservedAt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InsightFiltersThreatIntelIndicatorLastObservedAtDateRange dateRange;
        private @Nullable String end;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersThreatIntelIndicatorLastObservedAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setDateRange(@Nullable InsightFiltersThreatIntelIndicatorLastObservedAtDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = end;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = start;
            return this;
        }
        public InsightFiltersThreatIntelIndicatorLastObservedAt build() {
            return new InsightFiltersThreatIntelIndicatorLastObservedAt(dateRange, end, start);
        }
    }
}
