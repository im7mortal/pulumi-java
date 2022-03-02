// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebPubSubTlsSettingsResponse {
    /**
     * Request client certificate during TLS handshake if enabled
     * 
     */
    private final @Nullable Boolean clientCertEnabled;

    @OutputCustomType.Constructor({"clientCertEnabled"})
    private WebPubSubTlsSettingsResponse(@Nullable Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
    }

    /**
     * Request client certificate during TLS handshake if enabled
     * 
    */
    public Optional<Boolean> getClientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubTlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientCertEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubTlsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertEnabled = defaults.clientCertEnabled;
        }

        public Builder setClientCertEnabled(@Nullable Boolean clientCertEnabled) {
            this.clientCertEnabled = clientCertEnabled;
            return this;
        }
        public WebPubSubTlsSettingsResponse build() {
            return new WebPubSubTlsSettingsResponse(clientCertEnabled);
        }
    }
}
