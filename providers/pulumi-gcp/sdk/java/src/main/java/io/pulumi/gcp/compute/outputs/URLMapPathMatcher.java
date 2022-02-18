// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteAction;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultUrlRedirect;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherHeaderAction;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRule;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcher {
    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteAction defaultRouteAction;
    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    private final @Nullable String defaultService;
    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultUrlRedirect defaultUrlRedirect;
    /**
     * Description of this test case.
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherHeaderAction headerAction;
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that's required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherPathRule> pathRules;
    /**
     * The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherRouteRule> routeRules;

    @OutputCustomType.Constructor({"defaultRouteAction","defaultService","defaultUrlRedirect","description","headerAction","name","pathRules","routeRules"})
    private URLMapPathMatcher(
        @Nullable URLMapPathMatcherDefaultRouteAction defaultRouteAction,
        @Nullable String defaultService,
        @Nullable URLMapPathMatcherDefaultUrlRedirect defaultUrlRedirect,
        @Nullable String description,
        @Nullable URLMapPathMatcherHeaderAction headerAction,
        String name,
        @Nullable List<URLMapPathMatcherPathRule> pathRules,
        @Nullable List<URLMapPathMatcherRouteRule> routeRules) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.name = Objects.requireNonNull(name);
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteAction> getDefaultRouteAction() {
        return Optional.ofNullable(this.defaultRouteAction);
    }
    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    public Optional<String> getDefaultService() {
        return Optional.ofNullable(this.defaultService);
    }
    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultUrlRedirect> getDefaultUrlRedirect() {
        return Optional.ofNullable(this.defaultUrlRedirect);
    }
    /**
     * Description of this test case.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that's required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherPathRule> getPathRules() {
        return this.pathRules == null ? List.of() : this.pathRules;
    }
    /**
     * The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherRouteRule> getRouteRules() {
        return this.routeRules == null ? List.of() : this.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcher defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherDefaultRouteAction defaultRouteAction;
        private @Nullable String defaultService;
        private @Nullable URLMapPathMatcherDefaultUrlRedirect defaultUrlRedirect;
        private @Nullable String description;
        private @Nullable URLMapPathMatcherHeaderAction headerAction;
        private String name;
        private @Nullable List<URLMapPathMatcherPathRule> pathRules;
        private @Nullable List<URLMapPathMatcherRouteRule> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDefaultRouteAction(@Nullable URLMapPathMatcherDefaultRouteAction defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder setDefaultService(@Nullable String defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable URLMapPathMatcherDefaultUrlRedirect defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapPathMatcherHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPathRules(@Nullable List<URLMapPathMatcherPathRule> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setRouteRules(@Nullable List<URLMapPathMatcherRouteRule> routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        public URLMapPathMatcher build() {
            return new URLMapPathMatcher(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}