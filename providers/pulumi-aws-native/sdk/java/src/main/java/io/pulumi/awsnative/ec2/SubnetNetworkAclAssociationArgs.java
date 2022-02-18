// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubnetNetworkAclAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetNetworkAclAssociationArgs Empty = new SubnetNetworkAclAssociationArgs();

    /**
     * The ID of the network ACL
     * 
     */
    @InputImport(name="networkAclId", required=true)
    private final Input<String> networkAclId;

    public Input<String> getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * The ID of the subnet
     * 
     */
    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public SubnetNetworkAclAssociationArgs(
        Input<String> networkAclId,
        Input<String> subnetId) {
        this.networkAclId = Objects.requireNonNull(networkAclId, "expected parameter 'networkAclId' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private SubnetNetworkAclAssociationArgs() {
        this.networkAclId = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetNetworkAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> networkAclId;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetNetworkAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkAclId = defaults.networkAclId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setNetworkAclId(Input<String> networkAclId) {
            this.networkAclId = Objects.requireNonNull(networkAclId);
            return this;
        }

        public Builder setNetworkAclId(String networkAclId) {
            this.networkAclId = Input.of(Objects.requireNonNull(networkAclId));
            return this;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public SubnetNetworkAclAssociationArgs build() {
            return new SubnetNetworkAclAssociationArgs(networkAclId, subnetId);
        }
    }
}
