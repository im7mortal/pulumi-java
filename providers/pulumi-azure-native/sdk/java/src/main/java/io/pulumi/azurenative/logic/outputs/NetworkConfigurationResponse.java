// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentAccessEndpointResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkConfigurationResponse {
    /**
     * The access endpoint.
     * 
     */
    private final @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint;
    /**
     * The subnets.
     * 
     */
    private final @Nullable List<ResourceReferenceResponse> subnets;
    /**
     * Gets the virtual network address space.
     * 
     */
    private final @Nullable String virtualNetworkAddressSpace;

    @OutputCustomType.Constructor({"accessEndpoint","subnets","virtualNetworkAddressSpace"})
    private NetworkConfigurationResponse(
        @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint,
        @Nullable List<ResourceReferenceResponse> subnets,
        @Nullable String virtualNetworkAddressSpace) {
        this.accessEndpoint = accessEndpoint;
        this.subnets = subnets;
        this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
    }

    /**
     * The access endpoint.
     * 
    */
    public Optional<IntegrationServiceEnvironmentAccessEndpointResponse> getAccessEndpoint() {
        return Optional.ofNullable(this.accessEndpoint);
    }
    /**
     * The subnets.
     * 
    */
    public List<ResourceReferenceResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * Gets the virtual network address space.
     * 
    */
    public Optional<String> getVirtualNetworkAddressSpace() {
        return Optional.ofNullable(this.virtualNetworkAddressSpace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint;
        private @Nullable List<ResourceReferenceResponse> subnets;
        private @Nullable String virtualNetworkAddressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoint = defaults.accessEndpoint;
    	      this.subnets = defaults.subnets;
    	      this.virtualNetworkAddressSpace = defaults.virtualNetworkAddressSpace;
        }

        public Builder setAccessEndpoint(@Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }

        public Builder setSubnets(@Nullable List<ResourceReferenceResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setVirtualNetworkAddressSpace(@Nullable String virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
            return this;
        }
        public NetworkConfigurationResponse build() {
            return new NetworkConfigurationResponse(accessEndpoint, subnets, virtualNetworkAddressSpace);
        }
    }
}
