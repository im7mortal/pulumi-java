// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkEndpointGroupLbNetworkEndpointGroupResponse {
    /**
     * @return The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
    private final Integer defaultPort;
    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
    private final String network;
    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
    private final String subnetwork;
    /**
     * @return The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated. */
    private final String zone;

    @CustomType.Constructor
    private NetworkEndpointGroupLbNetworkEndpointGroupResponse(
        @CustomType.Parameter("defaultPort") Integer defaultPort,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("zone") String zone) {
        this.defaultPort = defaultPort;
        this.network = network;
        this.subnetwork = subnetwork;
        this.zone = zone;
    }

    /**
     * @return The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
    public Integer defaultPort() {
        return this.defaultPort;
    }
    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
    public String network() {
        return this.network;
    }
    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * @return The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated. */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupLbNetworkEndpointGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultPort;
        private String network;
        private String subnetwork;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupLbNetworkEndpointGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPort = defaults.defaultPort;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
    	      this.zone = defaults.zone;
        }

        public Builder defaultPort(Integer defaultPort) {
            this.defaultPort = Objects.requireNonNull(defaultPort);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public NetworkEndpointGroupLbNetworkEndpointGroupResponse build() {
            return new NetworkEndpointGroupLbNetworkEndpointGroupResponse(defaultPort, network, subnetwork, zone);
        }
    }
}
