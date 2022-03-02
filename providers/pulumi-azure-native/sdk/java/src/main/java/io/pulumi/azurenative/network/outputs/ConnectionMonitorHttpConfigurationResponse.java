// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.HTTPHeaderResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorHttpConfigurationResponse {
    /**
     * The HTTP method to use.
     * 
     */
    private final @Nullable String method;
    /**
     * The path component of the URI. For instance, "/dir1/dir2".
     * 
     */
    private final @Nullable String path;
    /**
     * The port to connect to.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    private final @Nullable Boolean preferHTTPS;
    /**
     * The HTTP headers to transmit with the request.
     * 
     */
    private final @Nullable List<HTTPHeaderResponse> requestHeaders;
    /**
     * HTTP status codes to consider successful. For instance, "2xx,301-304,418".
     * 
     */
    private final @Nullable List<String> validStatusCodeRanges;

    @OutputCustomType.Constructor({"method","path","port","preferHTTPS","requestHeaders","validStatusCodeRanges"})
    private ConnectionMonitorHttpConfigurationResponse(
        @Nullable String method,
        @Nullable String path,
        @Nullable Integer port,
        @Nullable Boolean preferHTTPS,
        @Nullable List<HTTPHeaderResponse> requestHeaders,
        @Nullable List<String> validStatusCodeRanges) {
        this.method = method;
        this.path = path;
        this.port = port;
        this.preferHTTPS = preferHTTPS;
        this.requestHeaders = requestHeaders;
        this.validStatusCodeRanges = validStatusCodeRanges;
    }

    /**
     * The HTTP method to use.
     * 
    */
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * The path component of the URI. For instance, "/dir1/dir2".
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The port to connect to.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
    */
    public Optional<Boolean> getPreferHTTPS() {
        return Optional.ofNullable(this.preferHTTPS);
    }
    /**
     * The HTTP headers to transmit with the request.
     * 
    */
    public List<HTTPHeaderResponse> getRequestHeaders() {
        return this.requestHeaders == null ? List.of() : this.requestHeaders;
    }
    /**
     * HTTP status codes to consider successful. For instance, "2xx,301-304,418".
     * 
    */
    public List<String> getValidStatusCodeRanges() {
        return this.validStatusCodeRanges == null ? List.of() : this.validStatusCodeRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorHttpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable Boolean preferHTTPS;
        private @Nullable List<HTTPHeaderResponse> requestHeaders;
        private @Nullable List<String> validStatusCodeRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorHttpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.preferHTTPS = defaults.preferHTTPS;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.validStatusCodeRanges = defaults.validStatusCodeRanges;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setPreferHTTPS(@Nullable Boolean preferHTTPS) {
            this.preferHTTPS = preferHTTPS;
            return this;
        }

        public Builder setRequestHeaders(@Nullable List<HTTPHeaderResponse> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public Builder setValidStatusCodeRanges(@Nullable List<String> validStatusCodeRanges) {
            this.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }
        public ConnectionMonitorHttpConfigurationResponse build() {
            return new ConnectionMonitorHttpConfigurationResponse(method, path, port, preferHTTPS, requestHeaders, validStatusCodeRanges);
        }
    }
}
