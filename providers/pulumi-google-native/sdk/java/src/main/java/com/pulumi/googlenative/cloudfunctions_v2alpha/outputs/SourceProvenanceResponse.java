// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudfunctions_v2alpha.outputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudfunctions_v2alpha.outputs.StorageSourceResponse;
import java.util.Objects;

@CustomType
public final class SourceProvenanceResponse {
    /**
     * @return A copy of the build&#39;s `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    private final RepoSourceResponse resolvedRepoSource;
    /**
     * @return A copy of the build&#39;s `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    private final StorageSourceResponse resolvedStorageSource;

    @CustomType.Constructor
    private SourceProvenanceResponse(
        @CustomType.Parameter("resolvedRepoSource") RepoSourceResponse resolvedRepoSource,
        @CustomType.Parameter("resolvedStorageSource") StorageSourceResponse resolvedStorageSource) {
        this.resolvedRepoSource = resolvedRepoSource;
        this.resolvedStorageSource = resolvedStorageSource;
    }

    /**
     * @return A copy of the build&#39;s `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    public RepoSourceResponse resolvedRepoSource() {
        return this.resolvedRepoSource;
    }
    /**
     * @return A copy of the build&#39;s `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    public StorageSourceResponse resolvedStorageSource() {
        return this.resolvedStorageSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceResponse resolvedRepoSource;
        private StorageSourceResponse resolvedStorageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolvedRepoSource = defaults.resolvedRepoSource;
    	      this.resolvedStorageSource = defaults.resolvedStorageSource;
        }

        public Builder resolvedRepoSource(RepoSourceResponse resolvedRepoSource) {
            this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource);
            return this;
        }
        public Builder resolvedStorageSource(StorageSourceResponse resolvedStorageSource) {
            this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource);
            return this;
        }        public SourceProvenanceResponse build() {
            return new SourceProvenanceResponse(resolvedRepoSource, resolvedStorageSource);
        }
    }
}
