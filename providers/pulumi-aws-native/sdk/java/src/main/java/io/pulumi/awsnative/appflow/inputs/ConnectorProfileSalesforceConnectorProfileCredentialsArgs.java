// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSalesforceConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSalesforceConnectorProfileCredentialsArgs Empty = new ConnectorProfileSalesforceConnectorProfileCredentialsArgs();

    /**
     * The credentials used to access protected resources.
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The client credentials to fetch access token and refresh token.
     * 
     */
    @InputImport(name="clientCredentialsArn")
    private final @Nullable Input<String> clientCredentialsArn;

    public Input<String> getClientCredentialsArn() {
        return this.clientCredentialsArn == null ? Input.empty() : this.clientCredentialsArn;
    }

    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    @InputImport(name="connectorOAuthRequest")
    private final @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    public Input<ConnectorProfileConnectorOAuthRequestArgs> getConnectorOAuthRequest() {
        return this.connectorOAuthRequest == null ? Input.empty() : this.connectorOAuthRequest;
    }

    /**
     * The credentials used to acquire new access tokens.
     * 
     */
    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    public ConnectorProfileSalesforceConnectorProfileCredentialsArgs(
        @Nullable Input<String> accessToken,
        @Nullable Input<String> clientCredentialsArn,
        @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest,
        @Nullable Input<String> refreshToken) {
        this.accessToken = accessToken;
        this.clientCredentialsArn = clientCredentialsArn;
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    private ConnectorProfileSalesforceConnectorProfileCredentialsArgs() {
        this.accessToken = Input.empty();
        this.clientCredentialsArn = Input.empty();
        this.connectorOAuthRequest = Input.empty();
        this.refreshToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSalesforceConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private @Nullable Input<String> clientCredentialsArn;
        private @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;
        private @Nullable Input<String> refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSalesforceConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientCredentialsArn = defaults.clientCredentialsArn;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setClientCredentialsArn(@Nullable Input<String> clientCredentialsArn) {
            this.clientCredentialsArn = clientCredentialsArn;
            return this;
        }

        public Builder setClientCredentialsArn(@Nullable String clientCredentialsArn) {
            this.clientCredentialsArn = Input.ofNullable(clientCredentialsArn);
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            this.connectorOAuthRequest = Input.ofNullable(connectorOAuthRequest);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public ConnectorProfileSalesforceConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileSalesforceConnectorProfileCredentialsArgs(accessToken, clientCredentialsArn, connectorOAuthRequest, refreshToken);
        }
    }
}
