// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @EnumType
    public enum SecurityPolicyRuleRateLimitOptionsEnforceOnKey {
        All("ALL"),
        AllIps("ALL_IPS"),
        HttpCookie("HTTP_COOKIE"),
        HttpHeader("HTTP_HEADER"),
        Ip("IP"),
        XffIp("XFF_IP");

        private final String value;

        SecurityPolicyRuleRateLimitOptionsEnforceOnKey(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityPolicyRuleRateLimitOptionsEnforceOnKey[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
