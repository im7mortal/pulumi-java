// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotCustomPayload {
    /**
     * The string that is sent to your application.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"value"})
    private BotCustomPayload(String value) {
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The string that is sent to your application.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotCustomPayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotCustomPayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public BotCustomPayload build() {
            return new BotCustomPayload(value);
        }
    }
}
