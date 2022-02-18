// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointAccessArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointAccessArgs Empty = new EndpointAccessArgs();

    /**
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    @InputImport(name="clusterIdentifier")
    private final @Nullable Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier == null ? Input.empty() : this.clusterIdentifier;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * The AWS account ID of the owner of the cluster.
     * 
     */
    @InputImport(name="resourceOwner")
    private final @Nullable Input<String> resourceOwner;

    public Input<String> getResourceOwner() {
        return this.resourceOwner == null ? Input.empty() : this.resourceOwner;
    }

    /**
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * 
     */
    @InputImport(name="subnetGroupName")
    private final @Nullable Input<String> subnetGroupName;

    public Input<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Input.empty() : this.subnetGroupName;
    }

    /**
     * A list of vpc security group ids to apply to the created endpoint access.
     * 
     */
    @InputImport(name="vpcSecurityGroupIds", required=true)
    private final Input<List<String>> vpcSecurityGroupIds;

    public Input<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public EndpointAccessArgs(
        @Nullable Input<String> clusterIdentifier,
        Input<String> endpointName,
        @Nullable Input<String> resourceOwner,
        @Nullable Input<String> subnetGroupName,
        Input<List<String>> vpcSecurityGroupIds) {
        this.clusterIdentifier = clusterIdentifier;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.resourceOwner = resourceOwner;
        this.subnetGroupName = subnetGroupName;
        this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds, "expected parameter 'vpcSecurityGroupIds' to be non-null");
    }

    private EndpointAccessArgs() {
        this.clusterIdentifier = Input.empty();
        this.endpointName = Input.empty();
        this.resourceOwner = Input.empty();
        this.subnetGroupName = Input.empty();
        this.vpcSecurityGroupIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterIdentifier;
        private Input<String> endpointName;
        private @Nullable Input<String> resourceOwner;
        private @Nullable Input<String> subnetGroupName;
        private Input<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.endpointName = defaults.endpointName;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setClusterIdentifier(@Nullable Input<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder setClusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Input.ofNullable(clusterIdentifier);
            return this;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setResourceOwner(@Nullable Input<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        public Builder setResourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Input.ofNullable(resourceOwner);
            return this;
        }

        public Builder setSubnetGroupName(@Nullable Input<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder setSubnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Input.ofNullable(subnetGroupName);
            return this;
        }

        public Builder setVpcSecurityGroupIds(Input<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Input.of(Objects.requireNonNull(vpcSecurityGroupIds));
            return this;
        }

        public EndpointAccessArgs build() {
            return new EndpointAccessArgs(clusterIdentifier, endpointName, resourceOwner, subnetGroupName, vpcSecurityGroupIds);
        }
    }
}