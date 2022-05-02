// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1.enums.EndpointPolicyType;
import com.pulumi.googlenative.networkservices_v1.inputs.EndpointMatcherArgs;
import com.pulumi.googlenative.networkservices_v1.inputs.TrafficPortSelectorArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointPolicyArgs Empty = new EndpointPolicyArgs();

    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    @Import(name="authorizationPolicy")
    private @Nullable Output<String> authorizationPolicy;

    /**
     * @return Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    public Optional<Output<String>> authorizationPolicy() {
        return Optional.ofNullable(this.authorizationPolicy);
    }

    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    @Import(name="clientTlsPolicy")
    private @Nullable Output<String> clientTlsPolicy;

    /**
     * @return Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    public Optional<Output<String>> clientTlsPolicy() {
        return Optional.ofNullable(this.clientTlsPolicy);
    }

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
     * A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    @Import(name="endpointMatcher", required=true)
    private Output<EndpointMatcherArgs> endpointMatcher;

    /**
     * @return A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    public Output<EndpointMatcherArgs> endpointMatcher() {
        return this.endpointMatcher;
    }

    /**
     * Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
     * 
     */
    @Import(name="endpointPolicyId", required=true)
    private Output<String> endpointPolicyId;

    /**
     * @return Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
     * 
     */
    public Output<String> endpointPolicyId() {
        return this.endpointPolicyId;
    }

    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the EndpointPolicy resource.
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
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
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
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    @Import(name="serverTlsPolicy")
    private @Nullable Output<String> serverTlsPolicy;

    /**
     * @return Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    public Optional<Output<String>> serverTlsPolicy() {
        return Optional.ofNullable(this.serverTlsPolicy);
    }

    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    @Import(name="trafficPortSelector")
    private @Nullable Output<TrafficPortSelectorArgs> trafficPortSelector;

    /**
     * @return Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    public Optional<Output<TrafficPortSelectorArgs>> trafficPortSelector() {
        return Optional.ofNullable(this.trafficPortSelector);
    }

    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    @Import(name="type", required=true)
    private Output<EndpointPolicyType> type;

    /**
     * @return The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    public Output<EndpointPolicyType> type() {
        return this.type;
    }

    private EndpointPolicyArgs() {}

    private EndpointPolicyArgs(EndpointPolicyArgs $) {
        this.authorizationPolicy = $.authorizationPolicy;
        this.clientTlsPolicy = $.clientTlsPolicy;
        this.description = $.description;
        this.endpointMatcher = $.endpointMatcher;
        this.endpointPolicyId = $.endpointPolicyId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.serverTlsPolicy = $.serverTlsPolicy;
        this.trafficPortSelector = $.trafficPortSelector;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPolicyArgs $;

        public Builder() {
            $ = new EndpointPolicyArgs();
        }

        public Builder(EndpointPolicyArgs defaults) {
            $ = new EndpointPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationPolicy Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authorizationPolicy(@Nullable Output<String> authorizationPolicy) {
            $.authorizationPolicy = authorizationPolicy;
            return this;
        }

        /**
         * @param authorizationPolicy Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authorizationPolicy(String authorizationPolicy) {
            return authorizationPolicy(Output.of(authorizationPolicy));
        }

        /**
         * @param clientTlsPolicy Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsPolicy(@Nullable Output<String> clientTlsPolicy) {
            $.clientTlsPolicy = clientTlsPolicy;
            return this;
        }

        /**
         * @param clientTlsPolicy Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsPolicy(String clientTlsPolicy) {
            return clientTlsPolicy(Output.of(clientTlsPolicy));
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
         * @param endpointMatcher A matcher that selects endpoints to which the policies should be applied.
         * 
         * @return builder
         * 
         */
        public Builder endpointMatcher(Output<EndpointMatcherArgs> endpointMatcher) {
            $.endpointMatcher = endpointMatcher;
            return this;
        }

        /**
         * @param endpointMatcher A matcher that selects endpoints to which the policies should be applied.
         * 
         * @return builder
         * 
         */
        public Builder endpointMatcher(EndpointMatcherArgs endpointMatcher) {
            return endpointMatcher(Output.of(endpointMatcher));
        }

        /**
         * @param endpointPolicyId Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endpointPolicyId(Output<String> endpointPolicyId) {
            $.endpointPolicyId = endpointPolicyId;
            return this;
        }

        /**
         * @param endpointPolicyId Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endpointPolicyId(String endpointPolicyId) {
            return endpointPolicyId(Output.of(endpointPolicyId));
        }

        /**
         * @param labels Optional. Set of label tags associated with the EndpointPolicy resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Set of label tags associated with the EndpointPolicy resource.
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
         * @param name Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
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
         * @param serverTlsPolicy Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsPolicy(@Nullable Output<String> serverTlsPolicy) {
            $.serverTlsPolicy = serverTlsPolicy;
            return this;
        }

        /**
         * @param serverTlsPolicy Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsPolicy(String serverTlsPolicy) {
            return serverTlsPolicy(Output.of(serverTlsPolicy));
        }

        /**
         * @param trafficPortSelector Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
         * 
         * @return builder
         * 
         */
        public Builder trafficPortSelector(@Nullable Output<TrafficPortSelectorArgs> trafficPortSelector) {
            $.trafficPortSelector = trafficPortSelector;
            return this;
        }

        /**
         * @param trafficPortSelector Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
         * 
         * @return builder
         * 
         */
        public Builder trafficPortSelector(TrafficPortSelectorArgs trafficPortSelector) {
            return trafficPortSelector(Output.of(trafficPortSelector));
        }

        /**
         * @param type The type of endpoint policy. This is primarily used to validate the configuration.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<EndpointPolicyType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of endpoint policy. This is primarily used to validate the configuration.
         * 
         * @return builder
         * 
         */
        public Builder type(EndpointPolicyType type) {
            return type(Output.of(type));
        }

        public EndpointPolicyArgs build() {
            $.endpointMatcher = Objects.requireNonNull($.endpointMatcher, "expected parameter 'endpointMatcher' to be non-null");
            $.endpointPolicyId = Objects.requireNonNull($.endpointPolicyId, "expected parameter 'endpointPolicyId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
