// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationCmafEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsManifestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CMAF packaging configuration.
 * 
 */
public final class PackagingConfigurationCmafPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationCmafPackageArgs Empty = new PackagingConfigurationCmafPackageArgs();

    @InputImport(name="encryption")
    private final @Nullable Input<PackagingConfigurationCmafEncryptionArgs> encryption;

    public Input<PackagingConfigurationCmafEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     */
    @InputImport(name="hlsManifests", required=true)
    private final Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;

    public Input<List<PackagingConfigurationHlsManifestArgs>> getHlsManifests() {
        return this.hlsManifests;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     */
    @InputImport(name="includeEncoderConfigurationInSegments")
    private final @Nullable Input<Boolean> includeEncoderConfigurationInSegments;

    public Input<Boolean> getIncludeEncoderConfigurationInSegments() {
        return this.includeEncoderConfigurationInSegments == null ? Input.empty() : this.includeEncoderConfigurationInSegments;
    }

    @InputImport(name="segmentDurationSeconds")
    private final @Nullable Input<Integer> segmentDurationSeconds;

    public Input<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Input.empty() : this.segmentDurationSeconds;
    }

    public PackagingConfigurationCmafPackageArgs(
        @Nullable Input<PackagingConfigurationCmafEncryptionArgs> encryption,
        Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests,
        @Nullable Input<Boolean> includeEncoderConfigurationInSegments,
        @Nullable Input<Integer> segmentDurationSeconds) {
        this.encryption = encryption;
        this.hlsManifests = Objects.requireNonNull(hlsManifests, "expected parameter 'hlsManifests' to be non-null");
        this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    private PackagingConfigurationCmafPackageArgs() {
        this.encryption = Input.empty();
        this.hlsManifests = Input.empty();
        this.includeEncoderConfigurationInSegments = Input.empty();
        this.segmentDurationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationCmafPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PackagingConfigurationCmafEncryptionArgs> encryption;
        private Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;
        private @Nullable Input<Boolean> includeEncoderConfigurationInSegments;
        private @Nullable Input<Integer> segmentDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationCmafPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.includeEncoderConfigurationInSegments = defaults.includeEncoderConfigurationInSegments;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
        }

        public Builder setEncryption(@Nullable Input<PackagingConfigurationCmafEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable PackagingConfigurationCmafEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setHlsManifests(Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = Objects.requireNonNull(hlsManifests);
            return this;
        }

        public Builder setHlsManifests(List<PackagingConfigurationHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Input.of(Objects.requireNonNull(hlsManifests));
            return this;
        }

        public Builder setIncludeEncoderConfigurationInSegments(@Nullable Input<Boolean> includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
            return this;
        }

        public Builder setIncludeEncoderConfigurationInSegments(@Nullable Boolean includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = Input.ofNullable(includeEncoderConfigurationInSegments);
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Input<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Input.ofNullable(segmentDurationSeconds);
            return this;
        }

        public PackagingConfigurationCmafPackageArgs build() {
            return new PackagingConfigurationCmafPackageArgs(encryption, hlsManifests, includeEncoderConfigurationInSegments, segmentDurationSeconds);
        }
    }
}
