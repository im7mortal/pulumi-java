// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCaptchaConfigArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabelArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of RuleGroup that contains condition and action.
 * 
 */
public final class RuleGroupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    @InputImport(name="action")
    private final @Nullable Input<RuleGroupRuleActionArgs> action;

    public Input<RuleGroupRuleActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="captchaConfig")
    private final @Nullable Input<RuleGroupCaptchaConfigArgs> captchaConfig;

    public Input<RuleGroupCaptchaConfigArgs> getCaptchaConfig() {
        return this.captchaConfig == null ? Input.empty() : this.captchaConfig;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @InputImport(name="ruleLabels")
    private final @Nullable Input<List<RuleGroupLabelArgs>> ruleLabels;

    public Input<List<RuleGroupLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Input.empty() : this.ruleLabels;
    }

    @InputImport(name="statement", required=true)
    private final Input<RuleGroupStatementArgs> statement;

    public Input<RuleGroupStatementArgs> getStatement() {
        return this.statement;
    }

    @InputImport(name="visibilityConfig", required=true)
    private final Input<RuleGroupVisibilityConfigArgs> visibilityConfig;

    public Input<RuleGroupVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupRuleArgs(
        @Nullable Input<RuleGroupRuleActionArgs> action,
        @Nullable Input<RuleGroupCaptchaConfigArgs> captchaConfig,
        Input<String> name,
        Input<Integer> priority,
        @Nullable Input<List<RuleGroupLabelArgs>> ruleLabels,
        Input<RuleGroupStatementArgs> statement,
        Input<RuleGroupVisibilityConfigArgs> visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupRuleArgs() {
        this.action = Input.empty();
        this.captchaConfig = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.ruleLabels = Input.empty();
        this.statement = Input.empty();
        this.visibilityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionArgs> action;
        private @Nullable Input<RuleGroupCaptchaConfigArgs> captchaConfig;
        private Input<String> name;
        private Input<Integer> priority;
        private @Nullable Input<List<RuleGroupLabelArgs>> ruleLabels;
        private Input<RuleGroupStatementArgs> statement;
        private Input<RuleGroupVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setAction(@Nullable Input<RuleGroupRuleActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable RuleGroupRuleActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setCaptchaConfig(@Nullable Input<RuleGroupCaptchaConfigArgs> captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder setCaptchaConfig(@Nullable RuleGroupCaptchaConfigArgs captchaConfig) {
            this.captchaConfig = Input.ofNullable(captchaConfig);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRuleLabels(@Nullable Input<List<RuleGroupLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder setRuleLabels(@Nullable List<RuleGroupLabelArgs> ruleLabels) {
            this.ruleLabels = Input.ofNullable(ruleLabels);
            return this;
        }

        public Builder setStatement(Input<RuleGroupStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder setStatement(RuleGroupStatementArgs statement) {
            this.statement = Input.of(Objects.requireNonNull(statement));
            return this;
        }

        public Builder setVisibilityConfig(Input<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder setVisibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Input.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }

        public RuleGroupRuleArgs build() {
            return new RuleGroupRuleArgs(action, captchaConfig, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
