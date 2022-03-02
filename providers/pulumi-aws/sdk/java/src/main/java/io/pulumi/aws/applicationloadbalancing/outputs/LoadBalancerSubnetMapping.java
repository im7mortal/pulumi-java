// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerSubnetMapping {
    /**
     * The allocation ID of the Elastic IP address.
     * 
     */
    private final @Nullable String allocationId;
    /**
     * An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    private final @Nullable String ipv6Address;
    private final @Nullable String outpostId;
    /**
     * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    private final @Nullable String privateIpv4Address;
    /**
     * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    private final String subnetId;

    @OutputCustomType.Constructor({"allocationId","ipv6Address","outpostId","privateIpv4Address","subnetId"})
    private LoadBalancerSubnetMapping(
        @Nullable String allocationId,
        @Nullable String ipv6Address,
        @Nullable String outpostId,
        @Nullable String privateIpv4Address,
        String subnetId) {
        this.allocationId = allocationId;
        this.ipv6Address = ipv6Address;
        this.outpostId = outpostId;
        this.privateIpv4Address = privateIpv4Address;
        this.subnetId = Objects.requireNonNull(subnetId);
    }

    /**
     * The allocation ID of the Elastic IP address.
     * 
    */
    public Optional<String> getAllocationId() {
        return Optional.ofNullable(this.allocationId);
    }
    /**
     * An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
    */
    public Optional<String> getIpv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }
    public Optional<String> getOutpostId() {
        return Optional.ofNullable(this.outpostId);
    }
    /**
     * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
    */
    public Optional<String> getPrivateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }
    /**
     * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocationId;
        private @Nullable String ipv6Address;
        private @Nullable String outpostId;
        private @Nullable String privateIpv4Address;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAllocationId(@Nullable String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setOutpostId(@Nullable String outpostId) {
            this.outpostId = outpostId;
            return this;
        }

        public Builder setPrivateIpv4Address(@Nullable String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public LoadBalancerSubnetMapping build() {
            return new LoadBalancerSubnetMapping(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
