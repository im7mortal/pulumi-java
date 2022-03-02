// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.aws.wafregional.outputs.WebAclRuleAction;
import io.pulumi.aws.wafregional.outputs.WebAclRuleOverrideAction;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRule {
    /**
     * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * 
     */
    private final @Nullable WebAclRuleAction action;
    /**
     * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * 
     */
    private final @Nullable WebAclRuleOverrideAction overrideAction;
    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    private final Integer priority;
    /**
     * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
     * 
     */
    private final String ruleId;
    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"action","overrideAction","priority","ruleId","type"})
    private WebAclRule(
        @Nullable WebAclRuleAction action,
        @Nullable WebAclRuleOverrideAction overrideAction,
        Integer priority,
        String ruleId,
        @Nullable String type) {
        this.action = action;
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority);
        this.ruleId = Objects.requireNonNull(ruleId);
        this.type = type;
    }

    /**
     * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * 
    */
    public Optional<WebAclRuleAction> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * 
    */
    public Optional<WebAclRuleOverrideAction> getOverrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }
    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
     * 
    */
    public String getRuleId() {
        return this.ruleId;
    }
    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleAction action;
        private @Nullable WebAclRuleOverrideAction overrideAction;
        private Integer priority;
        private String ruleId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable WebAclRuleAction action) {
            this.action = action;
            return this;
        }

        public Builder setOverrideAction(@Nullable WebAclRuleOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public WebAclRule build() {
            return new WebAclRule(action, overrideAction, priority, ruleId, type);
        }
    }
}
