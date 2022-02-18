// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A button to use on a response card used to gather slot values from a user.
 * 
 */
public final class BotButtonArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotButtonArgs Empty = new BotButtonArgs();

    /**
     * The text that appears on the button.
     * 
     */
    @InputImport(name="text", required=true)
    private final Input<String> text;

    public Input<String> getText() {
        return this.text;
    }

    /**
     * The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public BotButtonArgs(
        Input<String> text,
        Input<String> value) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BotButtonArgs() {
        this.text = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> text;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotButtonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder setText(Input<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setText(String text) {
            this.text = Input.of(Objects.requireNonNull(text));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public BotButtonArgs build() {
            return new BotButtonArgs(text, value);
        }
    }
}
