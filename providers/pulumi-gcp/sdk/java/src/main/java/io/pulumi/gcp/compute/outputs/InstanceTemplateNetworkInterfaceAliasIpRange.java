// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateNetworkInterfaceAliasIpRange {
    /**
     * The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    private final String ipCidrRange;
    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    private final @Nullable String subnetworkRangeName;

    @OutputCustomType.Constructor({"ipCidrRange","subnetworkRangeName"})
    private InstanceTemplateNetworkInterfaceAliasIpRange(
        String ipCidrRange,
        @Nullable String subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.subnetworkRangeName = subnetworkRangeName;
    }

    /**
     * The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
    */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
    */
    public Optional<String> getSubnetworkRangeName() {
        return Optional.ofNullable(this.subnetworkRangeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private @Nullable String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setSubnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }
        public InstanceTemplateNetworkInterfaceAliasIpRange build() {
            return new InstanceTemplateNetworkInterfaceAliasIpRange(ipCidrRange, subnetworkRangeName);
        }
    }
}
