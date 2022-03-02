// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineDefinitionPipelineObjectField {
    /**
     * Field identifier.
     * 
     */
    private final String key;
    /**
     * Field value, expressed as the identifier of another object
     * 
     */
    private final @Nullable String refValue;
    /**
     * Field value, expressed as a String.
     * 
     */
    private final @Nullable String stringValue;

    @OutputCustomType.Constructor({"key","refValue","stringValue"})
    private PipelineDefinitionPipelineObjectField(
        String key,
        @Nullable String refValue,
        @Nullable String stringValue) {
        this.key = Objects.requireNonNull(key);
        this.refValue = refValue;
        this.stringValue = stringValue;
    }

    /**
     * Field identifier.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Field value, expressed as the identifier of another object
     * 
    */
    public Optional<String> getRefValue() {
        return Optional.ofNullable(this.refValue);
    }
    /**
     * Field value, expressed as a String.
     * 
    */
    public Optional<String> getStringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionPipelineObjectField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String refValue;
        private @Nullable String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionPipelineObjectField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.refValue = defaults.refValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setRefValue(@Nullable String refValue) {
            this.refValue = refValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public PipelineDefinitionPipelineObjectField build() {
            return new PipelineDefinitionPipelineObjectField(key, refValue, stringValue);
        }
    }
}
