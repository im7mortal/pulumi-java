// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.composer_v1.inputs.PrivateClusterConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration information for configuring a Private IP Cloud Composer environment.
 * 
 */
public final class PrivateEnvironmentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEnvironmentConfigArgs Empty = new PrivateEnvironmentConfigArgs();

    /**
     * Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    @Import(name="cloudComposerConnectionSubnetwork")
    private @Nullable Output<String> cloudComposerConnectionSubnetwork;

    /**
     * @return Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    public Optional<Output<String>> cloudComposerConnectionSubnetwork() {
        return Optional.ofNullable(this.cloudComposerConnectionSubnetwork);
    }

    /**
     * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="cloudComposerNetworkIpv4CidrBlock")
    private @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock;

    /**
     * @return Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    public Optional<Output<String>> cloudComposerNetworkIpv4CidrBlock() {
        return Optional.ofNullable(this.cloudComposerNetworkIpv4CidrBlock);
    }

    /**
     * Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
     * 
     */
    @Import(name="cloudSqlIpv4CidrBlock")
    private @Nullable Output<String> cloudSqlIpv4CidrBlock;

    /**
     * @return Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
     * 
     */
    public Optional<Output<String>> cloudSqlIpv4CidrBlock() {
        return Optional.ofNullable(this.cloudSqlIpv4CidrBlock);
    }

    /**
     * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="enablePrivateEnvironment")
    private @Nullable Output<Boolean> enablePrivateEnvironment;

    /**
     * @return Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<Boolean>> enablePrivateEnvironment() {
        return Optional.ofNullable(this.enablePrivateEnvironment);
    }

    /**
     * Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    @Import(name="privateClusterConfig")
    private @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig;

    /**
     * @return Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    public Optional<Output<PrivateClusterConfigArgs>> privateClusterConfig() {
        return Optional.ofNullable(this.privateClusterConfig);
    }

    /**
     * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="webServerIpv4CidrBlock")
    private @Nullable Output<String> webServerIpv4CidrBlock;

    /**
     * @return Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<String>> webServerIpv4CidrBlock() {
        return Optional.ofNullable(this.webServerIpv4CidrBlock);
    }

    private PrivateEnvironmentConfigArgs() {}

    private PrivateEnvironmentConfigArgs(PrivateEnvironmentConfigArgs $) {
        this.cloudComposerConnectionSubnetwork = $.cloudComposerConnectionSubnetwork;
        this.cloudComposerNetworkIpv4CidrBlock = $.cloudComposerNetworkIpv4CidrBlock;
        this.cloudSqlIpv4CidrBlock = $.cloudSqlIpv4CidrBlock;
        this.enablePrivateEnvironment = $.enablePrivateEnvironment;
        this.privateClusterConfig = $.privateClusterConfig;
        this.webServerIpv4CidrBlock = $.webServerIpv4CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEnvironmentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEnvironmentConfigArgs $;

        public Builder() {
            $ = new PrivateEnvironmentConfigArgs();
        }

        public Builder(PrivateEnvironmentConfigArgs defaults) {
            $ = new PrivateEnvironmentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudComposerConnectionSubnetwork Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder cloudComposerConnectionSubnetwork(@Nullable Output<String> cloudComposerConnectionSubnetwork) {
            $.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
            return this;
        }

        /**
         * @param cloudComposerConnectionSubnetwork Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder cloudComposerConnectionSubnetwork(String cloudComposerConnectionSubnetwork) {
            return cloudComposerConnectionSubnetwork(Output.of(cloudComposerConnectionSubnetwork));
        }

        /**
         * @param cloudComposerNetworkIpv4CidrBlock Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
         * 
         * @return builder
         * 
         */
        public Builder cloudComposerNetworkIpv4CidrBlock(@Nullable Output<String> cloudComposerNetworkIpv4CidrBlock) {
            $.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            return this;
        }

        /**
         * @param cloudComposerNetworkIpv4CidrBlock Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
         * 
         * @return builder
         * 
         */
        public Builder cloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            return cloudComposerNetworkIpv4CidrBlock(Output.of(cloudComposerNetworkIpv4CidrBlock));
        }

        /**
         * @param cloudSqlIpv4CidrBlock Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlIpv4CidrBlock(@Nullable Output<String> cloudSqlIpv4CidrBlock) {
            $.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            return this;
        }

        /**
         * @param cloudSqlIpv4CidrBlock Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            return cloudSqlIpv4CidrBlock(Output.of(cloudSqlIpv4CidrBlock));
        }

        /**
         * @param enablePrivateEnvironment Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEnvironment(@Nullable Output<Boolean> enablePrivateEnvironment) {
            $.enablePrivateEnvironment = enablePrivateEnvironment;
            return this;
        }

        /**
         * @param enablePrivateEnvironment Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEnvironment(Boolean enablePrivateEnvironment) {
            return enablePrivateEnvironment(Output.of(enablePrivateEnvironment));
        }

        /**
         * @param privateClusterConfig Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
         * 
         * @return builder
         * 
         */
        public Builder privateClusterConfig(@Nullable Output<PrivateClusterConfigArgs> privateClusterConfig) {
            $.privateClusterConfig = privateClusterConfig;
            return this;
        }

        /**
         * @param privateClusterConfig Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
         * 
         * @return builder
         * 
         */
        public Builder privateClusterConfig(PrivateClusterConfigArgs privateClusterConfig) {
            return privateClusterConfig(Output.of(privateClusterConfig));
        }

        /**
         * @param webServerIpv4CidrBlock Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder webServerIpv4CidrBlock(@Nullable Output<String> webServerIpv4CidrBlock) {
            $.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
            return this;
        }

        /**
         * @param webServerIpv4CidrBlock Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder webServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            return webServerIpv4CidrBlock(Output.of(webServerIpv4CidrBlock));
        }

        public PrivateEnvironmentConfigArgs build() {
            return $;
        }
    }

}
