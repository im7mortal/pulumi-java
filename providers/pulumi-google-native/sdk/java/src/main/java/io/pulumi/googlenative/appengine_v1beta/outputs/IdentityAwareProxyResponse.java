// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdentityAwareProxyResponse {
    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
     * 
     */
    private final Boolean enabled;
    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    private final String oauth2ClientId;
    /**
     * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
     * 
     */
    private final String oauth2ClientSecret;
    /**
     * Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    private final String oauth2ClientSecretSha256;

    @OutputCustomType.Constructor({"enabled","oauth2ClientId","oauth2ClientSecret","oauth2ClientSecretSha256"})
    private IdentityAwareProxyResponse(
        Boolean enabled,
        String oauth2ClientId,
        String oauth2ClientSecret,
        String oauth2ClientSecretSha256) {
        this.enabled = Objects.requireNonNull(enabled);
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
        this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
        this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256);
    }

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
    */
    public String getOauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
     * 
    */
    public String getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }
    /**
     * Hex-encoded SHA-256 hash of the client secret.
     * 
    */
    public String getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityAwareProxyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private String oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityAwareProxyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setOauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder setOauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }

        public Builder setOauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256);
            return this;
        }
        public IdentityAwareProxyResponse build() {
            return new IdentityAwareProxyResponse(enabled, oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
