// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
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

    @CustomType.Constructor
    private NonResourceRule(
        @CustomType.Parameter("nonResourceURLs") @Nullable List<String> nonResourceURLs,
        @CustomType.Parameter("verbs") List<String> verbs) {
        this.nonResourceURLs = nonResourceURLs;
        this.verbs = verbs;
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
     * 
    */
    public List<String> nonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * 
    */
    public List<String> verbs() {
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

        public Builder nonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }
        public Builder verbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }        public NonResourceRule build() {
            return new NonResourceRule(nonResourceURLs, verbs);
        }
    }
}
