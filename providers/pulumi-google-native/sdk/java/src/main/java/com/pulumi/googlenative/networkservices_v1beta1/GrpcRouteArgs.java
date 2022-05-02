// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GrpcRouteRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrpcRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrpcRouteArgs Empty = new GrpcRouteArgs();

    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    @Import(name="gateways")
    private @Nullable Output<List<String>> gateways;

    /**
     * @return Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    public Optional<Output<List<String>>> gateways() {
        return Optional.ofNullable(this.gateways);
    }

    /**
     * Required. Short name of the GrpcRoute resource to be created.
     * 
     */
    @Import(name="grpcRouteId", required=true)
    private Output<String> grpcRouteId;

    /**
     * @return Required. Short name of the GrpcRoute resource to be created.
     * 
     */
    public Output<String> grpcRouteId() {
        return this.grpcRouteId;
    }

    /**
     * Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
     * 
     */
    @Import(name="hostnames", required=true)
    private Output<List<String>> hostnames;

    /**
     * @return Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }

    /**
     * Optional. Set of label tags associated with the GrpcRoute resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the GrpcRoute resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
     * 
     */
    @Import(name="meshes")
    private @Nullable Output<List<String>> meshes;

    /**
     * @return Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
     * 
     */
    public Optional<Output<List<String>>> meshes() {
        return Optional.ofNullable(this.meshes);
    }

    /**
     * Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<GrpcRouteRouteRuleArgs>> rules;

    /**
     * @return A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
     * 
     */
    public Output<List<GrpcRouteRouteRuleArgs>> rules() {
        return this.rules;
    }

    private GrpcRouteArgs() {}

    private GrpcRouteArgs(GrpcRouteArgs $) {
        this.description = $.description;
        this.gateways = $.gateways;
        this.grpcRouteId = $.grpcRouteId;
        this.hostnames = $.hostnames;
        this.labels = $.labels;
        this.location = $.location;
        this.meshes = $.meshes;
        this.name = $.name;
        this.project = $.project;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcRouteArgs $;

        public Builder() {
            $ = new GrpcRouteArgs();
        }

        public Builder(GrpcRouteArgs defaults) {
            $ = new GrpcRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. A free-text description of the resource. Max length 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A free-text description of the resource. Max length 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gateways Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
         * 
         * @return builder
         * 
         */
        public Builder gateways(@Nullable Output<List<String>> gateways) {
            $.gateways = gateways;
            return this;
        }

        /**
         * @param gateways Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
         * 
         * @return builder
         * 
         */
        public Builder gateways(List<String> gateways) {
            return gateways(Output.of(gateways));
        }

        /**
         * @param gateways Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
         * 
         * @return builder
         * 
         */
        public Builder gateways(String... gateways) {
            return gateways(List.of(gateways));
        }

        /**
         * @param grpcRouteId Required. Short name of the GrpcRoute resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder grpcRouteId(Output<String> grpcRouteId) {
            $.grpcRouteId = grpcRouteId;
            return this;
        }

        /**
         * @param grpcRouteId Required. Short name of the GrpcRoute resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder grpcRouteId(String grpcRouteId) {
            return grpcRouteId(Output.of(grpcRouteId));
        }

        /**
         * @param hostnames Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
         * 
         * @return builder
         * 
         */
        public Builder hostnames(Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        /**
         * @param labels Optional. Set of label tags associated with the GrpcRoute resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Set of label tags associated with the GrpcRoute resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param meshes Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
         * 
         * @return builder
         * 
         */
        public Builder meshes(@Nullable Output<List<String>> meshes) {
            $.meshes = meshes;
            return this;
        }

        /**
         * @param meshes Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
         * 
         * @return builder
         * 
         */
        public Builder meshes(List<String> meshes) {
            return meshes(Output.of(meshes));
        }

        /**
         * @param meshes Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
         * 
         * @return builder
         * 
         */
        public Builder meshes(String... meshes) {
            return meshes(List.of(meshes));
        }

        /**
         * @param name Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rules A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<GrpcRouteRouteRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<GrpcRouteRouteRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
         * 
         * @return builder
         * 
         */
        public Builder rules(GrpcRouteRouteRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GrpcRouteArgs build() {
            $.grpcRouteId = Objects.requireNonNull($.grpcRouteId, "expected parameter 'grpcRouteId' to be non-null");
            $.hostnames = Objects.requireNonNull($.hostnames, "expected parameter 'hostnames' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
