// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.ServiceAttachmentConnectionPreference;
import com.pulumi.googlenative.compute_v1.inputs.ServiceAttachmentConsumerProjectLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentArgs Empty = new ServiceAttachmentArgs();

    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @Import(name="connectionPreference")
    private @Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference;

    /**
     * @return The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    public Optional<Output<ServiceAttachmentConnectionPreference>> connectionPreference() {
        return Optional.ofNullable(this.connectionPreference);
    }

    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    @Import(name="consumerAcceptLists")
    private @Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;

    /**
     * @return Projects that are allowed to connect to this service attachment.
     * 
     */
    public Optional<Output<List<ServiceAttachmentConsumerProjectLimitArgs>>> consumerAcceptLists() {
        return Optional.ofNullable(this.consumerAcceptLists);
    }

    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    @Import(name="consumerRejectLists")
    private @Nullable Output<List<String>> consumerRejectLists;

    /**
     * @return Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    public Optional<Output<List<String>>> consumerRejectLists() {
        return Optional.ofNullable(this.consumerRejectLists);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
     * 
     */
    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    /**
     * @return If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
     * 
     */
    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    @Import(name="enableProxyProtocol")
    private @Nullable Output<Boolean> enableProxyProtocol;

    /**
     * @return If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    public Optional<Output<Boolean>> enableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    @Import(name="natSubnets")
    private @Nullable Output<List<String>> natSubnets;

    /**
     * @return An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    public Optional<Output<List<String>>> natSubnets() {
        return Optional.ofNullable(this.natSubnets);
    }

    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    @Import(name="producerForwardingRule")
    private @Nullable Output<String> producerForwardingRule;

    /**
     * @return The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    public Optional<Output<String>> producerForwardingRule() {
        return Optional.ofNullable(this.producerForwardingRule);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
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
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    @Import(name="targetService")
    private @Nullable Output<String> targetService;

    /**
     * @return The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    public Optional<Output<String>> targetService() {
        return Optional.ofNullable(this.targetService);
    }

    private ServiceAttachmentArgs() {}

    private ServiceAttachmentArgs(ServiceAttachmentArgs $) {
        this.connectionPreference = $.connectionPreference;
        this.consumerAcceptLists = $.consumerAcceptLists;
        this.consumerRejectLists = $.consumerRejectLists;
        this.description = $.description;
        this.domainNames = $.domainNames;
        this.enableProxyProtocol = $.enableProxyProtocol;
        this.name = $.name;
        this.natSubnets = $.natSubnets;
        this.producerForwardingRule = $.producerForwardingRule;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.targetService = $.targetService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAttachmentArgs $;

        public Builder() {
            $ = new ServiceAttachmentArgs();
        }

        public Builder(ServiceAttachmentArgs defaults) {
            $ = new ServiceAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPreference The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
         * 
         * @return builder
         * 
         */
        public Builder connectionPreference(@Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference) {
            $.connectionPreference = connectionPreference;
            return this;
        }

        /**
         * @param connectionPreference The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
         * 
         * @return builder
         * 
         */
        public Builder connectionPreference(ServiceAttachmentConnectionPreference connectionPreference) {
            return connectionPreference(Output.of(connectionPreference));
        }

        /**
         * @param consumerAcceptLists Projects that are allowed to connect to this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder consumerAcceptLists(@Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists) {
            $.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        /**
         * @param consumerAcceptLists Projects that are allowed to connect to this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder consumerAcceptLists(List<ServiceAttachmentConsumerProjectLimitArgs> consumerAcceptLists) {
            return consumerAcceptLists(Output.of(consumerAcceptLists));
        }

        /**
         * @param consumerAcceptLists Projects that are allowed to connect to this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder consumerAcceptLists(ServiceAttachmentConsumerProjectLimitArgs... consumerAcceptLists) {
            return consumerAcceptLists(List.of(consumerAcceptLists));
        }

        /**
         * @param consumerRejectLists Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
         * 
         * @return builder
         * 
         */
        public Builder consumerRejectLists(@Nullable Output<List<String>> consumerRejectLists) {
            $.consumerRejectLists = consumerRejectLists;
            return this;
        }

        /**
         * @param consumerRejectLists Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
         * 
         * @return builder
         * 
         */
        public Builder consumerRejectLists(List<String> consumerRejectLists) {
            return consumerRejectLists(Output.of(consumerRejectLists));
        }

        /**
         * @param consumerRejectLists Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
         * 
         * @return builder
         * 
         */
        public Builder consumerRejectLists(String... consumerRejectLists) {
            return consumerRejectLists(List.of(consumerRejectLists));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domainNames If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        /**
         * @param domainNames If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        /**
         * @param domainNames If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        /**
         * @param enableProxyProtocol If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(@Nullable Output<Boolean> enableProxyProtocol) {
            $.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        /**
         * @param enableProxyProtocol If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
            return enableProxyProtocol(Output.of(enableProxyProtocol));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param natSubnets An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder natSubnets(@Nullable Output<List<String>> natSubnets) {
            $.natSubnets = natSubnets;
            return this;
        }

        /**
         * @param natSubnets An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder natSubnets(List<String> natSubnets) {
            return natSubnets(Output.of(natSubnets));
        }

        /**
         * @param natSubnets An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder natSubnets(String... natSubnets) {
            return natSubnets(List.of(natSubnets));
        }

        /**
         * @param producerForwardingRule The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder producerForwardingRule(@Nullable Output<String> producerForwardingRule) {
            $.producerForwardingRule = producerForwardingRule;
            return this;
        }

        /**
         * @param producerForwardingRule The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder producerForwardingRule(String producerForwardingRule) {
            return producerForwardingRule(Output.of(producerForwardingRule));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
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
         * @param targetService The URL of a service serving the endpoint identified by this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder targetService(@Nullable Output<String> targetService) {
            $.targetService = targetService;
            return this;
        }

        /**
         * @param targetService The URL of a service serving the endpoint identified by this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder targetService(String targetService) {
            return targetService(Output.of(targetService));
        }

        public ServiceAttachmentArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
