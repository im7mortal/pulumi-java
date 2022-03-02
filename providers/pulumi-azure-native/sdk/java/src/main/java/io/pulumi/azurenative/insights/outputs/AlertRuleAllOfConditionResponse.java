// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.AlertRuleAnyOfOrLeafConditionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AlertRuleAllOfConditionResponse {
    /**
     * The list of Activity Log Alert rule conditions.
     * 
     */
    private final List<AlertRuleAnyOfOrLeafConditionResponse> allOf;

    @OutputCustomType.Constructor({"allOf"})
    private AlertRuleAllOfConditionResponse(List<AlertRuleAnyOfOrLeafConditionResponse> allOf) {
        this.allOf = Objects.requireNonNull(allOf);
    }

    /**
     * The list of Activity Log Alert rule conditions.
     * 
    */
    public List<AlertRuleAnyOfOrLeafConditionResponse> getAllOf() {
        return this.allOf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAllOfConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AlertRuleAnyOfOrLeafConditionResponse> allOf;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleAllOfConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
        }

        public Builder setAllOf(List<AlertRuleAnyOfOrLeafConditionResponse> allOf) {
            this.allOf = Objects.requireNonNull(allOf);
            return this;
        }
        public AlertRuleAllOfConditionResponse build() {
            return new AlertRuleAllOfConditionResponse(allOf);
        }
    }
}
