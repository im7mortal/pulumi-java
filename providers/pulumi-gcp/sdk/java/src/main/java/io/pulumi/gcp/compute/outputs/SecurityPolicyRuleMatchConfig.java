// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleMatchConfig {
    /**
     * Set of IP addresses or ranges (IPV4 or IPV6) in CIDR notation
     * to match against inbound traffic. There is a limit of 10 IP ranges per rule. A value of '\*' matches all IPs
     * (can be used to override the default behavior).
     * 
     */
    private final List<String> srcIpRanges;

    @OutputCustomType.Constructor({"srcIpRanges"})
    private SecurityPolicyRuleMatchConfig(List<String> srcIpRanges) {
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
    }

    /**
     * Set of IP addresses or ranges (IPV4 or IPV6) in CIDR notation
     * to match against inbound traffic. There is a limit of 10 IP ranges per rule. A value of '\*' matches all IPs
     * (can be used to override the default behavior).
     * 
     */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public SecurityPolicyRuleMatchConfig build() {
            return new SecurityPolicyRuleMatchConfig(srcIpRanges);
        }
    }
}