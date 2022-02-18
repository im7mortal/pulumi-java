// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.AwsNodePoolConfigConfigEncryption;
import io.pulumi.gcp.container.outputs.AwsNodePoolConfigRootVolume;
import io.pulumi.gcp.container.outputs.AwsNodePoolConfigSshConfig;
import io.pulumi.gcp.container.outputs.AwsNodePoolConfigTaint;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsNodePoolConfig {
    /**
     * Required. The ARN of the AWS KMS key used to encrypt node pool configuration.
     * 
     */
    private final AwsNodePoolConfigConfigEncryption configEncryption;
    /**
     * Required. The name of the AWS IAM role assigned to nodes in the pool.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * Optional. The initial labels assigned to nodes of this node pool. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    private final @Nullable AwsNodePoolConfigRootVolume rootVolume;
    /**
     * Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * Optional. The SSH configuration.
     * 
     */
    private final @Nullable AwsNodePoolConfigSshConfig sshConfig;
    /**
     * Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Optional. The initial taints assigned to nodes of this node pool.
     * 
     */
    private final @Nullable List<AwsNodePoolConfigTaint> taints;

    @OutputCustomType.Constructor({"configEncryption","iamInstanceProfile","instanceType","labels","rootVolume","securityGroupIds","sshConfig","tags","taints"})
    private AwsNodePoolConfig(
        AwsNodePoolConfigConfigEncryption configEncryption,
        String iamInstanceProfile,
        @Nullable String instanceType,
        @Nullable Map<String,String> labels,
        @Nullable AwsNodePoolConfigRootVolume rootVolume,
        @Nullable List<String> securityGroupIds,
        @Nullable AwsNodePoolConfigSshConfig sshConfig,
        @Nullable Map<String,String> tags,
        @Nullable List<AwsNodePoolConfigTaint> taints) {
        this.configEncryption = Objects.requireNonNull(configEncryption);
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
        this.instanceType = instanceType;
        this.labels = labels;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.tags = tags;
        this.taints = taints;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt node pool configuration.
     * 
     */
    public AwsNodePoolConfigConfigEncryption getConfigEncryption() {
        return this.configEncryption;
    }
    /**
     * Required. The name of the AWS IAM role assigned to nodes in the pool.
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
     * Optional. The initial labels assigned to nodes of this node pool. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    public Optional<AwsNodePoolConfigRootVolume> getRootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }
    /**
     * Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
     * 
     */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * Optional. The SSH configuration.
     * 
     */
    public Optional<AwsNodePoolConfigSshConfig> getSshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }
    /**
     * Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Optional. The initial taints assigned to nodes of this node pool.
     * 
     */
    public List<AwsNodePoolConfigTaint> getTaints() {
        return this.taints == null ? List.of() : this.taints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsNodePoolConfigConfigEncryption configEncryption;
        private String iamInstanceProfile;
        private @Nullable String instanceType;
        private @Nullable Map<String,String> labels;
        private @Nullable AwsNodePoolConfigRootVolume rootVolume;
        private @Nullable List<String> securityGroupIds;
        private @Nullable AwsNodePoolConfigSshConfig sshConfig;
        private @Nullable Map<String,String> tags;
        private @Nullable List<AwsNodePoolConfigTaint> taints;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configEncryption = defaults.configEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.labels = defaults.labels;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
        }

        public Builder setConfigEncryption(AwsNodePoolConfigConfigEncryption configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
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

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setRootVolume(@Nullable AwsNodePoolConfigRootVolume rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSshConfig(@Nullable AwsNodePoolConfigSshConfig sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTaints(@Nullable List<AwsNodePoolConfigTaint> taints) {
            this.taints = taints;
            return this;
        }

        public AwsNodePoolConfig build() {
            return new AwsNodePoolConfig(configEncryption, iamInstanceProfile, instanceType, labels, rootVolume, securityGroupIds, sshConfig, tags, taints);
        }
    }
}