// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclLoggingConfigurationLoggingFilterFilterCondition;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclLoggingConfigurationLoggingFilterFilter {
    /**
     * How to handle logs that satisfy the filter's conditions and requirement. Valid values: `KEEP` or `DROP`.
     * 
     */
    private final String behavior;
    /**
     * Match condition(s) for the filter. See Condition below for more details.
     * 
     */
    private final List<WebAclLoggingConfigurationLoggingFilterFilterCondition> conditions;
    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition. Valid values: `MEETS_ALL` or `MEETS_ANY`.
     * 
     */
    private final String requirement;

    @OutputCustomType.Constructor({"behavior","conditions","requirement"})
    private WebAclLoggingConfigurationLoggingFilterFilter(
        String behavior,
        List<WebAclLoggingConfigurationLoggingFilterFilterCondition> conditions,
        String requirement) {
        this.behavior = Objects.requireNonNull(behavior);
        this.conditions = Objects.requireNonNull(conditions);
        this.requirement = Objects.requireNonNull(requirement);
    }

    /**
     * How to handle logs that satisfy the filter's conditions and requirement. Valid values: `KEEP` or `DROP`.
     * 
    */
    public String getBehavior() {
        return this.behavior;
    }
    /**
     * Match condition(s) for the filter. See Condition below for more details.
     * 
    */
    public List<WebAclLoggingConfigurationLoggingFilterFilterCondition> getConditions() {
        return this.conditions;
    }
    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition. Valid values: `MEETS_ALL` or `MEETS_ANY`.
     * 
    */
    public String getRequirement() {
        return this.requirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String behavior;
        private List<WebAclLoggingConfigurationLoggingFilterFilterCondition> conditions;
        private String requirement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.conditions = defaults.conditions;
    	      this.requirement = defaults.requirement;
        }

        public Builder setBehavior(String behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }

        public Builder setConditions(List<WebAclLoggingConfigurationLoggingFilterFilterCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setRequirement(String requirement) {
            this.requirement = Objects.requireNonNull(requirement);
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilter build() {
            return new WebAclLoggingConfigurationLoggingFilterFilter(behavior, conditions, requirement);
        }
    }
}
