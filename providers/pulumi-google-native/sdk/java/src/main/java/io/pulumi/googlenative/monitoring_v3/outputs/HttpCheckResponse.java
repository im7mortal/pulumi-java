// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.BasicAuthenticationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class HttpCheckResponse {
    private final BasicAuthenticationResponse authInfo;
    private final String body;
    private final String contentType;
    private final Map<String,String> headers;
    private final Boolean maskHeaders;
    private final String path;
    private final Integer port;
    private final String requestMethod;
    private final Boolean useSsl;
    private final Boolean validateSsl;

    @OutputCustomType.Constructor({"authInfo","body","contentType","headers","maskHeaders","path","port","requestMethod","useSsl","validateSsl"})
    private HttpCheckResponse(
        BasicAuthenticationResponse authInfo,
        String body,
        String contentType,
        Map<String,String> headers,
        Boolean maskHeaders,
        String path,
        Integer port,
        String requestMethod,
        Boolean useSsl,
        Boolean validateSsl) {
        this.authInfo = Objects.requireNonNull(authInfo);
        this.body = Objects.requireNonNull(body);
        this.contentType = Objects.requireNonNull(contentType);
        this.headers = Objects.requireNonNull(headers);
        this.maskHeaders = Objects.requireNonNull(maskHeaders);
        this.path = Objects.requireNonNull(path);
        this.port = Objects.requireNonNull(port);
        this.requestMethod = Objects.requireNonNull(requestMethod);
        this.useSsl = Objects.requireNonNull(useSsl);
        this.validateSsl = Objects.requireNonNull(validateSsl);
    }

    public BasicAuthenticationResponse getAuthInfo() {
        return this.authInfo;
    }
    public String getBody() {
        return this.body;
    }
    public String getContentType() {
        return this.contentType;
    }
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    public Boolean getMaskHeaders() {
        return this.maskHeaders;
    }
    public String getPath() {
        return this.path;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }
    public Boolean getUseSsl() {
        return this.useSsl;
    }
    public Boolean getValidateSsl() {
        return this.validateSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthenticationResponse authInfo;
        private String body;
        private String contentType;
        private Map<String,String> headers;
        private Boolean maskHeaders;
        private String path;
        private Integer port;
        private String requestMethod;
        private Boolean useSsl;
        private Boolean validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder setAuthInfo(BasicAuthenticationResponse authInfo) {
            this.authInfo = Objects.requireNonNull(authInfo);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setMaskHeaders(Boolean maskHeaders) {
            this.maskHeaders = Objects.requireNonNull(maskHeaders);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setRequestMethod(String requestMethod) {
            this.requestMethod = Objects.requireNonNull(requestMethod);
            return this;
        }

        public Builder setUseSsl(Boolean useSsl) {
            this.useSsl = Objects.requireNonNull(useSsl);
            return this;
        }

        public Builder setValidateSsl(Boolean validateSsl) {
            this.validateSsl = Objects.requireNonNull(validateSsl);
            return this;
        }

        public HttpCheckResponse build() {
            return new HttpCheckResponse(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}