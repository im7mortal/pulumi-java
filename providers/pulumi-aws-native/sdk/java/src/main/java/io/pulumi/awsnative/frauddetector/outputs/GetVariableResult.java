// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.enums.VariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.VariableDataType;
import io.pulumi.awsnative.frauddetector.enums.VariableType;
import io.pulumi.awsnative.frauddetector.outputs.VariableTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVariableResult {
    /**
     * The ARN of the variable.
     * 
     */
    private final @Nullable String arn;
    /**
     * The time when the variable was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The source of the data.
     * 
     */
    private final @Nullable VariableDataSource dataSource;
    /**
     * The data type.
     * 
     */
    private final @Nullable VariableDataType dataType;
    /**
     * The default value for the variable when no value is received.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The time when the variable was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * Tags associated with this variable.
     * 
     */
    private final @Nullable List<VariableTag> tags;
    /**
     * The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    private final @Nullable VariableType variableType;

    @OutputCustomType.Constructor({"arn","createdTime","dataSource","dataType","defaultValue","description","lastUpdatedTime","tags","variableType"})
    private GetVariableResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable VariableDataSource dataSource,
        @Nullable VariableDataType dataType,
        @Nullable String defaultValue,
        @Nullable String description,
        @Nullable String lastUpdatedTime,
        @Nullable List<VariableTag> tags,
        @Nullable VariableType variableType) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.dataSource = dataSource;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
        this.variableType = variableType;
    }

    /**
     * The ARN of the variable.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The time when the variable was created.
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The source of the data.
     * 
     */
    public Optional<VariableDataSource> getDataSource() {
        return Optional.ofNullable(this.dataSource);
    }
    /**
     * The data type.
     * 
     */
    public Optional<VariableDataType> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * The default value for the variable when no value is received.
     * 
     */
    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * The description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The time when the variable was last updated.
     * 
     */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * Tags associated with this variable.
     * 
     */
    public List<VariableTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    public Optional<VariableType> getVariableType() {
        return Optional.ofNullable(this.variableType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable VariableDataSource dataSource;
        private @Nullable VariableDataType dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<VariableTag> tags;
        private @Nullable VariableType variableType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.dataSource = defaults.dataSource;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
    	      this.variableType = defaults.variableType;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDataSource(@Nullable VariableDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataType(@Nullable VariableDataType dataType) {
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

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setTags(@Nullable List<VariableTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVariableType(@Nullable VariableType variableType) {
            this.variableType = variableType;
            return this;
        }

        public GetVariableResult build() {
            return new GetVariableResult(arn, createdTime, dataSource, dataType, defaultValue, description, lastUpdatedTime, tags, variableType);
        }
    }
}