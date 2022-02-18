// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.FlowDistinguisherMethodArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.PolicyRulesWithSubjectsArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.PriorityLevelConfigurationReferenceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FlowSchemaSpec describes how the FlowSchema's specification looks like.
 * 
 */
public final class FlowSchemaSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSchemaSpecArgs Empty = new FlowSchemaSpecArgs();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    @InputImport(name="distinguisherMethod")
    private final @Nullable Input<FlowDistinguisherMethodArgs> distinguisherMethod;

    public Input<FlowDistinguisherMethodArgs> getDistinguisherMethod() {
        return this.distinguisherMethod == null ? Input.empty() : this.distinguisherMethod;
    }

    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    @InputImport(name="matchingPrecedence")
    private final @Nullable Input<Integer> matchingPrecedence;

    public Input<Integer> getMatchingPrecedence() {
        return this.matchingPrecedence == null ? Input.empty() : this.matchingPrecedence;
    }

    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    @InputImport(name="priorityLevelConfiguration", required=true)
    private final Input<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration;

    public Input<PriorityLevelConfigurationReferenceArgs> getPriorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }

    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<PolicyRulesWithSubjectsArgs>> rules;

    public Input<List<PolicyRulesWithSubjectsArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public FlowSchemaSpecArgs(
        @Nullable Input<FlowDistinguisherMethodArgs> distinguisherMethod,
        @Nullable Input<Integer> matchingPrecedence,
        Input<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration,
        @Nullable Input<List<PolicyRulesWithSubjectsArgs>> rules) {
        this.distinguisherMethod = distinguisherMethod;
        this.matchingPrecedence = matchingPrecedence;
        this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration, "expected parameter 'priorityLevelConfiguration' to be non-null");
        this.rules = rules;
    }

    private FlowSchemaSpecArgs() {
        this.distinguisherMethod = Input.empty();
        this.matchingPrecedence = Input.empty();
        this.priorityLevelConfiguration = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowDistinguisherMethodArgs> distinguisherMethod;
        private @Nullable Input<Integer> matchingPrecedence;
        private Input<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration;
        private @Nullable Input<List<PolicyRulesWithSubjectsArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinguisherMethod = defaults.distinguisherMethod;
    	      this.matchingPrecedence = defaults.matchingPrecedence;
    	      this.priorityLevelConfiguration = defaults.priorityLevelConfiguration;
    	      this.rules = defaults.rules;
        }

        public Builder setDistinguisherMethod(@Nullable Input<FlowDistinguisherMethodArgs> distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }

        public Builder setDistinguisherMethod(@Nullable FlowDistinguisherMethodArgs distinguisherMethod) {
            this.distinguisherMethod = Input.ofNullable(distinguisherMethod);
            return this;
        }

        public Builder setMatchingPrecedence(@Nullable Input<Integer> matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }

        public Builder setMatchingPrecedence(@Nullable Integer matchingPrecedence) {
            this.matchingPrecedence = Input.ofNullable(matchingPrecedence);
            return this;
        }

        public Builder setPriorityLevelConfiguration(Input<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
            return this;
        }

        public Builder setPriorityLevelConfiguration(PriorityLevelConfigurationReferenceArgs priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Input.of(Objects.requireNonNull(priorityLevelConfiguration));
            return this;
        }

        public Builder setRules(@Nullable Input<List<PolicyRulesWithSubjectsArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<PolicyRulesWithSubjectsArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public FlowSchemaSpecArgs build() {
            return new FlowSchemaSpecArgs(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
        }
    }
}
