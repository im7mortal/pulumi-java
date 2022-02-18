// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointAccessVpcSecurityGroup {
    /**
     * The status of the VPC security group.
     * 
     */
    private final @Nullable String status;
    /**
     * The identifier of the VPC security group.
     * 
     */
    private final @Nullable String vpcSecurityGroupId;

    @OutputCustomType.Constructor({"status","vpcSecurityGroupId"})
    private EndpointAccessVpcSecurityGroup(
        @Nullable String status,
        @Nullable String vpcSecurityGroupId) {
        this.status = status;
        this.vpcSecurityGroupId = vpcSecurityGroupId;
    }

    /**
     * The status of the VPC security group.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The identifier of the VPC security group.
     * 
     */
    public Optional<String> getVpcSecurityGroupId() {
        return Optional.ofNullable(this.vpcSecurityGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessVpcSecurityGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String status;
        private @Nullable String vpcSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessVpcSecurityGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.vpcSecurityGroupId = defaults.vpcSecurityGroupId;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setVpcSecurityGroupId(@Nullable String vpcSecurityGroupId) {
            this.vpcSecurityGroupId = vpcSecurityGroupId;
            return this;
        }

        public EndpointAccessVpcSecurityGroup build() {
            return new EndpointAccessVpcSecurityGroup(status, vpcSecurityGroupId);
        }
    }
}
