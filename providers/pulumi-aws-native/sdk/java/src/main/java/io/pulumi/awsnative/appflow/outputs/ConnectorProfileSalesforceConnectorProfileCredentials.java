// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConnectorOAuthRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileSalesforceConnectorProfileCredentials {
    /**
     * The credentials used to access protected resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * The client credentials to fetch access token and refresh token.
     * 
     */
    private final @Nullable String clientCredentialsArn;
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    private final @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
    /**
     * The credentials used to acquire new access tokens.
     * 
     */
    private final @Nullable String refreshToken;

    @OutputCustomType.Constructor({"accessToken","clientCredentialsArn","connectorOAuthRequest","refreshToken"})
    private ConnectorProfileSalesforceConnectorProfileCredentials(
        @Nullable String accessToken,
        @Nullable String clientCredentialsArn,
        @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest,
        @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.clientCredentialsArn = clientCredentialsArn;
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    /**
     * The credentials used to access protected resources.
     * 
    */
    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * The client credentials to fetch access token and refresh token.
     * 
    */
    public Optional<String> getClientCredentialsArn() {
        return Optional.ofNullable(this.clientCredentialsArn);
    }
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
    */
    public Optional<ConnectorProfileConnectorOAuthRequest> getConnectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }
    /**
     * The credentials used to acquire new access tokens.
     * 
    */
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSalesforceConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String clientCredentialsArn;
        private @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSalesforceConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientCredentialsArn = defaults.clientCredentialsArn;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setClientCredentialsArn(@Nullable String clientCredentialsArn) {
            this.clientCredentialsArn = clientCredentialsArn;
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileSalesforceConnectorProfileCredentials build() {
            return new ConnectorProfileSalesforceConnectorProfileCredentials(accessToken, clientCredentialsArn, connectorOAuthRequest, refreshToken);
        }
    }
}
