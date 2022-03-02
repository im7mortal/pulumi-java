// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NonResourcePolicyRule {
    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - "/healthz" is legal
     *   - "/hea*" is illegal
     *   - "/hea" is legal but matches nothing
     *   - "/hea/*" also matches nothing
     *   - "/healthz/*" matches all per-component health checks.
     *     "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
     */
    private final List<String> nonResourceURLs;
    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    private final List<String> verbs;

    @OutputCustomType.Constructor({"nonResourceURLs","verbs"})
    private NonResourcePolicyRule(
        List<String> nonResourceURLs,
        List<String> verbs) {
        this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs);
        this.verbs = Objects.requireNonNull(verbs);
    }

    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - "/healthz" is legal
     *   - "/hea*" is illegal
     *   - "/hea" is legal but matches nothing
     *   - "/hea/*" also matches nothing
     *   - "/healthz/*" matches all per-component health checks.
     *     "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
    */
    public List<String> getNonResourceURLs() {
        return this.nonResourceURLs;
    }
    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
     * 
    */
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourcePolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> nonResourceURLs;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourcePolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        public Builder setNonResourceURLs(List<String> nonResourceURLs) {
            this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }
        public NonResourcePolicyRule build() {
            return new NonResourcePolicyRule(nonResourceURLs, verbs);
        }
    }
}
