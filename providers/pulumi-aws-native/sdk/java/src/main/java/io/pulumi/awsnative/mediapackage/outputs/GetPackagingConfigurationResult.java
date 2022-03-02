// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationCmafPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationHlsPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationMssPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPackagingConfigurationResult {
    /**
     * The ARN of the PackagingConfiguration.
     * 
     */
    private final @Nullable String arn;
    /**
     * A CMAF packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationCmafPackage cmafPackage;
    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationDashPackage dashPackage;
    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationHlsPackage hlsPackage;
    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    private final @Nullable PackagingConfigurationMssPackage mssPackage;
    /**
     * The ID of a PackagingGroup.
     * 
     */
    private final @Nullable String packagingGroupId;
    /**
     * A collection of tags associated with a resource
     * 
     */
    private final @Nullable List<PackagingConfigurationTag> tags;

    @OutputCustomType.Constructor({"arn","cmafPackage","dashPackage","hlsPackage","mssPackage","packagingGroupId","tags"})
    private GetPackagingConfigurationResult(
        @Nullable String arn,
        @Nullable PackagingConfigurationCmafPackage cmafPackage,
        @Nullable PackagingConfigurationDashPackage dashPackage,
        @Nullable PackagingConfigurationHlsPackage hlsPackage,
        @Nullable PackagingConfigurationMssPackage mssPackage,
        @Nullable String packagingGroupId,
        @Nullable List<PackagingConfigurationTag> tags) {
        this.arn = arn;
        this.cmafPackage = cmafPackage;
        this.dashPackage = dashPackage;
        this.hlsPackage = hlsPackage;
        this.mssPackage = mssPackage;
        this.packagingGroupId = packagingGroupId;
        this.tags = tags;
    }

    /**
     * The ARN of the PackagingConfiguration.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * A CMAF packaging configuration.
     * 
    */
    public Optional<PackagingConfigurationCmafPackage> getCmafPackage() {
        return Optional.ofNullable(this.cmafPackage);
    }
    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
    */
    public Optional<PackagingConfigurationDashPackage> getDashPackage() {
        return Optional.ofNullable(this.dashPackage);
    }
    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * 
    */
    public Optional<PackagingConfigurationHlsPackage> getHlsPackage() {
        return Optional.ofNullable(this.hlsPackage);
    }
    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
    */
    public Optional<PackagingConfigurationMssPackage> getMssPackage() {
        return Optional.ofNullable(this.mssPackage);
    }
    /**
     * The ID of a PackagingGroup.
     * 
    */
    public Optional<String> getPackagingGroupId() {
        return Optional.ofNullable(this.packagingGroupId);
    }
    /**
     * A collection of tags associated with a resource
     * 
    */
    public List<PackagingConfigurationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackagingConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable PackagingConfigurationCmafPackage cmafPackage;
        private @Nullable PackagingConfigurationDashPackage dashPackage;
        private @Nullable PackagingConfigurationHlsPackage hlsPackage;
        private @Nullable PackagingConfigurationMssPackage mssPackage;
        private @Nullable String packagingGroupId;
        private @Nullable List<PackagingConfigurationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackagingConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cmafPackage = defaults.cmafPackage;
    	      this.dashPackage = defaults.dashPackage;
    	      this.hlsPackage = defaults.hlsPackage;
    	      this.mssPackage = defaults.mssPackage;
    	      this.packagingGroupId = defaults.packagingGroupId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCmafPackage(@Nullable PackagingConfigurationCmafPackage cmafPackage) {
            this.cmafPackage = cmafPackage;
            return this;
        }

        public Builder setDashPackage(@Nullable PackagingConfigurationDashPackage dashPackage) {
            this.dashPackage = dashPackage;
            return this;
        }

        public Builder setHlsPackage(@Nullable PackagingConfigurationHlsPackage hlsPackage) {
            this.hlsPackage = hlsPackage;
            return this;
        }

        public Builder setMssPackage(@Nullable PackagingConfigurationMssPackage mssPackage) {
            this.mssPackage = mssPackage;
            return this;
        }

        public Builder setPackagingGroupId(@Nullable String packagingGroupId) {
            this.packagingGroupId = packagingGroupId;
            return this;
        }

        public Builder setTags(@Nullable List<PackagingConfigurationTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetPackagingConfigurationResult build() {
            return new GetPackagingConfigurationResult(arn, cmafPackage, dashPackage, hlsPackage, mssPackage, packagingGroupId, tags);
        }
    }
}
