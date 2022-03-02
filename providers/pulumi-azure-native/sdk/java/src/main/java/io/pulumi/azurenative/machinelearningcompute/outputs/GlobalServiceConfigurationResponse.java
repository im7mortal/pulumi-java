// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.AutoScaleConfigurationResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ServiceAuthConfigurationResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.SslConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalServiceConfigurationResponse {
    /**
     * The auto-scale configuration
     * 
     */
    private final @Nullable AutoScaleConfigurationResponse autoScale;
    /**
     * The configuration ETag for updates.
     * 
     */
    private final @Nullable String etag;
    /**
     * Optional global authorization keys for all user services deployed in cluster. These are used if the service does not have auth keys.
     * 
     */
    private final @Nullable ServiceAuthConfigurationResponse serviceAuth;
    /**
     * The SSL configuration properties
     * 
     */
    private final @Nullable SslConfigurationResponse ssl;

    @OutputCustomType.Constructor({"autoScale","etag","serviceAuth","ssl"})
    private GlobalServiceConfigurationResponse(
        @Nullable AutoScaleConfigurationResponse autoScale,
        @Nullable String etag,
        @Nullable ServiceAuthConfigurationResponse serviceAuth,
        @Nullable SslConfigurationResponse ssl) {
        this.autoScale = autoScale;
        this.etag = etag;
        this.serviceAuth = serviceAuth;
        this.ssl = ssl;
    }

    /**
     * The auto-scale configuration
     * 
    */
    public Optional<AutoScaleConfigurationResponse> getAutoScale() {
        return Optional.ofNullable(this.autoScale);
    }
    /**
     * The configuration ETag for updates.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Optional global authorization keys for all user services deployed in cluster. These are used if the service does not have auth keys.
     * 
    */
    public Optional<ServiceAuthConfigurationResponse> getServiceAuth() {
        return Optional.ofNullable(this.serviceAuth);
    }
    /**
     * The SSL configuration properties
     * 
    */
    public Optional<SslConfigurationResponse> getSsl() {
        return Optional.ofNullable(this.ssl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalServiceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleConfigurationResponse autoScale;
        private @Nullable String etag;
        private @Nullable ServiceAuthConfigurationResponse serviceAuth;
        private @Nullable SslConfigurationResponse ssl;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalServiceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.etag = defaults.etag;
    	      this.serviceAuth = defaults.serviceAuth;
    	      this.ssl = defaults.ssl;
        }

        public Builder setAutoScale(@Nullable AutoScaleConfigurationResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setServiceAuth(@Nullable ServiceAuthConfigurationResponse serviceAuth) {
            this.serviceAuth = serviceAuth;
            return this;
        }

        public Builder setSsl(@Nullable SslConfigurationResponse ssl) {
            this.ssl = ssl;
            return this;
        }
        public GlobalServiceConfigurationResponse build() {
            return new GlobalServiceConfigurationResponse(autoScale, etag, serviceAuth, ssl);
        }
    }
}
