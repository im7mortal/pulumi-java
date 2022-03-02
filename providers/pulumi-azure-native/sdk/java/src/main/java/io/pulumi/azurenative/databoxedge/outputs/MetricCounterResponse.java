// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.MetricDimensionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricCounterResponse {
    /**
     * The additional dimensions to be added to metric.
     * 
     */
    private final @Nullable List<MetricDimensionResponse> additionalDimensions;
    /**
     * The dimension filter.
     * 
     */
    private final @Nullable List<MetricDimensionResponse> dimensionFilter;
    /**
     * The instance from which counter should be collected.
     * 
     */
    private final @Nullable String instance;
    /**
     * The counter name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"additionalDimensions","dimensionFilter","instance","name"})
    private MetricCounterResponse(
        @Nullable List<MetricDimensionResponse> additionalDimensions,
        @Nullable List<MetricDimensionResponse> dimensionFilter,
        @Nullable String instance,
        String name) {
        this.additionalDimensions = additionalDimensions;
        this.dimensionFilter = dimensionFilter;
        this.instance = instance;
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The additional dimensions to be added to metric.
     * 
    */
    public List<MetricDimensionResponse> getAdditionalDimensions() {
        return this.additionalDimensions == null ? List.of() : this.additionalDimensions;
    }
    /**
     * The dimension filter.
     * 
    */
    public List<MetricDimensionResponse> getDimensionFilter() {
        return this.dimensionFilter == null ? List.of() : this.dimensionFilter;
    }
    /**
     * The instance from which counter should be collected.
     * 
    */
    public Optional<String> getInstance() {
        return Optional.ofNullable(this.instance);
    }
    /**
     * The counter name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCounterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricDimensionResponse> additionalDimensions;
        private @Nullable List<MetricDimensionResponse> dimensionFilter;
        private @Nullable String instance;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCounterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDimensions = defaults.additionalDimensions;
    	      this.dimensionFilter = defaults.dimensionFilter;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
        }

        public Builder setAdditionalDimensions(@Nullable List<MetricDimensionResponse> additionalDimensions) {
            this.additionalDimensions = additionalDimensions;
            return this;
        }

        public Builder setDimensionFilter(@Nullable List<MetricDimensionResponse> dimensionFilter) {
            this.dimensionFilter = dimensionFilter;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public MetricCounterResponse build() {
            return new MetricCounterResponse(additionalDimensions, dimensionFilter, instance, name);
        }
    }
}
