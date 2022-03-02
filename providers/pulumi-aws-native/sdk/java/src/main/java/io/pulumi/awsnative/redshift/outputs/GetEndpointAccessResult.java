// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.awsnative.redshift.outputs.EndpointAccessVpcSecurityGroup;
import io.pulumi.awsnative.redshift.outputs.VpcEndpointProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEndpointAccessResult {
    /**
     * The DNS address of the endpoint.
     * 
     */
    private final @Nullable String address;
    /**
     * The time (UTC) that the endpoint was created.
     * 
     */
    private final @Nullable String endpointCreateTime;
    /**
     * The status of the endpoint.
     * 
     */
    private final @Nullable String endpointStatus;
    /**
     * The port number on which the cluster accepts incoming connections.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
     * 
     */
    private final @Nullable VpcEndpointProperties vpcEndpoint;
    /**
     * A list of vpc security group ids to apply to the created endpoint access.
     * 
     */
    private final @Nullable List<String> vpcSecurityGroupIds;
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the endpoint.
     * 
     */
    private final @Nullable List<EndpointAccessVpcSecurityGroup> vpcSecurityGroups;

    @OutputCustomType.Constructor({"address","endpointCreateTime","endpointStatus","port","vpcEndpoint","vpcSecurityGroupIds","vpcSecurityGroups"})
    private GetEndpointAccessResult(
        @Nullable String address,
        @Nullable String endpointCreateTime,
        @Nullable String endpointStatus,
        @Nullable Integer port,
        @Nullable VpcEndpointProperties vpcEndpoint,
        @Nullable List<String> vpcSecurityGroupIds,
        @Nullable List<EndpointAccessVpcSecurityGroup> vpcSecurityGroups) {
        this.address = address;
        this.endpointCreateTime = endpointCreateTime;
        this.endpointStatus = endpointStatus;
        this.port = port;
        this.vpcEndpoint = vpcEndpoint;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSecurityGroups = vpcSecurityGroups;
    }

    /**
     * The DNS address of the endpoint.
     * 
    */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * The time (UTC) that the endpoint was created.
     * 
    */
    public Optional<String> getEndpointCreateTime() {
        return Optional.ofNullable(this.endpointCreateTime);
    }
    /**
     * The status of the endpoint.
     * 
    */
    public Optional<String> getEndpointStatus() {
        return Optional.ofNullable(this.endpointStatus);
    }
    /**
     * The port number on which the cluster accepts incoming connections.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
     * 
    */
    public Optional<VpcEndpointProperties> getVpcEndpoint() {
        return Optional.ofNullable(this.vpcEndpoint);
    }
    /**
     * A list of vpc security group ids to apply to the created endpoint access.
     * 
    */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? List.of() : this.vpcSecurityGroupIds;
    }
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the endpoint.
     * 
    */
    public List<EndpointAccessVpcSecurityGroup> getVpcSecurityGroups() {
        return this.vpcSecurityGroups == null ? List.of() : this.vpcSecurityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointAccessResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String endpointCreateTime;
        private @Nullable String endpointStatus;
        private @Nullable Integer port;
        private @Nullable VpcEndpointProperties vpcEndpoint;
        private @Nullable List<String> vpcSecurityGroupIds;
        private @Nullable List<EndpointAccessVpcSecurityGroup> vpcSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointAccessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.endpointCreateTime = defaults.endpointCreateTime;
    	      this.endpointStatus = defaults.endpointStatus;
    	      this.port = defaults.port;
    	      this.vpcEndpoint = defaults.vpcEndpoint;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSecurityGroups = defaults.vpcSecurityGroups;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setEndpointCreateTime(@Nullable String endpointCreateTime) {
            this.endpointCreateTime = endpointCreateTime;
            return this;
        }

        public Builder setEndpointStatus(@Nullable String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setVpcEndpoint(@Nullable VpcEndpointProperties vpcEndpoint) {
            this.vpcEndpoint = vpcEndpoint;
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder setVpcSecurityGroups(@Nullable List<EndpointAccessVpcSecurityGroup> vpcSecurityGroups) {
            this.vpcSecurityGroups = vpcSecurityGroups;
            return this;
        }
        public GetEndpointAccessResult build() {
            return new GetEndpointAccessResult(address, endpointCreateTime, endpointStatus, port, vpcEndpoint, vpcSecurityGroupIds, vpcSecurityGroups);
        }
    }
}
