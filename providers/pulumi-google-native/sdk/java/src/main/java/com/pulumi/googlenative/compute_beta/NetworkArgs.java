// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.NetworkNetworkFirewallPolicyEnforcementOrder;
import com.pulumi.googlenative.compute_beta.inputs.NetworkRoutingConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    @Import(name="autoCreateSubnetworks")
    private @Nullable Output<Boolean> autoCreateSubnetworks;

    /**
     * @return Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    public Optional<Output<Boolean>> autoCreateSubnetworks() {
        return Optional.ofNullable(this.autoCreateSubnetworks);
    }

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
     * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    @Import(name="enableUlaInternalIpv6")
    private @Nullable Output<Boolean> enableUlaInternalIpv6;

    /**
     * @return Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    public Optional<Output<Boolean>> enableUlaInternalIpv6() {
        return Optional.ofNullable(this.enableUlaInternalIpv6);
    }

    /**
     * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    @Import(name="internalIpv6Range")
    private @Nullable Output<String> internalIpv6Range;

    /**
     * @return When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    public Optional<Output<String>> internalIpv6Range() {
        return Optional.ofNullable(this.internalIpv6Range);
    }

    /**
     * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     * @deprecated
     * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     */
    @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
    @Import(name="ipv4Range")
    private @Nullable Output<String> ipv4Range;

    /**
     * @return Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     * @deprecated
     * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
     * 
     */
    @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
    public Optional<Output<String>> ipv4Range() {
        return Optional.ofNullable(this.ipv4Range);
    }

    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
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
     * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
     * 
     */
    @Import(name="networkFirewallPolicyEnforcementOrder")
    private @Nullable Output<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder;

    /**
     * @return The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
     * 
     */
    public Optional<Output<NetworkNetworkFirewallPolicyEnforcementOrder>> networkFirewallPolicyEnforcementOrder() {
        return Optional.ofNullable(this.networkFirewallPolicyEnforcementOrder);
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
     * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    @Import(name="routingConfig")
    private @Nullable Output<NetworkRoutingConfigArgs> routingConfig;

    /**
     * @return The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    public Optional<Output<NetworkRoutingConfigArgs>> routingConfig() {
        return Optional.ofNullable(this.routingConfig);
    }

    private NetworkArgs() {}

    private NetworkArgs(NetworkArgs $) {
        this.autoCreateSubnetworks = $.autoCreateSubnetworks;
        this.description = $.description;
        this.enableUlaInternalIpv6 = $.enableUlaInternalIpv6;
        this.internalIpv6Range = $.internalIpv6Range;
        this.ipv4Range = $.ipv4Range;
        this.mtu = $.mtu;
        this.name = $.name;
        this.networkFirewallPolicyEnforcementOrder = $.networkFirewallPolicyEnforcementOrder;
        this.project = $.project;
        this.requestId = $.requestId;
        this.routingConfig = $.routingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkArgs $;

        public Builder() {
            $ = new NetworkArgs();
        }

        public Builder(NetworkArgs defaults) {
            $ = new NetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreateSubnetworks Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateSubnetworks(@Nullable Output<Boolean> autoCreateSubnetworks) {
            $.autoCreateSubnetworks = autoCreateSubnetworks;
            return this;
        }

        /**
         * @param autoCreateSubnetworks Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateSubnetworks(Boolean autoCreateSubnetworks) {
            return autoCreateSubnetworks(Output.of(autoCreateSubnetworks));
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
         * @param enableUlaInternalIpv6 Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
         * 
         * @return builder
         * 
         */
        public Builder enableUlaInternalIpv6(@Nullable Output<Boolean> enableUlaInternalIpv6) {
            $.enableUlaInternalIpv6 = enableUlaInternalIpv6;
            return this;
        }

        /**
         * @param enableUlaInternalIpv6 Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
         * 
         * @return builder
         * 
         */
        public Builder enableUlaInternalIpv6(Boolean enableUlaInternalIpv6) {
            return enableUlaInternalIpv6(Output.of(enableUlaInternalIpv6));
        }

        /**
         * @param internalIpv6Range When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
         * 
         * @return builder
         * 
         */
        public Builder internalIpv6Range(@Nullable Output<String> internalIpv6Range) {
            $.internalIpv6Range = internalIpv6Range;
            return this;
        }

        /**
         * @param internalIpv6Range When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
         * 
         * @return builder
         * 
         */
        public Builder internalIpv6Range(String internalIpv6Range) {
            return internalIpv6Range(Output.of(internalIpv6Range));
        }

        /**
         * @param ipv4Range Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
         * 
         */
        @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
        public Builder ipv4Range(@Nullable Output<String> ipv4Range) {
            $.ipv4Range = ipv4Range;
            return this;
        }

        /**
         * @param ipv4Range Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
         * 
         */
        @Deprecated /* Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created. */
        public Builder ipv4Range(String ipv4Range) {
            return ipv4Range(Output.of(ipv4Range));
        }

        /**
         * @param mtu Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
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
         * @param networkFirewallPolicyEnforcementOrder The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
         * 
         * @return builder
         * 
         */
        public Builder networkFirewallPolicyEnforcementOrder(@Nullable Output<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder) {
            $.networkFirewallPolicyEnforcementOrder = networkFirewallPolicyEnforcementOrder;
            return this;
        }

        /**
         * @param networkFirewallPolicyEnforcementOrder The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
         * 
         * @return builder
         * 
         */
        public Builder networkFirewallPolicyEnforcementOrder(NetworkNetworkFirewallPolicyEnforcementOrder networkFirewallPolicyEnforcementOrder) {
            return networkFirewallPolicyEnforcementOrder(Output.of(networkFirewallPolicyEnforcementOrder));
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
         * @param routingConfig The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
         * 
         * @return builder
         * 
         */
        public Builder routingConfig(@Nullable Output<NetworkRoutingConfigArgs> routingConfig) {
            $.routingConfig = routingConfig;
            return this;
        }

        /**
         * @param routingConfig The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
         * 
         * @return builder
         * 
         */
        public Builder routingConfig(NetworkRoutingConfigArgs routingConfig) {
            return routingConfig(Output.of(routingConfig));
        }

        public NetworkArgs build() {
            return $;
        }
    }

}
