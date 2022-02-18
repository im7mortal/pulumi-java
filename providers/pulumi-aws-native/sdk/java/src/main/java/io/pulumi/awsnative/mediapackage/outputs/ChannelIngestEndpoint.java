// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChannelIngestEndpoint {
    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     */
    private final @Nullable String id;
    /**
     * The system generated password for ingest authentication.
     * 
     */
    private final @Nullable String password;
    /**
     * The ingest URL to which the source stream should be sent.
     * 
     */
    private final @Nullable String url;
    /**
     * The system generated username for ingest authentication.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"id","password","url","username"})
    private ChannelIngestEndpoint(
        @Nullable String id,
        @Nullable String password,
        @Nullable String url,
        @Nullable String username) {
        this.id = id;
        this.password = password;
        this.url = url;
        this.username = username;
    }

    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The system generated password for ingest authentication.
     * 
     */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The ingest URL to which the source stream should be sent.
     * 
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * The system generated username for ingest authentication.
     * 
     */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelIngestEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String password;
        private @Nullable String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelIngestEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public ChannelIngestEndpoint build() {
            return new ChannelIngestEndpoint(id, password, url, username);
        }
    }
}
