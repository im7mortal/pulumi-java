// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLCaptchaConfig;
import io.pulumi.awsnative.wafv2.outputs.WebACLLabel;
import io.pulumi.awsnative.wafv2.outputs.WebACLOverrideAction;
import io.pulumi.awsnative.wafv2.outputs.WebACLRuleAction;
import io.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLVisibilityConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebACLRule {
    private final @Nullable WebACLRuleAction action;
    private final @Nullable WebACLCaptchaConfig captchaConfig;
    private final String name;
    private final @Nullable WebACLOverrideAction overrideAction;
    private final Integer priority;
    /**
     * Collection of Rule Labels.
     * 
     */
    private final @Nullable List<WebACLLabel> ruleLabels;
    private final WebACLStatement statement;
    private final WebACLVisibilityConfig visibilityConfig;

    @OutputCustomType.Constructor({"action","captchaConfig","name","overrideAction","priority","ruleLabels","statement","visibilityConfig"})
    private WebACLRule(
        @Nullable WebACLRuleAction action,
        @Nullable WebACLCaptchaConfig captchaConfig,
        String name,
        @Nullable WebACLOverrideAction overrideAction,
        Integer priority,
        @Nullable List<WebACLLabel> ruleLabels,
        WebACLStatement statement,
        WebACLVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name);
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority);
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement);
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
    }

    public Optional<WebACLRuleAction> getAction() {
        return Optional.ofNullable(this.action);
    }
    public Optional<WebACLCaptchaConfig> getCaptchaConfig() {
        return Optional.ofNullable(this.captchaConfig);
    }
    public String getName() {
        return this.name;
    }
    public Optional<WebACLOverrideAction> getOverrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Collection of Rule Labels.
     * 
    */
    public List<WebACLLabel> getRuleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    public WebACLStatement getStatement() {
        return this.statement;
    }
    public WebACLVisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLRuleAction action;
        private @Nullable WebACLCaptchaConfig captchaConfig;
        private String name;
        private @Nullable WebACLOverrideAction overrideAction;
        private Integer priority;
        private @Nullable List<WebACLLabel> ruleLabels;
        private WebACLStatement statement;
        private WebACLVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setAction(@Nullable WebACLRuleAction action) {
            this.action = action;
            return this;
        }

        public Builder setCaptchaConfig(@Nullable WebACLCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOverrideAction(@Nullable WebACLOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleLabels(@Nullable List<WebACLLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder setStatement(WebACLStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder setVisibilityConfig(WebACLVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public WebACLRule build() {
            return new WebACLRule(action, captchaConfig, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
