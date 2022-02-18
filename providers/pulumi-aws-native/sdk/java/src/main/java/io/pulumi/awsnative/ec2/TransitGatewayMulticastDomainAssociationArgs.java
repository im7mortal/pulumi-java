// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayMulticastDomainAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayMulticastDomainAssociationArgs Empty = new TransitGatewayMulticastDomainAssociationArgs();

    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * 
     */
    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @InputImport(name="transitGatewayAttachmentId", required=true)
    private final Input<String> transitGatewayAttachmentId;

    public Input<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @InputImport(name="transitGatewayMulticastDomainId", required=true)
    private final Input<String> transitGatewayMulticastDomainId;

    public Input<String> getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public TransitGatewayMulticastDomainAssociationArgs(
        Input<String> subnetId,
        Input<String> transitGatewayAttachmentId,
        Input<String> transitGatewayMulticastDomainId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private TransitGatewayMulticastDomainAssociationArgs() {
        this.subnetId = Input.empty();
        this.transitGatewayAttachmentId = Input.empty();
        this.transitGatewayMulticastDomainId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayMulticastDomainAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> subnetId;
        private Input<String> transitGatewayAttachmentId;
        private Input<String> transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayMulticastDomainAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder setTransitGatewayAttachmentId(Input<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }

        public Builder setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Input.of(Objects.requireNonNull(transitGatewayAttachmentId));
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(Input<String> transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Input.of(Objects.requireNonNull(transitGatewayMulticastDomainId));
            return this;
        }

        public TransitGatewayMulticastDomainAssociationArgs build() {
            return new TransitGatewayMulticastDomainAssociationArgs(subnetId, transitGatewayAttachmentId, transitGatewayMulticastDomainId);
        }
    }
}
