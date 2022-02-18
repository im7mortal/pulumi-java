// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NonResourceRule {
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
     * 
     */
    private final @Nullable List<String> nonResourceURLs;
    /**
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * 
     */
    private final List<String> verbs;

    @OutputCustomType.Constructor({"nonResourceURLs","verbs"})
    private NonResourceRule(
        @Nullable List<String> nonResourceURLs,
        List<String> verbs) {
        this.nonResourceURLs = nonResourceURLs;
        this.verbs = Objects.requireNonNull(verbs);
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
     * 
     */
    public List<String> getNonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * 
     */
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourceRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> nonResourceURLs;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourceRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        public Builder setNonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public NonResourceRule build() {
            return new NonResourceRule(nonResourceURLs, verbs);
        }
    }
}
