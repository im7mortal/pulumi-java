// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestPlaylistType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class OriginEndpointHlsManifest extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointHlsManifest Empty = new OriginEndpointHlsManifest();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @InputImport(name="adMarkers")
    private final @Nullable OriginEndpointHlsManifestAdMarkers adMarkers;

    public Optional<OriginEndpointHlsManifestAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Optional.empty() : Optional.ofNullable(this.adMarkers);
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @InputImport(name="adTriggers")
    private final @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers;

    public List<OriginEndpointHlsManifestAdTriggersItem> getAdTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }

    @InputImport(name="adsOnDeliveryRestrictions")
    private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;

    public Optional<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Optional.empty() : Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }

    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @InputImport(name="includeIframeOnlyStream")
    private final @Nullable Boolean includeIframeOnlyStream;

    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Optional.empty() : Optional.ofNullable(this.includeIframeOnlyStream);
    }

    /**
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    @InputImport(name="manifestName")
    private final @Nullable String manifestName;

    public Optional<String> getManifestName() {
        return this.manifestName == null ? Optional.empty() : Optional.ofNullable(this.manifestName);
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @InputImport(name="playlistType")
    private final @Nullable OriginEndpointHlsManifestPlaylistType playlistType;

    public Optional<OriginEndpointHlsManifestPlaylistType> getPlaylistType() {
        return this.playlistType == null ? Optional.empty() : Optional.ofNullable(this.playlistType);
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    @InputImport(name="playlistWindowSeconds")
    private final @Nullable Integer playlistWindowSeconds;

    public Optional<Integer> getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds == null ? Optional.empty() : Optional.ofNullable(this.playlistWindowSeconds);
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @InputImport(name="programDateTimeIntervalSeconds")
    private final @Nullable Integer programDateTimeIntervalSeconds;

    public Optional<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }

    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    @InputImport(name="url")
    private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public OriginEndpointHlsManifest(
        @Nullable OriginEndpointHlsManifestAdMarkers adMarkers,
        @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers,
        @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions,
        String id,
        @Nullable Boolean includeIframeOnlyStream,
        @Nullable String manifestName,
        @Nullable OriginEndpointHlsManifestPlaylistType playlistType,
        @Nullable Integer playlistWindowSeconds,
        @Nullable Integer programDateTimeIntervalSeconds,
        @Nullable String url) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.url = url;
    }

    private OriginEndpointHlsManifest() {
        this.adMarkers = null;
        this.adTriggers = List.of();
        this.adsOnDeliveryRestrictions = null;
        this.id = null;
        this.includeIframeOnlyStream = null;
        this.manifestName = null;
        this.playlistType = null;
        this.playlistWindowSeconds = null;
        this.programDateTimeIntervalSeconds = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointHlsManifestAdMarkers adMarkers;
        private @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers;
        private @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
        private String id;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable String manifestName;
        private @Nullable OriginEndpointHlsManifestPlaylistType playlistType;
        private @Nullable Integer playlistWindowSeconds;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.id = defaults.id;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.url = defaults.url;
        }

        public Builder setAdMarkers(@Nullable OriginEndpointHlsManifestAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdTriggers(@Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setPlaylistType(@Nullable OriginEndpointHlsManifestPlaylistType playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public OriginEndpointHlsManifest build() {
            return new OriginEndpointHlsManifest(adMarkers, adTriggers, adsOnDeliveryRestrictions, id, includeIframeOnlyStream, manifestName, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, url);
        }
    }
}
