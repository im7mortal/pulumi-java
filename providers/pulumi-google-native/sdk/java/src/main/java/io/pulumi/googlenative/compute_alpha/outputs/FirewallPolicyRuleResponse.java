// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyRuleMatcherResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyRuleResponse {
    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
     */
    private final String action;
    /**
     * An optional description for this resource.
     * 
     */
    private final String description;
    /**
     * The direction in which this rule applies.
     * 
     */
    private final String direction;
    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    private final Boolean disabled;
    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
     */
    private final Boolean enableLogging;
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
     * 
     */
    private final String kind;
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    private final FirewallPolicyRuleMatcherResponse match;
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    private final Integer priority;
    /**
     * Calculation of the complexity of a single firewall policy rule.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    private final List<String> targetResources;
    /**
     * A list of secure tags that controls which instances the firewall rule applies to. If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * 
     */
    private final List<FirewallPolicyRuleSecureTagResponse> targetSecureTags;
    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    private final List<String> targetServiceAccounts;

    @OutputCustomType.Constructor({"action","description","direction","disabled","enableLogging","kind","match","priority","ruleTupleCount","targetResources","targetSecureTags","targetServiceAccounts"})
    private FirewallPolicyRuleResponse(
        String action,
        String description,
        String direction,
        Boolean disabled,
        Boolean enableLogging,
        String kind,
        FirewallPolicyRuleMatcherResponse match,
        Integer priority,
        Integer ruleTupleCount,
        List<String> targetResources,
        List<FirewallPolicyRuleSecureTagResponse> targetSecureTags,
        List<String> targetServiceAccounts) {
        this.action = Objects.requireNonNull(action);
        this.description = Objects.requireNonNull(description);
        this.direction = Objects.requireNonNull(direction);
        this.disabled = Objects.requireNonNull(disabled);
        this.enableLogging = Objects.requireNonNull(enableLogging);
        this.kind = Objects.requireNonNull(kind);
        this.match = Objects.requireNonNull(match);
        this.priority = Objects.requireNonNull(priority);
        this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
        this.targetResources = Objects.requireNonNull(targetResources);
        this.targetSecureTags = Objects.requireNonNull(targetSecureTags);
        this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
    }

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * An optional description for this resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The direction in which this rule applies.
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
    */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
    */
    public FirewallPolicyRuleMatcherResponse getMatch() {
        return this.match;
    }
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Calculation of the complexity of a single firewall policy rule.
     * 
    */
    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
    */
    public List<String> getTargetResources() {
        return this.targetResources;
    }
    /**
     * A list of secure tags that controls which instances the firewall rule applies to. If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * 
    */
    public List<FirewallPolicyRuleSecureTagResponse> getTargetSecureTags() {
        return this.targetSecureTags;
    }
    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
    */
    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private String direction;
        private Boolean disabled;
        private Boolean enableLogging;
        private String kind;
        private FirewallPolicyRuleMatcherResponse match;
        private Integer priority;
        private Integer ruleTupleCount;
        private List<String> targetResources;
        private List<FirewallPolicyRuleSecureTagResponse> targetSecureTags;
        private List<String> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.priority = defaults.priority;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.targetResources = defaults.targetResources;
    	      this.targetSecureTags = defaults.targetSecureTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setEnableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMatch(FirewallPolicyRuleMatcherResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder setTargetResources(List<String> targetResources) {
            this.targetResources = Objects.requireNonNull(targetResources);
            return this;
        }

        public Builder setTargetSecureTags(List<FirewallPolicyRuleSecureTagResponse> targetSecureTags) {
            this.targetSecureTags = Objects.requireNonNull(targetSecureTags);
            return this;
        }

        public Builder setTargetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public FirewallPolicyRuleResponse build() {
            return new FirewallPolicyRuleResponse(action, description, direction, disabled, enableLogging, kind, match, priority, ruleTupleCount, targetResources, targetSecureTags, targetServiceAccounts);
        }
    }
}
