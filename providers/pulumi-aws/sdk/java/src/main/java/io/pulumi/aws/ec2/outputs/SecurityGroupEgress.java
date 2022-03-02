// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityGroupEgress {
    /**
     * List of CIDR blocks.
     * 
     */
    private final @Nullable List<String> cidrBlocks;
    /**
     * Description of this egress rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    private final Integer fromPort;
    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    private final @Nullable List<String> ipv6CidrBlocks;
    /**
     * List of Prefix List IDs.
     * 
     */
    private final @Nullable List<String> prefixListIds;
    /**
     * Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
     */
    private final String protocol;
    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    private final @Nullable Boolean self;
    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    private final Integer toPort;

    @OutputCustomType.Constructor({"cidrBlocks","description","fromPort","ipv6CidrBlocks","prefixListIds","protocol","securityGroups","self","toPort"})
    private SecurityGroupEgress(
        @Nullable List<String> cidrBlocks,
        @Nullable String description,
        Integer fromPort,
        @Nullable List<String> ipv6CidrBlocks,
        @Nullable List<String> prefixListIds,
        String protocol,
        @Nullable List<String> securityGroups,
        @Nullable Boolean self,
        Integer toPort) {
        this.cidrBlocks = cidrBlocks;
        this.description = description;
        this.fromPort = Objects.requireNonNull(fromPort);
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prefixListIds = prefixListIds;
        this.protocol = Objects.requireNonNull(protocol);
        this.securityGroups = securityGroups;
        this.self = self;
        this.toPort = Objects.requireNonNull(toPort);
    }

    /**
     * List of CIDR blocks.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    /**
     * Description of this egress rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * List of IPv6 CIDR blocks.
     * 
    */
    public List<String> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    /**
     * List of Prefix List IDs.
     * 
    */
    public List<String> getPrefixListIds() {
        return this.prefixListIds == null ? List.of() : this.prefixListIds;
    }
    /**
     * Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
    */
    public Optional<Boolean> getSelf() {
        return Optional.ofNullable(this.self);
    }
    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
    */
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupEgress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        private @Nullable String description;
        private Integer fromPort;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable List<String> prefixListIds;
        private String protocol;
        private @Nullable List<String> securityGroups;
        private @Nullable Boolean self;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupEgress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        public Builder setCidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setIpv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder setPrefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSelf(@Nullable Boolean self) {
            this.self = self;
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public SecurityGroupEgress build() {
            return new SecurityGroupEgress(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroups, self, toPort);
        }
    }
}
