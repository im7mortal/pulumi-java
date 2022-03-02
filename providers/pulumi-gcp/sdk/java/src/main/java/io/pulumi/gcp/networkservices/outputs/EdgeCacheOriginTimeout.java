// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheOriginTimeout {
    /**
     * The maximum duration to wait for the origin connection to be established, including DNS lookup, TLS handshake and TCP/QUIC connection establishment.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
     */
    private final @Nullable String connectTimeout;
    /**
     * The maximum time across all connection attempts to the origin, including failover origins, before returning an error to the client. A HTTP 503 will be returned if the timeout is reached before a response is returned.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
     */
    private final @Nullable String maxAttemptsTimeout;
    /**
     * The maximum duration to wait for data to arrive when reading from the HTTP connection/stream.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 30s.
     * 
     */
    private final @Nullable String responseTimeout;

    @OutputCustomType.Constructor({"connectTimeout","maxAttemptsTimeout","responseTimeout"})
    private EdgeCacheOriginTimeout(
        @Nullable String connectTimeout,
        @Nullable String maxAttemptsTimeout,
        @Nullable String responseTimeout) {
        this.connectTimeout = connectTimeout;
        this.maxAttemptsTimeout = maxAttemptsTimeout;
        this.responseTimeout = responseTimeout;
    }

    /**
     * The maximum duration to wait for the origin connection to be established, including DNS lookup, TLS handshake and TCP/QUIC connection establishment.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
    */
    public Optional<String> getConnectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }
    /**
     * The maximum time across all connection attempts to the origin, including failover origins, before returning an error to the client. A HTTP 503 will be returned if the timeout is reached before a response is returned.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
    */
    public Optional<String> getMaxAttemptsTimeout() {
        return Optional.ofNullable(this.maxAttemptsTimeout);
    }
    /**
     * The maximum duration to wait for data to arrive when reading from the HTTP connection/stream.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 30s.
     * 
    */
    public Optional<String> getResponseTimeout() {
        return Optional.ofNullable(this.responseTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectTimeout;
        private @Nullable String maxAttemptsTimeout;
        private @Nullable String responseTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheOriginTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxAttemptsTimeout = defaults.maxAttemptsTimeout;
    	      this.responseTimeout = defaults.responseTimeout;
        }

        public Builder setConnectTimeout(@Nullable String connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder setMaxAttemptsTimeout(@Nullable String maxAttemptsTimeout) {
            this.maxAttemptsTimeout = maxAttemptsTimeout;
            return this;
        }

        public Builder setResponseTimeout(@Nullable String responseTimeout) {
            this.responseTimeout = responseTimeout;
            return this;
        }
        public EdgeCacheOriginTimeout build() {
            return new EdgeCacheOriginTimeout(connectTimeout, maxAttemptsTimeout, responseTimeout);
        }
    }
}
