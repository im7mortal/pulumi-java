// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkPeeringResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkRoutingConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkResult {
    /**
     * @return Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    private final Boolean autoCreateSubnetworks;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    private final Boolean enableUlaInternalIpv6;
    /**
     * @return URL of the firewall policy the network is associated with.
     * 
     */
    private final String firewallPolicy;
    /**
     * @return The gateway address for default routing out of the network, selected by GCP.
     * 
     */
    private final String gatewayIPv4;
    /**
     * @return When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    private final String internalIpv6Range;
    /**
     * @return Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     * @deprecated
     * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     */
    @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
    private final String ipv4Range;
    /**
     * @return Type of the resource. Always compute#network for networks.
     * 
     */
    private final String kind;
    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    private final Integer mtu;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * @return The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
     * 
     */
    private final String networkFirewallPolicyEnforcementOrder;
    /**
     * @return A list of network peerings for the resource.
     * 
     */
    private final List<NetworkPeeringResponse> peerings;
    /**
     * @return URL of the region where the regional network resides. This field is not applicable to global network. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    private final NetworkRoutingConfigResponse routingConfig;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
     */
    private final List<String> subnetworks;

    @CustomType.Constructor
    private GetNetworkResult(
        @CustomType.Parameter("autoCreateSubnetworks") Boolean autoCreateSubnetworks,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enableUlaInternalIpv6") Boolean enableUlaInternalIpv6,
        @CustomType.Parameter("firewallPolicy") String firewallPolicy,
        @CustomType.Parameter("gatewayIPv4") String gatewayIPv4,
        @CustomType.Parameter("internalIpv6Range") String internalIpv6Range,
        @CustomType.Parameter("ipv4Range") String ipv4Range,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("mtu") Integer mtu,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkFirewallPolicyEnforcementOrder") String networkFirewallPolicyEnforcementOrder,
        @CustomType.Parameter("peerings") List<NetworkPeeringResponse> peerings,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("routingConfig") NetworkRoutingConfigResponse routingConfig,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("subnetworks") List<String> subnetworks) {
        this.autoCreateSubnetworks = autoCreateSubnetworks;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.enableUlaInternalIpv6 = enableUlaInternalIpv6;
        this.firewallPolicy = firewallPolicy;
        this.gatewayIPv4 = gatewayIPv4;
        this.internalIpv6Range = internalIpv6Range;
        this.ipv4Range = ipv4Range;
        this.kind = kind;
        this.mtu = mtu;
        this.name = name;
        this.networkFirewallPolicyEnforcementOrder = networkFirewallPolicyEnforcementOrder;
        this.peerings = peerings;
        this.region = region;
        this.routingConfig = routingConfig;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.subnetworks = subnetworks;
    }

    /**
     * @return Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    public Boolean autoCreateSubnetworks() {
        return this.autoCreateSubnetworks;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    public Boolean enableUlaInternalIpv6() {
        return this.enableUlaInternalIpv6;
    }
    /**
     * @return URL of the firewall policy the network is associated with.
     * 
     */
    public String firewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * @return The gateway address for default routing out of the network, selected by GCP.
     * 
     */
    public String gatewayIPv4() {
        return this.gatewayIPv4;
    }
    /**
     * @return When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    public String internalIpv6Range() {
        return this.internalIpv6Range;
    }
    /**
     * @return Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     * @deprecated
     * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     */
    @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
    public String ipv4Range() {
        return this.ipv4Range;
    }
    /**
     * @return Type of the resource. Always compute#network for networks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    public Integer mtu() {
        return this.mtu;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
     * 
     */
    public String networkFirewallPolicyEnforcementOrder() {
        return this.networkFirewallPolicyEnforcementOrder;
    }
    /**
     * @return A list of network peerings for the resource.
     * 
     */
    public List<NetworkPeeringResponse> peerings() {
        return this.peerings;
    }
    /**
     * @return URL of the region where the regional network resides. This field is not applicable to global network. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    public NetworkRoutingConfigResponse routingConfig() {
        return this.routingConfig;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
     */
    public List<String> subnetworks() {
        return this.subnetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateSubnetworks;
        private String creationTimestamp;
        private String description;
        private Boolean enableUlaInternalIpv6;
        private String firewallPolicy;
        private String gatewayIPv4;
        private String internalIpv6Range;
        private String ipv4Range;
        private String kind;
        private Integer mtu;
        private String name;
        private String networkFirewallPolicyEnforcementOrder;
        private List<NetworkPeeringResponse> peerings;
        private String region;
        private NetworkRoutingConfigResponse routingConfig;
        private String selfLink;
        private String selfLinkWithId;
        private List<String> subnetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateSubnetworks = defaults.autoCreateSubnetworks;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.enableUlaInternalIpv6 = defaults.enableUlaInternalIpv6;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.gatewayIPv4 = defaults.gatewayIPv4;
    	      this.internalIpv6Range = defaults.internalIpv6Range;
    	      this.ipv4Range = defaults.ipv4Range;
    	      this.kind = defaults.kind;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.networkFirewallPolicyEnforcementOrder = defaults.networkFirewallPolicyEnforcementOrder;
    	      this.peerings = defaults.peerings;
    	      this.region = defaults.region;
    	      this.routingConfig = defaults.routingConfig;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.subnetworks = defaults.subnetworks;
        }

        public Builder autoCreateSubnetworks(Boolean autoCreateSubnetworks) {
            this.autoCreateSubnetworks = Objects.requireNonNull(autoCreateSubnetworks);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enableUlaInternalIpv6(Boolean enableUlaInternalIpv6) {
            this.enableUlaInternalIpv6 = Objects.requireNonNull(enableUlaInternalIpv6);
            return this;
        }
        public Builder firewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }
        public Builder gatewayIPv4(String gatewayIPv4) {
            this.gatewayIPv4 = Objects.requireNonNull(gatewayIPv4);
            return this;
        }
        public Builder internalIpv6Range(String internalIpv6Range) {
            this.internalIpv6Range = Objects.requireNonNull(internalIpv6Range);
            return this;
        }
        public Builder ipv4Range(String ipv4Range) {
            this.ipv4Range = Objects.requireNonNull(ipv4Range);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder mtu(Integer mtu) {
            this.mtu = Objects.requireNonNull(mtu);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkFirewallPolicyEnforcementOrder(String networkFirewallPolicyEnforcementOrder) {
            this.networkFirewallPolicyEnforcementOrder = Objects.requireNonNull(networkFirewallPolicyEnforcementOrder);
            return this;
        }
        public Builder peerings(List<NetworkPeeringResponse> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }
        public Builder peerings(NetworkPeeringResponse... peerings) {
            return peerings(List.of(peerings));
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder routingConfig(NetworkRoutingConfigResponse routingConfig) {
            this.routingConfig = Objects.requireNonNull(routingConfig);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder subnetworks(List<String> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }
        public Builder subnetworks(String... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }        public GetNetworkResult build() {
            return new GetNetworkResult(autoCreateSubnetworks, creationTimestamp, description, enableUlaInternalIpv6, firewallPolicy, gatewayIPv4, internalIpv6Range, ipv4Range, kind, mtu, name, networkFirewallPolicyEnforcementOrder, peerings, region, routingConfig, selfLink, selfLinkWithId, subnetworks);
        }
    }
}
