// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Tag type enables you to specify a key-value pair that can be used to store information about an AWS CloudFormation StackSet.
 * 
 */
public final class StackSetTag extends io.pulumi.resources.InvokeArgs {

    public static final StackSetTag Empty = new StackSetTag();

    /**
     * A string used to identify this tag. You can specify a maximum of 127 characters for a tag key.
     * 
     */
    @InputImport(name="key", required=true)
    private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * A string containing the value for this tag. You can specify a maximum of 256 characters for a tag value.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public StackSetTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private StackSetTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetTag defaults) {
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

        public StackSetTag build() {
            return new StackSetTag(key, value);
        }
    }
}
