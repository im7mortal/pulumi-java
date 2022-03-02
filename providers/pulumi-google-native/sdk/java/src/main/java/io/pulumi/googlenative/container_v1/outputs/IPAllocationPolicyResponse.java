// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IPAllocationPolicyResponse {
    /**
     * The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    private final String clusterIpv4CidrBlock;
    /**
     * The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    private final String clusterSecondaryRangeName;
    /**
     * Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
     */
    private final Boolean createSubnetwork;
    /**
     * The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    private final String nodeIpv4CidrBlock;
    /**
     * The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    private final String servicesIpv4CidrBlock;
    /**
     * The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    private final String servicesSecondaryRangeName;
    /**
     * A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
     */
    private final String subnetworkName;
    /**
     * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    private final String tpuIpv4CidrBlock;
    /**
     * Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    private final Boolean useIpAliases;
    /**
     * Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    private final Boolean useRoutes;

    @OutputCustomType.Constructor({"clusterIpv4CidrBlock","clusterSecondaryRangeName","createSubnetwork","nodeIpv4CidrBlock","servicesIpv4CidrBlock","servicesSecondaryRangeName","subnetworkName","tpuIpv4CidrBlock","useIpAliases","useRoutes"})
    private IPAllocationPolicyResponse(
        String clusterIpv4CidrBlock,
        String clusterSecondaryRangeName,
        Boolean createSubnetwork,
        String nodeIpv4CidrBlock,
        String servicesIpv4CidrBlock,
        String servicesSecondaryRangeName,
        String subnetworkName,
        String tpuIpv4CidrBlock,
        Boolean useIpAliases,
        Boolean useRoutes) {
        this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock);
        this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName);
        this.createSubnetwork = Objects.requireNonNull(createSubnetwork);
        this.nodeIpv4CidrBlock = Objects.requireNonNull(nodeIpv4CidrBlock);
        this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock);
        this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName);
        this.subnetworkName = Objects.requireNonNull(subnetworkName);
        this.tpuIpv4CidrBlock = Objects.requireNonNull(tpuIpv4CidrBlock);
        this.useIpAliases = Objects.requireNonNull(useIpAliases);
        this.useRoutes = Objects.requireNonNull(useRoutes);
    }

    /**
     * The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
    */
    public String getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }
    /**
     * The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
    */
    public String getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }
    /**
     * Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
    */
    public Boolean getCreateSubnetwork() {
        return this.createSubnetwork;
    }
    /**
     * The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
    */
    public String getNodeIpv4CidrBlock() {
        return this.nodeIpv4CidrBlock;
    }
    /**
     * The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
    */
    public String getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }
    /**
     * The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
    */
    public String getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }
    /**
     * A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
    */
    public String getSubnetworkName() {
        return this.subnetworkName;
    }
    /**
     * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
    */
    public String getTpuIpv4CidrBlock() {
        return this.tpuIpv4CidrBlock;
    }
    /**
     * Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
    */
    public Boolean getUseIpAliases() {
        return this.useIpAliases;
    }
    /**
     * Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
    */
    public Boolean getUseRoutes() {
        return this.useRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAllocationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIpv4CidrBlock;
        private String clusterSecondaryRangeName;
        private Boolean createSubnetwork;
        private String nodeIpv4CidrBlock;
        private String servicesIpv4CidrBlock;
        private String servicesSecondaryRangeName;
        private String subnetworkName;
        private String tpuIpv4CidrBlock;
        private Boolean useIpAliases;
        private Boolean useRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAllocationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.createSubnetwork = defaults.createSubnetwork;
    	      this.nodeIpv4CidrBlock = defaults.nodeIpv4CidrBlock;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
    	      this.subnetworkName = defaults.subnetworkName;
    	      this.tpuIpv4CidrBlock = defaults.tpuIpv4CidrBlock;
    	      this.useIpAliases = defaults.useIpAliases;
    	      this.useRoutes = defaults.useRoutes;
        }

        public Builder setClusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock);
            return this;
        }

        public Builder setClusterSecondaryRangeName(String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName);
            return this;
        }

        public Builder setCreateSubnetwork(Boolean createSubnetwork) {
            this.createSubnetwork = Objects.requireNonNull(createSubnetwork);
            return this;
        }

        public Builder setNodeIpv4CidrBlock(String nodeIpv4CidrBlock) {
            this.nodeIpv4CidrBlock = Objects.requireNonNull(nodeIpv4CidrBlock);
            return this;
        }

        public Builder setServicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock);
            return this;
        }

        public Builder setServicesSecondaryRangeName(String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName);
            return this;
        }

        public Builder setSubnetworkName(String subnetworkName) {
            this.subnetworkName = Objects.requireNonNull(subnetworkName);
            return this;
        }

        public Builder setTpuIpv4CidrBlock(String tpuIpv4CidrBlock) {
            this.tpuIpv4CidrBlock = Objects.requireNonNull(tpuIpv4CidrBlock);
            return this;
        }

        public Builder setUseIpAliases(Boolean useIpAliases) {
            this.useIpAliases = Objects.requireNonNull(useIpAliases);
            return this;
        }

        public Builder setUseRoutes(Boolean useRoutes) {
            this.useRoutes = Objects.requireNonNull(useRoutes);
            return this;
        }
        public IPAllocationPolicyResponse build() {
            return new IPAllocationPolicyResponse(clusterIpv4CidrBlock, clusterSecondaryRangeName, createSubnetwork, nodeIpv4CidrBlock, servicesIpv4CidrBlock, servicesSecondaryRangeName, subnetworkName, tpuIpv4CidrBlock, useIpAliases, useRoutes);
        }
    }
}
