// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GitRepoSourceResponse {
    /**
     * The branch or tag to use. Must start with "refs/" (required).
     * 
     */
    private final String ref;
    /**
     * See RepoType below.
     * 
     */
    private final String repoType;
    /**
     * The URI of the repo (required).
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"ref","repoType","uri"})
    private GitRepoSourceResponse(
        String ref,
        String repoType,
        String uri) {
        this.ref = Objects.requireNonNull(ref);
        this.repoType = Objects.requireNonNull(repoType);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The branch or tag to use. Must start with "refs/" (required).
     * 
    */
    public String getRef() {
        return this.ref;
    }
    /**
     * See RepoType below.
     * 
    */
    public String getRepoType() {
        return this.repoType;
    }
    /**
     * The URI of the repo (required).
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ref;
        private String repoType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
    	      this.repoType = defaults.repoType;
    	      this.uri = defaults.uri;
        }

        public Builder setRef(String ref) {
            this.ref = Objects.requireNonNull(ref);
            return this;
        }

        public Builder setRepoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GitRepoSourceResponse build() {
            return new GitRepoSourceResponse(ref, repoType, uri);
        }
    }
}
