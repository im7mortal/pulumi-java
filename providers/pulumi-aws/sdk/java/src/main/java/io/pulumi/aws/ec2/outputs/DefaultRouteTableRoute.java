// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefaultRouteTableRoute {
    /**
     * The CIDR block of the route.
     * 
     */
    private final @Nullable String cidrBlock;
    /**
     * The ID of a managed prefix list destination of the route.
     * 
     */
    private final @Nullable String destinationPrefixListId;
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     * 
     */
    private final @Nullable String egressOnlyGatewayId;
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway.
     * 
     */
    private final @Nullable String gatewayId;
    /**
     * Identifier of an EC2 instance.
     * 
     */
    private final @Nullable String instanceId;
    /**
     * The Ipv6 CIDR block of the route
     * 
     */
    private final @Nullable String ipv6CidrBlock;
    /**
     * Identifier of a VPC NAT gateway.
     * 
     */
    private final @Nullable String natGatewayId;
    /**
     * Identifier of an EC2 network interface.
     * 
     */
    private final @Nullable String networkInterfaceId;
    /**
     * Identifier of an EC2 Transit Gateway.
     * 
     */
    private final @Nullable String transitGatewayId;
    /**
     * Identifier of a VPC Endpoint. This route must be removed prior to VPC Endpoint deletion.
     * 
     */
    private final @Nullable String vpcEndpointId;
    /**
     * Identifier of a VPC peering connection.
     * 
     */
    private final @Nullable String vpcPeeringConnectionId;

    @OutputCustomType.Constructor({"cidrBlock","destinationPrefixListId","egressOnlyGatewayId","gatewayId","instanceId","ipv6CidrBlock","natGatewayId","networkInterfaceId","transitGatewayId","vpcEndpointId","vpcPeeringConnectionId"})
    private DefaultRouteTableRoute(
        @Nullable String cidrBlock,
        @Nullable String destinationPrefixListId,
        @Nullable String egressOnlyGatewayId,
        @Nullable String gatewayId,
        @Nullable String instanceId,
        @Nullable String ipv6CidrBlock,
        @Nullable String natGatewayId,
        @Nullable String networkInterfaceId,
        @Nullable String transitGatewayId,
        @Nullable String vpcEndpointId,
        @Nullable String vpcPeeringConnectionId) {
        this.cidrBlock = cidrBlock;
        this.destinationPrefixListId = destinationPrefixListId;
        this.egressOnlyGatewayId = egressOnlyGatewayId;
        this.gatewayId = gatewayId;
        this.instanceId = instanceId;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.natGatewayId = natGatewayId;
        this.networkInterfaceId = networkInterfaceId;
        this.transitGatewayId = transitGatewayId;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * The CIDR block of the route.
     * 
    */
    public Optional<String> getCidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * The ID of a managed prefix list destination of the route.
     * 
    */
    public Optional<String> getDestinationPrefixListId() {
        return Optional.ofNullable(this.destinationPrefixListId);
    }
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     * 
    */
    public Optional<String> getEgressOnlyGatewayId() {
        return Optional.ofNullable(this.egressOnlyGatewayId);
    }
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway.
     * 
    */
    public Optional<String> getGatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }
    /**
     * Identifier of an EC2 instance.
     * 
    */
    public Optional<String> getInstanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * The Ipv6 CIDR block of the route
     * 
    */
    public Optional<String> getIpv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }
    /**
     * Identifier of a VPC NAT gateway.
     * 
    */
    public Optional<String> getNatGatewayId() {
        return Optional.ofNullable(this.natGatewayId);
    }
    /**
     * Identifier of an EC2 network interface.
     * 
    */
    public Optional<String> getNetworkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    /**
     * Identifier of an EC2 Transit Gateway.
     * 
    */
    public Optional<String> getTransitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }
    /**
     * Identifier of a VPC Endpoint. This route must be removed prior to VPC Endpoint deletion.
     * 
    */
    public Optional<String> getVpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }
    /**
     * Identifier of a VPC peering connection.
     * 
    */
    public Optional<String> getVpcPeeringConnectionId() {
        return Optional.ofNullable(this.vpcPeeringConnectionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidrBlock;
        private @Nullable String destinationPrefixListId;
        private @Nullable String egressOnlyGatewayId;
        private @Nullable String gatewayId;
        private @Nullable String instanceId;
        private @Nullable String ipv6CidrBlock;
        private @Nullable String natGatewayId;
        private @Nullable String networkInterfaceId;
        private @Nullable String transitGatewayId;
        private @Nullable String vpcEndpointId;
        private @Nullable String vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.instanceId = defaults.instanceId;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setDestinationPrefixListId(@Nullable String destinationPrefixListId) {
            this.destinationPrefixListId = destinationPrefixListId;
            return this;
        }

        public Builder setEgressOnlyGatewayId(@Nullable String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            return this;
        }

        public Builder setGatewayId(@Nullable String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setNatGatewayId(@Nullable String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setTransitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder setVpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder setVpcPeeringConnectionId(@Nullable String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }
        public DefaultRouteTableRoute build() {
            return new DefaultRouteTableRoute(cidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, instanceId, ipv6CidrBlock, natGatewayId, networkInterfaceId, transitGatewayId, vpcEndpointId, vpcPeeringConnectionId);
        }
    }
}
