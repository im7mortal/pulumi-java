// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationStreamSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class PackagingConfigurationHlsManifestArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationHlsManifestArgs Empty = new PackagingConfigurationHlsManifestArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
     */
    @InputImport(name="adMarkers")
    private final @Nullable Input<PackagingConfigurationHlsManifestAdMarkers> adMarkers;

    public Input<PackagingConfigurationHlsManifestAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Input.empty() : this.adMarkers;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @InputImport(name="includeIframeOnlyStream")
    private final @Nullable Input<Boolean> includeIframeOnlyStream;

    public Input<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Input.empty() : this.includeIframeOnlyStream;
    }

    @InputImport(name="manifestName")
    private final @Nullable Input<String> manifestName;

    public Input<String> getManifestName() {
        return this.manifestName == null ? Input.empty() : this.manifestName;
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @InputImport(name="programDateTimeIntervalSeconds")
    private final @Nullable Input<Integer> programDateTimeIntervalSeconds;

    public Input<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Input.empty() : this.programDateTimeIntervalSeconds;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @InputImport(name="repeatExtXKey")
    private final @Nullable Input<Boolean> repeatExtXKey;

    public Input<Boolean> getRepeatExtXKey() {
        return this.repeatExtXKey == null ? Input.empty() : this.repeatExtXKey;
    }

    @InputImport(name="streamSelection")
    private final @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection;

    public Input<PackagingConfigurationStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Input.empty() : this.streamSelection;
    }

    public PackagingConfigurationHlsManifestArgs(
        @Nullable Input<PackagingConfigurationHlsManifestAdMarkers> adMarkers,
        @Nullable Input<Boolean> includeIframeOnlyStream,
        @Nullable Input<String> manifestName,
        @Nullable Input<Integer> programDateTimeIntervalSeconds,
        @Nullable Input<Boolean> repeatExtXKey,
        @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection) {
        this.adMarkers = adMarkers;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.streamSelection = streamSelection;
    }

    private PackagingConfigurationHlsManifestArgs() {
        this.adMarkers = Input.empty();
        this.includeIframeOnlyStream = Input.empty();
        this.manifestName = Input.empty();
        this.programDateTimeIntervalSeconds = Input.empty();
        this.repeatExtXKey = Input.empty();
        this.streamSelection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PackagingConfigurationHlsManifestAdMarkers> adMarkers;
        private @Nullable Input<Boolean> includeIframeOnlyStream;
        private @Nullable Input<String> manifestName;
        private @Nullable Input<Integer> programDateTimeIntervalSeconds;
        private @Nullable Input<Boolean> repeatExtXKey;
        private @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsManifestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setAdMarkers(@Nullable Input<PackagingConfigurationHlsManifestAdMarkers> adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdMarkers(@Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers) {
            this.adMarkers = Input.ofNullable(adMarkers);
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Input<Boolean> includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = Input.ofNullable(includeIframeOnlyStream);
            return this;
        }

        public Builder setManifestName(@Nullable Input<String> manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = Input.ofNullable(manifestName);
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Input<Integer> programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = Input.ofNullable(programDateTimeIntervalSeconds);
            return this;
        }

        public Builder setRepeatExtXKey(@Nullable Input<Boolean> repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder setRepeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = Input.ofNullable(repeatExtXKey);
            return this;
        }

        public Builder setStreamSelection(@Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setStreamSelection(@Nullable PackagingConfigurationStreamSelectionArgs streamSelection) {
            this.streamSelection = Input.ofNullable(streamSelection);
            return this;
        }

        public PackagingConfigurationHlsManifestArgs build() {
            return new PackagingConfigurationHlsManifestArgs(adMarkers, includeIframeOnlyStream, manifestName, programDateTimeIntervalSeconds, repeatExtXKey, streamSelection);
        }
    }
}
