// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisParameterResponse {
    /**
     * Parameter type.
     * 
     */
    private final @Nullable String dataType;
    /**
     * Default value of parameter.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * Parameter description.
     * 
     */
    private final @Nullable String description;
    /**
     * Design default value of parameter.
     * 
     */
    private final @Nullable String designDefaultValue;
    /**
     * Parameter id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Parameter name.
     * 
     */
    private final @Nullable String name;
    /**
     * Whether parameter is required.
     * 
     */
    private final @Nullable Boolean required;
    /**
     * Whether parameter is sensitive.
     * 
     */
    private final @Nullable Boolean sensitive;
    /**
     * Default sensitive value of parameter.
     * 
     */
    private final @Nullable String sensitiveDefaultValue;
    /**
     * Parameter value set.
     * 
     */
    private final @Nullable Boolean valueSet;
    /**
     * Parameter value type.
     * 
     */
    private final @Nullable String valueType;
    /**
     * Parameter reference variable.
     * 
     */
    private final @Nullable String variable;

    @OutputCustomType.Constructor({"dataType","defaultValue","description","designDefaultValue","id","name","required","sensitive","sensitiveDefaultValue","valueSet","valueType","variable"})
    private SsisParameterResponse(
        @Nullable String dataType,
        @Nullable String defaultValue,
        @Nullable String description,
        @Nullable String designDefaultValue,
        @Nullable Double id,
        @Nullable String name,
        @Nullable Boolean required,
        @Nullable Boolean sensitive,
        @Nullable String sensitiveDefaultValue,
        @Nullable Boolean valueSet,
        @Nullable String valueType,
        @Nullable String variable) {
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.designDefaultValue = designDefaultValue;
        this.id = id;
        this.name = name;
        this.required = required;
        this.sensitive = sensitive;
        this.sensitiveDefaultValue = sensitiveDefaultValue;
        this.valueSet = valueSet;
        this.valueType = valueType;
        this.variable = variable;
    }

    /**
     * Parameter type.
     * 
    */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * Default value of parameter.
     * 
    */
    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Parameter description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Design default value of parameter.
     * 
    */
    public Optional<String> getDesignDefaultValue() {
        return Optional.ofNullable(this.designDefaultValue);
    }
    /**
     * Parameter id.
     * 
    */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Parameter name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Whether parameter is required.
     * 
    */
    public Optional<Boolean> getRequired() {
        return Optional.ofNullable(this.required);
    }
    /**
     * Whether parameter is sensitive.
     * 
    */
    public Optional<Boolean> getSensitive() {
        return Optional.ofNullable(this.sensitive);
    }
    /**
     * Default sensitive value of parameter.
     * 
    */
    public Optional<String> getSensitiveDefaultValue() {
        return Optional.ofNullable(this.sensitiveDefaultValue);
    }
    /**
     * Parameter value set.
     * 
    */
    public Optional<Boolean> getValueSet() {
        return Optional.ofNullable(this.valueSet);
    }
    /**
     * Parameter value type.
     * 
    */
    public Optional<String> getValueType() {
        return Optional.ofNullable(this.valueType);
    }
    /**
     * Parameter reference variable.
     * 
    */
    public Optional<String> getVariable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable String designDefaultValue;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean required;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveDefaultValue;
        private @Nullable Boolean valueSet;
        private @Nullable String valueType;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.designDefaultValue = defaults.designDefaultValue;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveDefaultValue = defaults.sensitiveDefaultValue;
    	      this.valueSet = defaults.valueSet;
    	      this.valueType = defaults.valueType;
    	      this.variable = defaults.variable;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDesignDefaultValue(@Nullable String designDefaultValue) {
            this.designDefaultValue = designDefaultValue;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRequired(@Nullable Boolean required) {
            this.required = required;
            return this;
        }

        public Builder setSensitive(@Nullable Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public Builder setSensitiveDefaultValue(@Nullable String sensitiveDefaultValue) {
            this.sensitiveDefaultValue = sensitiveDefaultValue;
            return this;
        }

        public Builder setValueSet(@Nullable Boolean valueSet) {
            this.valueSet = valueSet;
            return this;
        }

        public Builder setValueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public SsisParameterResponse build() {
            return new SsisParameterResponse(dataType, defaultValue, description, designDefaultValue, id, name, required, sensitive, sensitiveDefaultValue, valueSet, valueType, variable);
        }
    }
}
