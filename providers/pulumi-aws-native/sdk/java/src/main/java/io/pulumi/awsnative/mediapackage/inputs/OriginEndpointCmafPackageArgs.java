// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointCmafEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsManifestArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Common Media Application Format (CMAF) packaging configuration.
 * 
 */
public final class OriginEndpointCmafPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointCmafPackageArgs Empty = new OriginEndpointCmafPackageArgs();

    @InputImport(name="encryption")
    private final @Nullable Input<OriginEndpointCmafEncryptionArgs> encryption;

    public Input<OriginEndpointCmafEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations
     * 
     */
    @InputImport(name="hlsManifests")
    private final @Nullable Input<List<OriginEndpointHlsManifestArgs>> hlsManifests;

    public Input<List<OriginEndpointHlsManifestArgs>> getHlsManifests() {
        return this.hlsManifests == null ? Input.empty() : this.hlsManifests;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
     */
    @InputImport(name="segmentDurationSeconds")
    private final @Nullable Input<Integer> segmentDurationSeconds;

    public Input<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Input.empty() : this.segmentDurationSeconds;
    }

    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
     * 
     */
    @InputImport(name="segmentPrefix")
    private final @Nullable Input<String> segmentPrefix;

    public Input<String> getSegmentPrefix() {
        return this.segmentPrefix == null ? Input.empty() : this.segmentPrefix;
    }

    @InputImport(name="streamSelection")
    private final @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;

    public Input<OriginEndpointStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Input.empty() : this.streamSelection;
    }

    public OriginEndpointCmafPackageArgs(
        @Nullable Input<OriginEndpointCmafEncryptionArgs> encryption,
        @Nullable Input<List<OriginEndpointHlsManifestArgs>> hlsManifests,
        @Nullable Input<Integer> segmentDurationSeconds,
        @Nullable Input<String> segmentPrefix,
        @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection) {
        this.encryption = encryption;
        this.hlsManifests = hlsManifests;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentPrefix = segmentPrefix;
        this.streamSelection = streamSelection;
    }

    private OriginEndpointCmafPackageArgs() {
        this.encryption = Input.empty();
        this.hlsManifests = Input.empty();
        this.segmentDurationSeconds = Input.empty();
        this.segmentPrefix = Input.empty();
        this.streamSelection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointCmafPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OriginEndpointCmafEncryptionArgs> encryption;
        private @Nullable Input<List<OriginEndpointHlsManifestArgs>> hlsManifests;
        private @Nullable Input<Integer> segmentDurationSeconds;
        private @Nullable Input<String> segmentPrefix;
        private @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointCmafPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.segmentPrefix = defaults.segmentPrefix;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setEncryption(@Nullable Input<OriginEndpointCmafEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable OriginEndpointCmafEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setHlsManifests(@Nullable Input<List<OriginEndpointHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = hlsManifests;
            return this;
        }

        public Builder setHlsManifests(@Nullable List<OriginEndpointHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Input.ofNullable(hlsManifests);
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

        public Builder setSegmentPrefix(@Nullable Input<String> segmentPrefix) {
            this.segmentPrefix = segmentPrefix;
            return this;
        }

        public Builder setSegmentPrefix(@Nullable String segmentPrefix) {
            this.segmentPrefix = Input.ofNullable(segmentPrefix);
            return this;
        }

        public Builder setStreamSelection(@Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setStreamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Input.ofNullable(streamSelection);
            return this;
        }

        public OriginEndpointCmafPackageArgs build() {
            return new OriginEndpointCmafPackageArgs(encryption, hlsManifests, segmentDurationSeconds, segmentPrefix, streamSelection);
        }
    }
}
