// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointOrigination;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointAuthorization;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointCmafPackage;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointDashPackage;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointHlsPackage;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointMssPackage;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOriginEndpointResult {
    /**
     * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable OriginEndpointAuthorization authorization;
    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     */
    private final @Nullable String channelId;
    private final @Nullable OriginEndpointCmafPackage cmafPackage;
    private final @Nullable OriginEndpointDashPackage dashPackage;
    /**
     * A short text description of the OriginEndpoint.
     * 
     */
    private final @Nullable String description;
    private final @Nullable OriginEndpointHlsPackage hlsPackage;
    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     */
    private final @Nullable String manifestName;
    private final @Nullable OriginEndpointMssPackage mssPackage;
    /**
     * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
     * 
     */
    private final @Nullable OriginEndpointOrigination origination;
    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
     * 
     */
    private final @Nullable Integer startoverWindowSeconds;
    /**
     * A collection of tags associated with a resource
     * 
     */
    private final @Nullable List<OriginEndpointTag> tags;
    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
     * 
     */
    private final @Nullable Integer timeDelaySeconds;
    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    private final @Nullable String url;
    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     */
    private final @Nullable List<String> whitelist;

    @OutputCustomType.Constructor({"arn","authorization","channelId","cmafPackage","dashPackage","description","hlsPackage","manifestName","mssPackage","origination","startoverWindowSeconds","tags","timeDelaySeconds","url","whitelist"})
    private GetOriginEndpointResult(
        @Nullable String arn,
        @Nullable OriginEndpointAuthorization authorization,
        @Nullable String channelId,
        @Nullable OriginEndpointCmafPackage cmafPackage,
        @Nullable OriginEndpointDashPackage dashPackage,
        @Nullable String description,
        @Nullable OriginEndpointHlsPackage hlsPackage,
        @Nullable String manifestName,
        @Nullable OriginEndpointMssPackage mssPackage,
        @Nullable OriginEndpointOrigination origination,
        @Nullable Integer startoverWindowSeconds,
        @Nullable List<OriginEndpointTag> tags,
        @Nullable Integer timeDelaySeconds,
        @Nullable String url,
        @Nullable List<String> whitelist) {
        this.arn = arn;
        this.authorization = authorization;
        this.channelId = channelId;
        this.cmafPackage = cmafPackage;
        this.dashPackage = dashPackage;
        this.description = description;
        this.hlsPackage = hlsPackage;
        this.manifestName = manifestName;
        this.mssPackage = mssPackage;
        this.origination = origination;
        this.startoverWindowSeconds = startoverWindowSeconds;
        this.tags = tags;
        this.timeDelaySeconds = timeDelaySeconds;
        this.url = url;
        this.whitelist = whitelist;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<OriginEndpointAuthorization> getAuthorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     */
    public Optional<String> getChannelId() {
        return Optional.ofNullable(this.channelId);
    }
    public Optional<OriginEndpointCmafPackage> getCmafPackage() {
        return Optional.ofNullable(this.cmafPackage);
    }
    public Optional<OriginEndpointDashPackage> getDashPackage() {
        return Optional.ofNullable(this.dashPackage);
    }
    /**
     * A short text description of the OriginEndpoint.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<OriginEndpointHlsPackage> getHlsPackage() {
        return Optional.ofNullable(this.hlsPackage);
    }
    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     */
    public Optional<String> getManifestName() {
        return Optional.ofNullable(this.manifestName);
    }
    public Optional<OriginEndpointMssPackage> getMssPackage() {
        return Optional.ofNullable(this.mssPackage);
    }
    /**
     * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
     * 
     */
    public Optional<OriginEndpointOrigination> getOrigination() {
        return Optional.ofNullable(this.origination);
    }
    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
     * 
     */
    public Optional<Integer> getStartoverWindowSeconds() {
        return Optional.ofNullable(this.startoverWindowSeconds);
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    public List<OriginEndpointTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
     * 
     */
    public Optional<Integer> getTimeDelaySeconds() {
        return Optional.ofNullable(this.timeDelaySeconds);
    }
    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     */
    public List<String> getWhitelist() {
        return this.whitelist == null ? List.of() : this.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable OriginEndpointAuthorization authorization;
        private @Nullable String channelId;
        private @Nullable OriginEndpointCmafPackage cmafPackage;
        private @Nullable OriginEndpointDashPackage dashPackage;
        private @Nullable String description;
        private @Nullable OriginEndpointHlsPackage hlsPackage;
        private @Nullable String manifestName;
        private @Nullable OriginEndpointMssPackage mssPackage;
        private @Nullable OriginEndpointOrigination origination;
        private @Nullable Integer startoverWindowSeconds;
        private @Nullable List<OriginEndpointTag> tags;
        private @Nullable Integer timeDelaySeconds;
        private @Nullable String url;
        private @Nullable List<String> whitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authorization = defaults.authorization;
    	      this.channelId = defaults.channelId;
    	      this.cmafPackage = defaults.cmafPackage;
    	      this.dashPackage = defaults.dashPackage;
    	      this.description = defaults.description;
    	      this.hlsPackage = defaults.hlsPackage;
    	      this.manifestName = defaults.manifestName;
    	      this.mssPackage = defaults.mssPackage;
    	      this.origination = defaults.origination;
    	      this.startoverWindowSeconds = defaults.startoverWindowSeconds;
    	      this.tags = defaults.tags;
    	      this.timeDelaySeconds = defaults.timeDelaySeconds;
    	      this.url = defaults.url;
    	      this.whitelist = defaults.whitelist;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAuthorization(@Nullable OriginEndpointAuthorization authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder setChannelId(@Nullable String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Builder setCmafPackage(@Nullable OriginEndpointCmafPackage cmafPackage) {
            this.cmafPackage = cmafPackage;
            return this;
        }

        public Builder setDashPackage(@Nullable OriginEndpointDashPackage dashPackage) {
            this.dashPackage = dashPackage;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHlsPackage(@Nullable OriginEndpointHlsPackage hlsPackage) {
            this.hlsPackage = hlsPackage;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setMssPackage(@Nullable OriginEndpointMssPackage mssPackage) {
            this.mssPackage = mssPackage;
            return this;
        }

        public Builder setOrigination(@Nullable OriginEndpointOrigination origination) {
            this.origination = origination;
            return this;
        }

        public Builder setStartoverWindowSeconds(@Nullable Integer startoverWindowSeconds) {
            this.startoverWindowSeconds = startoverWindowSeconds;
            return this;
        }

        public Builder setTags(@Nullable List<OriginEndpointTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeDelaySeconds(@Nullable Integer timeDelaySeconds) {
            this.timeDelaySeconds = timeDelaySeconds;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setWhitelist(@Nullable List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetOriginEndpointResult build() {
            return new GetOriginEndpointResult(arn, authorization, channelId, cmafPackage, dashPackage, description, hlsPackage, manifestName, mssPackage, origination, startoverWindowSeconds, tags, timeDelaySeconds, url, whitelist);
        }
    }
}
