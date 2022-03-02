// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterHTTPProxyConfigResponse {
    /**
     * HTTP proxy server endpoint to use.
     * 
     */
    private final @Nullable String httpProxy;
    /**
     * HTTPS proxy server endpoint to use.
     * 
     */
    private final @Nullable String httpsProxy;
    /**
     * Endpoints that should not go through proxy.
     * 
     */
    private final @Nullable List<String> noProxy;
    /**
     * Alternative CA cert to use for connecting to proxy servers.
     * 
     */
    private final @Nullable String trustedCa;

    @OutputCustomType.Constructor({"httpProxy","httpsProxy","noProxy","trustedCa"})
    private ManagedClusterHTTPProxyConfigResponse(
        @Nullable String httpProxy,
        @Nullable String httpsProxy,
        @Nullable List<String> noProxy,
        @Nullable String trustedCa) {
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
        this.trustedCa = trustedCa;
    }

    /**
     * HTTP proxy server endpoint to use.
     * 
    */
    public Optional<String> getHttpProxy() {
        return Optional.ofNullable(this.httpProxy);
    }
    /**
     * HTTPS proxy server endpoint to use.
     * 
    */
    public Optional<String> getHttpsProxy() {
        return Optional.ofNullable(this.httpsProxy);
    }
    /**
     * Endpoints that should not go through proxy.
     * 
    */
    public List<String> getNoProxy() {
        return this.noProxy == null ? List.of() : this.noProxy;
    }
    /**
     * Alternative CA cert to use for connecting to proxy servers.
     * 
    */
    public Optional<String> getTrustedCa() {
        return Optional.ofNullable(this.trustedCa);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterHTTPProxyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpProxy;
        private @Nullable String httpsProxy;
        private @Nullable List<String> noProxy;
        private @Nullable String trustedCa;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterHTTPProxyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpProxy = defaults.httpProxy;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.noProxy = defaults.noProxy;
    	      this.trustedCa = defaults.trustedCa;
        }

        public Builder setHttpProxy(@Nullable String httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        public Builder setHttpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder setNoProxy(@Nullable List<String> noProxy) {
            this.noProxy = noProxy;
            return this;
        }

        public Builder setTrustedCa(@Nullable String trustedCa) {
            this.trustedCa = trustedCa;
            return this;
        }
        public ManagedClusterHTTPProxyConfigResponse build() {
            return new ManagedClusterHTTPProxyConfigResponse(httpProxy, httpsProxy, noProxy, trustedCa);
        }
    }
}
