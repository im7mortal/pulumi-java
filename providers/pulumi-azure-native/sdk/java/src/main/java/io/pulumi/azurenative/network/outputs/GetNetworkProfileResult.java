// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkProfileResult {
    /**
     * List of chid container network interface configurations.
     * 
     */
    private final @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations;
    /**
     * List of child container network interfaces.
     * 
     */
    private final List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the network profile resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the network profile resource.
     * 
     */
    private final String resourceGuid;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"containerNetworkInterfaceConfigurations","containerNetworkInterfaces","etag","id","location","name","provisioningState","resourceGuid","tags","type"})
    private GetNetworkProfileResult(
        @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations,
        List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces,
        String etag,
        @Nullable String id,
        @Nullable String location,
        String name,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        this.containerNetworkInterfaces = Objects.requireNonNull(containerNetworkInterfaces);
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of chid container network interface configurations.
     * 
    */
    public List<ContainerNetworkInterfaceConfigurationResponse> getContainerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations == null ? List.of() : this.containerNetworkInterfaceConfigurations;
    }
    /**
     * List of child container network interfaces.
     * 
    */
    public List<ContainerNetworkInterfaceResponse> getContainerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the network profile resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the network profile resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations;
        private List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaceConfigurations = defaults.containerNetworkInterfaceConfigurations;
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setContainerNetworkInterfaceConfigurations(@Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations) {
            this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
            return this;
        }

        public Builder setContainerNetworkInterfaces(List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = Objects.requireNonNull(containerNetworkInterfaces);
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
        public GetNetworkProfileResult build() {
            return new GetNetworkProfileResult(containerNetworkInterfaceConfigurations, containerNetworkInterfaces, etag, id, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}
