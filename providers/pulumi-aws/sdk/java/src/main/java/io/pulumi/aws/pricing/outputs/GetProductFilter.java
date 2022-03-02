// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pricing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetProductFilter {
    /**
     * The product attribute name that you want to filter on.
     * 
     */
    private final String field;
    /**
     * The product attribute value that you want to filter on.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"field","value"})
    private GetProductFilter(
        String field,
        String value) {
        this.field = Objects.requireNonNull(field);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The product attribute name that you want to filter on.
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * The product attribute value that you want to filter on.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.value = defaults.value;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetProductFilter build() {
            return new GetProductFilter(field, value);
        }
    }
}
