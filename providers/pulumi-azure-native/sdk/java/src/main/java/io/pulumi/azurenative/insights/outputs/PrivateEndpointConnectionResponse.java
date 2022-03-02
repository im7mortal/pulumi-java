// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.insights.outputs.PrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateEndpointConnectionResponse {
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    private final @Nullable PrivateEndpointPropertyResponse privateEndpoint;
    /**
     * Connection state of the private endpoint connection.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * State of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","type"})
    private PrivateEndpointConnectionResponse(
        String id,
        String name,
        @Nullable PrivateEndpointPropertyResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        String provisioningState,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Private endpoint which the connection belongs to.
     * 
    */
    public Optional<PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Connection state of the private endpoint connection.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * State of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
