// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneAwsServicesAuthentication;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneConfigEncryption;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneDatabaseEncryption;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneMainVolume;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneProxyConfig;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneRootVolume;
import io.pulumi.gcp.container.outputs.AwsClusterControlPlaneSshConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsClusterControlPlane {
    /**
     * Required. Authentication configuration for management of AWS resources.
     * 
     */
    private final AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    private final AwsClusterControlPlaneConfigEncryption configEncryption;
    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    private final AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
    /**
     * Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    private final @Nullable AwsClusterControlPlaneMainVolume mainVolume;
    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    private final @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    private final @Nullable AwsClusterControlPlaneRootVolume rootVolume;
    /**
     * Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    private final @Nullable AwsClusterControlPlaneSshConfig sshConfig;
    /**
     * Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    private final List<String> subnetIds;
    /**
     * Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"awsServicesAuthentication","configEncryption","databaseEncryption","iamInstanceProfile","instanceType","mainVolume","proxyConfig","rootVolume","securityGroupIds","sshConfig","subnetIds","tags","version"})
    private AwsClusterControlPlane(
        AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication,
        AwsClusterControlPlaneConfigEncryption configEncryption,
        AwsClusterControlPlaneDatabaseEncryption databaseEncryption,
        String iamInstanceProfile,
        @Nullable String instanceType,
        @Nullable AwsClusterControlPlaneMainVolume mainVolume,
        @Nullable AwsClusterControlPlaneProxyConfig proxyConfig,
        @Nullable AwsClusterControlPlaneRootVolume rootVolume,
        @Nullable List<String> securityGroupIds,
        @Nullable AwsClusterControlPlaneSshConfig sshConfig,
        List<String> subnetIds,
        @Nullable Map<String,String> tags,
        String version) {
        this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
        this.configEncryption = Objects.requireNonNull(configEncryption);
        this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
        this.instanceType = instanceType;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.subnetIds = Objects.requireNonNull(subnetIds);
        this.tags = tags;
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Required. Authentication configuration for management of AWS resources.
     * 
    */
    public AwsClusterControlPlaneAwsServicesAuthentication getAwsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }
    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
    */
    public AwsClusterControlPlaneConfigEncryption getConfigEncryption() {
        return this.configEncryption;
    }
    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
    */
    public AwsClusterControlPlaneDatabaseEncryption getDatabaseEncryption() {
        return this.databaseEncryption;
    }
    /**
     * Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
    */
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
    */
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
    */
    public Optional<AwsClusterControlPlaneMainVolume> getMainVolume() {
        return Optional.ofNullable(this.mainVolume);
    }
    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
    */
    public Optional<AwsClusterControlPlaneProxyConfig> getProxyConfig() {
        return Optional.ofNullable(this.proxyConfig);
    }
    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
    */
    public Optional<AwsClusterControlPlaneRootVolume> getRootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }
    /**
     * Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * Optional. SSH configuration for how to access the underlying control plane machines.
     * 
    */
    public Optional<AwsClusterControlPlaneSshConfig> getSshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }
    /**
     * Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlane defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
        private AwsClusterControlPlaneConfigEncryption configEncryption;
        private AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
        private String iamInstanceProfile;
        private @Nullable String instanceType;
        private @Nullable AwsClusterControlPlaneMainVolume mainVolume;
        private @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
        private @Nullable AwsClusterControlPlaneRootVolume rootVolume;
        private @Nullable List<String> securityGroupIds;
        private @Nullable AwsClusterControlPlaneSshConfig sshConfig;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsServicesAuthentication = defaults.awsServicesAuthentication;
    	      this.configEncryption = defaults.configEncryption;
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setAwsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication) {
            this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
            return this;
        }

        public Builder setConfigEncryption(AwsClusterControlPlaneConfigEncryption configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }

        public Builder setDatabaseEncryption(AwsClusterControlPlaneDatabaseEncryption databaseEncryption) {
            this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
            return this;
        }

        public Builder setIamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setMainVolume(@Nullable AwsClusterControlPlaneMainVolume mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }

        public Builder setProxyConfig(@Nullable AwsClusterControlPlaneProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public Builder setRootVolume(@Nullable AwsClusterControlPlaneRootVolume rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSshConfig(@Nullable AwsClusterControlPlaneSshConfig sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public AwsClusterControlPlane build() {
            return new AwsClusterControlPlane(awsServicesAuthentication, configEncryption, databaseEncryption, iamInstanceProfile, instanceType, mainVolume, proxyConfig, rootVolume, securityGroupIds, sshConfig, subnetIds, tags, version);
        }
    }
}
