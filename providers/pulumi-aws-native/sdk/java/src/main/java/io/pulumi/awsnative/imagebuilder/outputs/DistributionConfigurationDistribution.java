// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistributionAmiDistributionConfigurationProperties;
import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistributionContainerDistributionConfigurationProperties;
import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationLaunchTemplateConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionConfigurationDistribution {
    /**
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * 
     */
    private final @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration;
    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * 
     */
    private final @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration;
    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    private final @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations;
    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    private final @Nullable List<String> licenseConfigurationArns;
    /**
     * region
     * 
     */
    private final String region;

    @OutputCustomType.Constructor({"amiDistributionConfiguration","containerDistributionConfiguration","launchTemplateConfigurations","licenseConfigurationArns","region"})
    private DistributionConfigurationDistribution(
        @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration,
        @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration,
        @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations,
        @Nullable List<String> licenseConfigurationArns,
        String region) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        this.containerDistributionConfiguration = containerDistributionConfiguration;
        this.launchTemplateConfigurations = launchTemplateConfigurations;
        this.licenseConfigurationArns = licenseConfigurationArns;
        this.region = Objects.requireNonNull(region);
    }

    /**
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * 
     */
    public Optional<DistributionConfigurationDistributionAmiDistributionConfigurationProperties> getAmiDistributionConfiguration() {
        return Optional.ofNullable(this.amiDistributionConfiguration);
    }
    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * 
     */
    public Optional<DistributionConfigurationDistributionContainerDistributionConfigurationProperties> getContainerDistributionConfiguration() {
        return Optional.ofNullable(this.containerDistributionConfiguration);
    }
    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    public List<DistributionConfigurationLaunchTemplateConfiguration> getLaunchTemplateConfigurations() {
        return this.launchTemplateConfigurations == null ? List.of() : this.launchTemplateConfigurations;
    }
    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    public List<String> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns == null ? List.of() : this.licenseConfigurationArns;
    }
    /**
     * region
     * 
     */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration;
        private @Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration;
        private @Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations;
        private @Nullable List<String> licenseConfigurationArns;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfiguration = defaults.amiDistributionConfiguration;
    	      this.containerDistributionConfiguration = defaults.containerDistributionConfiguration;
    	      this.launchTemplateConfigurations = defaults.launchTemplateConfigurations;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder setAmiDistributionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationProperties amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        public Builder setContainerDistributionConfiguration(@Nullable DistributionConfigurationDistributionContainerDistributionConfigurationProperties containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        public Builder setLaunchTemplateConfigurations(@Nullable List<DistributionConfigurationLaunchTemplateConfiguration> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = launchTemplateConfigurations;
            return this;
        }

        public Builder setLicenseConfigurationArns(@Nullable List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public DistributionConfigurationDistribution build() {
            return new DistributionConfigurationDistribution(amiDistributionConfiguration, containerDistributionConfiguration, launchTemplateConfigurations, licenseConfigurationArns, region);
        }
    }
}
