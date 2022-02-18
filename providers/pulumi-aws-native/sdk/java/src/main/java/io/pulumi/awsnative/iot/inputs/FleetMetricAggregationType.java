// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Aggregation types supported by Fleet Indexing
 * 
 */
public final class FleetMetricAggregationType extends io.pulumi.resources.InvokeArgs {

    public static final FleetMetricAggregationType Empty = new FleetMetricAggregationType();

    /**
     * Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Fleet Indexing aggregation type values
     * 
     */
    @InputImport(name="values", required=true)
    private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public FleetMetricAggregationType(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private FleetMetricAggregationType() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetMetricAggregationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetMetricAggregationType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public FleetMetricAggregationType build() {
            return new FleetMetricAggregationType(name, values);
        }
    }
}
