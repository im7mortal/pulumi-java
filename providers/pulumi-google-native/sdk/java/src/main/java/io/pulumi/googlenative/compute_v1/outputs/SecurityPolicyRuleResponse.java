// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRuleHttpHeaderActionResponse;
import io.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRuleMatcherResponse;
import io.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRuleRateLimitOptionsResponse;
import io.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleResponse {
    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    private final String action;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    private final SecurityPolicyRuleHttpHeaderActionResponse headerAction;
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    private final String kind;
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    private final SecurityPolicyRuleMatcherResponse match;
    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    private final Boolean preview;
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    private final Integer priority;
    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRedirectOptionsResponse redirectOptions;

    @OutputCustomType.Constructor({"action","description","headerAction","kind","match","preview","priority","rateLimitOptions","redirectOptions"})
    private SecurityPolicyRuleResponse(
        String action,
        String description,
        SecurityPolicyRuleHttpHeaderActionResponse headerAction,
        String kind,
        SecurityPolicyRuleMatcherResponse match,
        Boolean preview,
        Integer priority,
        SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions,
        SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
        this.action = Objects.requireNonNull(action);
        this.description = Objects.requireNonNull(description);
        this.headerAction = Objects.requireNonNull(headerAction);
        this.kind = Objects.requireNonNull(kind);
        this.match = Objects.requireNonNull(match);
        this.preview = Objects.requireNonNull(preview);
        this.priority = Objects.requireNonNull(priority);
        this.rateLimitOptions = Objects.requireNonNull(rateLimitOptions);
        this.redirectOptions = Objects.requireNonNull(redirectOptions);
    }

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional, additional actions that are performed on headers.
     * 
    */
    public SecurityPolicyRuleHttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
    */
    public SecurityPolicyRuleMatcherResponse getMatch() {
        return this.match;
    }
    /**
     * If set to true, the specified action is not enforced.
     * 
    */
    public Boolean getPreview() {
        return this.preview;
    }
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
    */
    public SecurityPolicyRuleRateLimitOptionsResponse getRateLimitOptions() {
        return this.rateLimitOptions;
    }
    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
    */
    public SecurityPolicyRuleRedirectOptionsResponse getRedirectOptions() {
        return this.redirectOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private SecurityPolicyRuleHttpHeaderActionResponse headerAction;
        private String kind;
        private SecurityPolicyRuleMatcherResponse match;
        private Boolean preview;
        private Integer priority;
        private SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
        private SecurityPolicyRuleRedirectOptionsResponse redirectOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
    	      this.redirectOptions = defaults.redirectOptions;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHeaderAction(SecurityPolicyRuleHttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMatch(SecurityPolicyRuleMatcherResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setPreview(Boolean preview) {
            this.preview = Objects.requireNonNull(preview);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRateLimitOptions(SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions) {
            this.rateLimitOptions = Objects.requireNonNull(rateLimitOptions);
            return this;
        }

        public Builder setRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
            this.redirectOptions = Objects.requireNonNull(redirectOptions);
            return this;
        }
        public SecurityPolicyRuleResponse build() {
            return new SecurityPolicyRuleResponse(action, description, headerAction, kind, match, preview, priority, rateLimitOptions, redirectOptions);
        }
    }
}
