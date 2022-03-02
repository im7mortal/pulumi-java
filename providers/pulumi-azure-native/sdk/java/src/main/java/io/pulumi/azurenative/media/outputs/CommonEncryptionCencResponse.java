// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.CencDrmConfigurationResponse;
import io.pulumi.azurenative.media.outputs.EnabledProtocolsResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyContentKeysResponse;
import io.pulumi.azurenative.media.outputs.TrackSelectionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CommonEncryptionCencResponse {
    /**
     * Representing which tracks should not be encrypted
     * 
     */
    private final @Nullable List<TrackSelectionResponse> clearTracks;
    /**
     * Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    private final @Nullable StreamingPolicyContentKeysResponse contentKeys;
    /**
     * Configuration of DRMs for CommonEncryptionCenc encryption scheme
     * 
     */
    private final @Nullable CencDrmConfigurationResponse drm;
    /**
     * Representing supported protocols
     * 
     */
    private final @Nullable EnabledProtocolsResponse enabledProtocols;

    @OutputCustomType.Constructor({"clearTracks","contentKeys","drm","enabledProtocols"})
    private CommonEncryptionCencResponse(
        @Nullable List<TrackSelectionResponse> clearTracks,
        @Nullable StreamingPolicyContentKeysResponse contentKeys,
        @Nullable CencDrmConfigurationResponse drm,
        @Nullable EnabledProtocolsResponse enabledProtocols) {
        this.clearTracks = clearTracks;
        this.contentKeys = contentKeys;
        this.drm = drm;
        this.enabledProtocols = enabledProtocols;
    }

    /**
     * Representing which tracks should not be encrypted
     * 
    */
    public List<TrackSelectionResponse> getClearTracks() {
        return this.clearTracks == null ? List.of() : this.clearTracks;
    }
    /**
     * Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
    */
    public Optional<StreamingPolicyContentKeysResponse> getContentKeys() {
        return Optional.ofNullable(this.contentKeys);
    }
    /**
     * Configuration of DRMs for CommonEncryptionCenc encryption scheme
     * 
    */
    public Optional<CencDrmConfigurationResponse> getDrm() {
        return Optional.ofNullable(this.drm);
    }
    /**
     * Representing supported protocols
     * 
    */
    public Optional<EnabledProtocolsResponse> getEnabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonEncryptionCencResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrackSelectionResponse> clearTracks;
        private @Nullable StreamingPolicyContentKeysResponse contentKeys;
        private @Nullable CencDrmConfigurationResponse drm;
        private @Nullable EnabledProtocolsResponse enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonEncryptionCencResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clearTracks = defaults.clearTracks;
    	      this.contentKeys = defaults.contentKeys;
    	      this.drm = defaults.drm;
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder setClearTracks(@Nullable List<TrackSelectionResponse> clearTracks) {
            this.clearTracks = clearTracks;
            return this;
        }

        public Builder setContentKeys(@Nullable StreamingPolicyContentKeysResponse contentKeys) {
            this.contentKeys = contentKeys;
            return this;
        }

        public Builder setDrm(@Nullable CencDrmConfigurationResponse drm) {
            this.drm = drm;
            return this;
        }

        public Builder setEnabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }
        public CommonEncryptionCencResponse build() {
            return new CommonEncryptionCencResponse(clearTracks, contentKeys, drm, enabledProtocols);
        }
    }
}
