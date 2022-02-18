// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestPlaylistType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class OriginEndpointHlsManifestArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsManifestArgs Empty = new OriginEndpointHlsManifestArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @InputImport(name="adMarkers")
    private final @Nullable Input<OriginEndpointHlsManifestAdMarkers> adMarkers;

    public Input<OriginEndpointHlsManifestAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Input.empty() : this.adMarkers;
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @InputImport(name="adTriggers")
    private final @Nullable Input<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers;

    public Input<List<OriginEndpointHlsManifestAdTriggersItem>> getAdTriggers() {
        return this.adTriggers == null ? Input.empty() : this.adTriggers;
    }

    @InputImport(name="adsOnDeliveryRestrictions")
    private final @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Input<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Input.empty() : this.adsOnDeliveryRestrictions;
    }

    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
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

    /**
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    @InputImport(name="manifestName")
    private final @Nullable Input<String> manifestName;

    public Input<String> getManifestName() {
        return this.manifestName == null ? Input.empty() : this.manifestName;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @InputImport(name="playlistType")
    private final @Nullable Input<OriginEndpointHlsManifestPlaylistType> playlistType;

    public Input<OriginEndpointHlsManifestPlaylistType> getPlaylistType() {
        return this.playlistType == null ? Input.empty() : this.playlistType;
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    @InputImport(name="playlistWindowSeconds")
    private final @Nullable Input<Integer> playlistWindowSeconds;

    public Input<Integer> getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds == null ? Input.empty() : this.playlistWindowSeconds;
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
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public OriginEndpointHlsManifestArgs(
        @Nullable Input<OriginEndpointHlsManifestAdMarkers> adMarkers,
        @Nullable Input<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers,
        @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions,
        Input<String> id,
        @Nullable Input<Boolean> includeIframeOnlyStream,
        @Nullable Input<String> manifestName,
        @Nullable Input<OriginEndpointHlsManifestPlaylistType> playlistType,
        @Nullable Input<Integer> playlistWindowSeconds,
        @Nullable Input<Integer> programDateTimeIntervalSeconds,
        @Nullable Input<String> url) {
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

    private OriginEndpointHlsManifestArgs() {
        this.adMarkers = Input.empty();
        this.adTriggers = Input.empty();
        this.adsOnDeliveryRestrictions = Input.empty();
        this.id = Input.empty();
        this.includeIframeOnlyStream = Input.empty();
        this.manifestName = Input.empty();
        this.playlistType = Input.empty();
        this.playlistWindowSeconds = Input.empty();
        this.programDateTimeIntervalSeconds = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OriginEndpointHlsManifestAdMarkers> adMarkers;
        private @Nullable Input<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers;
        private @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;
        private Input<String> id;
        private @Nullable Input<Boolean> includeIframeOnlyStream;
        private @Nullable Input<String> manifestName;
        private @Nullable Input<OriginEndpointHlsManifestPlaylistType> playlistType;
        private @Nullable Input<Integer> playlistWindowSeconds;
        private @Nullable Input<Integer> programDateTimeIntervalSeconds;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsManifestArgs defaults) {
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

        public Builder setAdMarkers(@Nullable Input<OriginEndpointHlsManifestAdMarkers> adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdMarkers(@Nullable OriginEndpointHlsManifestAdMarkers adMarkers) {
            this.adMarkers = Input.ofNullable(adMarkers);
            return this;
        }

        public Builder setAdTriggers(@Nullable Input<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdTriggers(@Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers) {
            this.adTriggers = Input.ofNullable(adTriggers);
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = Input.ofNullable(adsOnDeliveryRestrictions);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
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

        public Builder setPlaylistType(@Nullable Input<OriginEndpointHlsManifestPlaylistType> playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder setPlaylistType(@Nullable OriginEndpointHlsManifestPlaylistType playlistType) {
            this.playlistType = Input.ofNullable(playlistType);
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Input<Integer> playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = Input.ofNullable(playlistWindowSeconds);
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

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public OriginEndpointHlsManifestArgs build() {
            return new OriginEndpointHlsManifestArgs(adMarkers, adTriggers, adsOnDeliveryRestrictions, id, includeIframeOnlyStream, manifestName, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, url);
        }
    }
}
