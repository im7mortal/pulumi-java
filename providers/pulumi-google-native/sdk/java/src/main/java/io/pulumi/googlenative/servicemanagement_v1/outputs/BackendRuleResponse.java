// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackendRuleResponse {
    /**
     * The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
     * 
     */
    private final String address;
    /**
     * The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
     * 
     */
    private final Double deadline;
    /**
     * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization" HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
     * 
     */
    private final Boolean disableAuth;
    /**
     * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP "authorization" header, and sent to the backend.
     * 
     */
    private final String jwtAudience;
    /**
     * The number of seconds to wait for the completion of a long running operation. The default is no deadline.
     * 
     */
    private final Double operationDeadline;
    private final String pathTranslation;
    /**
     * The protocol used for sending a request to the backend. The supported values are "http/1.1" and "h2". The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
     * 
     */
    private final String protocol;
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @OutputCustomType.Constructor({"address","deadline","disableAuth","jwtAudience","operationDeadline","pathTranslation","protocol","selector"})
    private BackendRuleResponse(
        String address,
        Double deadline,
        Boolean disableAuth,
        String jwtAudience,
        Double operationDeadline,
        String pathTranslation,
        String protocol,
        String selector) {
        this.address = Objects.requireNonNull(address);
        this.deadline = Objects.requireNonNull(deadline);
        this.disableAuth = Objects.requireNonNull(disableAuth);
        this.jwtAudience = Objects.requireNonNull(jwtAudience);
        this.operationDeadline = Objects.requireNonNull(operationDeadline);
        this.pathTranslation = Objects.requireNonNull(pathTranslation);
        this.protocol = Objects.requireNonNull(protocol);
        this.selector = Objects.requireNonNull(selector);
    }

    /**
     * The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
     * 
    */
    public String getAddress() {
        return this.address;
    }
    /**
     * The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
     * 
    */
    public Double getDeadline() {
        return this.deadline;
    }
    /**
     * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization" HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
     * 
    */
    public Boolean getDisableAuth() {
        return this.disableAuth;
    }
    /**
     * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP "authorization" header, and sent to the backend.
     * 
    */
    public String getJwtAudience() {
        return this.jwtAudience;
    }
    /**
     * The number of seconds to wait for the completion of a long running operation. The default is no deadline.
     * 
    */
    public Double getOperationDeadline() {
        return this.operationDeadline;
    }
    public String getPathTranslation() {
        return this.pathTranslation;
    }
    /**
     * The protocol used for sending a request to the backend. The supported values are "http/1.1" and "h2". The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
    */
    public String getSelector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private Double deadline;
        private Boolean disableAuth;
        private String jwtAudience;
        private Double operationDeadline;
        private String pathTranslation;
        private String protocol;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.deadline = defaults.deadline;
    	      this.disableAuth = defaults.disableAuth;
    	      this.jwtAudience = defaults.jwtAudience;
    	      this.operationDeadline = defaults.operationDeadline;
    	      this.pathTranslation = defaults.pathTranslation;
    	      this.protocol = defaults.protocol;
    	      this.selector = defaults.selector;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setDeadline(Double deadline) {
            this.deadline = Objects.requireNonNull(deadline);
            return this;
        }

        public Builder setDisableAuth(Boolean disableAuth) {
            this.disableAuth = Objects.requireNonNull(disableAuth);
            return this;
        }

        public Builder setJwtAudience(String jwtAudience) {
            this.jwtAudience = Objects.requireNonNull(jwtAudience);
            return this;
        }

        public Builder setOperationDeadline(Double operationDeadline) {
            this.operationDeadline = Objects.requireNonNull(operationDeadline);
            return this;
        }

        public Builder setPathTranslation(String pathTranslation) {
            this.pathTranslation = Objects.requireNonNull(pathTranslation);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public BackendRuleResponse build() {
            return new BackendRuleResponse(address, deadline, disableAuth, jwtAudience, operationDeadline, pathTranslation, protocol, selector);
        }
    }
}
