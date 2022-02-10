// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BasicPerfSampleSeriesResponse {
    private final String perfMetricType;
    private final String perfUnit;
    private final String sampleSeriesLabel;

    @OutputCustomType.Constructor({"perfMetricType","perfUnit","sampleSeriesLabel"})
    private BasicPerfSampleSeriesResponse(
        String perfMetricType,
        String perfUnit,
        String sampleSeriesLabel) {
        this.perfMetricType = Objects.requireNonNull(perfMetricType);
        this.perfUnit = Objects.requireNonNull(perfUnit);
        this.sampleSeriesLabel = Objects.requireNonNull(sampleSeriesLabel);
    }

    public String getPerfMetricType() {
        return this.perfMetricType;
    }
    public String getPerfUnit() {
        return this.perfUnit;
    }
    public String getSampleSeriesLabel() {
        return this.sampleSeriesLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicPerfSampleSeriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String perfMetricType;
        private String perfUnit;
        private String sampleSeriesLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicPerfSampleSeriesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perfMetricType = defaults.perfMetricType;
    	      this.perfUnit = defaults.perfUnit;
    	      this.sampleSeriesLabel = defaults.sampleSeriesLabel;
        }

        public Builder setPerfMetricType(String perfMetricType) {
            this.perfMetricType = Objects.requireNonNull(perfMetricType);
            return this;
        }

        public Builder setPerfUnit(String perfUnit) {
            this.perfUnit = Objects.requireNonNull(perfUnit);
            return this;
        }

        public Builder setSampleSeriesLabel(String sampleSeriesLabel) {
            this.sampleSeriesLabel = Objects.requireNonNull(sampleSeriesLabel);
            return this;
        }

        public BasicPerfSampleSeriesResponse build() {
            return new BasicPerfSampleSeriesResponse(perfMetricType, perfUnit, sampleSeriesLabel);
        }
    }
}