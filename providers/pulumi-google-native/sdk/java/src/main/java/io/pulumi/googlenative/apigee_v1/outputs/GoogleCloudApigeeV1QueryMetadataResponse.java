// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1QueryMetadataResponse {
    /**
     * Dimensions of the AsyncQuery.
     * 
     */
    private final List<String> dimensions;
    /**
     * End timestamp of the query range.
     * 
     */
    private final String endTimestamp;
    /**
     * Metrics of the AsyncQuery. Example: ["name:message_count,func:sum,alias:sum_message_count"]
     * 
     */
    private final List<String> metrics;
    /**
     * Output format.
     * 
     */
    private final String outputFormat;
    /**
     * Start timestamp of the query range.
     * 
     */
    private final String startTimestamp;
    /**
     * Query GroupBy time unit.
     * 
     */
    private final String timeUnit;

    @OutputCustomType.Constructor({"dimensions","endTimestamp","metrics","outputFormat","startTimestamp","timeUnit"})
    private GoogleCloudApigeeV1QueryMetadataResponse(
        List<String> dimensions,
        String endTimestamp,
        List<String> metrics,
        String outputFormat,
        String startTimestamp,
        String timeUnit) {
        this.dimensions = Objects.requireNonNull(dimensions);
        this.endTimestamp = Objects.requireNonNull(endTimestamp);
        this.metrics = Objects.requireNonNull(metrics);
        this.outputFormat = Objects.requireNonNull(outputFormat);
        this.startTimestamp = Objects.requireNonNull(startTimestamp);
        this.timeUnit = Objects.requireNonNull(timeUnit);
    }

    /**
     * Dimensions of the AsyncQuery.
     * 
    */
    public List<String> getDimensions() {
        return this.dimensions;
    }
    /**
     * End timestamp of the query range.
     * 
    */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }
    /**
     * Metrics of the AsyncQuery. Example: ["name:message_count,func:sum,alias:sum_message_count"]
     * 
    */
    public List<String> getMetrics() {
        return this.metrics;
    }
    /**
     * Output format.
     * 
    */
    public String getOutputFormat() {
        return this.outputFormat;
    }
    /**
     * Start timestamp of the query range.
     * 
    */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }
    /**
     * Query GroupBy time unit.
     * 
    */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dimensions;
        private String endTimestamp;
        private List<String> metrics;
        private String outputFormat;
        private String startTimestamp;
        private String timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.endTimestamp = defaults.endTimestamp;
    	      this.metrics = defaults.metrics;
    	      this.outputFormat = defaults.outputFormat;
    	      this.startTimestamp = defaults.startTimestamp;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder setDimensions(List<String> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder setEndTimestamp(String endTimestamp) {
            this.endTimestamp = Objects.requireNonNull(endTimestamp);
            return this;
        }

        public Builder setMetrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setOutputFormat(String outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }

        public Builder setStartTimestamp(String startTimestamp) {
            this.startTimestamp = Objects.requireNonNull(startTimestamp);
            return this;
        }

        public Builder setTimeUnit(String timeUnit) {
            this.timeUnit = Objects.requireNonNull(timeUnit);
            return this;
        }
        public GoogleCloudApigeeV1QueryMetadataResponse build() {
            return new GoogleCloudApigeeV1QueryMetadataResponse(dimensions, endTimestamp, metrics, outputFormat, startTimestamp, timeUnit);
        }
    }
}
