// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServerEndpointDetails {
    /**
     * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    private final @Nullable List<String> addressAllocationIds;
    /**
     * A list of security groups IDs that are available to attach to your server's endpoint. If no security groups are specified, the VPC's default security groups are automatically assigned to your endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    private final @Nullable List<String> subnetIds;
    /**
     * The ID of the VPC endpoint. This property can only be used when `endpoint_type` is set to `VPC_ENDPOINT`
     * 
     */
    private final @Nullable String vpcEndpointId;
    /**
     * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor({"addressAllocationIds","securityGroupIds","subnetIds","vpcEndpointId","vpcId"})
    private ServerEndpointDetails(
        @Nullable List<String> addressAllocationIds,
        @Nullable List<String> securityGroupIds,
        @Nullable List<String> subnetIds,
        @Nullable String vpcEndpointId,
        @Nullable String vpcId) {
        this.addressAllocationIds = addressAllocationIds;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcId = vpcId;
    }

    /**
     * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
    */
    public List<String> getAddressAllocationIds() {
        return this.addressAllocationIds == null ? List.of() : this.addressAllocationIds;
    }
    /**
     * A list of security groups IDs that are available to attach to your server's endpoint. If no security groups are specified, the VPC's default security groups are automatically assigned to your endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }
    /**
     * The ID of the VPC endpoint. This property can only be used when `endpoint_type` is set to `VPC_ENDPOINT`
     * 
    */
    public Optional<String> getVpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }
    /**
     * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressAllocationIds;
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;
        private @Nullable String vpcEndpointId;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressAllocationIds = defaults.addressAllocationIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAddressAllocationIds(@Nullable List<String> addressAllocationIds) {
            this.addressAllocationIds = addressAllocationIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setVpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public ServerEndpointDetails build() {
            return new ServerEndpointDetails(addressAllocationIds, securityGroupIds, subnetIds, vpcEndpointId, vpcId);
        }
    }
}
