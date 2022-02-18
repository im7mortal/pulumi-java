// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceState extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceState Empty = new EdgeCacheServiceState();

    /**
     * A human-readable description of the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * HTTP/3 (IETF QUIC) and Google QUIC are enabled by default.
     * 
     */
    @InputImport(name="disableQuic")
    private final @Nullable Input<Boolean> disableQuic;

    public Input<Boolean> getDisableQuic() {
        return this.disableQuic == null ? Input.empty() : this.disableQuic;
    }

    /**
     * Resource URL that points at the Cloud Armor edge security policy that is applied on each request against the EdgeCacheService.
     * 
     */
    @InputImport(name="edgeSecurityPolicy")
    private final @Nullable Input<String> edgeSecurityPolicy;

    public Input<String> getEdgeSecurityPolicy() {
        return this.edgeSecurityPolicy == null ? Input.empty() : this.edgeSecurityPolicy;
    }

    /**
     * URLs to sslCertificate resources that are used to authenticate connections between users and the EdgeCacheService.
     * Note that only "global" certificates with a "scope" of "EDGE_CACHE" can be attached to an EdgeCacheService.
     * 
     */
    @InputImport(name="edgeSslCertificates")
    private final @Nullable Input<List<String>> edgeSslCertificates;

    public Input<List<String>> getEdgeSslCertificates() {
        return this.edgeSslCertificates == null ? Input.empty() : this.edgeSslCertificates;
    }

    /**
     * The IPv4 addresses associated with this service. Addresses are static for the lifetime of the service.
     * 
     */
    @InputImport(name="ipv4Addresses")
    private final @Nullable Input<List<String>> ipv4Addresses;

    public Input<List<String>> getIpv4Addresses() {
        return this.ipv4Addresses == null ? Input.empty() : this.ipv4Addresses;
    }

    /**
     * The IPv6 addresses associated with this service. Addresses are static for the lifetime of the service.
     * 
     */
    @InputImport(name="ipv6Addresses")
    private final @Nullable Input<List<String>> ipv6Addresses;

    public Input<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Input.empty() : this.ipv6Addresses;
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Specifies the logging options for the traffic served by this service. If logging is enabled, logs will be exported to Cloud Logging.
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
    private final @Nullable Input<EdgeCacheServiceLogConfigGetArgs> logConfig;

    public Input<EdgeCacheServiceLogConfigGetArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Require TLS (HTTPS) for all clients connecting to this service.
     * Clients who connect over HTTP (port 80) will receive a HTTP 301 to the same URL over HTTPS (port 443).
     * You must have at least one (1) edgeSslCertificate specified to enable this.
     * 
     */
    @InputImport(name="requireTls")
    private final @Nullable Input<Boolean> requireTls;

    public Input<Boolean> getRequireTls() {
        return this.requireTls == null ? Input.empty() : this.requireTls;
    }

    /**
     * Defines how requests are routed, modified, cached and/or which origin content is filled from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routing")
    private final @Nullable Input<EdgeCacheServiceRoutingGetArgs> routing;

    public Input<EdgeCacheServiceRoutingGetArgs> getRouting() {
        return this.routing == null ? Input.empty() : this.routing;
    }

    /**
     * URL of the SslPolicy resource that will be associated with the EdgeCacheService.
     * If not set, the EdgeCacheService has no SSL policy configured, and will default to the "COMPATIBLE" policy.
     * 
     */
    @InputImport(name="sslPolicy")
    private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    public EdgeCacheServiceState(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disableQuic,
        @Nullable Input<String> edgeSecurityPolicy,
        @Nullable Input<List<String>> edgeSslCertificates,
        @Nullable Input<List<String>> ipv4Addresses,
        @Nullable Input<List<String>> ipv6Addresses,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<EdgeCacheServiceLogConfigGetArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> requireTls,
        @Nullable Input<EdgeCacheServiceRoutingGetArgs> routing,
        @Nullable Input<String> sslPolicy) {
        this.description = description;
        this.disableQuic = disableQuic;
        this.edgeSecurityPolicy = edgeSecurityPolicy;
        this.edgeSslCertificates = edgeSslCertificates;
        this.ipv4Addresses = ipv4Addresses;
        this.ipv6Addresses = ipv6Addresses;
        this.labels = labels;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.requireTls = requireTls;
        this.routing = routing;
        this.sslPolicy = sslPolicy;
    }

    private EdgeCacheServiceState() {
        this.description = Input.empty();
        this.disableQuic = Input.empty();
        this.edgeSecurityPolicy = Input.empty();
        this.edgeSslCertificates = Input.empty();
        this.ipv4Addresses = Input.empty();
        this.ipv6Addresses = Input.empty();
        this.labels = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requireTls = Input.empty();
        this.routing = Input.empty();
        this.sslPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disableQuic;
        private @Nullable Input<String> edgeSecurityPolicy;
        private @Nullable Input<List<String>> edgeSslCertificates;
        private @Nullable Input<List<String>> ipv4Addresses;
        private @Nullable Input<List<String>> ipv6Addresses;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<EdgeCacheServiceLogConfigGetArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> requireTls;
        private @Nullable Input<EdgeCacheServiceRoutingGetArgs> routing;
        private @Nullable Input<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disableQuic = defaults.disableQuic;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.edgeSslCertificates = defaults.edgeSslCertificates;
    	      this.ipv4Addresses = defaults.ipv4Addresses;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.labels = defaults.labels;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requireTls = defaults.requireTls;
    	      this.routing = defaults.routing;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisableQuic(@Nullable Input<Boolean> disableQuic) {
            this.disableQuic = disableQuic;
            return this;
        }

        public Builder setDisableQuic(@Nullable Boolean disableQuic) {
            this.disableQuic = Input.ofNullable(disableQuic);
            return this;
        }

        public Builder setEdgeSecurityPolicy(@Nullable Input<String> edgeSecurityPolicy) {
            this.edgeSecurityPolicy = edgeSecurityPolicy;
            return this;
        }

        public Builder setEdgeSecurityPolicy(@Nullable String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Input.ofNullable(edgeSecurityPolicy);
            return this;
        }

        public Builder setEdgeSslCertificates(@Nullable Input<List<String>> edgeSslCertificates) {
            this.edgeSslCertificates = edgeSslCertificates;
            return this;
        }

        public Builder setEdgeSslCertificates(@Nullable List<String> edgeSslCertificates) {
            this.edgeSslCertificates = Input.ofNullable(edgeSslCertificates);
            return this;
        }

        public Builder setIpv4Addresses(@Nullable Input<List<String>> ipv4Addresses) {
            this.ipv4Addresses = ipv4Addresses;
            return this;
        }

        public Builder setIpv4Addresses(@Nullable List<String> ipv4Addresses) {
            this.ipv4Addresses = Input.ofNullable(ipv4Addresses);
            return this;
        }

        public Builder setIpv6Addresses(@Nullable Input<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder setIpv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Input.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<EdgeCacheServiceLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable EdgeCacheServiceLogConfigGetArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequireTls(@Nullable Input<Boolean> requireTls) {
            this.requireTls = requireTls;
            return this;
        }

        public Builder setRequireTls(@Nullable Boolean requireTls) {
            this.requireTls = Input.ofNullable(requireTls);
            return this;
        }

        public Builder setRouting(@Nullable Input<EdgeCacheServiceRoutingGetArgs> routing) {
            this.routing = routing;
            return this;
        }

        public Builder setRouting(@Nullable EdgeCacheServiceRoutingGetArgs routing) {
            this.routing = Input.ofNullable(routing);
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public EdgeCacheServiceState build() {
            return new EdgeCacheServiceState(description, disableQuic, edgeSecurityPolicy, edgeSslCertificates, ipv4Addresses, ipv6Addresses, labels, logConfig, name, project, requireTls, routing, sslPolicy);
        }
    }
}