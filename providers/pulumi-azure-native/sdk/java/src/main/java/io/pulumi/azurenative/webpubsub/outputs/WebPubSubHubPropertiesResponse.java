// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.EventHandlerResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebPubSubHubPropertiesResponse {
    /**
     * The settings for configuring if anonymous connections are allowed for this hub: "allow" or "deny". Default to "deny".
     * 
     */
    private final @Nullable String anonymousConnectPolicy;
    /**
     * Event handler of a hub.
     * 
     */
    private final @Nullable List<EventHandlerResponse> eventHandlers;

    @OutputCustomType.Constructor({"anonymousConnectPolicy","eventHandlers"})
    private WebPubSubHubPropertiesResponse(
        @Nullable String anonymousConnectPolicy,
        @Nullable List<EventHandlerResponse> eventHandlers) {
        this.anonymousConnectPolicy = anonymousConnectPolicy;
        this.eventHandlers = eventHandlers;
    }

    /**
     * The settings for configuring if anonymous connections are allowed for this hub: "allow" or "deny". Default to "deny".
     * 
    */
    public Optional<String> getAnonymousConnectPolicy() {
        return Optional.ofNullable(this.anonymousConnectPolicy);
    }
    /**
     * Event handler of a hub.
     * 
    */
    public List<EventHandlerResponse> getEventHandlers() {
        return this.eventHandlers == null ? List.of() : this.eventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String anonymousConnectPolicy;
        private @Nullable List<EventHandlerResponse> eventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousConnectPolicy = defaults.anonymousConnectPolicy;
    	      this.eventHandlers = defaults.eventHandlers;
        }

        public Builder setAnonymousConnectPolicy(@Nullable String anonymousConnectPolicy) {
            this.anonymousConnectPolicy = anonymousConnectPolicy;
            return this;
        }

        public Builder setEventHandlers(@Nullable List<EventHandlerResponse> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }
        public WebPubSubHubPropertiesResponse build() {
            return new WebPubSubHubPropertiesResponse(anonymousConnectPolicy, eventHandlers);
        }
    }
}
