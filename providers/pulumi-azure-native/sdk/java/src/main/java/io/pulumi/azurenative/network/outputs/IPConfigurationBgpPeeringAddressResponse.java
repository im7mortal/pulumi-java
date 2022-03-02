// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPConfigurationBgpPeeringAddressResponse {
    /**
     * The list of custom BGP peering addresses which belong to IP configuration.
     * 
     */
    private final @Nullable List<String> customBgpIpAddresses;
    /**
     * The list of default BGP peering addresses which belong to IP configuration.
     * 
     */
    private final List<String> defaultBgpIpAddresses;
    /**
     * The ID of IP configuration which belongs to gateway.
     * 
     */
    private final @Nullable String ipconfigurationId;
    /**
     * The list of tunnel public IP addresses which belong to IP configuration.
     * 
     */
    private final List<String> tunnelIpAddresses;

    @OutputCustomType.Constructor({"customBgpIpAddresses","defaultBgpIpAddresses","ipconfigurationId","tunnelIpAddresses"})
    private IPConfigurationBgpPeeringAddressResponse(
        @Nullable List<String> customBgpIpAddresses,
        List<String> defaultBgpIpAddresses,
        @Nullable String ipconfigurationId,
        List<String> tunnelIpAddresses) {
        this.customBgpIpAddresses = customBgpIpAddresses;
        this.defaultBgpIpAddresses = Objects.requireNonNull(defaultBgpIpAddresses);
        this.ipconfigurationId = ipconfigurationId;
        this.tunnelIpAddresses = Objects.requireNonNull(tunnelIpAddresses);
    }

    /**
     * The list of custom BGP peering addresses which belong to IP configuration.
     * 
    */
    public List<String> getCustomBgpIpAddresses() {
        return this.customBgpIpAddresses == null ? List.of() : this.customBgpIpAddresses;
    }
    /**
     * The list of default BGP peering addresses which belong to IP configuration.
     * 
    */
    public List<String> getDefaultBgpIpAddresses() {
        return this.defaultBgpIpAddresses;
    }
    /**
     * The ID of IP configuration which belongs to gateway.
     * 
    */
    public Optional<String> getIpconfigurationId() {
        return Optional.ofNullable(this.ipconfigurationId);
    }
    /**
     * The list of tunnel public IP addresses which belong to IP configuration.
     * 
    */
    public List<String> getTunnelIpAddresses() {
        return this.tunnelIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigurationBgpPeeringAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customBgpIpAddresses;
        private List<String> defaultBgpIpAddresses;
        private @Nullable String ipconfigurationId;
        private List<String> tunnelIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigurationBgpPeeringAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBgpIpAddresses = defaults.customBgpIpAddresses;
    	      this.defaultBgpIpAddresses = defaults.defaultBgpIpAddresses;
    	      this.ipconfigurationId = defaults.ipconfigurationId;
    	      this.tunnelIpAddresses = defaults.tunnelIpAddresses;
        }

        public Builder setCustomBgpIpAddresses(@Nullable List<String> customBgpIpAddresses) {
            this.customBgpIpAddresses = customBgpIpAddresses;
            return this;
        }

        public Builder setDefaultBgpIpAddresses(List<String> defaultBgpIpAddresses) {
            this.defaultBgpIpAddresses = Objects.requireNonNull(defaultBgpIpAddresses);
            return this;
        }

        public Builder setIpconfigurationId(@Nullable String ipconfigurationId) {
            this.ipconfigurationId = ipconfigurationId;
            return this;
        }

        public Builder setTunnelIpAddresses(List<String> tunnelIpAddresses) {
            this.tunnelIpAddresses = Objects.requireNonNull(tunnelIpAddresses);
            return this;
        }
        public IPConfigurationBgpPeeringAddressResponse build() {
            return new IPConfigurationBgpPeeringAddressResponse(customBgpIpAddresses, defaultBgpIpAddresses, ipconfigurationId, tunnelIpAddresses);
        }
    }
}
