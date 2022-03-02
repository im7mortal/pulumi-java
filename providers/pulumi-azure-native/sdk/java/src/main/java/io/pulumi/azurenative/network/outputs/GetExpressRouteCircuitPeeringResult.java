// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitConnectionResponse;
import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitStatsResponse;
import io.pulumi.azurenative.network.outputs.ExpressRouteConnectionIdResponse;
import io.pulumi.azurenative.network.outputs.Ipv6ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.azurenative.network.outputs.PeerExpressRouteCircuitConnectionResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExpressRouteCircuitPeeringResult {
    /**
     * The Azure ASN.
     * 
     */
    private final @Nullable Integer azureASN;
    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    private final @Nullable List<ExpressRouteCircuitConnectionResponse> connections;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The ExpressRoute connection.
     * 
     */
    private final @Nullable ExpressRouteConnectionIdResponse expressRouteConnection;
    /**
     * The GatewayManager Etag.
     * 
     */
    private final @Nullable String gatewayManagerEtag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The IPv6 peering configuration.
     * 
     */
    private final @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig;
    /**
     * Who was the last to modify the peering.
     * 
     */
    private final String lastModifiedBy;
    /**
     * The Microsoft peering configuration.
     * 
     */
    private final @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The peer ASN.
     * 
     */
    private final @Nullable Double peerASN;
    /**
     * The list of peered circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    private final List<PeerExpressRouteCircuitConnectionResponse> peeredConnections;
    /**
     * The peering type.
     * 
     */
    private final @Nullable String peeringType;
    /**
     * The primary port.
     * 
     */
    private final @Nullable String primaryAzurePort;
    /**
     * The primary address prefix.
     * 
     */
    private final @Nullable String primaryPeerAddressPrefix;
    /**
     * The provisioning state of the express route circuit peering resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the RouteFilter resource.
     * 
     */
    private final @Nullable SubResourceResponse routeFilter;
    /**
     * The secondary port.
     * 
     */
    private final @Nullable String secondaryAzurePort;
    /**
     * The secondary address prefix.
     * 
     */
    private final @Nullable String secondaryPeerAddressPrefix;
    /**
     * The shared key.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * The peering state.
     * 
     */
    private final @Nullable String state;
    /**
     * The peering stats of express route circuit.
     * 
     */
    private final @Nullable ExpressRouteCircuitStatsResponse stats;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * The VLAN ID.
     * 
     */
    private final @Nullable Integer vlanId;

    @OutputCustomType.Constructor({"azureASN","connections","etag","expressRouteConnection","gatewayManagerEtag","id","ipv6PeeringConfig","lastModifiedBy","microsoftPeeringConfig","name","peerASN","peeredConnections","peeringType","primaryAzurePort","primaryPeerAddressPrefix","provisioningState","routeFilter","secondaryAzurePort","secondaryPeerAddressPrefix","sharedKey","state","stats","type","vlanId"})
    private GetExpressRouteCircuitPeeringResult(
        @Nullable Integer azureASN,
        @Nullable List<ExpressRouteCircuitConnectionResponse> connections,
        String etag,
        @Nullable ExpressRouteConnectionIdResponse expressRouteConnection,
        @Nullable String gatewayManagerEtag,
        @Nullable String id,
        @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig,
        String lastModifiedBy,
        @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig,
        @Nullable String name,
        @Nullable Double peerASN,
        List<PeerExpressRouteCircuitConnectionResponse> peeredConnections,
        @Nullable String peeringType,
        @Nullable String primaryAzurePort,
        @Nullable String primaryPeerAddressPrefix,
        String provisioningState,
        @Nullable SubResourceResponse routeFilter,
        @Nullable String secondaryAzurePort,
        @Nullable String secondaryPeerAddressPrefix,
        @Nullable String sharedKey,
        @Nullable String state,
        @Nullable ExpressRouteCircuitStatsResponse stats,
        String type,
        @Nullable Integer vlanId) {
        this.azureASN = azureASN;
        this.connections = connections;
        this.etag = Objects.requireNonNull(etag);
        this.expressRouteConnection = expressRouteConnection;
        this.gatewayManagerEtag = gatewayManagerEtag;
        this.id = id;
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.name = name;
        this.peerASN = peerASN;
        this.peeredConnections = Objects.requireNonNull(peeredConnections);
        this.peeringType = peeringType;
        this.primaryAzurePort = primaryAzurePort;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routeFilter = routeFilter;
        this.secondaryAzurePort = secondaryAzurePort;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.sharedKey = sharedKey;
        this.state = state;
        this.stats = stats;
        this.type = Objects.requireNonNull(type);
        this.vlanId = vlanId;
    }

    /**
     * The Azure ASN.
     * 
    */
    public Optional<Integer> getAzureASN() {
        return Optional.ofNullable(this.azureASN);
    }
    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
    */
    public List<ExpressRouteCircuitConnectionResponse> getConnections() {
        return this.connections == null ? List.of() : this.connections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The ExpressRoute connection.
     * 
    */
    public Optional<ExpressRouteConnectionIdResponse> getExpressRouteConnection() {
        return Optional.ofNullable(this.expressRouteConnection);
    }
    /**
     * The GatewayManager Etag.
     * 
    */
    public Optional<String> getGatewayManagerEtag() {
        return Optional.ofNullable(this.gatewayManagerEtag);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IPv6 peering configuration.
     * 
    */
    public Optional<Ipv6ExpressRouteCircuitPeeringConfigResponse> getIpv6PeeringConfig() {
        return Optional.ofNullable(this.ipv6PeeringConfig);
    }
    /**
     * Who was the last to modify the peering.
     * 
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The Microsoft peering configuration.
     * 
    */
    public Optional<ExpressRouteCircuitPeeringConfigResponse> getMicrosoftPeeringConfig() {
        return Optional.ofNullable(this.microsoftPeeringConfig);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The peer ASN.
     * 
    */
    public Optional<Double> getPeerASN() {
        return Optional.ofNullable(this.peerASN);
    }
    /**
     * The list of peered circuit connections associated with Azure Private Peering for this circuit.
     * 
    */
    public List<PeerExpressRouteCircuitConnectionResponse> getPeeredConnections() {
        return this.peeredConnections;
    }
    /**
     * The peering type.
     * 
    */
    public Optional<String> getPeeringType() {
        return Optional.ofNullable(this.peeringType);
    }
    /**
     * The primary port.
     * 
    */
    public Optional<String> getPrimaryAzurePort() {
        return Optional.ofNullable(this.primaryAzurePort);
    }
    /**
     * The primary address prefix.
     * 
    */
    public Optional<String> getPrimaryPeerAddressPrefix() {
        return Optional.ofNullable(this.primaryPeerAddressPrefix);
    }
    /**
     * The provisioning state of the express route circuit peering resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the RouteFilter resource.
     * 
    */
    public Optional<SubResourceResponse> getRouteFilter() {
        return Optional.ofNullable(this.routeFilter);
    }
    /**
     * The secondary port.
     * 
    */
    public Optional<String> getSecondaryAzurePort() {
        return Optional.ofNullable(this.secondaryAzurePort);
    }
    /**
     * The secondary address prefix.
     * 
    */
    public Optional<String> getSecondaryPeerAddressPrefix() {
        return Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }
    /**
     * The shared key.
     * 
    */
    public Optional<String> getSharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * The peering state.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The peering stats of express route circuit.
     * 
    */
    public Optional<ExpressRouteCircuitStatsResponse> getStats() {
        return Optional.ofNullable(this.stats);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The VLAN ID.
     * 
    */
    public Optional<Integer> getVlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCircuitPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer azureASN;
        private @Nullable List<ExpressRouteCircuitConnectionResponse> connections;
        private String etag;
        private @Nullable ExpressRouteConnectionIdResponse expressRouteConnection;
        private @Nullable String gatewayManagerEtag;
        private @Nullable String id;
        private @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig;
        private String lastModifiedBy;
        private @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
        private @Nullable String name;
        private @Nullable Double peerASN;
        private List<PeerExpressRouteCircuitConnectionResponse> peeredConnections;
        private @Nullable String peeringType;
        private @Nullable String primaryAzurePort;
        private @Nullable String primaryPeerAddressPrefix;
        private String provisioningState;
        private @Nullable SubResourceResponse routeFilter;
        private @Nullable String secondaryAzurePort;
        private @Nullable String secondaryPeerAddressPrefix;
        private @Nullable String sharedKey;
        private @Nullable String state;
        private @Nullable ExpressRouteCircuitStatsResponse stats;
        private String type;
        private @Nullable Integer vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteCircuitPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureASN = defaults.azureASN;
    	      this.connections = defaults.connections;
    	      this.etag = defaults.etag;
    	      this.expressRouteConnection = defaults.expressRouteConnection;
    	      this.gatewayManagerEtag = defaults.gatewayManagerEtag;
    	      this.id = defaults.id;
    	      this.ipv6PeeringConfig = defaults.ipv6PeeringConfig;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.name = defaults.name;
    	      this.peerASN = defaults.peerASN;
    	      this.peeredConnections = defaults.peeredConnections;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryAzurePort = defaults.primaryAzurePort;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryAzurePort = defaults.secondaryAzurePort;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
    	      this.type = defaults.type;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder setAzureASN(@Nullable Integer azureASN) {
            this.azureASN = azureASN;
            return this;
        }

        public Builder setConnections(@Nullable List<ExpressRouteCircuitConnectionResponse> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpressRouteConnection(@Nullable ExpressRouteConnectionIdResponse expressRouteConnection) {
            this.expressRouteConnection = expressRouteConnection;
            return this;
        }

        public Builder setGatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            this.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig) {
            this.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPeerASN(@Nullable Double peerASN) {
            this.peerASN = peerASN;
            return this;
        }

        public Builder setPeeredConnections(List<PeerExpressRouteCircuitConnectionResponse> peeredConnections) {
            this.peeredConnections = Objects.requireNonNull(peeredConnections);
            return this;
        }

        public Builder setPeeringType(@Nullable String peeringType) {
            this.peeringType = peeringType;
            return this;
        }

        public Builder setPrimaryAzurePort(@Nullable String primaryAzurePort) {
            this.primaryAzurePort = primaryAzurePort;
            return this;
        }

        public Builder setPrimaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRouteFilter(@Nullable SubResourceResponse routeFilter) {
            this.routeFilter = routeFilter;
            return this;
        }

        public Builder setSecondaryAzurePort(@Nullable String secondaryAzurePort) {
            this.secondaryAzurePort = secondaryAzurePort;
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder setSharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStats(@Nullable ExpressRouteCircuitStatsResponse stats) {
            this.stats = stats;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVlanId(@Nullable Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public GetExpressRouteCircuitPeeringResult build() {
            return new GetExpressRouteCircuitPeeringResult(azureASN, connections, etag, expressRouteConnection, gatewayManagerEtag, id, ipv6PeeringConfig, lastModifiedBy, microsoftPeeringConfig, name, peerASN, peeredConnections, peeringType, primaryAzurePort, primaryPeerAddressPrefix, provisioningState, routeFilter, secondaryAzurePort, secondaryPeerAddressPrefix, sharedKey, state, stats, type, vlanId);
        }
    }
}
