// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LocalGatewayRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalGatewayRouteArgs Empty = new LocalGatewayRouteArgs();

    /**
     * The CIDR block used for destination matches.
     * 
     */
    @InputImport(name="destinationCidrBlock", required=true)
    private final Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The ID of the local gateway route table.
     * 
     */
    @InputImport(name="localGatewayRouteTableId", required=true)
    private final Input<String> localGatewayRouteTableId;

    public Input<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * The ID of the virtual interface group.
     * 
     */
    @InputImport(name="localGatewayVirtualInterfaceGroupId", required=true)
    private final Input<String> localGatewayVirtualInterfaceGroupId;

    public Input<String> getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    public LocalGatewayRouteArgs(
        Input<String> destinationCidrBlock,
        Input<String> localGatewayRouteTableId,
        Input<String> localGatewayVirtualInterfaceGroupId) {
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId, "expected parameter 'localGatewayRouteTableId' to be non-null");
        this.localGatewayVirtualInterfaceGroupId = Objects.requireNonNull(localGatewayVirtualInterfaceGroupId, "expected parameter 'localGatewayVirtualInterfaceGroupId' to be non-null");
    }

    private LocalGatewayRouteArgs() {
        this.destinationCidrBlock = Input.empty();
        this.localGatewayRouteTableId = Input.empty();
        this.localGatewayVirtualInterfaceGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalGatewayRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationCidrBlock;
        private Input<String> localGatewayRouteTableId;
        private Input<String> localGatewayVirtualInterfaceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalGatewayRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.localGatewayVirtualInterfaceGroupId = defaults.localGatewayVirtualInterfaceGroupId;
        }

        public Builder setDestinationCidrBlock(Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }

        public Builder setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Input.of(Objects.requireNonNull(destinationCidrBlock));
            return this;
        }

        public Builder setLocalGatewayRouteTableId(Input<String> localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }

        public Builder setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Input.of(Objects.requireNonNull(localGatewayRouteTableId));
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceGroupId(Input<String> localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = Objects.requireNonNull(localGatewayVirtualInterfaceGroupId);
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = Input.of(Objects.requireNonNull(localGatewayVirtualInterfaceGroupId));
            return this;
        }

        public LocalGatewayRouteArgs build() {
            return new LocalGatewayRouteArgs(destinationCidrBlock, localGatewayRouteTableId, localGatewayVirtualInterfaceGroupId);
        }
    }
}
