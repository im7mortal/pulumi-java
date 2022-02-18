// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ParameterGroupTag {
    /**
     * The key for the tag. May not be null.
     * 
     */
    private final String key;
    /**
     * The tag's value. May be null.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private ParameterGroupTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The key for the tag. May not be null.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The tag's value. May be null.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ParameterGroupTag build() {
            return new ParameterGroupTag(key, value);
        }
    }
}
