// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GitFileSourceResponse {
    /**
     * The path of the file, with the repo root as the root of the path.
     * 
     */
    private final String path;
    /**
     * See RepoType above.
     * 
     */
    private final String repoType;
    /**
     * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    private final String revision;
    /**
     * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"path","repoType","revision","uri"})
    private GitFileSourceResponse(
        String path,
        String repoType,
        String revision,
        String uri) {
        this.path = Objects.requireNonNull(path);
        this.repoType = Objects.requireNonNull(repoType);
        this.revision = Objects.requireNonNull(revision);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The path of the file, with the repo root as the root of the path.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * See RepoType above.
     * 
    */
    public String getRepoType() {
        return this.repoType;
    }
    /**
     * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
    */
    public String getRevision() {
        return this.revision;
    }
    /**
     * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitFileSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String repoType;
        private String revision;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitFileSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.repoType = defaults.repoType;
    	      this.revision = defaults.revision;
    	      this.uri = defaults.uri;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRepoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }

        public Builder setRevision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GitFileSourceResponse build() {
            return new GitFileSourceResponse(path, repoType, revision, uri);
        }
    }
}
