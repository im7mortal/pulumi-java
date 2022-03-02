// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.RegexValidationResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.ValueValidationResponse;
import java.util.Objects;

@OutputCustomType
public final class ParameterValidationResponse {
    /**
     * Validation based on regular expressions.
     * 
     */
    private final RegexValidationResponse regex;
    /**
     * Validation based on a list of allowed values.
     * 
     */
    private final ValueValidationResponse values;

    @OutputCustomType.Constructor({"regex","values"})
    private ParameterValidationResponse(
        RegexValidationResponse regex,
        ValueValidationResponse values) {
        this.regex = Objects.requireNonNull(regex);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Validation based on regular expressions.
     * 
    */
    public RegexValidationResponse getRegex() {
        return this.regex;
    }
    /**
     * Validation based on a list of allowed values.
     * 
    */
    public ValueValidationResponse getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexValidationResponse regex;
        private ValueValidationResponse values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder setRegex(RegexValidationResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public Builder setValues(ValueValidationResponse values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ParameterValidationResponse build() {
            return new ParameterValidationResponse(regex, values);
        }
    }
}
