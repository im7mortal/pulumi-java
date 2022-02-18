// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowVpcInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowVpcInterfaceArgs Empty = new FlowVpcInterfaceArgs();

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    @InputImport(name="flowArn", required=true)
    private final Input<String> flowArn;

    public Input<String> getFlowArn() {
        return this.flowArn;
    }

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Security Group IDs to be used on ENI.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
    private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * Subnet must be in the AZ of the Flow
     * 
     */
    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public FlowVpcInterfaceArgs(
        Input<String> flowArn,
        @Nullable Input<String> name,
        Input<String> roleArn,
        Input<List<String>> securityGroupIds,
        Input<String> subnetId) {
        this.flowArn = Objects.requireNonNull(flowArn, "expected parameter 'flowArn' to be non-null");
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private FlowVpcInterfaceArgs() {
        this.flowArn = Input.empty();
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.securityGroupIds = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVpcInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> flowArn;
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private Input<List<String>> securityGroupIds;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVpcInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowArn = defaults.flowArn;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setFlowArn(Input<String> flowArn) {
            this.flowArn = Objects.requireNonNull(flowArn);
            return this;
        }

        public Builder setFlowArn(String flowArn) {
            this.flowArn = Input.of(Objects.requireNonNull(flowArn));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setSecurityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
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

        public FlowVpcInterfaceArgs build() {
            return new FlowVpcInterfaceArgs(flowArn, name, roleArn, securityGroupIds, subnetId);
        }
    }
}
