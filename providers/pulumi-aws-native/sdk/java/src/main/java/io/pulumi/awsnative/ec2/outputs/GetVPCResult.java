// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.VPCTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVPCResult {
    /**
     * A list of IPv4 CIDR block association IDs for the VPC.
     * 
     */
    private final @Nullable List<String> cidrBlockAssociations;
    /**
     * The default network ACL ID that is associated with the VPC.
     * 
     */
    private final @Nullable String defaultNetworkAcl;
    /**
     * The default security group ID that is associated with the VPC.
     * 
     */
    private final @Nullable String defaultSecurityGroup;
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default for nondefault VPCs.
     * 
     */
    private final @Nullable Boolean enableDnsHostnames;
    /**
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. Enabled by default.
     * 
     */
    private final @Nullable Boolean enableDnsSupport;
    /**
     * The allowed tenancy of instances launched into the VPC.
     * 
     * "default": An instance launched into the VPC runs on shared hardware by default, unless you explicitly specify a different tenancy during instance launch.
     * 
     * "dedicated": An instance launched into the VPC is a Dedicated Instance by default, unless you explicitly specify a tenancy of host during instance launch. You cannot specify a tenancy of default during instance launch.
     * 
     * Updating InstanceTenancy requires no replacement only if you are updating its value from "dedicated" to "default". Updating InstanceTenancy from "default" to "dedicated" requires replacement.
     * 
     */
    private final @Nullable String instanceTenancy;
    /**
     * A list of IPv6 CIDR blocks that are associated with the VPC.
     * 
     */
    private final @Nullable List<String> ipv6CidrBlocks;
    /**
     * The tags for the VPC.
     * 
     */
    private final @Nullable List<VPCTag> tags;
    /**
     * The Id for the model.
     * 
     */
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor({"cidrBlockAssociations","defaultNetworkAcl","defaultSecurityGroup","enableDnsHostnames","enableDnsSupport","instanceTenancy","ipv6CidrBlocks","tags","vpcId"})
    private GetVPCResult(
        @Nullable List<String> cidrBlockAssociations,
        @Nullable String defaultNetworkAcl,
        @Nullable String defaultSecurityGroup,
        @Nullable Boolean enableDnsHostnames,
        @Nullable Boolean enableDnsSupport,
        @Nullable String instanceTenancy,
        @Nullable List<String> ipv6CidrBlocks,
        @Nullable List<VPCTag> tags,
        @Nullable String vpcId) {
        this.cidrBlockAssociations = cidrBlockAssociations;
        this.defaultNetworkAcl = defaultNetworkAcl;
        this.defaultSecurityGroup = defaultSecurityGroup;
        this.enableDnsHostnames = enableDnsHostnames;
        this.enableDnsSupport = enableDnsSupport;
        this.instanceTenancy = instanceTenancy;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * A list of IPv4 CIDR block association IDs for the VPC.
     * 
    */
    public List<String> getCidrBlockAssociations() {
        return this.cidrBlockAssociations == null ? List.of() : this.cidrBlockAssociations;
    }
    /**
     * The default network ACL ID that is associated with the VPC.
     * 
    */
    public Optional<String> getDefaultNetworkAcl() {
        return Optional.ofNullable(this.defaultNetworkAcl);
    }
    /**
     * The default security group ID that is associated with the VPC.
     * 
    */
    public Optional<String> getDefaultSecurityGroup() {
        return Optional.ofNullable(this.defaultSecurityGroup);
    }
    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default for nondefault VPCs.
     * 
    */
    public Optional<Boolean> getEnableDnsHostnames() {
        return Optional.ofNullable(this.enableDnsHostnames);
    }
    /**
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. Enabled by default.
     * 
    */
    public Optional<Boolean> getEnableDnsSupport() {
        return Optional.ofNullable(this.enableDnsSupport);
    }
    /**
     * The allowed tenancy of instances launched into the VPC.
     * 
     * "default": An instance launched into the VPC runs on shared hardware by default, unless you explicitly specify a different tenancy during instance launch.
     * 
     * "dedicated": An instance launched into the VPC is a Dedicated Instance by default, unless you explicitly specify a tenancy of host during instance launch. You cannot specify a tenancy of default during instance launch.
     * 
     * Updating InstanceTenancy requires no replacement only if you are updating its value from "dedicated" to "default". Updating InstanceTenancy from "default" to "dedicated" requires replacement.
     * 
    */
    public Optional<String> getInstanceTenancy() {
        return Optional.ofNullable(this.instanceTenancy);
    }
    /**
     * A list of IPv6 CIDR blocks that are associated with the VPC.
     * 
    */
    public List<String> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    /**
     * The tags for the VPC.
     * 
    */
    public List<VPCTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The Id for the model.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVPCResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrBlockAssociations;
        private @Nullable String defaultNetworkAcl;
        private @Nullable String defaultSecurityGroup;
        private @Nullable Boolean enableDnsHostnames;
        private @Nullable Boolean enableDnsSupport;
        private @Nullable String instanceTenancy;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable List<VPCTag> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVPCResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlockAssociations = defaults.cidrBlockAssociations;
    	      this.defaultNetworkAcl = defaults.defaultNetworkAcl;
    	      this.defaultSecurityGroup = defaults.defaultSecurityGroup;
    	      this.enableDnsHostnames = defaults.enableDnsHostnames;
    	      this.enableDnsSupport = defaults.enableDnsSupport;
    	      this.instanceTenancy = defaults.instanceTenancy;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setCidrBlockAssociations(@Nullable List<String> cidrBlockAssociations) {
            this.cidrBlockAssociations = cidrBlockAssociations;
            return this;
        }

        public Builder setDefaultNetworkAcl(@Nullable String defaultNetworkAcl) {
            this.defaultNetworkAcl = defaultNetworkAcl;
            return this;
        }

        public Builder setDefaultSecurityGroup(@Nullable String defaultSecurityGroup) {
            this.defaultSecurityGroup = defaultSecurityGroup;
            return this;
        }

        public Builder setEnableDnsHostnames(@Nullable Boolean enableDnsHostnames) {
            this.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        public Builder setEnableDnsSupport(@Nullable Boolean enableDnsSupport) {
            this.enableDnsSupport = enableDnsSupport;
            return this;
        }

        public Builder setInstanceTenancy(@Nullable String instanceTenancy) {
            this.instanceTenancy = instanceTenancy;
            return this;
        }

        public Builder setIpv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder setTags(@Nullable List<VPCTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetVPCResult build() {
            return new GetVPCResult(cidrBlockAssociations, defaultNetworkAcl, defaultSecurityGroup, enableDnsHostnames, enableDnsSupport, instanceTenancy, ipv6CidrBlocks, tags, vpcId);
        }
    }
}
