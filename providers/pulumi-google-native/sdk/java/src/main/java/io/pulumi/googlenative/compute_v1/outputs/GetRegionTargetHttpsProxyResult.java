// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionTargetHttpsProxyResult {
    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
     */
    private final String authorizationPolicy;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
     * 
     */
    private final String fingerprint;
    /**
     * Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    private final Boolean proxyBind;
    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    private final String quicOverride;
    /**
     * URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    private final String serverTlsPolicy;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final List<String> sslCertificates;
    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
     */
    private final String sslPolicy;
    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
     */
    private final String urlMap;

    @OutputCustomType.Constructor({"authorizationPolicy","creationTimestamp","description","fingerprint","kind","name","proxyBind","quicOverride","region","selfLink","serverTlsPolicy","sslCertificates","sslPolicy","urlMap"})
    private GetRegionTargetHttpsProxyResult(
        String authorizationPolicy,
        String creationTimestamp,
        String description,
        String fingerprint,
        String kind,
        String name,
        Boolean proxyBind,
        String quicOverride,
        String region,
        String selfLink,
        String serverTlsPolicy,
        List<String> sslCertificates,
        String sslPolicy,
        String urlMap) {
        this.authorizationPolicy = Objects.requireNonNull(authorizationPolicy);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.proxyBind = Objects.requireNonNull(proxyBind);
        this.quicOverride = Objects.requireNonNull(quicOverride);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serverTlsPolicy = Objects.requireNonNull(serverTlsPolicy);
        this.sslCertificates = Objects.requireNonNull(sslCertificates);
        this.sslPolicy = Objects.requireNonNull(sslPolicy);
        this.urlMap = Objects.requireNonNull(urlMap);
    }

    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
    */
    public String getAuthorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
    */
    public Boolean getProxyBind() {
        return this.proxyBind;
    }
    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
    */
    public String getQuicOverride() {
        return this.quicOverride;
    }
    /**
     * URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
    */
    public String getServerTlsPolicy() {
        return this.serverTlsPolicy;
    }
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
    */
    public List<String> getSslCertificates() {
        return this.sslCertificates;
    }
    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
    */
    public String getSslPolicy() {
        return this.sslPolicy;
    }
    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
    */
    public String getUrlMap() {
        return this.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionTargetHttpsProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationPolicy;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String name;
        private Boolean proxyBind;
        private String quicOverride;
        private String region;
        private String selfLink;
        private String serverTlsPolicy;
        private List<String> sslCertificates;
        private String sslPolicy;
        private String urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionTargetHttpsProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder setAuthorizationPolicy(String authorizationPolicy) {
            this.authorizationPolicy = Objects.requireNonNull(authorizationPolicy);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProxyBind(Boolean proxyBind) {
            this.proxyBind = Objects.requireNonNull(proxyBind);
            return this;
        }

        public Builder setQuicOverride(String quicOverride) {
            this.quicOverride = Objects.requireNonNull(quicOverride);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServerTlsPolicy(String serverTlsPolicy) {
            this.serverTlsPolicy = Objects.requireNonNull(serverTlsPolicy);
            return this;
        }

        public Builder setSslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }

        public Builder setSslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }

        public Builder setUrlMap(String urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }
        public GetRegionTargetHttpsProxyResult build() {
            return new GetRegionTargetHttpsProxyResult(authorizationPolicy, creationTimestamp, description, fingerprint, kind, name, proxyBind, quicOverride, region, selfLink, serverTlsPolicy, sslCertificates, sslPolicy, urlMap);
        }
    }
}
