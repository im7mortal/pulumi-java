// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.NonResourceRule;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.ResourceRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectRulesReviewStatus {
    /**
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    private final @Nullable String evaluationError;
    /**
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * 
     */
    private final Boolean incomplete;
    /**
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private final List<NonResourceRule> nonResourceRules;
    /**
     * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private final List<ResourceRule> resourceRules;

    @CustomType.Constructor
    private SubjectRulesReviewStatus(
        @CustomType.Parameter("evaluationError") @Nullable String evaluationError,
        @CustomType.Parameter("incomplete") Boolean incomplete,
        @CustomType.Parameter("nonResourceRules") List<NonResourceRule> nonResourceRules,
        @CustomType.Parameter("resourceRules") List<ResourceRule> resourceRules) {
        this.evaluationError = evaluationError;
        this.incomplete = incomplete;
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
    }

    /**
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
    */
    public Optional<String> evaluationError() {
        return Optional.ofNullable(this.evaluationError);
    }
    /**
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * 
    */
    public Boolean incomplete() {
        return this.incomplete;
    }
    /**
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
    */
    public List<NonResourceRule> nonResourceRules() {
        return this.nonResourceRules;
    }
    /**
     * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
    */
    public List<ResourceRule> resourceRules() {
        return this.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectRulesReviewStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String evaluationError;
        private Boolean incomplete;
        private List<NonResourceRule> nonResourceRules;
        private List<ResourceRule> resourceRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectRulesReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationError = defaults.evaluationError;
    	      this.incomplete = defaults.incomplete;
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
        }

        public Builder evaluationError(@Nullable String evaluationError) {
            this.evaluationError = evaluationError;
            return this;
        }
        public Builder incomplete(Boolean incomplete) {
            this.incomplete = Objects.requireNonNull(incomplete);
            return this;
        }
        public Builder nonResourceRules(List<NonResourceRule> nonResourceRules) {
            this.nonResourceRules = Objects.requireNonNull(nonResourceRules);
            return this;
        }
        public Builder nonResourceRules(NonResourceRule... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }
        public Builder resourceRules(List<ResourceRule> resourceRules) {
            this.resourceRules = Objects.requireNonNull(resourceRules);
            return this;
        }
        public Builder resourceRules(ResourceRule... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }        public SubjectRulesReviewStatus build() {
            return new SubjectRulesReviewStatus(evaluationError, incomplete, nonResourceRules, resourceRules);
        }
    }
}
