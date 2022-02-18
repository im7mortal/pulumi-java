// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotFulfillmentStartResponseSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotFulfillmentUpdateResponseSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information for updating the user on the progress of fulfilling an intent.
 * 
 */
public final class BotFulfillmentUpdatesSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotFulfillmentUpdatesSpecificationArgs Empty = new BotFulfillmentUpdatesSpecificationArgs();

    /**
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * 
     */
    @InputImport(name="active", required=true)
    private final Input<Boolean> active;

    public Input<Boolean> getActive() {
        return this.active;
    }

    @InputImport(name="startResponse")
    private final @Nullable Input<BotFulfillmentStartResponseSpecificationArgs> startResponse;

    public Input<BotFulfillmentStartResponseSpecificationArgs> getStartResponse() {
        return this.startResponse == null ? Input.empty() : this.startResponse;
    }

    /**
     * The length of time that the fulfillment Lambda function should run before it times out.
     * 
     */
    @InputImport(name="timeoutInSeconds")
    private final @Nullable Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    @InputImport(name="updateResponse")
    private final @Nullable Input<BotFulfillmentUpdateResponseSpecificationArgs> updateResponse;

    public Input<BotFulfillmentUpdateResponseSpecificationArgs> getUpdateResponse() {
        return this.updateResponse == null ? Input.empty() : this.updateResponse;
    }

    public BotFulfillmentUpdatesSpecificationArgs(
        Input<Boolean> active,
        @Nullable Input<BotFulfillmentStartResponseSpecificationArgs> startResponse,
        @Nullable Input<Integer> timeoutInSeconds,
        @Nullable Input<BotFulfillmentUpdateResponseSpecificationArgs> updateResponse) {
        this.active = Objects.requireNonNull(active, "expected parameter 'active' to be non-null");
        this.startResponse = startResponse;
        this.timeoutInSeconds = timeoutInSeconds;
        this.updateResponse = updateResponse;
    }

    private BotFulfillmentUpdatesSpecificationArgs() {
        this.active = Input.empty();
        this.startResponse = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.updateResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotFulfillmentUpdatesSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> active;
        private @Nullable Input<BotFulfillmentStartResponseSpecificationArgs> startResponse;
        private @Nullable Input<Integer> timeoutInSeconds;
        private @Nullable Input<BotFulfillmentUpdateResponseSpecificationArgs> updateResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotFulfillmentUpdatesSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.startResponse = defaults.startResponse;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.updateResponse = defaults.updateResponse;
        }

        public Builder setActive(Input<Boolean> active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = Input.of(Objects.requireNonNull(active));
            return this;
        }

        public Builder setStartResponse(@Nullable Input<BotFulfillmentStartResponseSpecificationArgs> startResponse) {
            this.startResponse = startResponse;
            return this;
        }

        public Builder setStartResponse(@Nullable BotFulfillmentStartResponseSpecificationArgs startResponse) {
            this.startResponse = Input.ofNullable(startResponse);
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder setUpdateResponse(@Nullable Input<BotFulfillmentUpdateResponseSpecificationArgs> updateResponse) {
            this.updateResponse = updateResponse;
            return this;
        }

        public Builder setUpdateResponse(@Nullable BotFulfillmentUpdateResponseSpecificationArgs updateResponse) {
            this.updateResponse = Input.ofNullable(updateResponse);
            return this;
        }

        public BotFulfillmentUpdatesSpecificationArgs build() {
            return new BotFulfillmentUpdatesSpecificationArgs(active, startResponse, timeoutInSeconds, updateResponse);
        }
    }
}