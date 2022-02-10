// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiveEventEndpointResponse {
    private final @Nullable String protocol;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"protocol","url"})
    private LiveEventEndpointResponse(
        @Nullable String protocol,
        @Nullable String url) {
        this.protocol = protocol;
        this.url = url;
    }

    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String protocol;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.url = defaults.url;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public LiveEventEndpointResponse build() {
            return new LiveEventEndpointResponse(protocol, url);
        }
    }
}