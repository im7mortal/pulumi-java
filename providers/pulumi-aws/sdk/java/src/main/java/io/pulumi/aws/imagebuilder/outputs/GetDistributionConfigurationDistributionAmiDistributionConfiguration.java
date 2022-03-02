// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDistributionConfigurationDistributionAmiDistributionConfiguration {
    /**
     * Key-value map of tags to apply to distributed AMI.
     * 
     */
    private final Map<String,String> amiTags;
    /**
     * Description to apply to distributed AMI.
     * 
     */
    private final String description;
    /**
     * Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
     * 
     */
    private final String kmsKeyId;
    /**
     * Nested list of EC2 launch permissions.
     * 
     */
    private final List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions;
    /**
     * Name of the distribution configuration.
     * 
     */
    private final String name;
    /**
     * Set of target AWS Account identifiers.
     * 
     */
    private final List<String> targetAccountIds;

    @OutputCustomType.Constructor({"amiTags","description","kmsKeyId","launchPermissions","name","targetAccountIds"})
    private GetDistributionConfigurationDistributionAmiDistributionConfiguration(
        Map<String,String> amiTags,
        String description,
        String kmsKeyId,
        List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions,
        String name,
        List<String> targetAccountIds) {
        this.amiTags = Objects.requireNonNull(amiTags);
        this.description = Objects.requireNonNull(description);
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
        this.launchPermissions = Objects.requireNonNull(launchPermissions);
        this.name = Objects.requireNonNull(name);
        this.targetAccountIds = Objects.requireNonNull(targetAccountIds);
    }

    /**
     * Key-value map of tags to apply to distributed AMI.
     * 
    */
    public Map<String,String> getAmiTags() {
        return this.amiTags;
    }
    /**
     * Description to apply to distributed AMI.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
     * 
    */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Nested list of EC2 launch permissions.
     * 
    */
    public List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> getLaunchPermissions() {
        return this.launchPermissions;
    }
    /**
     * Name of the distribution configuration.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Set of target AWS Account identifiers.
     * 
    */
    public List<String> getTargetAccountIds() {
        return this.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> amiTags;
        private String description;
        private String kmsKeyId;
        private List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions;
        private String name;
        private List<String> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermissions = defaults.launchPermissions;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder setAmiTags(Map<String,String> amiTags) {
            this.amiTags = Objects.requireNonNull(amiTags);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setLaunchPermissions(List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions) {
            this.launchPermissions = Objects.requireNonNull(launchPermissions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetAccountIds(List<String> targetAccountIds) {
            this.targetAccountIds = Objects.requireNonNull(targetAccountIds);
            return this;
        }
        public GetDistributionConfigurationDistributionAmiDistributionConfiguration build() {
            return new GetDistributionConfigurationDistributionAmiDistributionConfiguration(amiTags, description, kmsKeyId, launchPermissions, name, targetAccountIds);
        }
    }
}
