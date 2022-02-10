// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceTapConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkTapResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkTapResponse Empty = new VirtualNetworkTapResponse();

    @InputImport(name="destinationLoadBalancerFrontEndIPConfiguration")
    private final @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration;

    public Optional<FrontendIPConfigurationResponse> getDestinationLoadBalancerFrontEndIPConfiguration() {
        return this.destinationLoadBalancerFrontEndIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.destinationLoadBalancerFrontEndIPConfiguration);
    }

    @InputImport(name="destinationNetworkInterfaceIPConfiguration")
    private final @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration;

    public Optional<NetworkInterfaceIPConfigurationResponse> getDestinationNetworkInterfaceIPConfiguration() {
        return this.destinationNetworkInterfaceIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.destinationNetworkInterfaceIPConfiguration);
    }

    @InputImport(name="destinationPort")
    private final @Nullable Integer destinationPort;

    public Optional<Integer> getDestinationPort() {
        return this.destinationPort == null ? Optional.empty() : Optional.ofNullable(this.destinationPort);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="networkInterfaceTapConfigurations", required=true)
    private final List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations;

    public List<NetworkInterfaceTapConfigurationResponse> getNetworkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="resourceGuid", required=true)
    private final String resourceGuid;

    public String getResourceGuid() {
        return this.resourceGuid;
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public VirtualNetworkTapResponse(
        @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration,
        @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration,
        @Nullable Integer destinationPort,
        String etag,
        @Nullable String id,
        @Nullable String location,
        String name,
        List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = destinationPort;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.networkInterfaceTapConfigurations = Objects.requireNonNull(networkInterfaceTapConfigurations, "expected parameter 'networkInterfaceTapConfigurations' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualNetworkTapResponse() {
        this.destinationLoadBalancerFrontEndIPConfiguration = null;
        this.destinationNetworkInterfaceIPConfiguration = null;
        this.destinationPort = null;
        this.etag = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.networkInterfaceTapConfigurations = List.of();
        this.provisioningState = null;
        this.resourceGuid = null;
        this.tags = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkTapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration;
        private @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration;
        private @Nullable Integer destinationPort;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkTapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationLoadBalancerFrontEndIPConfiguration = defaults.destinationLoadBalancerFrontEndIPConfiguration;
    	      this.destinationNetworkInterfaceIPConfiguration = defaults.destinationNetworkInterfaceIPConfiguration;
    	      this.destinationPort = defaults.destinationPort;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterfaceTapConfigurations = defaults.networkInterfaceTapConfigurations;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDestinationLoadBalancerFrontEndIPConfiguration(@Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }

        public Builder setDestinationNetworkInterfaceIPConfiguration(@Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkInterfaceTapConfigurations(List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations) {
            this.networkInterfaceTapConfigurations = Objects.requireNonNull(networkInterfaceTapConfigurations);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VirtualNetworkTapResponse build() {
            return new VirtualNetworkTapResponse(destinationLoadBalancerFrontEndIPConfiguration, destinationNetworkInterfaceIPConfiguration, destinationPort, etag, id, location, name, networkInterfaceTapConfigurations, provisioningState, resourceGuid, tags, type);
        }
    }
}