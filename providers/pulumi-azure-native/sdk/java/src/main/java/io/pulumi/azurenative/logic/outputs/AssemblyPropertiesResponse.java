// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssemblyPropertiesResponse {
    /**
     * The assembly culture.
     * 
     */
    private final @Nullable String assemblyCulture;
    /**
     * The assembly name.
     * 
     */
    private final String assemblyName;
    /**
     * The assembly public key token.
     * 
     */
    private final @Nullable String assemblyPublicKeyToken;
    /**
     * The assembly version.
     * 
     */
    private final @Nullable String assemblyVersion;
    /**
     * The artifact changed time.
     * 
     */
    private final @Nullable String changedTime;
    private final @Nullable Object content;
    /**
     * The content link.
     * 
     */
    private final @Nullable ContentLinkResponse contentLink;
    /**
     * The content type.
     * 
     */
    private final @Nullable String contentType;
    /**
     * The artifact creation time.
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable Object metadata;

    @OutputCustomType.Constructor({"assemblyCulture","assemblyName","assemblyPublicKeyToken","assemblyVersion","changedTime","content","contentLink","contentType","createdTime","metadata"})
    private AssemblyPropertiesResponse(
        @Nullable String assemblyCulture,
        String assemblyName,
        @Nullable String assemblyPublicKeyToken,
        @Nullable String assemblyVersion,
        @Nullable String changedTime,
        @Nullable Object content,
        @Nullable ContentLinkResponse contentLink,
        @Nullable String contentType,
        @Nullable String createdTime,
        @Nullable Object metadata) {
        this.assemblyCulture = assemblyCulture;
        this.assemblyName = Objects.requireNonNull(assemblyName);
        this.assemblyPublicKeyToken = assemblyPublicKeyToken;
        this.assemblyVersion = assemblyVersion;
        this.changedTime = changedTime;
        this.content = content;
        this.contentLink = contentLink;
        this.contentType = contentType;
        this.createdTime = createdTime;
        this.metadata = metadata;
    }

    /**
     * The assembly culture.
     * 
    */
    public Optional<String> getAssemblyCulture() {
        return Optional.ofNullable(this.assemblyCulture);
    }
    /**
     * The assembly name.
     * 
    */
    public String getAssemblyName() {
        return this.assemblyName;
    }
    /**
     * The assembly public key token.
     * 
    */
    public Optional<String> getAssemblyPublicKeyToken() {
        return Optional.ofNullable(this.assemblyPublicKeyToken);
    }
    /**
     * The assembly version.
     * 
    */
    public Optional<String> getAssemblyVersion() {
        return Optional.ofNullable(this.assemblyVersion);
    }
    /**
     * The artifact changed time.
     * 
    */
    public Optional<String> getChangedTime() {
        return Optional.ofNullable(this.changedTime);
    }
    public Optional<Object> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The content link.
     * 
    */
    public Optional<ContentLinkResponse> getContentLink() {
        return Optional.ofNullable(this.contentLink);
    }
    /**
     * The content type.
     * 
    */
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * The artifact creation time.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssemblyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assemblyCulture;
        private String assemblyName;
        private @Nullable String assemblyPublicKeyToken;
        private @Nullable String assemblyVersion;
        private @Nullable String changedTime;
        private @Nullable Object content;
        private @Nullable ContentLinkResponse contentLink;
        private @Nullable String contentType;
        private @Nullable String createdTime;
        private @Nullable Object metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(AssemblyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assemblyCulture = defaults.assemblyCulture;
    	      this.assemblyName = defaults.assemblyName;
    	      this.assemblyPublicKeyToken = defaults.assemblyPublicKeyToken;
    	      this.assemblyVersion = defaults.assemblyVersion;
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
    	      this.contentType = defaults.contentType;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
        }

        public Builder setAssemblyCulture(@Nullable String assemblyCulture) {
            this.assemblyCulture = assemblyCulture;
            return this;
        }

        public Builder setAssemblyName(String assemblyName) {
            this.assemblyName = Objects.requireNonNull(assemblyName);
            return this;
        }

        public Builder setAssemblyPublicKeyToken(@Nullable String assemblyPublicKeyToken) {
            this.assemblyPublicKeyToken = assemblyPublicKeyToken;
            return this;
        }

        public Builder setAssemblyVersion(@Nullable String assemblyVersion) {
            this.assemblyVersion = assemblyVersion;
            return this;
        }

        public Builder setChangedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder setContent(@Nullable Object content) {
            this.content = content;
            return this;
        }

        public Builder setContentLink(@Nullable ContentLinkResponse contentLink) {
            this.contentLink = contentLink;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public AssemblyPropertiesResponse build() {
            return new AssemblyPropertiesResponse(assemblyCulture, assemblyName, assemblyPublicKeyToken, assemblyVersion, changedTime, content, contentLink, contentType, createdTime, metadata);
        }
    }
}
