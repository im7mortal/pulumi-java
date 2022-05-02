// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.SecurityPolicyRuleRateLimitOptionsEnforceOnKey;
import com.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRateLimitOptionsThresholdArgs;
import com.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRedirectOptionsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsArgs Empty = new SecurityPolicyRuleRateLimitOptionsArgs();

    /**
     * Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @Import(name="banDurationSec")
    private @Nullable Output<Integer> banDurationSec;

    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    public Optional<Output<Integer>> banDurationSec() {
        return Optional.ofNullable(this.banDurationSec);
    }

    /**
     * Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    @Import(name="banThreshold")
    private @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold;

    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    public Optional<Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs>> banThreshold() {
        return Optional.ofNullable(this.banThreshold);
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    @Import(name="conformAction")
    private @Nullable Output<String> conformAction;

    /**
     * @return Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    public Optional<Output<String>> conformAction() {
        return Optional.ofNullable(this.conformAction);
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @Import(name="enforceOnKey")
    private @Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey;

    /**
     * @return Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    public Optional<Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey>> enforceOnKey() {
        return Optional.ofNullable(this.enforceOnKey);
    }

    /**
     * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    @Import(name="enforceOnKeyName")
    private @Nullable Output<String> enforceOnKeyName;

    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    public Optional<Output<String>> enforceOnKeyName() {
        return Optional.ofNullable(this.enforceOnKeyName);
    }

    /**
     * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
     * 
     */
    @Import(name="exceedAction")
    private @Nullable Output<String> exceedAction;

    /**
     * @return Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
     * 
     */
    public Optional<Output<String>> exceedAction() {
        return Optional.ofNullable(this.exceedAction);
    }

    /**
     * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    @Import(name="exceedRedirectOptions")
    private @Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions;

    /**
     * @return Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    public Optional<Output<SecurityPolicyRuleRedirectOptionsArgs>> exceedRedirectOptions() {
        return Optional.ofNullable(this.exceedRedirectOptions);
    }

    /**
     * Threshold at which to begin ratelimiting.
     * 
     */
    @Import(name="rateLimitThreshold")
    private @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold;

    /**
     * @return Threshold at which to begin ratelimiting.
     * 
     */
    public Optional<Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs>> rateLimitThreshold() {
        return Optional.ofNullable(this.rateLimitThreshold);
    }

    private SecurityPolicyRuleRateLimitOptionsArgs() {}

    private SecurityPolicyRuleRateLimitOptionsArgs(SecurityPolicyRuleRateLimitOptionsArgs $) {
        this.banDurationSec = $.banDurationSec;
        this.banThreshold = $.banThreshold;
        this.conformAction = $.conformAction;
        this.enforceOnKey = $.enforceOnKey;
        this.enforceOnKeyName = $.enforceOnKeyName;
        this.exceedAction = $.exceedAction;
        this.exceedRedirectOptions = $.exceedRedirectOptions;
        this.rateLimitThreshold = $.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRateLimitOptionsArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleRateLimitOptionsArgs();
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
            $ = new SecurityPolicyRuleRateLimitOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param banDurationSec Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
         * 
         * @return builder
         * 
         */
        public Builder banDurationSec(@Nullable Output<Integer> banDurationSec) {
            $.banDurationSec = banDurationSec;
            return this;
        }

        /**
         * @param banDurationSec Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
         * 
         * @return builder
         * 
         */
        public Builder banDurationSec(Integer banDurationSec) {
            return banDurationSec(Output.of(banDurationSec));
        }

        /**
         * @param banThreshold Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
         * 
         * @return builder
         * 
         */
        public Builder banThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold) {
            $.banThreshold = banThreshold;
            return this;
        }

        /**
         * @param banThreshold Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
         * 
         * @return builder
         * 
         */
        public Builder banThreshold(SecurityPolicyRuleRateLimitOptionsThresholdArgs banThreshold) {
            return banThreshold(Output.of(banThreshold));
        }

        /**
         * @param conformAction Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
         * 
         * @return builder
         * 
         */
        public Builder conformAction(@Nullable Output<String> conformAction) {
            $.conformAction = conformAction;
            return this;
        }

        /**
         * @param conformAction Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
         * 
         * @return builder
         * 
         */
        public Builder conformAction(String conformAction) {
            return conformAction(Output.of(conformAction));
        }

        /**
         * @param enforceOnKey Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKey(@Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey) {
            $.enforceOnKey = enforceOnKey;
            return this;
        }

        /**
         * @param enforceOnKey Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKey(SecurityPolicyRuleRateLimitOptionsEnforceOnKey enforceOnKey) {
            return enforceOnKey(Output.of(enforceOnKey));
        }

        /**
         * @param enforceOnKeyName Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKeyName(@Nullable Output<String> enforceOnKeyName) {
            $.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        /**
         * @param enforceOnKeyName Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKeyName(String enforceOnKeyName) {
            return enforceOnKeyName(Output.of(enforceOnKeyName));
        }

        /**
         * @param exceedAction Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
         * 
         * @return builder
         * 
         */
        public Builder exceedAction(@Nullable Output<String> exceedAction) {
            $.exceedAction = exceedAction;
            return this;
        }

        /**
         * @param exceedAction Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
         * 
         * @return builder
         * 
         */
        public Builder exceedAction(String exceedAction) {
            return exceedAction(Output.of(exceedAction));
        }

        /**
         * @param exceedRedirectOptions Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
         * 
         * @return builder
         * 
         */
        public Builder exceedRedirectOptions(@Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions) {
            $.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        /**
         * @param exceedRedirectOptions Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
         * 
         * @return builder
         * 
         */
        public Builder exceedRedirectOptions(SecurityPolicyRuleRedirectOptionsArgs exceedRedirectOptions) {
            return exceedRedirectOptions(Output.of(exceedRedirectOptions));
        }

        /**
         * @param rateLimitThreshold Threshold at which to begin ratelimiting.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold) {
            $.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        /**
         * @param rateLimitThreshold Threshold at which to begin ratelimiting.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThresholdArgs rateLimitThreshold) {
            return rateLimitThreshold(Output.of(rateLimitThreshold));
        }

        public SecurityPolicyRuleRateLimitOptionsArgs build() {
            return $;
        }
    }

}
