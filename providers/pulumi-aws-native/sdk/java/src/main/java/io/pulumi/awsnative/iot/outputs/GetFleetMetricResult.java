// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.FleetMetricAggregationType;
import io.pulumi.awsnative.iot.outputs.FleetMetricTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFleetMetricResult {
    /**
     * The aggregation field to perform aggregation and metric emission
     * 
     */
    private final @Nullable String aggregationField;
    private final @Nullable FleetMetricAggregationType aggregationType;
    /**
     * The creation date of a fleet metric
     * 
     */
    private final @Nullable Double creationDate;
    /**
     * The description of a fleet metric
     * 
     */
    private final @Nullable String description;
    /**
     * The index name of a fleet metric
     * 
     */
    private final @Nullable String indexName;
    /**
     * The last modified date of a fleet metric
     * 
     */
    private final @Nullable Double lastModifiedDate;
    /**
     * The Amazon Resource Number (ARN) of a fleet metric metric
     * 
     */
    private final @Nullable String metricArn;
    /**
     * The period of metric emission in seconds
     * 
     */
    private final @Nullable Integer period;
    /**
     * The Fleet Indexing query used by a fleet metric
     * 
     */
    private final @Nullable String queryString;
    /**
     * The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    private final @Nullable String queryVersion;
    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    private final @Nullable List<FleetMetricTag> tags;
    /**
     * The unit of data points emitted by a fleet metric
     * 
     */
    private final @Nullable String unit;
    /**
     * The version of a fleet metric
     * 
     */
    private final @Nullable Double version;

    @OutputCustomType.Constructor({"aggregationField","aggregationType","creationDate","description","indexName","lastModifiedDate","metricArn","period","queryString","queryVersion","tags","unit","version"})
    private GetFleetMetricResult(
        @Nullable String aggregationField,
        @Nullable FleetMetricAggregationType aggregationType,
        @Nullable Double creationDate,
        @Nullable String description,
        @Nullable String indexName,
        @Nullable Double lastModifiedDate,
        @Nullable String metricArn,
        @Nullable Integer period,
        @Nullable String queryString,
        @Nullable String queryVersion,
        @Nullable List<FleetMetricTag> tags,
        @Nullable String unit,
        @Nullable Double version) {
        this.aggregationField = aggregationField;
        this.aggregationType = aggregationType;
        this.creationDate = creationDate;
        this.description = description;
        this.indexName = indexName;
        this.lastModifiedDate = lastModifiedDate;
        this.metricArn = metricArn;
        this.period = period;
        this.queryString = queryString;
        this.queryVersion = queryVersion;
        this.tags = tags;
        this.unit = unit;
        this.version = version;
    }

    /**
     * The aggregation field to perform aggregation and metric emission
     * 
     */
    public Optional<String> getAggregationField() {
        return Optional.ofNullable(this.aggregationField);
    }
    public Optional<FleetMetricAggregationType> getAggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }
    /**
     * The creation date of a fleet metric
     * 
     */
    public Optional<Double> getCreationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * The description of a fleet metric
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The index name of a fleet metric
     * 
     */
    public Optional<String> getIndexName() {
        return Optional.ofNullable(this.indexName);
    }
    /**
     * The last modified date of a fleet metric
     * 
     */
    public Optional<Double> getLastModifiedDate() {
        return Optional.ofNullable(this.lastModifiedDate);
    }
    /**
     * The Amazon Resource Number (ARN) of a fleet metric metric
     * 
     */
    public Optional<String> getMetricArn() {
        return Optional.ofNullable(this.metricArn);
    }
    /**
     * The period of metric emission in seconds
     * 
     */
    public Optional<Integer> getPeriod() {
        return Optional.ofNullable(this.period);
    }
    /**
     * The Fleet Indexing query used by a fleet metric
     * 
     */
    public Optional<String> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    public Optional<String> getQueryVersion() {
        return Optional.ofNullable(this.queryVersion);
    }
    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    public List<FleetMetricTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The unit of data points emitted by a fleet metric
     * 
     */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * The version of a fleet metric
     * 
     */
    public Optional<Double> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetMetricResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aggregationField;
        private @Nullable FleetMetricAggregationType aggregationType;
        private @Nullable Double creationDate;
        private @Nullable String description;
        private @Nullable String indexName;
        private @Nullable Double lastModifiedDate;
        private @Nullable String metricArn;
        private @Nullable Integer period;
        private @Nullable String queryString;
        private @Nullable String queryVersion;
        private @Nullable List<FleetMetricTag> tags;
        private @Nullable String unit;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetMetricResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationField = defaults.aggregationField;
    	      this.aggregationType = defaults.aggregationType;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.indexName = defaults.indexName;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.metricArn = defaults.metricArn;
    	      this.period = defaults.period;
    	      this.queryString = defaults.queryString;
    	      this.queryVersion = defaults.queryVersion;
    	      this.tags = defaults.tags;
    	      this.unit = defaults.unit;
    	      this.version = defaults.version;
        }

        public Builder setAggregationField(@Nullable String aggregationField) {
            this.aggregationField = aggregationField;
            return this;
        }

        public Builder setAggregationType(@Nullable FleetMetricAggregationType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        public Builder setCreationDate(@Nullable Double creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIndexName(@Nullable String indexName) {
            this.indexName = indexName;
            return this;
        }

        public Builder setLastModifiedDate(@Nullable Double lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder setMetricArn(@Nullable String metricArn) {
            this.metricArn = metricArn;
            return this;
        }

        public Builder setPeriod(@Nullable Integer period) {
            this.period = period;
            return this;
        }

        public Builder setQueryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryVersion(@Nullable String queryVersion) {
            this.queryVersion = queryVersion;
            return this;
        }

        public Builder setTags(@Nullable List<FleetMetricTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }

        public GetFleetMetricResult build() {
            return new GetFleetMetricResult(aggregationField, aggregationType, creationDate, description, indexName, lastModifiedDate, metricArn, period, queryString, queryVersion, tags, unit, version);
        }
    }
}
