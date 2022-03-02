// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeout;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherPathRuleRouteAction {
    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy;
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
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy;
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout;
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite;
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
    private final @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices;

    @OutputCustomType.Constructor({"corsPolicy","faultInjectionPolicy","requestMirrorPolicy","retryPolicy","timeout","urlRewrite","weightedBackendServices"})
    private RegionUrlMapPathMatcherPathRuleRouteAction(
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy,
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy,
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout,
        @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite,
        @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices) {
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
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy> getCorsPolicy() {
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
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy> getFaultInjectionPolicy() {
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
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy> getRequestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy> getRetryPolicy() {
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
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite> getUrlRewrite() {
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
    public List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite;
        private @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUrlRewrite(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteAction build() {
            return new RegionUrlMapPathMatcherPathRuleRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
