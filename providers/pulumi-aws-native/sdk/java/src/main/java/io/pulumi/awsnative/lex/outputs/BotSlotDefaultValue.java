// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotSlotDefaultValue {
    /**
     * The default value to use when a user doesn't provide a value for a slot.
     * 
     */
    private final String defaultValue;

    @OutputCustomType.Constructor({"defaultValue"})
    private BotSlotDefaultValue(String defaultValue) {
        this.defaultValue = Objects.requireNonNull(defaultValue);
    }

    /**
     * The default value to use when a user doesn't provide a value for a slot.
     * 
    */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotDefaultValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotDefaultValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public BotSlotDefaultValue build() {
            return new BotSlotDefaultValue(defaultValue);
        }
    }
}
