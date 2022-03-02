// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceManagementPrivateLinkEndpointConnectionsResponse {
    /**
     * The private endpoint connections.
     * 
     */
    private final @Nullable List<String> privateEndpointConnections;

    @OutputCustomType.Constructor({"privateEndpointConnections"})
    private ResourceManagementPrivateLinkEndpointConnectionsResponse(@Nullable List<String> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
    }

    /**
     * The private endpoint connections.
     * 
    */
    public List<String> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> privateEndpointConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<String> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public ResourceManagementPrivateLinkEndpointConnectionsResponse build() {
            return new ResourceManagementPrivateLinkEndpointConnectionsResponse(privateEndpointConnections);
        }
    }
}
