// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionConfigurationDistributionAmiDistributionConfiguration {
    /**
     * Key-value map of tags to apply to the distributed AMI.
     * 
     */
    private final @Nullable Map<String,String> amiTags;
    /**
     * Description of the container distribution configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
     * 
     */
    private final @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission launchPermission;
    /**
     * Name to apply to the distributed AMI.
     * 
     */
    private final @Nullable String name;
    /**
     * Set of AWS Account identifiers to distribute the AMI.
     * 
     */
    private final @Nullable List<String> targetAccountIds;

    @OutputCustomType.Constructor({"amiTags","description","kmsKeyId","launchPermission","name","targetAccountIds"})
    private DistributionConfigurationDistributionAmiDistributionConfiguration(
        @Nullable Map<String,String> amiTags,
        @Nullable String description,
        @Nullable String kmsKeyId,
        @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission launchPermission,
        @Nullable String name,
        @Nullable List<String> targetAccountIds) {
        this.amiTags = amiTags;
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.launchPermission = launchPermission;
        this.name = name;
        this.targetAccountIds = targetAccountIds;
    }

    /**
     * Key-value map of tags to apply to the distributed AMI.
     * 
    */
    public Map<String,String> getAmiTags() {
        return this.amiTags == null ? Map.of() : this.amiTags;
    }
    /**
     * Description of the container distribution configuration.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
     * 
    */
    public Optional<DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> getLaunchPermission() {
        return Optional.ofNullable(this.launchPermission);
    }
    /**
     * Name to apply to the distributed AMI.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Set of AWS Account identifiers to distribute the AMI.
     * 
    */
    public List<String> getTargetAccountIds() {
        return this.targetAccountIds == null ? List.of() : this.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> amiTags;
        private @Nullable String description;
        private @Nullable String kmsKeyId;
        private @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission launchPermission;
        private @Nullable String name;
        private @Nullable List<String> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermission = defaults.launchPermission;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder setAmiTags(@Nullable Map<String,String> amiTags) {
            this.amiTags = amiTags;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setLaunchPermission(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission launchPermission) {
            this.launchPermission = launchPermission;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTargetAccountIds(@Nullable List<String> targetAccountIds) {
            this.targetAccountIds = targetAccountIds;
            return this;
        }
        public DistributionConfigurationDistributionAmiDistributionConfiguration build() {
            return new DistributionConfigurationDistributionAmiDistributionConfiguration(amiTags, description, kmsKeyId, launchPermission, name, targetAccountIds);
        }
    }
}
