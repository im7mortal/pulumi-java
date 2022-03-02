// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.EventRequestMessageResponse;
import io.pulumi.azurenative.containerregistry.outputs.EventResponseMessageResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventResponse {
    /**
     * The event request message sent to the service URI.
     * 
     */
    private final @Nullable EventRequestMessageResponse eventRequestMessage;
    /**
     * The event response message received from the service URI.
     * 
     */
    private final @Nullable EventResponseMessageResponse eventResponseMessage;
    /**
     * The event ID.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"eventRequestMessage","eventResponseMessage","id"})
    private EventResponse(
        @Nullable EventRequestMessageResponse eventRequestMessage,
        @Nullable EventResponseMessageResponse eventResponseMessage,
        @Nullable String id) {
        this.eventRequestMessage = eventRequestMessage;
        this.eventResponseMessage = eventResponseMessage;
        this.id = id;
    }

    /**
     * The event request message sent to the service URI.
     * 
    */
    public Optional<EventRequestMessageResponse> getEventRequestMessage() {
        return Optional.ofNullable(this.eventRequestMessage);
    }
    /**
     * The event response message received from the service URI.
     * 
    */
    public Optional<EventResponseMessageResponse> getEventResponseMessage() {
        return Optional.ofNullable(this.eventResponseMessage);
    }
    /**
     * The event ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventRequestMessageResponse eventRequestMessage;
        private @Nullable EventResponseMessageResponse eventResponseMessage;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventRequestMessage = defaults.eventRequestMessage;
    	      this.eventResponseMessage = defaults.eventResponseMessage;
    	      this.id = defaults.id;
        }

        public Builder setEventRequestMessage(@Nullable EventRequestMessageResponse eventRequestMessage) {
            this.eventRequestMessage = eventRequestMessage;
            return this;
        }

        public Builder setEventResponseMessage(@Nullable EventResponseMessageResponse eventResponseMessage) {
            this.eventResponseMessage = eventResponseMessage;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }
        public EventResponse build() {
            return new EventResponse(eventRequestMessage, eventResponseMessage, id);
        }
    }
}
