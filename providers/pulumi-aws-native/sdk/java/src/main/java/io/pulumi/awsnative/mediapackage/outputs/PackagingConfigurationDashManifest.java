// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashManifestManifestLayout;
import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashManifestProfile;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationStreamSelection;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PackagingConfigurationDashManifest {
    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * 
     */
    private final @Nullable PackagingConfigurationDashManifestManifestLayout manifestLayout;
    private final @Nullable String manifestName;
    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     */
    private final @Nullable Integer minBufferTimeSeconds;
    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * 
     */
    private final @Nullable PackagingConfigurationDashManifestProfile profile;
    private final @Nullable PackagingConfigurationStreamSelection streamSelection;

    @OutputCustomType.Constructor({"manifestLayout","manifestName","minBufferTimeSeconds","profile","streamSelection"})
    private PackagingConfigurationDashManifest(
        @Nullable PackagingConfigurationDashManifestManifestLayout manifestLayout,
        @Nullable String manifestName,
        @Nullable Integer minBufferTimeSeconds,
        @Nullable PackagingConfigurationDashManifestProfile profile,
        @Nullable PackagingConfigurationStreamSelection streamSelection) {
        this.manifestLayout = manifestLayout;
        this.manifestName = manifestName;
        this.minBufferTimeSeconds = minBufferTimeSeconds;
        this.profile = profile;
        this.streamSelection = streamSelection;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * 
    */
    public Optional<PackagingConfigurationDashManifestManifestLayout> getManifestLayout() {
        return Optional.ofNullable(this.manifestLayout);
    }
    public Optional<String> getManifestName() {
        return Optional.ofNullable(this.manifestName);
    }
    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
    */
    public Optional<Integer> getMinBufferTimeSeconds() {
        return Optional.ofNullable(this.minBufferTimeSeconds);
    }
    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * 
    */
    public Optional<PackagingConfigurationDashManifestProfile> getProfile() {
        return Optional.ofNullable(this.profile);
    }
    public Optional<PackagingConfigurationStreamSelection> getStreamSelection() {
        return Optional.ofNullable(this.streamSelection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PackagingConfigurationDashManifestManifestLayout manifestLayout;
        private @Nullable String manifestName;
        private @Nullable Integer minBufferTimeSeconds;
        private @Nullable PackagingConfigurationDashManifestProfile profile;
        private @Nullable PackagingConfigurationStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestLayout = defaults.manifestLayout;
    	      this.manifestName = defaults.manifestName;
    	      this.minBufferTimeSeconds = defaults.minBufferTimeSeconds;
    	      this.profile = defaults.profile;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setManifestLayout(@Nullable PackagingConfigurationDashManifestManifestLayout manifestLayout) {
            this.manifestLayout = manifestLayout;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setMinBufferTimeSeconds(@Nullable Integer minBufferTimeSeconds) {
            this.minBufferTimeSeconds = minBufferTimeSeconds;
            return this;
        }

        public Builder setProfile(@Nullable PackagingConfigurationDashManifestProfile profile) {
            this.profile = profile;
            return this;
        }

        public Builder setStreamSelection(@Nullable PackagingConfigurationStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public PackagingConfigurationDashManifest build() {
            return new PackagingConfigurationDashManifest(manifestLayout, manifestName, minBufferTimeSeconds, profile, streamSelection);
        }
    }
}
