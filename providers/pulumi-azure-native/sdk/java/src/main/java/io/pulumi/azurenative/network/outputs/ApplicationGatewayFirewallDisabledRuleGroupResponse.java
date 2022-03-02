// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayFirewallDisabledRuleGroupResponse {
    /**
     * The name of the rule group that will be disabled.
     * 
     */
    private final String ruleGroupName;
    /**
     * The list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     * 
     */
    private final @Nullable List<Integer> rules;

    @OutputCustomType.Constructor({"ruleGroupName","rules"})
    private ApplicationGatewayFirewallDisabledRuleGroupResponse(
        String ruleGroupName,
        @Nullable List<Integer> rules) {
        this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
        this.rules = rules;
    }

    /**
     * The name of the rule group that will be disabled.
     * 
    */
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * The list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     * 
    */
    public List<Integer> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFirewallDisabledRuleGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupName;
        private @Nullable List<Integer> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFirewallDisabledRuleGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public Builder setRules(@Nullable List<Integer> rules) {
            this.rules = rules;
            return this;
        }
        public ApplicationGatewayFirewallDisabledRuleGroupResponse build() {
            return new ApplicationGatewayFirewallDisabledRuleGroupResponse(ruleGroupName, rules);
        }
    }
}
