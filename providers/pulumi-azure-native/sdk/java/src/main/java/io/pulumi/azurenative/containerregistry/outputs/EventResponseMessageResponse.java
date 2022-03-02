// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventResponseMessageResponse {
    /**
     * The content of the event response message.
     * 
     */
    private final @Nullable String content;
    /**
     * The headers of the event response message.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * The reason phrase of the event response message.
     * 
     */
    private final @Nullable String reasonPhrase;
    /**
     * The status code of the event response message.
     * 
     */
    private final @Nullable String statusCode;
    /**
     * The HTTP message version.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"content","headers","reasonPhrase","statusCode","version"})
    private EventResponseMessageResponse(
        @Nullable String content,
        @Nullable Map<String,String> headers,
        @Nullable String reasonPhrase,
        @Nullable String statusCode,
        @Nullable String version) {
        this.content = content;
        this.headers = headers;
        this.reasonPhrase = reasonPhrase;
        this.statusCode = statusCode;
        this.version = version;
    }

    /**
     * The content of the event response message.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The headers of the event response message.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * The reason phrase of the event response message.
     * 
    */
    public Optional<String> getReasonPhrase() {
        return Optional.ofNullable(this.reasonPhrase);
    }
    /**
     * The status code of the event response message.
     * 
    */
    public Optional<String> getStatusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * The HTTP message version.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable Map<String,String> headers;
        private @Nullable String reasonPhrase;
        private @Nullable String statusCode;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponseMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.headers = defaults.headers;
    	      this.reasonPhrase = defaults.reasonPhrase;
    	      this.statusCode = defaults.statusCode;
    	      this.version = defaults.version;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setReasonPhrase(@Nullable String reasonPhrase) {
            this.reasonPhrase = reasonPhrase;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public EventResponseMessageResponse build() {
            return new EventResponseMessageResponse(content, headers, reasonPhrase, statusCode, version);
        }
    }
}
