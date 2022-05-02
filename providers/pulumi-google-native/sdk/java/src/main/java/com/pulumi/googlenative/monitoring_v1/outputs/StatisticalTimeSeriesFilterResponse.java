// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatisticalTimeSeriesFilterResponse {
    /**
     * @return How many time series to output.
     * 
     */
    private final Integer numTimeSeries;
    /**
     * @return rankingMethod is applied to a set of time series, and then the produced value for each individual time series is used to compare a given time series to others. These are methods that cannot be applied stream-by-stream, but rather require the full context of a request to evaluate time series.
     * 
     */
    private final String rankingMethod;

    @CustomType.Constructor
    private StatisticalTimeSeriesFilterResponse(
        @CustomType.Parameter("numTimeSeries") Integer numTimeSeries,
        @CustomType.Parameter("rankingMethod") String rankingMethod) {
        this.numTimeSeries = numTimeSeries;
        this.rankingMethod = rankingMethod;
    }

    /**
     * @return How many time series to output.
     * 
     */
    public Integer numTimeSeries() {
        return this.numTimeSeries;
    }
    /**
     * @return rankingMethod is applied to a set of time series, and then the produced value for each individual time series is used to compare a given time series to others. These are methods that cannot be applied stream-by-stream, but rather require the full context of a request to evaluate time series.
     * 
     */
    public String rankingMethod() {
        return this.rankingMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatisticalTimeSeriesFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numTimeSeries;
        private String rankingMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(StatisticalTimeSeriesFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numTimeSeries = defaults.numTimeSeries;
    	      this.rankingMethod = defaults.rankingMethod;
        }

        public Builder numTimeSeries(Integer numTimeSeries) {
            this.numTimeSeries = Objects.requireNonNull(numTimeSeries);
            return this;
        }
        public Builder rankingMethod(String rankingMethod) {
            this.rankingMethod = Objects.requireNonNull(rankingMethod);
            return this;
        }        public StatisticalTimeSeriesFilterResponse build() {
            return new StatisticalTimeSeriesFilterResponse(numTimeSeries, rankingMethod);
        }
    }
}
