// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMessageGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of message groups that Amazon Lex uses to respond the user input.
 * 
 */
public final class BotResponseSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotResponseSpecificationArgs Empty = new BotResponseSpecificationArgs();

    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * 
     */
    @InputImport(name="allowInterrupt")
    private final @Nullable Input<Boolean> allowInterrupt;

    public Input<Boolean> getAllowInterrupt() {
        return this.allowInterrupt == null ? Input.empty() : this.allowInterrupt;
    }

    @InputImport(name="messageGroupsList", required=true)
    private final Input<List<BotMessageGroupArgs>> messageGroupsList;

    public Input<List<BotMessageGroupArgs>> getMessageGroupsList() {
        return this.messageGroupsList;
    }

    public BotResponseSpecificationArgs(
        @Nullable Input<Boolean> allowInterrupt,
        Input<List<BotMessageGroupArgs>> messageGroupsList) {
        this.allowInterrupt = allowInterrupt;
        this.messageGroupsList = Objects.requireNonNull(messageGroupsList, "expected parameter 'messageGroupsList' to be non-null");
    }

    private BotResponseSpecificationArgs() {
        this.allowInterrupt = Input.empty();
        this.messageGroupsList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotResponseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInterrupt;
        private Input<List<BotMessageGroupArgs>> messageGroupsList;

        public Builder() {
    	      // Empty
        }

        public Builder(BotResponseSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.messageGroupsList = defaults.messageGroupsList;
        }

        public Builder setAllowInterrupt(@Nullable Input<Boolean> allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder setAllowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = Input.ofNullable(allowInterrupt);
            return this;
        }

        public Builder setMessageGroupsList(Input<List<BotMessageGroupArgs>> messageGroupsList) {
            this.messageGroupsList = Objects.requireNonNull(messageGroupsList);
            return this;
        }

        public Builder setMessageGroupsList(List<BotMessageGroupArgs> messageGroupsList) {
            this.messageGroupsList = Input.of(Objects.requireNonNull(messageGroupsList));
            return this;
        }

        public BotResponseSpecificationArgs build() {
            return new BotResponseSpecificationArgs(allowInterrupt, messageGroupsList);
        }
    }
}
