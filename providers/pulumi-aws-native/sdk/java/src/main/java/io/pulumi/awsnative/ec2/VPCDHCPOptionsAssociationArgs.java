// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VPCDHCPOptionsAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VPCDHCPOptionsAssociationArgs Empty = new VPCDHCPOptionsAssociationArgs();

    /**
     * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
     * 
     */
    @InputImport(name="dhcpOptionsId", required=true)
    private final Input<String> dhcpOptionsId;

    public Input<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * The ID of the VPC.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public VPCDHCPOptionsAssociationArgs(
        Input<String> dhcpOptionsId,
        Input<String> vpcId) {
        this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId, "expected parameter 'dhcpOptionsId' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VPCDHCPOptionsAssociationArgs() {
        this.dhcpOptionsId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VPCDHCPOptionsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dhcpOptionsId;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VPCDHCPOptionsAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setDhcpOptionsId(Input<String> dhcpOptionsId) {
            this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId);
            return this;
        }

        public Builder setDhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = Input.of(Objects.requireNonNull(dhcpOptionsId));
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }

        public VPCDHCPOptionsAssociationArgs build() {
            return new VPCDHCPOptionsAssociationArgs(dhcpOptionsId, vpcId);
        }
    }
}
