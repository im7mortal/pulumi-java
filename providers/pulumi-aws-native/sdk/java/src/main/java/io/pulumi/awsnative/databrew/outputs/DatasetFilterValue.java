// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetFilterValue {
    private final String value;
    /**
     * Variable name
     * 
     */
    private final String valueReference;

    @OutputCustomType.Constructor({"value","valueReference"})
    private DatasetFilterValue(
        String value,
        String valueReference) {
        this.value = Objects.requireNonNull(value);
        this.valueReference = Objects.requireNonNull(valueReference);
    }

    public String getValue() {
        return this.value;
    }
    /**
     * Variable name
     * 
     */
    public String getValueReference() {
        return this.valueReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;
        private String valueReference;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueReference = defaults.valueReference;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValueReference(String valueReference) {
            this.valueReference = Objects.requireNonNull(valueReference);
            return this;
        }

        public DatasetFilterValue build() {
            return new DatasetFilterValue(value, valueReference);
        }
    }
}
