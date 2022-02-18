// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeAddress {
    /**
     * The node address.
     * 
     */
    private final String address;
    /**
     * Node address type, one of Hostname, ExternalIP or InternalIP.
     * 
     * Possible enum values:
     *  - `"ExternalDNS"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeExternalIP. The IP it resolves to may or may not be a listed NodeExternalIP address.
     *  - `"ExternalIP"` identifies an IP address which is, in some way, intended to be more usable from outside the cluster then an internal IP, though no specific semantics are defined. It may be a globally routable IP, though it is not required to be. External IPs may be assigned directly to an interface on the node, like a NodeInternalIP, or alternatively, packets sent to the external IP may be NAT'ed to an internal node IP rather than being delivered directly (making the IP less efficient for node-to-node traffic than a NodeInternalIP).
     *  - `"Hostname"` identifies a name of the node. Although every node can be assumed to have a NodeAddress of this type, its exact syntax and semantics are not defined, and are not consistent between different clusters.
     *  - `"InternalDNS"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeInternalIP. The IP it resolves to may or may not be a listed NodeInternalIP address.
     *  - `"InternalIP"` identifies an IP address which is assigned to one of the node's network interfaces. Every node should have at least one address of this type. An internal IP is normally expected to be reachable from every other node, but may not be visible to hosts outside the cluster. By default it is assumed that kube-apiserver can reach node internal IPs, though it is possible to configure clusters where this is not the case. NodeInternalIP is the default type of node IP, and does not necessarily imply that the IP is ONLY reachable internally. If a node has multiple internal IPs, no specific semantics are assigned to the additional IPs.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"address","type"})
    private NodeAddress(
        String address,
        String type) {
        this.address = Objects.requireNonNull(address);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The node address.
     * 
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Node address type, one of Hostname, ExternalIP or InternalIP.
     * 
     * Possible enum values:
     *  - `"ExternalDNS"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeExternalIP. The IP it resolves to may or may not be a listed NodeExternalIP address.
     *  - `"ExternalIP"` identifies an IP address which is, in some way, intended to be more usable from outside the cluster then an internal IP, though no specific semantics are defined. It may be a globally routable IP, though it is not required to be. External IPs may be assigned directly to an interface on the node, like a NodeInternalIP, or alternatively, packets sent to the external IP may be NAT'ed to an internal node IP rather than being delivered directly (making the IP less efficient for node-to-node traffic than a NodeInternalIP).
     *  - `"Hostname"` identifies a name of the node. Although every node can be assumed to have a NodeAddress of this type, its exact syntax and semantics are not defined, and are not consistent between different clusters.
     *  - `"InternalDNS"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeInternalIP. The IP it resolves to may or may not be a listed NodeInternalIP address.
     *  - `"InternalIP"` identifies an IP address which is assigned to one of the node's network interfaces. Every node should have at least one address of this type. An internal IP is normally expected to be reachable from every other node, but may not be visible to hosts outside the cluster. By default it is assumed that kube-apiserver can reach node internal IPs, though it is possible to configure clusters where this is not the case. NodeInternalIP is the default type of node IP, and does not necessarily imply that the IP is ONLY reachable internally. If a node has multiple internal IPs, no specific semantics are assigned to the additional IPs.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public NodeAddress build() {
            return new NodeAddress(address, type);
        }
    }
}
