// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InputMappingResponse {
    /**
     * The name of the field that is going to be injected.
     * 
     */
    private final String fieldName;
    /**
     * The location where this mapping applies.
     * 
     */
    private final String location;
    /**
     * Regex to evaluate on method to decide if input applies.
     * 
     */
    private final String methodMatch;
    /**
     * A jsonPath expression to select an element.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"fieldName","location","methodMatch","value"})
    private InputMappingResponse(
        String fieldName,
        String location,
        String methodMatch,
        String value) {
        this.fieldName = Objects.requireNonNull(fieldName);
        this.location = Objects.requireNonNull(location);
        this.methodMatch = Objects.requireNonNull(methodMatch);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The name of the field that is going to be injected.
     * 
    */
    public String getFieldName() {
        return this.fieldName;
    }
    /**
     * The location where this mapping applies.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Regex to evaluate on method to decide if input applies.
     * 
    */
    public String getMethodMatch() {
        return this.methodMatch;
    }
    /**
     * A jsonPath expression to select an element.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fieldName;
        private String location;
        private String methodMatch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InputMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.location = defaults.location;
    	      this.methodMatch = defaults.methodMatch;
    	      this.value = defaults.value;
        }

        public Builder setFieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMethodMatch(String methodMatch) {
            this.methodMatch = Objects.requireNonNull(methodMatch);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InputMappingResponse build() {
            return new InputMappingResponse(fieldName, location, methodMatch, value);
        }
    }
}
