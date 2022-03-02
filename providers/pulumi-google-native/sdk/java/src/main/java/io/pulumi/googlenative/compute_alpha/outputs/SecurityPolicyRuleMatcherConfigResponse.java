// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyRuleMatcherConfigDestinationPortResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyRuleMatcherConfigLayer4ConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleMatcherConfigResponse {
    /**
     * CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final List<String> destIpRanges;
    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts;
    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;
    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    private final List<String> srcIpRanges;

    @OutputCustomType.Constructor({"destIpRanges","destPorts","layer4Configs","srcIpRanges"})
    private SecurityPolicyRuleMatcherConfigResponse(
        List<String> destIpRanges,
        List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts,
        List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs,
        List<String> srcIpRanges) {
        this.destIpRanges = Objects.requireNonNull(destIpRanges);
        this.destPorts = Objects.requireNonNull(destPorts);
        this.layer4Configs = Objects.requireNonNull(layer4Configs);
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
    }

    /**
     * CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
    */
    public List<String> getDestIpRanges() {
        return this.destIpRanges;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
    */
    public List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> getDestPorts() {
        return this.destPorts;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
    */
    public List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> getLayer4Configs() {
        return this.layer4Configs;
    }
    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
    */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destIpRanges;
        private List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts;
        private List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destPorts = defaults.destPorts;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setDestIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }

        public Builder setDestPorts(List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts) {
            this.destPorts = Objects.requireNonNull(destPorts);
            return this;
        }

        public Builder setLayer4Configs(List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public SecurityPolicyRuleMatcherConfigResponse build() {
            return new SecurityPolicyRuleMatcherConfigResponse(destIpRanges, destPorts, layer4Configs, srcIpRanges);
        }
    }
}
