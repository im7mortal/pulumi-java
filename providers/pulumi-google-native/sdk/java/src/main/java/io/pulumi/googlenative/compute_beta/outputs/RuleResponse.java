// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ConditionResponse;
import io.pulumi.googlenative.compute_beta.outputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String action;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<ConditionResponse> conditions;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String description;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> ins;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<LogConfigResponse> logConfigs;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> notIns;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> permissions;

    @OutputCustomType.Constructor({"action","conditions","description","ins","logConfigs","notIns","permissions"})
    private RuleResponse(
        String action,
        List<ConditionResponse> conditions,
        String description,
        List<String> ins,
        List<LogConfigResponse> logConfigs,
        List<String> notIns,
        List<String> permissions) {
        this.action = Objects.requireNonNull(action);
        this.conditions = Objects.requireNonNull(conditions);
        this.description = Objects.requireNonNull(description);
        this.ins = Objects.requireNonNull(ins);
        this.logConfigs = Objects.requireNonNull(logConfigs);
        this.notIns = Objects.requireNonNull(notIns);
        this.permissions = Objects.requireNonNull(permissions);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<ConditionResponse> getConditions() {
        return this.conditions;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> getIns() {
        return this.ins;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<LogConfigResponse> getLogConfigs() {
        return this.logConfigs;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> getNotIns() {
        return this.notIns;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> getPermissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ConditionResponse> conditions;
        private String description;
        private List<String> ins;
        private List<LogConfigResponse> logConfigs;
        private List<String> notIns;
        private List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.ins = defaults.ins;
    	      this.logConfigs = defaults.logConfigs;
    	      this.notIns = defaults.notIns;
    	      this.permissions = defaults.permissions;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setConditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIns(List<String> ins) {
            this.ins = Objects.requireNonNull(ins);
            return this;
        }

        public Builder setLogConfigs(List<LogConfigResponse> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }

        public Builder setNotIns(List<String> notIns) {
            this.notIns = Objects.requireNonNull(notIns);
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public RuleResponse build() {
            return new RuleResponse(action, conditions, description, ins, logConfigs, notIns, permissions);
        }
    }
}
