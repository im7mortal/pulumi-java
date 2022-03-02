// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse {
    /**
     * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with "subject alt name". For instance a certificate can be self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile <(printf "\nsubjectAltName='DNS:www.example.com'")
     * 
     */
    private final List<String> allowedCaCerts;
    /**
     * The password for HTTP Basic authentication.
     * 
     */
    private final String password;
    /**
     * The HTTP request headers to send together with webhook requests.
     * 
     */
    private final Map<String,String> requestHeaders;
    /**
     * The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    private final String uri;
    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"allowedCaCerts","password","requestHeaders","uri","username"})
    private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(
        List<String> allowedCaCerts,
        String password,
        Map<String,String> requestHeaders,
        String uri,
        String username) {
        this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
        this.password = Objects.requireNonNull(password);
        this.requestHeaders = Objects.requireNonNull(requestHeaders);
        this.uri = Objects.requireNonNull(uri);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with "subject alt name". For instance a certificate can be self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile <(printf "\nsubjectAltName='DNS:www.example.com'")
     * 
    */
    public List<String> getAllowedCaCerts() {
        return this.allowedCaCerts;
    }
    /**
     * The password for HTTP Basic authentication.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The HTTP request headers to send together with webhook requests.
     * 
    */
    public Map<String,String> getRequestHeaders() {
        return this.requestHeaders;
    }
    /**
     * The webhook URI for receiving POST requests. It must use https protocol.
     * 
    */
    public String getUri() {
        return this.uri;
    }
    /**
     * The user name for HTTP Basic authentication.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCaCerts;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setAllowedCaCerts(List<String> allowedCaCerts) {
            this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRequestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
