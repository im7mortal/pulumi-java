// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.enums.DomainAppNetworkAccessType;
import io.pulumi.awsnative.sagemaker.enums.DomainAuthMode;
import io.pulumi.awsnative.sagemaker.inputs.DomainTagArgs;
import io.pulumi.awsnative.sagemaker.inputs.DomainUserSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    @InputImport(name="appNetworkAccessType")
    private final @Nullable Input<DomainAppNetworkAccessType> appNetworkAccessType;

    public Input<DomainAppNetworkAccessType> getAppNetworkAccessType() {
        return this.appNetworkAccessType == null ? Input.empty() : this.appNetworkAccessType;
    }

    /**
     * The mode of authentication that members use to access the domain.
     * 
     */
    @InputImport(name="authMode", required=true)
    private final Input<DomainAuthMode> authMode;

    public Input<DomainAuthMode> getAuthMode() {
        return this.authMode;
    }

    /**
     * The default user settings.
     * 
     */
    @InputImport(name="defaultUserSettings", required=true)
    private final Input<DomainUserSettingsArgs> defaultUserSettings;

    public Input<DomainUserSettingsArgs> getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * A name for the domain.
     * 
     */
    @InputImport(name="domainName")
    private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<DomainTagArgs>> tags;

    public Input<List<DomainTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public DomainArgs(
        @Nullable Input<DomainAppNetworkAccessType> appNetworkAccessType,
        Input<DomainAuthMode> authMode,
        Input<DomainUserSettingsArgs> defaultUserSettings,
        @Nullable Input<String> domainName,
        @Nullable Input<String> kmsKeyId,
        Input<List<String>> subnetIds,
        @Nullable Input<List<DomainTagArgs>> tags,
        Input<String> vpcId) {
        this.appNetworkAccessType = appNetworkAccessType;
        this.authMode = Objects.requireNonNull(authMode, "expected parameter 'authMode' to be non-null");
        this.defaultUserSettings = Objects.requireNonNull(defaultUserSettings, "expected parameter 'defaultUserSettings' to be non-null");
        this.domainName = domainName;
        this.kmsKeyId = kmsKeyId;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private DomainArgs() {
        this.appNetworkAccessType = Input.empty();
        this.authMode = Input.empty();
        this.defaultUserSettings = Input.empty();
        this.domainName = Input.empty();
        this.kmsKeyId = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DomainAppNetworkAccessType> appNetworkAccessType;
        private Input<DomainAuthMode> authMode;
        private Input<DomainUserSettingsArgs> defaultUserSettings;
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> kmsKeyId;
        private Input<List<String>> subnetIds;
        private @Nullable Input<List<DomainTagArgs>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkAccessType = defaults.appNetworkAccessType;
    	      this.authMode = defaults.authMode;
    	      this.defaultUserSettings = defaults.defaultUserSettings;
    	      this.domainName = defaults.domainName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAppNetworkAccessType(@Nullable Input<DomainAppNetworkAccessType> appNetworkAccessType) {
            this.appNetworkAccessType = appNetworkAccessType;
            return this;
        }

        public Builder setAppNetworkAccessType(@Nullable DomainAppNetworkAccessType appNetworkAccessType) {
            this.appNetworkAccessType = Input.ofNullable(appNetworkAccessType);
            return this;
        }

        public Builder setAuthMode(Input<DomainAuthMode> authMode) {
            this.authMode = Objects.requireNonNull(authMode);
            return this;
        }

        public Builder setAuthMode(DomainAuthMode authMode) {
            this.authMode = Input.of(Objects.requireNonNull(authMode));
            return this;
        }

        public Builder setDefaultUserSettings(Input<DomainUserSettingsArgs> defaultUserSettings) {
            this.defaultUserSettings = Objects.requireNonNull(defaultUserSettings);
            return this;
        }

        public Builder setDefaultUserSettings(DomainUserSettingsArgs defaultUserSettings) {
            this.defaultUserSettings = Input.of(Objects.requireNonNull(defaultUserSettings));
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DomainTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DomainTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }

        public DomainArgs build() {
            return new DomainArgs(appNetworkAccessType, authMode, defaultUserSettings, domainName, kmsKeyId, subnetIds, tags, vpcId);
        }
    }
}
