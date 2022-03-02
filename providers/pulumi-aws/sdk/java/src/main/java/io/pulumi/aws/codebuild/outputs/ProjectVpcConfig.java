// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ProjectVpcConfig {
    /**
     * Security group IDs to assign to running builds.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * Subnet IDs within which to run builds.
     * 
     */
    private final List<String> subnets;
    /**
     * ID of the VPC within which to run builds.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"securityGroupIds","subnets","vpcId"})
    private ProjectVpcConfig(
        List<String> securityGroupIds,
        List<String> subnets,
        String vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
        this.subnets = Objects.requireNonNull(subnets);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * Security group IDs to assign to running builds.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Subnet IDs within which to run builds.
     * 
    */
    public List<String> getSubnets() {
        return this.subnets;
    }
    /**
     * ID of the VPC within which to run builds.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnets;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public ProjectVpcConfig build() {
            return new ProjectVpcConfig(securityGroupIds, subnets, vpcId);
        }
    }
}
