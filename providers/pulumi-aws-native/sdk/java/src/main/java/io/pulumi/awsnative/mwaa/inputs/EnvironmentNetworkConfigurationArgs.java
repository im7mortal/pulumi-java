// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures the network resources of the environment.
 * 
 */
public final class EnvironmentNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentNetworkConfigurationArgs Empty = new EnvironmentNetworkConfigurationArgs();

    /**
     * A list of security groups to use for the environment.
     * 
     */
    @InputImport(name="securityGroupIds")
    private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * A list of subnets to use for the environment. These must be private subnets, in the same VPC, in two different availability zones.
     * 
     */
    @InputImport(name="subnetIds")
    private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    public EnvironmentNetworkConfigurationArgs(
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private EnvironmentNetworkConfigurationArgs() {
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public EnvironmentNetworkConfigurationArgs build() {
            return new EnvironmentNetworkConfigurationArgs(securityGroupIds, subnetIds);
        }
    }
}
