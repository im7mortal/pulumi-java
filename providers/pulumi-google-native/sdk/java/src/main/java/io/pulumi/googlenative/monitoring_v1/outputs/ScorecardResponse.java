// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.GaugeViewResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.SparkChartViewResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.ThresholdResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesQueryResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ScorecardResponse {
    private final GaugeViewResponse gaugeView;
    private final SparkChartViewResponse sparkChartView;
    private final List<ThresholdResponse> thresholds;
    private final TimeSeriesQueryResponse timeSeriesQuery;

    @OutputCustomType.Constructor({"gaugeView","sparkChartView","thresholds","timeSeriesQuery"})
    private ScorecardResponse(
        GaugeViewResponse gaugeView,
        SparkChartViewResponse sparkChartView,
        List<ThresholdResponse> thresholds,
        TimeSeriesQueryResponse timeSeriesQuery) {
        this.gaugeView = Objects.requireNonNull(gaugeView);
        this.sparkChartView = Objects.requireNonNull(sparkChartView);
        this.thresholds = Objects.requireNonNull(thresholds);
        this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
    }

    public GaugeViewResponse getGaugeView() {
        return this.gaugeView;
    }
    public SparkChartViewResponse getSparkChartView() {
        return this.sparkChartView;
    }
    public List<ThresholdResponse> getThresholds() {
        return this.thresholds;
    }
    public TimeSeriesQueryResponse getTimeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScorecardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GaugeViewResponse gaugeView;
        private SparkChartViewResponse sparkChartView;
        private List<ThresholdResponse> thresholds;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(ScorecardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gaugeView = defaults.gaugeView;
    	      this.sparkChartView = defaults.sparkChartView;
    	      this.thresholds = defaults.thresholds;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder setGaugeView(GaugeViewResponse gaugeView) {
            this.gaugeView = Objects.requireNonNull(gaugeView);
            return this;
        }

        public Builder setSparkChartView(SparkChartViewResponse sparkChartView) {
            this.sparkChartView = Objects.requireNonNull(sparkChartView);
            return this;
        }

        public Builder setThresholds(List<ThresholdResponse> thresholds) {
            this.thresholds = Objects.requireNonNull(thresholds);
            return this;
        }

        public Builder setTimeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }

        public ScorecardResponse build() {
            return new ScorecardResponse(gaugeView, sparkChartView, thresholds, timeSeriesQuery);
        }
    }
}