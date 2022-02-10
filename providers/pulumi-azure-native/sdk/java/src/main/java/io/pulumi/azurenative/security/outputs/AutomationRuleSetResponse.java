// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.AutomationTriggeringRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationRuleSetResponse {
    private final @Nullable List<AutomationTriggeringRuleResponse> rules;

    @OutputCustomType.Constructor({"rules"})
    private AutomationRuleSetResponse(@Nullable List<AutomationTriggeringRuleResponse> rules) {
        this.rules = rules;
    }

    public List<AutomationTriggeringRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutomationTriggeringRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable List<AutomationTriggeringRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public AutomationRuleSetResponse build() {
            return new AutomationRuleSetResponse(rules);
        }
    }
}