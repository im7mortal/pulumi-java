// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.UrlMapTestHeaderResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class UrlMapTestResponse {
    /**
     * Description of this test case.
     * 
     */
    private final String description;
    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    private final String expectedOutputUrl;
    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    private final Integer expectedRedirectResponseCode;
    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    private final List<UrlMapTestHeaderResponse> headers;
    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    private final String host;
    /**
     * Path portion of the URL.
     * 
     */
    private final String path;
    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"description","expectedOutputUrl","expectedRedirectResponseCode","headers","host","path","service"})
    private UrlMapTestResponse(
        String description,
        String expectedOutputUrl,
        Integer expectedRedirectResponseCode,
        List<UrlMapTestHeaderResponse> headers,
        String host,
        String path,
        String service) {
        this.description = Objects.requireNonNull(description);
        this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl);
        this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode);
        this.headers = Objects.requireNonNull(headers);
        this.host = Objects.requireNonNull(host);
        this.path = Objects.requireNonNull(path);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * Description of this test case.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
    */
    public String getExpectedOutputUrl() {
        return this.expectedOutputUrl;
    }
    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
    */
    public Integer getExpectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode;
    }
    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
    */
    public List<UrlMapTestHeaderResponse> getHeaders() {
        return this.headers;
    }
    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Path portion of the URL.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expectedOutputUrl;
        private Integer expectedRedirectResponseCode;
        private List<UrlMapTestHeaderResponse> headers;
        private String host;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpectedOutputUrl(String expectedOutputUrl) {
            this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl);
            return this;
        }

        public Builder setExpectedRedirectResponseCode(Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode);
            return this;
        }

        public Builder setHeaders(List<UrlMapTestHeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public UrlMapTestResponse build() {
            return new UrlMapTestResponse(description, expectedOutputUrl, expectedRedirectResponseCode, headers, host, path, service);
        }
    }
}
