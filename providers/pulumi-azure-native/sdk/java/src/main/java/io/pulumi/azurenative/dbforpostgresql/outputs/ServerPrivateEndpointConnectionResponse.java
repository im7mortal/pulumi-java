// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.azurenative.dbforpostgresql.outputs.ServerPrivateEndpointConnectionPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServerPrivateEndpointConnectionResponse {
    /**
     * Resource ID of the Private Endpoint Connection.
     * 
     */
    private final String id;
    /**
     * Private endpoint connection properties
     * 
     */
    private final ServerPrivateEndpointConnectionPropertiesResponse properties;

    @OutputCustomType.Constructor({"id","properties"})
    private ServerPrivateEndpointConnectionResponse(
        String id,
        ServerPrivateEndpointConnectionPropertiesResponse properties) {
        this.id = Objects.requireNonNull(id);
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * Resource ID of the Private Endpoint Connection.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Private endpoint connection properties
     * 
    */
    public ServerPrivateEndpointConnectionPropertiesResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private ServerPrivateEndpointConnectionPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProperties(ServerPrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public ServerPrivateEndpointConnectionResponse build() {
            return new ServerPrivateEndpointConnectionResponse(id, properties);
        }
    }
}
