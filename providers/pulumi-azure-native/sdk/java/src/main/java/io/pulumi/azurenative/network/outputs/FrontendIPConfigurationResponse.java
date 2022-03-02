// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrontendIPConfigurationResponse {
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
     * An array of references to inbound pools that use this frontend IP.
     * 
     */
    private final List<SubResourceResponse> inboundNatPools;
    /**
     * An array of references to inbound rules that use this frontend IP.
     * 
     */
    private final List<SubResourceResponse> inboundNatRules;
    /**
     * An array of references to load balancing rules that use this frontend IP.
     * 
     */
    private final List<SubResourceResponse> loadBalancingRules;
    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * An array of references to outbound rules that use this frontend IP.
     * 
     */
    private final List<SubResourceResponse> outboundRules;
    /**
     * The private IP address of the IP configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * The Private IP allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * The provisioning state of the frontend IP configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the Public IP resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse publicIPAddress;
    /**
     * The reference to the Public IP Prefix resource.
     * 
     */
    private final @Nullable SubResourceResponse publicIPPrefix;
    /**
     * The reference to the subnet resource.
     * 
     */
    private final @Nullable SubnetResponse subnet;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"etag","id","inboundNatPools","inboundNatRules","loadBalancingRules","name","outboundRules","privateIPAddress","privateIPAddressVersion","privateIPAllocationMethod","provisioningState","publicIPAddress","publicIPPrefix","subnet","type","zones"})
    private FrontendIPConfigurationResponse(
        String etag,
        @Nullable String id,
        List<SubResourceResponse> inboundNatPools,
        List<SubResourceResponse> inboundNatRules,
        List<SubResourceResponse> loadBalancingRules,
        @Nullable String name,
        List<SubResourceResponse> outboundRules,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAddressVersion,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable PublicIPAddressResponse publicIPAddress,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable SubnetResponse subnet,
        String type,
        @Nullable List<String> zones) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
        this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
        this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
        this.name = name;
        this.outboundRules = Objects.requireNonNull(outboundRules);
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddress = publicIPAddress;
        this.publicIPPrefix = publicIPPrefix;
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
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
     * An array of references to inbound pools that use this frontend IP.
     * 
    */
    public List<SubResourceResponse> getInboundNatPools() {
        return this.inboundNatPools;
    }
    /**
     * An array of references to inbound rules that use this frontend IP.
     * 
    */
    public List<SubResourceResponse> getInboundNatRules() {
        return this.inboundNatRules;
    }
    /**
     * An array of references to load balancing rules that use this frontend IP.
     * 
    */
    public List<SubResourceResponse> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * An array of references to outbound rules that use this frontend IP.
     * 
    */
    public List<SubResourceResponse> getOutboundRules() {
        return this.outboundRules;
    }
    /**
     * The private IP address of the IP configuration.
     * 
    */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * 
    */
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * The Private IP allocation method.
     * 
    */
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * The provisioning state of the frontend IP configuration resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the Public IP resource.
     * 
    */
    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    /**
     * The reference to the Public IP Prefix resource.
     * 
    */
    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    /**
     * The reference to the subnet resource.
     * 
    */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private List<SubResourceResponse> inboundNatPools;
        private List<SubResourceResponse> inboundNatRules;
        private List<SubResourceResponse> loadBalancingRules;
        private @Nullable String name;
        private List<SubResourceResponse> outboundRules;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable PublicIPAddressResponse publicIPAddress;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable SubnetResponse subnet;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundNatPools(List<SubResourceResponse> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }

        public Builder setInboundNatRules(List<SubResourceResponse> inboundNatRules) {
            this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
            return this;
        }

        public Builder setLoadBalancingRules(List<SubResourceResponse> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOutboundRules(List<SubResourceResponse> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public FrontendIPConfigurationResponse build() {
            return new FrontendIPConfigurationResponse(etag, id, inboundNatPools, inboundNatRules, loadBalancingRules, name, outboundRules, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, provisioningState, publicIPAddress, publicIPPrefix, subnet, type, zones);
        }
    }
}
