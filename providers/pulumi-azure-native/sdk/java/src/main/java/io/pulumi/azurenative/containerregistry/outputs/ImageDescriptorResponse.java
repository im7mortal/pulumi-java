// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageDescriptorResponse {
    /**
     * The sha256-based digest of the image manifest.
     * 
     */
    private final @Nullable String digest;
    /**
     * The registry login server.
     * 
     */
    private final @Nullable String registry;
    /**
     * The repository name.
     * 
     */
    private final @Nullable String repository;
    /**
     * The tag name.
     * 
     */
    private final @Nullable String tag;

    @OutputCustomType.Constructor({"digest","registry","repository","tag"})
    private ImageDescriptorResponse(
        @Nullable String digest,
        @Nullable String registry,
        @Nullable String repository,
        @Nullable String tag) {
        this.digest = digest;
        this.registry = registry;
        this.repository = repository;
        this.tag = tag;
    }

    /**
     * The sha256-based digest of the image manifest.
     * 
    */
    public Optional<String> getDigest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * The registry login server.
     * 
    */
    public Optional<String> getRegistry() {
        return Optional.ofNullable(this.registry);
    }
    /**
     * The repository name.
     * 
    */
    public Optional<String> getRepository() {
        return Optional.ofNullable(this.repository);
    }
    /**
     * The tag name.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private @Nullable String registry;
        private @Nullable String repository;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.registry = defaults.registry;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder setDigest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }

        public Builder setRegistry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public ImageDescriptorResponse build() {
            return new ImageDescriptorResponse(digest, registry, repository, tag);
        }
    }
}
