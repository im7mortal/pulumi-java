// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MarkdownPartMetadataResponseSettingsSettings {
    /**
     * The content of the markdown part.
     * 
     */
    private final @Nullable String content;
    /**
     * The source of the content of the markdown part.
     * 
     */
    private final @Nullable Integer markdownSource;
    /**
     * The uri of markdown content.
     * 
     */
    private final @Nullable String markdownUri;
    /**
     * The subtitle of the markdown part.
     * 
     */
    private final @Nullable String subtitle;
    /**
     * The title of the markdown part.
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor({"content","markdownSource","markdownUri","subtitle","title"})
    private MarkdownPartMetadataResponseSettingsSettings(
        @Nullable String content,
        @Nullable Integer markdownSource,
        @Nullable String markdownUri,
        @Nullable String subtitle,
        @Nullable String title) {
        this.content = content;
        this.markdownSource = markdownSource;
        this.markdownUri = markdownUri;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * The content of the markdown part.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The source of the content of the markdown part.
     * 
    */
    public Optional<Integer> getMarkdownSource() {
        return Optional.ofNullable(this.markdownSource);
    }
    /**
     * The uri of markdown content.
     * 
    */
    public Optional<String> getMarkdownUri() {
        return Optional.ofNullable(this.markdownUri);
    }
    /**
     * The subtitle of the markdown part.
     * 
    */
    public Optional<String> getSubtitle() {
        return Optional.ofNullable(this.subtitle);
    }
    /**
     * The title of the markdown part.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseSettingsSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable Integer markdownSource;
        private @Nullable String markdownUri;
        private @Nullable String subtitle;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseSettingsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.markdownSource = defaults.markdownSource;
    	      this.markdownUri = defaults.markdownUri;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setMarkdownSource(@Nullable Integer markdownSource) {
            this.markdownSource = markdownSource;
            return this;
        }

        public Builder setMarkdownUri(@Nullable String markdownUri) {
            this.markdownUri = markdownUri;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }
        public MarkdownPartMetadataResponseSettingsSettings build() {
            return new MarkdownPartMetadataResponseSettingsSettings(content, markdownSource, markdownUri, subtitle, title);
        }
    }
}
