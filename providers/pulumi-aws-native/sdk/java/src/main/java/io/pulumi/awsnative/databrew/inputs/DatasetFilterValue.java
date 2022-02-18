// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate expression variable names with their values
 * 
 */
public final class DatasetFilterValue extends io.pulumi.resources.InvokeArgs {

    public static final DatasetFilterValue Empty = new DatasetFilterValue();

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    /**
     * Variable name
     * 
     */
    @InputImport(name="valueReference", required=true)
    private final String valueReference;

    public String getValueReference() {
        return this.valueReference;
    }

    public DatasetFilterValue(
        String value,
        String valueReference) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.valueReference = Objects.requireNonNull(valueReference, "expected parameter 'valueReference' to be non-null");
    }

    private DatasetFilterValue() {
        this.value = null;
        this.valueReference = null;
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
