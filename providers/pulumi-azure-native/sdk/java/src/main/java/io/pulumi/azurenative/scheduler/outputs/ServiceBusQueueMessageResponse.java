// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.ServiceBusAuthenticationResponse;
import io.pulumi.azurenative.scheduler.outputs.ServiceBusBrokeredMessagePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceBusQueueMessageResponse {
    /**
     * Gets or sets the Service Bus authentication.
     * 
     */
    private final @Nullable ServiceBusAuthenticationResponse authentication;
    /**
     * Gets or sets the brokered message properties.
     * 
     */
    private final @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;
    /**
     * Gets or sets the custom message properties.
     * 
     */
    private final @Nullable Map<String,String> customMessageProperties;
    /**
     * Gets or sets the message.
     * 
     */
    private final @Nullable String message;
    /**
     * Gets or sets the namespace.
     * 
     */
    private final @Nullable String namespace;
    /**
     * Gets or sets the queue name.
     * 
     */
    private final @Nullable String queueName;
    /**
     * Gets or sets the transport type.
     * 
     */
    private final @Nullable String transportType;

    @OutputCustomType.Constructor({"authentication","brokeredMessageProperties","customMessageProperties","message","namespace","queueName","transportType"})
    private ServiceBusQueueMessageResponse(
        @Nullable ServiceBusAuthenticationResponse authentication,
        @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties,
        @Nullable Map<String,String> customMessageProperties,
        @Nullable String message,
        @Nullable String namespace,
        @Nullable String queueName,
        @Nullable String transportType) {
        this.authentication = authentication;
        this.brokeredMessageProperties = brokeredMessageProperties;
        this.customMessageProperties = customMessageProperties;
        this.message = message;
        this.namespace = namespace;
        this.queueName = queueName;
        this.transportType = transportType;
    }

    /**
     * Gets or sets the Service Bus authentication.
     * 
    */
    public Optional<ServiceBusAuthenticationResponse> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Gets or sets the brokered message properties.
     * 
    */
    public Optional<ServiceBusBrokeredMessagePropertiesResponse> getBrokeredMessageProperties() {
        return Optional.ofNullable(this.brokeredMessageProperties);
    }
    /**
     * Gets or sets the custom message properties.
     * 
    */
    public Map<String,String> getCustomMessageProperties() {
        return this.customMessageProperties == null ? Map.of() : this.customMessageProperties;
    }
    /**
     * Gets or sets the message.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Gets or sets the namespace.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * Gets or sets the queue name.
     * 
    */
    public Optional<String> getQueueName() {
        return Optional.ofNullable(this.queueName);
    }
    /**
     * Gets or sets the transport type.
     * 
    */
    public Optional<String> getTransportType() {
        return Optional.ofNullable(this.transportType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceBusAuthenticationResponse authentication;
        private @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;
        private @Nullable Map<String,String> customMessageProperties;
        private @Nullable String message;
        private @Nullable String namespace;
        private @Nullable String queueName;
        private @Nullable String transportType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.brokeredMessageProperties = defaults.brokeredMessageProperties;
    	      this.customMessageProperties = defaults.customMessageProperties;
    	      this.message = defaults.message;
    	      this.namespace = defaults.namespace;
    	      this.queueName = defaults.queueName;
    	      this.transportType = defaults.transportType;
        }

        public Builder setAuthentication(@Nullable ServiceBusAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBrokeredMessageProperties(@Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties) {
            this.brokeredMessageProperties = brokeredMessageProperties;
            return this;
        }

        public Builder setCustomMessageProperties(@Nullable Map<String,String> customMessageProperties) {
            this.customMessageProperties = customMessageProperties;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setTransportType(@Nullable String transportType) {
            this.transportType = transportType;
            return this;
        }
        public ServiceBusQueueMessageResponse build() {
            return new ServiceBusQueueMessageResponse(authentication, brokeredMessageProperties, customMessageProperties, message, namespace, queueName, transportType);
        }
    }
}
