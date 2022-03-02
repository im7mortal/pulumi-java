// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.HttpFilterConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.HttpHeaderActionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.HttpRedirectActionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.HttpRouteActionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.HttpRouteRuleMatchResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpRouteRuleResponse {
    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    private final String description;
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final HttpHeaderActionResponse headerAction;
    /**
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final List<HttpFilterConfigResponse> httpFilterConfigs;
    /**
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final List<HttpFilterConfigResponse> httpFilterMetadata;
    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    private final List<HttpRouteRuleMatchResponse> matchRules;
    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    private final Integer priority;
    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
     * 
     */
    private final HttpRouteActionResponse routeAction;
    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    private final String service;
    /**
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final HttpRedirectActionResponse urlRedirect;

    @OutputCustomType.Constructor({"description","headerAction","httpFilterConfigs","httpFilterMetadata","matchRules","priority","routeAction","service","urlRedirect"})
    private HttpRouteRuleResponse(
        String description,
        HttpHeaderActionResponse headerAction,
        List<HttpFilterConfigResponse> httpFilterConfigs,
        List<HttpFilterConfigResponse> httpFilterMetadata,
        List<HttpRouteRuleMatchResponse> matchRules,
        Integer priority,
        HttpRouteActionResponse routeAction,
        String service,
        HttpRedirectActionResponse urlRedirect) {
        this.description = Objects.requireNonNull(description);
        this.headerAction = Objects.requireNonNull(headerAction);
        this.httpFilterConfigs = Objects.requireNonNull(httpFilterConfigs);
        this.httpFilterMetadata = Objects.requireNonNull(httpFilterMetadata);
        this.matchRules = Objects.requireNonNull(matchRules);
        this.priority = Objects.requireNonNull(priority);
        this.routeAction = Objects.requireNonNull(routeAction);
        this.service = Objects.requireNonNull(service);
        this.urlRedirect = Objects.requireNonNull(urlRedirect);
    }

    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public HttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }
    /**
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public List<HttpFilterConfigResponse> getHttpFilterConfigs() {
        return this.httpFilterConfigs;
    }
    /**
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public List<HttpFilterConfigResponse> getHttpFilterMetadata() {
        return this.httpFilterMetadata;
    }
    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
    */
    public List<HttpRouteRuleMatchResponse> getMatchRules() {
        return this.matchRules;
    }
    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
     * 
    */
    public HttpRouteActionResponse getRouteAction() {
        return this.routeAction;
    }
    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
    */
    public HttpRedirectActionResponse getUrlRedirect() {
        return this.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private HttpHeaderActionResponse headerAction;
        private List<HttpFilterConfigResponse> httpFilterConfigs;
        private List<HttpFilterConfigResponse> httpFilterMetadata;
        private List<HttpRouteRuleMatchResponse> matchRules;
        private Integer priority;
        private HttpRouteActionResponse routeAction;
        private String service;
        private HttpRedirectActionResponse urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.httpFilterConfigs = defaults.httpFilterConfigs;
    	      this.httpFilterMetadata = defaults.httpFilterMetadata;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHeaderAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setHttpFilterConfigs(List<HttpFilterConfigResponse> httpFilterConfigs) {
            this.httpFilterConfigs = Objects.requireNonNull(httpFilterConfigs);
            return this;
        }

        public Builder setHttpFilterMetadata(List<HttpFilterConfigResponse> httpFilterMetadata) {
            this.httpFilterMetadata = Objects.requireNonNull(httpFilterMetadata);
            return this;
        }

        public Builder setMatchRules(List<HttpRouteRuleMatchResponse> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteAction(HttpRouteActionResponse routeAction) {
            this.routeAction = Objects.requireNonNull(routeAction);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setUrlRedirect(HttpRedirectActionResponse urlRedirect) {
            this.urlRedirect = Objects.requireNonNull(urlRedirect);
            return this;
        }
        public HttpRouteRuleResponse build() {
            return new HttpRouteRuleResponse(description, headerAction, httpFilterConfigs, httpFilterMetadata, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
