// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.outputs;

import io.pulumi.awsnative.networkmanager.outputs.LinkBandwidth;
import io.pulumi.awsnative.networkmanager.outputs.LinkTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLinkResult {
    /**
     * The Bandwidth for the link.
     * 
     */
    private final @Nullable LinkBandwidth bandwidth;
    /**
     * The description of the link.
     * 
     */
    private final @Nullable String description;
    /**
     * The Amazon Resource Name (ARN) of the link.
     * 
     */
    private final @Nullable String linkArn;
    /**
     * The ID of the link.
     * 
     */
    private final @Nullable String linkId;
    /**
     * The provider of the link.
     * 
     */
    private final @Nullable String provider;
    /**
     * The tags for the link.
     * 
     */
    private final @Nullable List<LinkTag> tags;
    /**
     * The type of the link.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"bandwidth","description","linkArn","linkId","provider","tags","type"})
    private GetLinkResult(
        @Nullable LinkBandwidth bandwidth,
        @Nullable String description,
        @Nullable String linkArn,
        @Nullable String linkId,
        @Nullable String provider,
        @Nullable List<LinkTag> tags,
        @Nullable String type) {
        this.bandwidth = bandwidth;
        this.description = description;
        this.linkArn = linkArn;
        this.linkId = linkId;
        this.provider = provider;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The Bandwidth for the link.
     * 
     */
    public Optional<LinkBandwidth> getBandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }
    /**
     * The description of the link.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) of the link.
     * 
     */
    public Optional<String> getLinkArn() {
        return Optional.ofNullable(this.linkArn);
    }
    /**
     * The ID of the link.
     * 
     */
    public Optional<String> getLinkId() {
        return Optional.ofNullable(this.linkId);
    }
    /**
     * The provider of the link.
     * 
     */
    public Optional<String> getProvider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * The tags for the link.
     * 
     */
    public List<LinkTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The type of the link.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinkBandwidth bandwidth;
        private @Nullable String description;
        private @Nullable String linkArn;
        private @Nullable String linkId;
        private @Nullable String provider;
        private @Nullable List<LinkTag> tags;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.description = defaults.description;
    	      this.linkArn = defaults.linkArn;
    	      this.linkId = defaults.linkId;
    	      this.provider = defaults.provider;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setBandwidth(@Nullable LinkBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLinkArn(@Nullable String linkArn) {
            this.linkArn = linkArn;
            return this;
        }

        public Builder setLinkId(@Nullable String linkId) {
            this.linkId = linkId;
            return this;
        }

        public Builder setProvider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }

        public Builder setTags(@Nullable List<LinkTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public GetLinkResult build() {
            return new GetLinkResult(bandwidth, description, linkArn, linkId, provider, tags, type);
        }
    }
}
