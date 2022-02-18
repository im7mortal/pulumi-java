// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLocalGatewayRouteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteArgs Empty = new GetLocalGatewayRouteArgs();

    /**
     * The CIDR block used for destination matches.
     * 
     */
    @InputImport(name="destinationCidrBlock", required=true)
    private final String destinationCidrBlock;

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The ID of the local gateway route table.
     * 
     */
    @InputImport(name="localGatewayRouteTableId", required=true)
    private final String localGatewayRouteTableId;

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    public GetLocalGatewayRouteArgs(
        String destinationCidrBlock,
        String localGatewayRouteTableId) {
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId, "expected parameter 'localGatewayRouteTableId' to be non-null");
    }

    private GetLocalGatewayRouteArgs() {
        this.destinationCidrBlock = null;
        this.localGatewayRouteTableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationCidrBlock;
        private String localGatewayRouteTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
        }

        public Builder setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }

        public Builder setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }

        public GetLocalGatewayRouteArgs build() {
            return new GetLocalGatewayRouteArgs(destinationCidrBlock, localGatewayRouteTableId);
        }
    }
}
