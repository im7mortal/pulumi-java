// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.NonResourcePolicyRule;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.ResourcePolicyRule;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.Subject;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyRulesWithSubjects {
    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    private final @Nullable List<NonResourcePolicyRule> nonResourceRules;
    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    private final @Nullable List<ResourcePolicyRule> resourceRules;
    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    private final List<Subject> subjects;

    @OutputCustomType.Constructor({"nonResourceRules","resourceRules","subjects"})
    private PolicyRulesWithSubjects(
        @Nullable List<NonResourcePolicyRule> nonResourceRules,
        @Nullable List<ResourcePolicyRule> resourceRules,
        List<Subject> subjects) {
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = Objects.requireNonNull(subjects);
    }

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public List<NonResourcePolicyRule> getNonResourceRules() {
        return this.nonResourceRules == null ? List.of() : this.nonResourceRules;
    }
    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public List<ResourcePolicyRule> getResourceRules() {
        return this.resourceRules == null ? List.of() : this.resourceRules;
    }
    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    public List<Subject> getSubjects() {
        return this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjects defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NonResourcePolicyRule> nonResourceRules;
        private @Nullable List<ResourcePolicyRule> resourceRules;
        private List<Subject> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRulesWithSubjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        public Builder setNonResourceRules(@Nullable List<NonResourcePolicyRule> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }

        public Builder setResourceRules(@Nullable List<ResourcePolicyRule> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }

        public Builder setSubjects(List<Subject> subjects) {
            this.subjects = Objects.requireNonNull(subjects);
            return this;
        }

        public PolicyRulesWithSubjects build() {
            return new PolicyRulesWithSubjects(nonResourceRules, resourceRules, subjects);
        }
    }
}
