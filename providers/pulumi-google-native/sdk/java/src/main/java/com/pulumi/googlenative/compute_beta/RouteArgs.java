// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    @Import(name="destRange")
    private @Nullable Output<String> destRange;

    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    public Optional<Output<String>> destRange() {
        return Optional.ofNullable(this.destRange);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    @Import(name="nextHopGateway")
    private @Nullable Output<String> nextHopGateway;

    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    public Optional<Output<String>> nextHopGateway() {
        return Optional.ofNullable(this.nextHopGateway);
    }

    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    @Import(name="nextHopIlb")
    private @Nullable Output<String> nextHopIlb;

    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    public Optional<Output<String>> nextHopIlb() {
        return Optional.ofNullable(this.nextHopIlb);
    }

    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    @Import(name="nextHopInstance")
    private @Nullable Output<String> nextHopInstance;

    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    public Optional<Output<String>> nextHopInstance() {
        return Optional.ofNullable(this.nextHopInstance);
    }

    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    @Import(name="nextHopIp")
    private @Nullable Output<String> nextHopIp;

    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    public Optional<Output<String>> nextHopIp() {
        return Optional.ofNullable(this.nextHopIp);
    }

    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    @Import(name="nextHopNetwork")
    private @Nullable Output<String> nextHopNetwork;

    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    public Optional<Output<String>> nextHopNetwork() {
        return Optional.ofNullable(this.nextHopNetwork);
    }

    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @Import(name="nextHopVpnTunnel")
    private @Nullable Output<String> nextHopVpnTunnel;

    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public Optional<Output<String>> nextHopVpnTunnel() {
        return Optional.ofNullable(this.nextHopVpnTunnel);
    }

    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * A list of instance tags to which this route applies.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.description = $.description;
        this.destRange = $.destRange;
        this.name = $.name;
        this.network = $.network;
        this.nextHopGateway = $.nextHopGateway;
        this.nextHopIlb = $.nextHopIlb;
        this.nextHopInstance = $.nextHopInstance;
        this.nextHopIp = $.nextHopIp;
        this.nextHopNetwork = $.nextHopNetwork;
        this.nextHopVpnTunnel = $.nextHopVpnTunnel;
        this.priority = $.priority;
        this.project = $.project;
        this.requestId = $.requestId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this field when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this field when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destRange The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
         * 
         * @return builder
         * 
         */
        public Builder destRange(@Nullable Output<String> destRange) {
            $.destRange = destRange;
            return this;
        }

        /**
         * @param destRange The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
         * 
         * @return builder
         * 
         */
        public Builder destRange(String destRange) {
            return destRange(Output.of(destRange));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Fully-qualified URL of the network that this route applies to.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Fully-qualified URL of the network that this route applies to.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nextHopGateway The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
         * 
         * @return builder
         * 
         */
        public Builder nextHopGateway(@Nullable Output<String> nextHopGateway) {
            $.nextHopGateway = nextHopGateway;
            return this;
        }

        /**
         * @param nextHopGateway The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
         * 
         * @return builder
         * 
         */
        public Builder nextHopGateway(String nextHopGateway) {
            return nextHopGateway(Output.of(nextHopGateway));
        }

        /**
         * @param nextHopIlb The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlb(@Nullable Output<String> nextHopIlb) {
            $.nextHopIlb = nextHopIlb;
            return this;
        }

        /**
         * @param nextHopIlb The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlb(String nextHopIlb) {
            return nextHopIlb(Output.of(nextHopIlb));
        }

        /**
         * @param nextHopInstance The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstance(@Nullable Output<String> nextHopInstance) {
            $.nextHopInstance = nextHopInstance;
            return this;
        }

        /**
         * @param nextHopInstance The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstance(String nextHopInstance) {
            return nextHopInstance(Output.of(nextHopInstance));
        }

        /**
         * @param nextHopIp The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIp(@Nullable Output<String> nextHopIp) {
            $.nextHopIp = nextHopIp;
            return this;
        }

        /**
         * @param nextHopIp The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIp(String nextHopIp) {
            return nextHopIp(Output.of(nextHopIp));
        }

        /**
         * @param nextHopNetwork The URL of the local network if it should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopNetwork(@Nullable Output<String> nextHopNetwork) {
            $.nextHopNetwork = nextHopNetwork;
            return this;
        }

        /**
         * @param nextHopNetwork The URL of the local network if it should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopNetwork(String nextHopNetwork) {
            return nextHopNetwork(Output.of(nextHopNetwork));
        }

        /**
         * @param nextHopVpnTunnel The URL to a VpnTunnel that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopVpnTunnel(@Nullable Output<String> nextHopVpnTunnel) {
            $.nextHopVpnTunnel = nextHopVpnTunnel;
            return this;
        }

        /**
         * @param nextHopVpnTunnel The URL to a VpnTunnel that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            return nextHopVpnTunnel(Output.of(nextHopVpnTunnel));
        }

        /**
         * @param priority The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public RouteArgs build() {
            return $;
        }
    }

}
