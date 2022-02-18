// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.outputs.StreamingImageEncryptionConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamingImageResult {
    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
     */
    private final @Nullable String description;
    private final @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration;
    /**
     * <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
     */
    private final @Nullable List<String> eulaIds;
    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
     */
    private final @Nullable String owner;
    /**
     * <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
     */
    private final @Nullable String platform;
    private final @Nullable String streamingImageId;

    @OutputCustomType.Constructor({"description","encryptionConfiguration","eulaIds","name","owner","platform","streamingImageId"})
    private GetStreamingImageResult(
        @Nullable String description,
        @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration,
        @Nullable List<String> eulaIds,
        @Nullable String name,
        @Nullable String owner,
        @Nullable String platform,
        @Nullable String streamingImageId) {
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.eulaIds = eulaIds;
        this.name = name;
        this.owner = owner;
        this.platform = platform;
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<StreamingImageEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    /**
     * <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
     */
    public List<String> getEulaIds() {
        return this.eulaIds == null ? List.of() : this.eulaIds;
    }
    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
     */
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
     */
    public Optional<String> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    public Optional<String> getStreamingImageId() {
        return Optional.ofNullable(this.streamingImageId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration;
        private @Nullable List<String> eulaIds;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable String platform;
        private @Nullable String streamingImageId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.eulaIds = defaults.eulaIds;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.platform = defaults.platform;
    	      this.streamingImageId = defaults.streamingImageId;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable StreamingImageEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEulaIds(@Nullable List<String> eulaIds) {
            this.eulaIds = eulaIds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setStreamingImageId(@Nullable String streamingImageId) {
            this.streamingImageId = streamingImageId;
            return this;
        }

        public GetStreamingImageResult build() {
            return new GetStreamingImageResult(description, encryptionConfiguration, eulaIds, name, owner, platform, streamingImageId);
        }
    }
}
