// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CorsSettingsResponse {
    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     * 
     */
    private final @Nullable List<String> allowedOrigins;
    /**
     * Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     * 
     */
    private final @Nullable Boolean supportCredentials;

    @OutputCustomType.Constructor({"allowedOrigins","supportCredentials"})
    private CorsSettingsResponse(
        @Nullable List<String> allowedOrigins,
        @Nullable Boolean supportCredentials) {
        this.allowedOrigins = allowedOrigins;
        this.supportCredentials = supportCredentials;
    }

    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     * 
    */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     * 
    */
    public Optional<Boolean> getSupportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        public Builder setAllowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        public Builder setSupportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }
        public CorsSettingsResponse build() {
            return new CorsSettingsResponse(allowedOrigins, supportCredentials);
        }
    }
}
