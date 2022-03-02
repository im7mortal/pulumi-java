// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.AsyncOptionsResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.InputMappingResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.ValidationOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OptionsResponse {
    /**
     * Options regarding how to thread async requests.
     * 
     */
    private final List<AsyncOptionsResponse> asyncOptions;
    /**
     * The mappings that apply for requests.
     * 
     */
    private final List<InputMappingResponse> inputMappings;
    /**
     * The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
     */
    private final String nameProperty;
    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    private final ValidationOptionsResponse validationOptions;

    @OutputCustomType.Constructor({"asyncOptions","inputMappings","nameProperty","validationOptions"})
    private OptionsResponse(
        List<AsyncOptionsResponse> asyncOptions,
        List<InputMappingResponse> inputMappings,
        String nameProperty,
        ValidationOptionsResponse validationOptions) {
        this.asyncOptions = Objects.requireNonNull(asyncOptions);
        this.inputMappings = Objects.requireNonNull(inputMappings);
        this.nameProperty = Objects.requireNonNull(nameProperty);
        this.validationOptions = Objects.requireNonNull(validationOptions);
    }

    /**
     * Options regarding how to thread async requests.
     * 
    */
    public List<AsyncOptionsResponse> getAsyncOptions() {
        return this.asyncOptions;
    }
    /**
     * The mappings that apply for requests.
     * 
    */
    public List<InputMappingResponse> getInputMappings() {
        return this.inputMappings;
    }
    /**
     * The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
    */
    public String getNameProperty() {
        return this.nameProperty;
    }
    /**
     * Options for how to validate and process properties on a resource.
     * 
    */
    public ValidationOptionsResponse getValidationOptions() {
        return this.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AsyncOptionsResponse> asyncOptions;
        private List<InputMappingResponse> inputMappings;
        private String nameProperty;
        private ValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncOptions = defaults.asyncOptions;
    	      this.inputMappings = defaults.inputMappings;
    	      this.nameProperty = defaults.nameProperty;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setAsyncOptions(List<AsyncOptionsResponse> asyncOptions) {
            this.asyncOptions = Objects.requireNonNull(asyncOptions);
            return this;
        }

        public Builder setInputMappings(List<InputMappingResponse> inputMappings) {
            this.inputMappings = Objects.requireNonNull(inputMappings);
            return this;
        }

        public Builder setNameProperty(String nameProperty) {
            this.nameProperty = Objects.requireNonNull(nameProperty);
            return this;
        }

        public Builder setValidationOptions(ValidationOptionsResponse validationOptions) {
            this.validationOptions = Objects.requireNonNull(validationOptions);
            return this;
        }
        public OptionsResponse build() {
            return new OptionsResponse(asyncOptions, inputMappings, nameProperty, validationOptions);
        }
    }
}
