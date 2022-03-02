// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerDefaultActionRedirect {
    /**
     * Hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
     * 
     */
    private final @Nullable String host;
    /**
     * Absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
     * 
     */
    private final @Nullable String path;
    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    private final @Nullable String port;
    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
     * 
     */
    private final @Nullable String query;
    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    private final String statusCode;

    @OutputCustomType.Constructor({"host","path","port","protocol","query","statusCode"})
    private ListenerDefaultActionRedirect(
        @Nullable String host,
        @Nullable String path,
        @Nullable String port,
        @Nullable String protocol,
        @Nullable String query,
        String statusCode) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
        this.statusCode = Objects.requireNonNull(statusCode);
    }

    /**
     * Hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
     * 
    */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * Absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
    */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
     * 
    */
    public Optional<String> getQuery() {
        return Optional.ofNullable(this.query);
    }
    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
    */
    public String getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable String path;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable String query;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public ListenerDefaultActionRedirect build() {
            return new ListenerDefaultActionRedirect(host, path, port, protocol, query, statusCode);
        }
    }
}
