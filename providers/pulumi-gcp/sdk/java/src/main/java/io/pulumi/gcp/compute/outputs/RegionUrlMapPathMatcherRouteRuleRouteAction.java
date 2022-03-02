// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionTimeout;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteAction {
    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy;
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionTimeout timeout;
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;
    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices;

    @OutputCustomType.Constructor({"corsPolicy","faultInjectionPolicy","requestMirrorPolicy","retryPolicy","timeout","urlRewrite","weightedBackendServices"})
    private RegionUrlMapPathMatcherRouteRuleRouteAction(
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionTimeout timeout,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite,
        @Nullable List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy> getCorsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy> getFaultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy> getRequestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite> getUrlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
    */
    public List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionTimeout timeout;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUrlRewrite(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteAction build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
