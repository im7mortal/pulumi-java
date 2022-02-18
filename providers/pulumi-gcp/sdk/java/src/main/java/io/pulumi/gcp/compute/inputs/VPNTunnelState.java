// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VPNTunnelState extends io.pulumi.resources.ResourceArgs {

    public static final VPNTunnelState Empty = new VPNTunnelState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
    private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Detailed status message for the VPN tunnel.
     * 
     */
    @InputImport(name="detailedStatus")
    private final @Nullable Input<String> detailedStatus;

    public Input<String> getDetailedStatus() {
        return this.detailedStatus == null ? Input.empty() : this.detailedStatus;
    }

    /**
     * IKE protocol version to use when establishing the VPN tunnel with
     * peer VPN gateway.
     * Acceptable IKE versions are 1 or 2. Default version is 2.
     * 
     */
    @InputImport(name="ikeVersion")
    private final @Nullable Input<Integer> ikeVersion;

    public Input<Integer> getIkeVersion() {
        return this.ikeVersion == null ? Input.empty() : this.ikeVersion;
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @InputImport(name="labelFingerprint")
    private final @Nullable Input<String> labelFingerprint;

    public Input<String> getLabelFingerprint() {
        return this.labelFingerprint == null ? Input.empty() : this.labelFingerprint;
    }

    /**
     * Labels to apply to this VpnTunnel.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Local traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    @InputImport(name="localTrafficSelectors")
    private final @Nullable Input<List<String>> localTrafficSelectors;

    public Input<List<String>> getLocalTrafficSelectors() {
        return this.localTrafficSelectors == null ? Input.empty() : this.localTrafficSelectors;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63
     * characters long and match the regular expression
     * `a-z?` which means the first character
     * must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    @InputImport(name="peerExternalGateway")
    private final @Nullable Input<String> peerExternalGateway;

    public Input<String> getPeerExternalGateway() {
        return this.peerExternalGateway == null ? Input.empty() : this.peerExternalGateway;
    }

    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    @InputImport(name="peerExternalGatewayInterface")
    private final @Nullable Input<Integer> peerExternalGatewayInterface;

    public Input<Integer> getPeerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface == null ? Input.empty() : this.peerExternalGatewayInterface;
    }

    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected.
     * If provided, the VPN tunnel will automatically use the same vpn_gateway_interface
     * ID in the peer GCP VPN gateway.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    @InputImport(name="peerGcpGateway")
    private final @Nullable Input<String> peerGcpGateway;

    public Input<String> getPeerGcpGateway() {
        return this.peerGcpGateway == null ? Input.empty() : this.peerGcpGateway;
    }

    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @InputImport(name="peerIp")
    private final @Nullable Input<String> peerIp;

    public Input<String> getPeerIp() {
        return this.peerIp == null ? Input.empty() : this.peerIp;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region where the tunnel is located. If unset, is set to the region of `target_vpn_gateway`.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Remote traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    @InputImport(name="remoteTrafficSelectors")
    private final @Nullable Input<List<String>> remoteTrafficSelectors;

    public Input<List<String>> getRemoteTrafficSelectors() {
        return this.remoteTrafficSelectors == null ? Input.empty() : this.remoteTrafficSelectors;
    }

    /**
     * URL of router resource to be used for dynamic routing.
     * 
     */
    @InputImport(name="router")
    private final @Nullable Input<String> router;

    public Input<String> getRouter() {
        return this.router == null ? Input.empty() : this.router;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * Shared secret used to set the secure session between the Cloud VPN
     * gateway and the peer VPN gateway.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="sharedSecret")
    private final @Nullable Input<String> sharedSecret;

    public Input<String> getSharedSecret() {
        return this.sharedSecret == null ? Input.empty() : this.sharedSecret;
    }

    /**
     * Hash of the shared secret.
     * 
     */
    @InputImport(name="sharedSecretHash")
    private final @Nullable Input<String> sharedSecretHash;

    public Input<String> getSharedSecretHash() {
        return this.sharedSecretHash == null ? Input.empty() : this.sharedSecretHash;
    }

    /**
     * URL of the Target VPN gateway with which this VPN tunnel is
     * associated.
     * 
     */
    @InputImport(name="targetVpnGateway")
    private final @Nullable Input<String> targetVpnGateway;

    public Input<String> getTargetVpnGateway() {
        return this.targetVpnGateway == null ? Input.empty() : this.targetVpnGateway;
    }

    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @InputImport(name="tunnelId")
    private final @Nullable Input<String> tunnelId;

    public Input<String> getTunnelId() {
        return this.tunnelId == null ? Input.empty() : this.tunnelId;
    }

    /**
     * URL of the VPN gateway with which this VPN tunnel is associated.
     * This must be used if a High Availability VPN gateway resource is created.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    @InputImport(name="vpnGateway")
    private final @Nullable Input<String> vpnGateway;

    public Input<String> getVpnGateway() {
        return this.vpnGateway == null ? Input.empty() : this.vpnGateway;
    }

    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @InputImport(name="vpnGatewayInterface")
    private final @Nullable Input<Integer> vpnGatewayInterface;

    public Input<Integer> getVpnGatewayInterface() {
        return this.vpnGatewayInterface == null ? Input.empty() : this.vpnGatewayInterface;
    }

    public VPNTunnelState(
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> detailedStatus,
        @Nullable Input<Integer> ikeVersion,
        @Nullable Input<String> labelFingerprint,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> localTrafficSelectors,
        @Nullable Input<String> name,
        @Nullable Input<String> peerExternalGateway,
        @Nullable Input<Integer> peerExternalGatewayInterface,
        @Nullable Input<String> peerGcpGateway,
        @Nullable Input<String> peerIp,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<List<String>> remoteTrafficSelectors,
        @Nullable Input<String> router,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> sharedSecret,
        @Nullable Input<String> sharedSecretHash,
        @Nullable Input<String> targetVpnGateway,
        @Nullable Input<String> tunnelId,
        @Nullable Input<String> vpnGateway,
        @Nullable Input<Integer> vpnGatewayInterface) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.detailedStatus = detailedStatus;
        this.ikeVersion = ikeVersion;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.localTrafficSelectors = localTrafficSelectors;
        this.name = name;
        this.peerExternalGateway = peerExternalGateway;
        this.peerExternalGatewayInterface = peerExternalGatewayInterface;
        this.peerGcpGateway = peerGcpGateway;
        this.peerIp = peerIp;
        this.project = project;
        this.region = region;
        this.remoteTrafficSelectors = remoteTrafficSelectors;
        this.router = router;
        this.selfLink = selfLink;
        this.sharedSecret = sharedSecret;
        this.sharedSecretHash = sharedSecretHash;
        this.targetVpnGateway = targetVpnGateway;
        this.tunnelId = tunnelId;
        this.vpnGateway = vpnGateway;
        this.vpnGatewayInterface = vpnGatewayInterface;
    }

    private VPNTunnelState() {
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.detailedStatus = Input.empty();
        this.ikeVersion = Input.empty();
        this.labelFingerprint = Input.empty();
        this.labels = Input.empty();
        this.localTrafficSelectors = Input.empty();
        this.name = Input.empty();
        this.peerExternalGateway = Input.empty();
        this.peerExternalGatewayInterface = Input.empty();
        this.peerGcpGateway = Input.empty();
        this.peerIp = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.remoteTrafficSelectors = Input.empty();
        this.router = Input.empty();
        this.selfLink = Input.empty();
        this.sharedSecret = Input.empty();
        this.sharedSecretHash = Input.empty();
        this.targetVpnGateway = Input.empty();
        this.tunnelId = Input.empty();
        this.vpnGateway = Input.empty();
        this.vpnGatewayInterface = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VPNTunnelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> detailedStatus;
        private @Nullable Input<Integer> ikeVersion;
        private @Nullable Input<String> labelFingerprint;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> localTrafficSelectors;
        private @Nullable Input<String> name;
        private @Nullable Input<String> peerExternalGateway;
        private @Nullable Input<Integer> peerExternalGatewayInterface;
        private @Nullable Input<String> peerGcpGateway;
        private @Nullable Input<String> peerIp;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<List<String>> remoteTrafficSelectors;
        private @Nullable Input<String> router;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> sharedSecret;
        private @Nullable Input<String> sharedSecretHash;
        private @Nullable Input<String> targetVpnGateway;
        private @Nullable Input<String> tunnelId;
        private @Nullable Input<String> vpnGateway;
        private @Nullable Input<Integer> vpnGatewayInterface;

        public Builder() {
    	      // Empty
        }

        public Builder(VPNTunnelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.detailedStatus = defaults.detailedStatus;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.localTrafficSelectors = defaults.localTrafficSelectors;
    	      this.name = defaults.name;
    	      this.peerExternalGateway = defaults.peerExternalGateway;
    	      this.peerExternalGatewayInterface = defaults.peerExternalGatewayInterface;
    	      this.peerGcpGateway = defaults.peerGcpGateway;
    	      this.peerIp = defaults.peerIp;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.remoteTrafficSelectors = defaults.remoteTrafficSelectors;
    	      this.router = defaults.router;
    	      this.selfLink = defaults.selfLink;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.sharedSecretHash = defaults.sharedSecretHash;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
    	      this.tunnelId = defaults.tunnelId;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnGatewayInterface = defaults.vpnGatewayInterface;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDetailedStatus(@Nullable Input<String> detailedStatus) {
            this.detailedStatus = detailedStatus;
            return this;
        }

        public Builder setDetailedStatus(@Nullable String detailedStatus) {
            this.detailedStatus = Input.ofNullable(detailedStatus);
            return this;
        }

        public Builder setIkeVersion(@Nullable Input<Integer> ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }

        public Builder setIkeVersion(@Nullable Integer ikeVersion) {
            this.ikeVersion = Input.ofNullable(ikeVersion);
            return this;
        }

        public Builder setLabelFingerprint(@Nullable Input<String> labelFingerprint) {
            this.labelFingerprint = labelFingerprint;
            return this;
        }

        public Builder setLabelFingerprint(@Nullable String labelFingerprint) {
            this.labelFingerprint = Input.ofNullable(labelFingerprint);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocalTrafficSelectors(@Nullable Input<List<String>> localTrafficSelectors) {
            this.localTrafficSelectors = localTrafficSelectors;
            return this;
        }

        public Builder setLocalTrafficSelectors(@Nullable List<String> localTrafficSelectors) {
            this.localTrafficSelectors = Input.ofNullable(localTrafficSelectors);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeerExternalGateway(@Nullable Input<String> peerExternalGateway) {
            this.peerExternalGateway = peerExternalGateway;
            return this;
        }

        public Builder setPeerExternalGateway(@Nullable String peerExternalGateway) {
            this.peerExternalGateway = Input.ofNullable(peerExternalGateway);
            return this;
        }

        public Builder setPeerExternalGatewayInterface(@Nullable Input<Integer> peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = peerExternalGatewayInterface;
            return this;
        }

        public Builder setPeerExternalGatewayInterface(@Nullable Integer peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = Input.ofNullable(peerExternalGatewayInterface);
            return this;
        }

        public Builder setPeerGcpGateway(@Nullable Input<String> peerGcpGateway) {
            this.peerGcpGateway = peerGcpGateway;
            return this;
        }

        public Builder setPeerGcpGateway(@Nullable String peerGcpGateway) {
            this.peerGcpGateway = Input.ofNullable(peerGcpGateway);
            return this;
        }

        public Builder setPeerIp(@Nullable Input<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }

        public Builder setPeerIp(@Nullable String peerIp) {
            this.peerIp = Input.ofNullable(peerIp);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRemoteTrafficSelectors(@Nullable Input<List<String>> remoteTrafficSelectors) {
            this.remoteTrafficSelectors = remoteTrafficSelectors;
            return this;
        }

        public Builder setRemoteTrafficSelectors(@Nullable List<String> remoteTrafficSelectors) {
            this.remoteTrafficSelectors = Input.ofNullable(remoteTrafficSelectors);
            return this;
        }

        public Builder setRouter(@Nullable Input<String> router) {
            this.router = router;
            return this;
        }

        public Builder setRouter(@Nullable String router) {
            this.router = Input.ofNullable(router);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSharedSecret(@Nullable Input<String> sharedSecret) {
            this.sharedSecret = sharedSecret;
            return this;
        }

        public Builder setSharedSecret(@Nullable String sharedSecret) {
            this.sharedSecret = Input.ofNullable(sharedSecret);
            return this;
        }

        public Builder setSharedSecretHash(@Nullable Input<String> sharedSecretHash) {
            this.sharedSecretHash = sharedSecretHash;
            return this;
        }

        public Builder setSharedSecretHash(@Nullable String sharedSecretHash) {
            this.sharedSecretHash = Input.ofNullable(sharedSecretHash);
            return this;
        }

        public Builder setTargetVpnGateway(@Nullable Input<String> targetVpnGateway) {
            this.targetVpnGateway = targetVpnGateway;
            return this;
        }

        public Builder setTargetVpnGateway(@Nullable String targetVpnGateway) {
            this.targetVpnGateway = Input.ofNullable(targetVpnGateway);
            return this;
        }

        public Builder setTunnelId(@Nullable Input<String> tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        public Builder setTunnelId(@Nullable String tunnelId) {
            this.tunnelId = Input.ofNullable(tunnelId);
            return this;
        }

        public Builder setVpnGateway(@Nullable Input<String> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }

        public Builder setVpnGateway(@Nullable String vpnGateway) {
            this.vpnGateway = Input.ofNullable(vpnGateway);
            return this;
        }

        public Builder setVpnGatewayInterface(@Nullable Input<Integer> vpnGatewayInterface) {
            this.vpnGatewayInterface = vpnGatewayInterface;
            return this;
        }

        public Builder setVpnGatewayInterface(@Nullable Integer vpnGatewayInterface) {
            this.vpnGatewayInterface = Input.ofNullable(vpnGatewayInterface);
            return this;
        }

        public VPNTunnelState build() {
            return new VPNTunnelState(creationTimestamp, description, detailedStatus, ikeVersion, labelFingerprint, labels, localTrafficSelectors, name, peerExternalGateway, peerExternalGatewayInterface, peerGcpGateway, peerIp, project, region, remoteTrafficSelectors, router, selfLink, sharedSecret, sharedSecretHash, targetVpnGateway, tunnelId, vpnGateway, vpnGatewayInterface);
        }
    }
}